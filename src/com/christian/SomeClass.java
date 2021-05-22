package com.christian;

public class SomeClass {
    public String doSomthing(){
        int i=0;
        UpperConcat uc = (s1,s2)-> {
            System.out.println("The Lambda expression class is: "+ getClass().getSimpleName());
            System.out.println("i in the lambda: "+ i);
            String result= s1.toUpperCase()+s2.toUpperCase();
            return result;
        };
        System.out.println("The some class name is: "+ getClass().getSimpleName());
        return (Main.doStringStuff(uc,"String1","String2"));
    }

    public void printValue(){
        int num=25;
        Runnable r= ()->{
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("The Value is :" + num);
        };

        new Thread(r).start();
    }


}
