package com.company;

public class Tv extends ElectricDevice {

    protected float m_screen_size ;

    public Tv(boolean m_worksOnBatteries, float screen_size) {
        super(m_worksOnBatteries);
        this.m_screen_size = m_screen_size;
        m_worksOnBatteries=false;
    }


    @Override
    public void useDevice() {
        System.out.println("watching tv...");
    }

    @Override
    public void fixDevice() {
        if (m_isFaulty=true){

            System.out.println("fixing");

            m_isFaulty=false;
        }

        else {
            System.out.println("this tv working properly");

        }

    }







}
