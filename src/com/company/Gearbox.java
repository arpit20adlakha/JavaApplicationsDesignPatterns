package com.company;

import java.util.ArrayList;
import java.util.List;

class Gearbox {
    private ArrayList<Gear> gears;
    private int current;
    private int  maxGears;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.current = current;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(4, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if(number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if(newGear >=0 && (newGear < this.gears.size()) && this.clutchIsIn ) {
            this.current = newGear;
            System.out.println("Gear" + newGear + "selected");
        } else {
            System.out.println("Grind!");
            this.current = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!");
        }
        return revs * gears.get(current).getRatio();
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        Gear(int number, double ratio) {
            this.gearNumber = number;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }
    }

}
