package com.christian;

public class SomeClass {
    public String doSomthing(){
        System.out.println("The some class name is: "+ getClass().getSimpleName());
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperConcat(String s1, String s2) {
                System.out.println("The Annonymous class name is: "+ getClass().getSimpleName());
                return s1.toUpperCase()+s2.toUpperCase();
            }
        },"String1","String2");
    }
}
