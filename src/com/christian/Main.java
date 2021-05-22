package com.christian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        //if one line no semi colon
        new Thread(()->{
            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Line 3");
            System.out.println("Line 4");
        }).start();

        Employee emp1= new Employee("mark",21);
        Employee emp2= new Employee("john",31);
        Employee emp3= new Employee("christian",41);

        List<Employee> employees= new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        //Sort employees
/*        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/


        //Sort Employee using Lambda

        Collections.sort(employees,(e1,e2)->
                e1.getName().compareTo(e2.getName())
                );

        //Print Employees

        for(Employee e: employees){
            System.out.println(e.getName());
        }



    }
}

/*
class CodeToRun implements Runnable{

    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}*/
