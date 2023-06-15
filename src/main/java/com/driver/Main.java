package com.driver;

public class Main {
    public static void main(String[] args) {

        B obj = new B();
        System.out.println(obj.meth());

//        return null;
    }

    public static class B extends  A{
        @Override
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }


    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }

}

