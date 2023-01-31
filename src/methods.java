package com.company;




public class methods {

          //static int value (int x , int y) {
        // static method se static mathod hi call kr skte h non static method call nhi kr skte bina object bnaye object bnane ke bad koi b kr skte h
    // static means ek method puri class m share hoga jse ek fridge pure hostel m share hota h

        /* int value (int x , int y) {
        int z;
        if (x>y){
            z= x  + y;
        }
                                           // x or y are replaced by a or a1 and b or b1
        else {
            z= (x + y)*5;

        }
        return z;                            // return z means vhi chle jao jha se aye the jse c and c1 ki jgh
    }

    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c;
     //   int c=value (a , b);
        //method calling by creating an object;
        methods obj = new methods();
        c=obj.value(a , b);


        int a1 = 7;
        int b1 = 4;
        int c1;
        //int c1 = value(a1 , c1)
        //method calling by creating an object;
        c1= obj.value(a1 , b1);



        System.out.println(c);
        System.out.println(c1);*/


    /*int logic (int a , int b) {
        int c;
        if (a == b) {
            c = a + b;
        } else {
            c = (a + b) * 7;
        }
        return c;
    }*/

  //  public static void main(String[] args) {
        // using ststic statement
    /*    int a= 89;
        int b = 89;
        int c = logic (a , b);
        System.out.println(c);*/

        // using object creation;
    /*    int a1 = 45;
        int b1 =  68;
        int c1;
        methods obj = new methods();
         c1 = obj.logic(a1 , b1);
        System.out.println(c1);*/



   static int marks(int a ,  int b) {
        int c;
        if (a>b){
            c=a+b;
        }
        else {
            c=(a*b);
        }
        return c;
    }


    public static void main(String[] args) {
     int x=89;
     int y=98;
     int v= marks(x , y);
     methods obj = new methods();
     int z = obj.marks(x , y);
        System.out.println(z);
        System.out.println(v);
    }







        }


