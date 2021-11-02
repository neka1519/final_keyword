package com.neka;

final class A {
public final void show(){
    System.out.println("In show");
}
}
class B extends A{  //throws error as class A is final

}
public class Main {

    public static void main(String[] args) {

        A obj = new A();
    }
}
/*
final - used with var, class, methods
final int  a  = 10---> you can't change the value acts like const.put CAPS
final class --> that particular class can't be extended
final method ---> you can't override the method
 */