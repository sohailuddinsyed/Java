package com.javapractice.Basics;

public class Encapsulation {
    private int roll;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

}
class EncapsulationDemo{
    public static void main(String args[]){
        Encapsulation ob=new Encapsulation();
        ob.setName("Sohail");
        ob.setRoll(11);

        System.out.println(ob.getName());
        System.out.println(ob.getRoll());
    }
}

