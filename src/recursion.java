public class recursion {
/*    static int factorial(int n){
        if (n==0||n==1){
            return 1;

        }

        else {
            return n* factorial(n-1);
        }

    }

    public static void main(String[] args) {
        int x=5;
        System.out.println("the value of factorial 7 is- " + factorial(x));
    }*/


    static int fabon(int n) {

        int c = (n-1)+ (n-2);
        return c;
    }





    public static void main(String[] args) {
        int a = 0;
        System.out.println(fabon(a));

    }



    }

