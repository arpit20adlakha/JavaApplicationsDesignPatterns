//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.regex.*;
//
//public class Solution {
//
//        // Input Up 4
//        //
//        public static void main(String args[] ) throws Exception {
//            ElevatorSystem elevatorSystem = new ElevatorSystem();
//            ExecutorService executor = Executors.newFixedThreadPool(4);
//            Double d = Double.POSITIVE_INFINITY;
//            System.out.println(d);
//            d += Double.NEGATIVE_INFINITY;
//            System.out.println(d);
//            d = Double.NaN;
//            System.out.println(d);
//            Elevator elevator;
//            Scanner scanner = new Scanner(System.in);
//
//            String direction = scanner.next();
//            Integer floor = scanner.nextInt();
//            String resetCommand = scanner.next();
//
//            if (direction.toUpperCase().equals("UP")) {
//                elevator = elevatorSystem.getElevator(ElevatorState.UP, floor);
//                elevator.addFloorsToUpQueue(floor);
//            } else if (direction.toUpperCase().equals("DOWN")){
//                elevator = elevatorSystem.getElevator(ElevatorState.DOWN, floor);
//                elevator.addFloorsToDownQueue(floor);
//
//            } else {
//                throw new Exception("Invalid Command");
//            }
//
//            if (resetCommand.toUpperCase().equals("UP RESET ")) {
//                // elevatorSystem.resetFloorButton();
//            }
//
//
//        }
//
//    interface Button {
//        void press(int id);
//        void doublePress(int id);
//    }
//
//    enum ButtonState {
//        ON, OFF;
//    }
//
//    class FloorButton implements Button {
//        private ButtonState state;
//        private int id;
//
//        public FloorButton(int id) {
//            this.id = id;
//            this.state = ButtonState.OFF;
//        }
//
//        @Override
//        public void press(int id) {
//            this.state = ButtonState.ON;
//        }
//
//        @Override
//        public void doublePress(int id) {
//            this.state = ButtonState.OFF;
//        }
//    }
//
//
//
//    class ElevatorButton implements Button {
//        private ButtonState state;
//        private int id;
//
//        public ElevatorButton(int id) {
//            this.id = id;
//            this.state = ButtonState.OFF;
//        }
//        @Override
//        public void press(int id) {
//            this.state = ButtonState.ON;
//        }
//        @Override
//        public void doublePress(int id) {
//            this.state = ButtonState.OFF;
//        }
//    }
//
//    interface ElevatorI {
//
//    }
//
//    class Elevator implements ElevatorI {
//
//        private int minFloor;
//        private int maxFloor;
//        private int floor;
//        private int load;
//        private ElevatorState state;
//        private int id;
//        private boolean doorOpen;
//        private Queue<Integer> upFloorsQueue;
//        private Queue<Integer> downFLoorsQueue;
//        private int numPersons;
//        private List<ElevatorButton> elevatorButtons;
//
//        public Elevator() {
//            this.minFloor = Constants.MIN_FLOOR;
//            this.upFloorsQueue = new PriorityQueue<>(Constants.MAX_FLOOR + 1);
//            this.upFloorsQueue = new PriorityQueue<>(Constants.MAX_FLOOR + 1, Collections.reverseOrder());
//            this.doorOpen = false;
//            this.state = ElevatorState.STILL;
//
//        }
//
//        public boolean isUpFloorsQueueEmpty() {
//            return this.upFloorsQueue.isEmpty();
//        }
//
//        public void addFloorsToUpQueue(int floor) {
//
//            if (this.upFloorsQueue.contains(floor)) {
//                System.out.println("Floor Alreaded Added to Up Queue"); // or an Exception can be thrown which can be handled
//                return;
//            }
//            this.elevatorButtons.get(floor).press(floor);
//            upFloorsQueue.add(floor);
//        }
//
//        public void addFloorsToDownQueue(int floor) {
//            if (this.downFLoorsQueue.contains(floor)) {
//                System.out.println("Floor already added to down queue");
//                return;
//            }
//            this.elevatorButtons.get(floor).press(floor);
//            downFLoorsQueue.add(floor);
//        }
//
//        public boolean isDownFloorQueueEmpty() {
//            return this.downFLoorsQueue.isEmpty();
//        }
//
//
//        public ElevatorState getState() {
//            return state;
//        }
//
//        public void addPerson() {
//            numPersons++;
//        }
//
//        public void removePerson() {
//            numPersons--;
//        }
//
//        public int getPersons() {
//            return this.numPersons;
//        }
//
//        public boolean isGoingUp() {
//            return this.state.equals(ElevatorState.UP);
//        }
//
//        public void goUp(int from) {
//            // hardware signals
//            int i = from;
//            while(!isUpFloorsQueueEmpty()) {
//                i++;
//                if (upFloorsQueue.contains(i)) {
//                    try {
//                        stopForASecond();
//                    } catch (Exception e) {
//
//                    }
//                }
//            }
//
//        }
//
//        public void stopForASecond() throws InterruptedException{
//            Thread.sleep(1000);
//        }
//
//        public void setUpState() {
//            this.state = ElevatorState.UP;
//            goUp();
//        }
//
//        public void setDownState() {
//            this.state = ElevatorState.DOWN;
//            goDown();
//        }
//
//        public void goDown() {
//            while(!isDownFloorQueueEmpty()) {
//
//            }
//        }
//
//    }
//
//    enum ElevatorState {
//        UP, DOWN, BROKEN, STILL;
//    }
//
//    class Constants {
//        public  static final int MIN_FLOOR = 0;
//        public  static final int MAX_FLOOR = 10;
//        public  static final int LOAD_ELEVATOR = 1000;
//        public  static final int NUM_ELEVATORS = 4;
//        public  static final int MAX_PERSONS = 10;
//    }
//
//
//
//    interface ElevatorSystemI {
//        Elevator getElevator(ElevatorState requiredState, int floor);
//    }
//
//    class ElevatorSystem implements ElevatorSystemI {
//        private ArrayList<Elevator> elevators = new ArrayList<>();
//        private ArrayList<FloorButton> floorButtons= new ArrayList<>();
//
//        public ElevatorSystem() {
//            elevators.add(ElevatorFactory.getDefaultElevator());
//            elevators.add(ElevatorFactory.getDefaultElevator());
//            floorButtons.add(new FloorButton(1));
//            floorButtons.add(new FloorButton(2));
//        }
//
//        @Override
//        public Elevator getElevator(ElevatorState requiredState, int floor) {
//            if (ElevatorState.UP.equals(requiredState)) {
//                floorButtons.get(1).press(1);
//            } else {
//                floorButtons.get(2).press(2);
//            }
//
//
//            for (Elevator elevator: elevators) {
//                if (elevator.getState().equals(requiredState)) {
//                    return elevator;
//                }
//            }
//
//            Elevator elevator = elevators.get(0);
//            if (requiredState.equals(ElevatorState.UP)) {
//                elevator.setUpState();
//            } else if (requiredState.equals(ElevatorState.DOWN)) {
//                elevator.setDownState();
//            }
//
//            return elevator;
//        }
//
//        public void resetFloorButton(int id) {
//            this.floorButtons.get(id).doublePress(id);
//        }
//
//        // you can overload the method getElevator or you can have different implementation of the interface to use it to use a different algorithm for picking up an elevator
//    }
//
//    class ElevatorFactory {
//
//        public static Elevator getDefaultElevator(){
//            return new Elevator();
//        }
//    }
//
//
//}
