package com.christian;

public class SomeClass {
    public String doSomthing(){
        int i=0;
        UpperConcat uc = (s1,s2)-> {
            System.out.println("The Lambda expression class is: "+ getClass().getSimpleName());
            String result= s1.toUpperCase()+s2.toUpperCase();
            return result;
        };
        System.out.println("The some class name is: "+ getClass().getSimpleName());
        return (Main.doStringStuff(uc,"String1","String2"));
    }
}
