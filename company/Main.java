package com.company;

import lombok.Getter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Question 1
        //1)דריסה במחלקה היורשת מתבצעת ע"י אנוטציה  @override
        //אנחנו נשתמש בזה בכדי למנוע שכפול של קוד


        // Question 2
        //תשובה במחלקות


        // Question 3
        //תשובה במחלקות


        // Question 4
        //יכולת של אובייקט שנוצר מטיפוס מסויים להיות בו זמנית אובייקט מטיפוסים אחרים


        //Question 5

       //  MathTeacher m =new MathTeacher();

      //   HistoryTeacher h = new HistoryTeacher();



       // public static void IdentifyTeacher (Teacher t){

       //    if (  )


      //  }


        //Question 6
        //א)


        //Question 7
        //א)מחלקה אבסרטרקטית(מופשט\לא קיים)זוהיא מחלקה שלא ניתן ליצור ממנה מופע בד"כ אלו במחלקות עליונות
        //ונעדו לאפשר פונקציונליות למחלקות שתחתיהם.
        //ב) מחלקה אבסטרקטית יכולה לרשת ממחלקה אבסרקטית אחרת ללא חיוב במימוש (חוב)


        //Question 8
        //א)פונקציה אבסרטרקטית אסור שיהיה לה קוד אלא היא צריכה להיות ללא גוף וכתובה כמו שם של שדה
        //  ב) פונקציה במחלקה אבסטרקטית לא יכול להיות privat מיכוון שבפונקציה זו  לא יהיה  מימוש והקוד לא יתקמפל ו
        //  ובמילים אחרות יש חוב שאי אפשר לשלם
        //ב)פונקציה אבסרקטית צריכה להיות כתובה חתימה בלבד !


        //Question 9

        //א)במחלקה אבסטרקטית יכולה להיות פונקציה רגילה (לא אבסטרקטית)
        // ב)במחלקה אבסטרקטית יכולות להיות פונקציות רגילות בלבד.


        //Question 10
        //תשובה במחלקות


        //Question 11
        //תשובה במחלקות
        // - (סעיף מילולי) : לא ניתן לדרוס תפונקציה בגגל שהיא נמצאת בfinal


      /*  Tv t = new Tv(false,32.4f);

        Cellphone c =new Cellphone(true,"LG");

         public boolean RepairElecticDevice(ElectricDevice){

           if (c.m_worksOnBatteries= true){

           }

         }
        */


        //Question 12

        //א)לא ניתן לרשת ממחלקת final

        //ב) דוגמה למחלקה זו היא מחלקת Math הכלולה בשפת JAVA


        //Question 13
        //א) הרעיון המרכזי של interface(חוזה/יכולת) זה לייצר חוב ללא מחלקה
        // נשתמש בפקודה זו כאשר יש מס' מחלקות שלא שייכות לעץ ירושה ולא לכולם אותו "אבא" ורוצים לרשת פונקציות מסוימות .


        //Question 14

        //א)לא ניתן להוסיף access modifier מהסיבה שזה פתוח  לכולם
        //   ניתן להגדיר interface כ public אך כתיבה כזו לא נכונה מפני שאיברי ה Interface מוגדרים כ  public אוטומטי .

        //ב) לא ניתן לממש תפונקציות ,אלא רק המחלקות שירשו ממנה יוכלו לעשות פעולה זו.


        //ג) ניתן לרשת יותר ממחלקה אחת בשונה ממחלקה abstract.


        //ד)לא ניתן להגדיר שדות בתוך ה interface


        //Question 15


        //Question 16

        //ישנם 3 הבדלים עיקריים בין interface ל abstract


        //   מחלקה abstract :
        // *ניתן לרשת יותר ממחלקה אחת
        //*מחזיק שדות מידע
        //נשתמש כשייש "אבא משותף לכול המחלקות


        //  מחלקה  interface  :
        //*ניתן לרשת יותר ממחלקה אחת
        //*לא מחזיק שדות מידע
        //נשתמש כשייש מחלקה שלא שייכת לעץ ירושה


        //Question 17

       /* IPlayer iPlayer1  = new GuitarPlayer();

        IPlayer  iPlayer0 = new PianoPlayer();



    }
        public static void startMusicShow (Player p) {

            p.play();

            if (p instanceof GuitarPlayer) {

                GuitarPlayer p_as_guitar = (GuitarPlayer) p;

                ((GuitarPlayer) p).rockAndRoll();
            }

            if (p instanceof PianoPlayer) {

                PianoPlayer p_as_Piano = (PianoPlayer) p;
                ((PianoPlayer) p).playjazz();
            }
       */

            //Question 18

        //ArrayList פקודה/שדה של המערך של אייטמים

        //ההבדל בין arraylist למערך רגיל ,שבמערך רגיל לא יתן לשנות להגדיל /למחוק





        //Question 19


      /*  ArrayList <Integer>numbers =new ArrayList<>();

        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        numbers.remove(1);
        System.out.println(numbers);
        System.out.println(numbers.indexOf(9));
      */




        //Question 21








    }


}




