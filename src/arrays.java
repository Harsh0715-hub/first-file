package com.company;

public class arrays {
    public static void main(String[] args) {
        /*Classroom of 500 students = you have to store marks of them;
        Two methods of it :
        1. Creating 500 variables.
        2. Using Arrays(recommended)*/

    //    Array index starts from "0";


       // Array can be used in 3 types :



    //    1. Declaration and memory allocation;
   /*     int [] marks= new int[5];

  //      Then Initialisation
        marks[0]=78;
        marks[1]=89;
        marks[2]=97;
        marks[3]=78;
        marks[4]=56;
        System.out.println(marks[4]);*/






     //   2. Declaration
/*     int [] marks;

     //   Then memory allocation
        marks= new int [5];

     // Then Initialisation
        marks[0]=78;
        marks[1]=89;
        marks[2]=97;
        marks[3]=78;
        marks[4]=56;
        System.out.println(marks[4]);*/






    //    3. Declaration , Memory allocation and Initialisation
     /*   int [] marks= {89 , 98 , 96 , 56 , 89};
        System.out.println(marks[3]);*/








        int [] marks = {67 , 78 , 67 , 98 , 89};
        System.out.println(marks.length);
        String [] name = {"Harsh" , "Harry" , "Aditya" , "Akash"};
        System.out.println(name.length);
        System.out.println(name[3]);




        //Arrays can be accessed through 2 methods;
        //1. Naive Method
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);





        //2. Using Loops;
        System.out.println("Using loops");
        for (int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }



        //Taking it in reverse order;
        System.out.println("Taking it in reverse order");
        for(int s=marks.length-1;s>=0;s-- ){
            System.out.println(marks[s]);
        }






        // for each loop

        System.out.println("using for each loop");
        //just simple syntax where no concern of the index;

        for (int element: marks ){
            System.out.println(element);
        }


    }
}
