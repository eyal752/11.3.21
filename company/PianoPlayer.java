package com.company;

public class PianoPlayer extends Player {

    @Override
    public void play() {
        System.out.println("playing bach");
    }

    @Override
    public void compose() {
        System.out.println("composing piano melody");
    }


  public void practice(){

      System.out.println("practice makes perfect");
  }

   public void playjazz(){

       System.out.println("Playing i Got Rhyhm by George gershwin");
   }
}
