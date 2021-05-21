package com.christian;

public class Main {
    public static void main(String []args){

        // Creating a thread and runnning it
        //new Thread(new CodeToRun()).start();

        //Annonymous class of thread runnable
         /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" printing from runnable ");
            }
        }).start();
        */

        new Thread(()->System.out.println("Printing from runnable, lambda")).start();

    }
}
class CodeToRun implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}