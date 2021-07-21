package com.company;

public class Cellphone extends ElectricDevice {


    protected String brand ;

    public Cellphone(boolean m_worksOnBatteries, String brand) {
        super(m_worksOnBatteries);
        this.brand = brand;
        m_worksOnBatteries=false;


    }

    @Override
    public void useDevice() {
        System.out.println("talking on the phone");


    }


    @Override
    public void fixDevice() {

        if (m_isFaulty=true){

            System.out.println("fixing cellphone");

            m_isFaulty=false ;
        }

        else {

            System.out.println("this cellphone is working properly");


        }





    }







}

