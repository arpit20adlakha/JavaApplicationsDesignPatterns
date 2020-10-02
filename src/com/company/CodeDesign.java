package com.company;
//        Promise.resolve().then(() => {
//           console.log('promise3 resolved');
//           process.nextTick(() => console.log('next tick inside promise resolve handler'));
//        });
//        setImmediate(() => console.log('set immediate1'));
//         
//        process.nextTick(() => console.log('next tick1'));
//        process.nextTick(() => console.log('next tick2'));
//         
//        setTimeout(() => console.log('set timeout'), 0);
//        setImmediate(() => console.log('set immediate4'));
//        Promise.resolve().then(() => {
//           console.log('promise3 resolved');
//           process.nextTick(() => console.log('next tick inside promise resolve handler'));
//        });
//        setImmediate(() => console.log('set immediate1'));
//         
//        process.nextTick(() => console.log('next tick1'));
//        process.nextTick(() => console.log('next tick2'));
//         
//        setTimeout(() => console.log('set timeout'), 0);
//        setImmediate(() => console.log('set immediate4'));Promise.resolve().then(() => {
//           console.log('promise3 resolved');
//           process.nextTick(() => console.log('next tick inside promise resolve handler'));
//        });
//        setImmediate(() => console.log('set immediate1'));
//         
//        process.nextTick(() => console.log('next tick1'));
//        process.nextTick(() => console.log('next tick2'));
//         
//        setTimeout(() => console.log('set timeout'), 0);
//        setImmediate(() => console.log('set immediate4'));Promise.resolve().then(() => {
//           console.log('promise3 resolved');
//           process.nextTick(() => console.log('next tick inside promise resolve handler'));
//        });
//        setImmediate(() => console.log('set immediate1'));
//         
//        process.nextTick(() => console.log('next tick1'));
//        process.nextTick(() => console.log('next tick2'));
//         
//        setTimeout(() => console.log('set timeout'), 0);
//        setImmediate(() => console.log('set immediate4'));
import java.util.Scanner;

public class CodeDesign {
    private static Scanner scanner = new Scanner(System.in);

    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been atttached");
            }
            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());


//        Gearbox mc = new Gearbox(6);
//        mc.addGear(1, 5.3);
//        mc.addGear(2, 10.6);
//        mc.addGear(3, 15.9);
//        mc.operateClutch(true);
//        mc.changeGear(1);
//        mc.operateClutch(false);
//        System.out.println(mc.wheelSpeed(1000));
//        mc.changeGear(2);
//        System.out.println(mc.wheelSpeed(3000));
//        mc.operateClutch(true);
//        mc.operateClutch(false);
//        System.out.println(mc.wheelSpeed(6000));
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
