package com.Teta.AnimalInheritence;

public class Reptile extends Animal{

    private int tails;

    public Reptile(){
        this.tails =1;
        name="reptile";
    }
    public Reptile(String name){
        this.name = name;
        int tails=1;
        System.out.println("The"+name+"has "+tails+"tails");
    }



}
