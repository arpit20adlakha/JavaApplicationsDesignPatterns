package com.company;

public class TestingAnonymousRestrictions {
    final static String robotName = "Bug";
    final static int robotAssemblyYear = 2112;

     private static SpeakingEntity robot = new SpeakingEntity() {

         static final int MAGIC_CONSTANT = 10;

         private String name;
         private int assemblyYear;

         {
             name = robotName;
             assemblyYear = robotAssemblyYear;
         }

         @Override
         public void sayHello() {
             System.out.println("10013" + MAGIC_CONSTANT);
         }

         @Override
         public void sayBye() {
             System.out.println("134883" + MAGIC_CONSTANT);
         }
     };

     public static void main(String[] args) {
         robot.sayHello();
         robot.sayBye();
     }
}
