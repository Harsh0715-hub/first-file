package com.company;

public class multidimensional_array {
    public static void main(String[] args) {
        //MULTIDIMENSIONAL ARRAYS
        int [] marks = new int[5]; //1-D ARRAY
        int [][] flats = new int[2][3]; //2-D ARRAY
        //INITIALISATION
        flats [0][0]=101;
        flats [0][1]=102;
        flats [0][2]=103;
        flats [1][0]=201;
        flats [1][1]=202;
        flats [1][2]=203;

        //PRINTING A 2-D ARRAY
        for(int i = 0;i <flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }


    }
}
