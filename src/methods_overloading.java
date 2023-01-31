public class methods_overloading {


    // when we dont want anything in return from the method we use void;
/*    static void telljoke() {
        System.out.println("I invented a new word !\n" +
                "plagarism");
    }
    //change 1
        static void change (int a){
        a=98;
    }

    //change 2
    static void  change2(int [] arr) {
        arr[0]=78;
    }

    public static void main(String[] args) {
        telljoke();


    /*  int [] marks = {98 , 89 , 78 , 56 , 95};
        // Case 1 - changing the integer!;
        int x=45;
        change (x);
        System.out.println("the value of x after changing is - " + x);*/


// Case2- changing the array!;
/*        int [] marks = {98 , 89 , 78 , 56 , 95};
        change2(marks);
        System.out.println("the value of marks[0] after changing is - " + marks[0]);

    }*/




    // Methods overloading- when two or more methods can have same name but diff parameters
    // Method overloading is not performed by changing return type of methods
    // like static int oss (int a )- this type is not a case of overloading we have to change the parameters it will show error.

    static void oss(){
        System.out.println("good morning bro!");
    }

    static void oss(int a){
        System.out.println("good morning " + a +" bro" );   // here a is parameter
    }

    static void oss(int a , int b){          //  here a and b are parameters
        System.out.println("good morning " + a + "bro");
        System.out.println("good morning " + b + "bro");
    }

    public static void main(String[] args) {
        oss();
        oss(3000);
        oss (4000 , 5000);
     //here 3000 and 4000 and 5000 are arguments !
     //   Arguments are actual!
    }


}
