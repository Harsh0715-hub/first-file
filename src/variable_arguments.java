

public class variable_arguments{
 //   static int sum(int...arr){
        static int sum(int a , int...arr){     //here 1 integer is fixed i.e., it is compalsary to define a
        int rex = a;
        for ( int f:arr){
            rex +=f;
        }
        return rex;

    }


    public static void main(String[] args) {
        System.out.println(sum(4,6,8,9,4,5,6,7,7));
        //System.out.println(sum()); //when nothing is inserted it results in 0; - for pure array
        System.out.println(sum(3 )); //when one parameter is fixed
    }
}

