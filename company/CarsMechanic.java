package com.company;

public class CarsMechanic extends Mechanic {

    String[] car_types_i_can_repair = new String[1];

    @Override
    public void repair() {
        System.out.println("repairing car");


    }

   public void replaceWheel(){

       System.out.println("replacing the damaged wheel");


   }




}
