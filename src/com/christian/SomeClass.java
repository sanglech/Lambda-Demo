package com.christian;

public class SomeClass {
    public String doSomthing(){


        int i=0;
//        UpperConcat uc = (s1,s2)->{
//            System.out.println("The Lambda expression class is: "+ getClass().getSimpleName());
//            String result= s1.toUpperCase()+s2.toUpperCase();
//            return result;
//        };

        UpperConcat uc = (s1,s2)-> {
            System.out.println("The Lambda expression class is: "+ getClass().getSimpleName());
            String result= s1.toUpperCase()+s2.toUpperCase();
            return result;
        };
        System.out.println("The some class name is: "+ getClass().getSimpleName());
//        {
//            i++;
//            UpperConcat uc = new UpperConcat() {
//                @Override
//                public String upperConcat(String s1, String s2) {
//                    return s1.toUpperCase()+s2.toUpperCase();
//                }
//            };
//        }
        System.out.println("The Annonyomous class name is: "+ getClass().getSimpleName());
        System.out.println("i is: "+ i);
        return (Main.doStringStuff(uc,"String1","String2"));
//        System.out.println("The some class name is: "+ getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperConcat(String s1, String s2) {
//                System.out.println("The Annonymous class name is: "+ getClass().getSimpleName());
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        },"String1","String2");
    }
}
