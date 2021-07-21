package com.company;

public class RoundZero {

 public static double RoundUp(double d) {

     if (d == 0) {

         return 0.0;
     } else if (d > 0.0 && d < 1.0) {

         return 1.0;


     }

    return -1.0;

 }



      public static double RoundDown(double d){

       if (d==1.0){

         return 1.0;
     }

       else if (d>0.0&&d<1.0){

         return 0.0;

     }


         return -1.0;
 }


     public static double Round(double d){
     if (d>0.0&&d<1.0){

         return 1.0;
     }

     else if (d>0.0&&d<=0.4){

         return 0.0;

     }

      return -1.0;

 }


}
