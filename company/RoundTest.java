package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoundTest {


    @Test
    public void test_roundup(){
        //Arrange
        RoundZero roundZero =new RoundZero();

        //Act
       double actual_result = RoundZero.RoundUp(0);

      //Assert

       double expected_result=0.0;

      assertEquals(actual_result,expected_result);


      //Large number test 0

      double actual_result1= RoundZero.RoundUp(0.1);

       double expected_result1= 1.0;

        assertEquals (actual_result1,expected_result1);

        //Check the small number 0

        double actual_result2=RoundZero.RoundUp(4.0);

        double expected_result2=-1;

        assertEquals(actual_result2,expected_result2);

    }



     @Test
     public void test_roundDown(){
         //Arrange
         RoundZero roundZero =new RoundZero();
         //Act
         double actual_result =RoundZero.RoundDown(1.0);

         //Assert
         double expected_result =1.0;

         assertEquals(actual_result,expected_result);

        //Check different from number 1

         //Act

         double actual_result1= RoundZero.RoundDown(0.5);

         //Assert

         double expected_result1=0.0;


        assertEquals(actual_result1,expected_result1);



        // Check different from number 1

         //Act

         double actual_result2 =RoundZero.RoundDown(2.0);

         //Assert

         double expected_result2 =-1.0;

         assertEquals(actual_result2,expected_result2);



    }

       @Test
      public void  test_round(){

        RoundZero roundZero =new RoundZero();

           //Act
           double actual_result=RoundZero.Round(0.5);

           //Asset

           double expected_result=1.0;

           assertEquals(actual_result,expected_result);


           // Check different from number 1



           //Act

           double actual_result1 =RoundZero.Round(0.4);

           //Asset

           double expected_result1= 0.0;


          assertEquals(actual_result1,expected_result1);


    }



      }




