package com.company;

public abstract class Mechanic {

    protected   String name;
    protected   int years_of_experience;

    public abstract void repair();

    public void useScrewdriver(){
        System.out.println("using screwdriver to open this screw");



    }


}
