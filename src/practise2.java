public class practise2 {
    //change 1- changing an integer; - in case of integers no. ki copy vha jati h to vo change nhi hota
    static void change1 (int a){
        a=67;
    }



    // change 2 - changing the array - isme array ka sirf reference jata h matlab change2 or marks same array ki bat krre h same for the object;
    static void change2(int [] arr ){
        arr[1]= 90;
    }

    public static void main(String[] args) {
        int x=68;
        change1(x);
        System.out.println("the value of x after changing - " + x);


        int [] marks = {87 , 78 , 56 , 45 ,98};
        change2(marks);
        System.out.println("the value of marks[1] after changing is - " + x);
    }

}
