package com.company;
import java.util.Random;
import java.util.Scanner;

public class stone_paper_scissor {
    public static void main(String[] args) {
        Scanner xd= new Scanner(System.in);
        System.out.println("Round 1");
        System.out.println("enter the no.");
        int c=xd.nextInt();
        if (c==0){
            System.out.println("stone");
        }


        else if (c==1){
            System.out.println("paper");
        }


        else if (c==2){
            System.out.println("scissor");
        }






        Random as= new Random();
        int a=as.nextInt(0,2);
        if (a==0){
            System.out.println("stone");
        }

        else if (a==1){
            System.out.println("paper");
        }

        else if (a==2){
            System.out.println("scissor");
        }





        if (a==0 && c==0){
            System.out.println("draw!!");

        }

        else if (a==0 && c==1){
            System.out.println("you loose!!");

        }


        else if (a==1 && c==0){
            System.out.println("you win!!");

        }


        else if (a==0 && c==2){
            System.out.println("you win!!");

        }



        else if (a==2 && c==0){
            System.out.println("you loose!!");

        }


        else if (a==1 && c==1){
            System.out.println("Draw!!");

        }




        else if (a==1 && c==2){
            System.out.println("you loose!!");

        }


        else if (a==2 && c==1){
            System.out.println("you win!!");

        }



        else if (a==2 && c==2){
            System.out.println("Draw!!");

        }








        Scanner cd= new Scanner(System.in);
        System.out.println("Round 2");
        System.out.println("enter the no.");
        int f=xd.nextInt();
        if (f==0){
            System.out.println("stone");
        }


        else if (f==1){
            System.out.println("paper");
        }


        else if (f==2){
            System.out.println("scissor");
        }






        Random av= new Random();
        int h=as.nextInt(0,2);
        if (h==0){
            System.out.println("stone");
        }

        else if (h==1){
            System.out.println("paper");
        }

        else if (h==2){
            System.out.println("scissor");
        }



        if (f==0 && h==0){
            System.out.println("draw!!");

        }

        else if (f==0 && h==1){
            System.out.println("you loose!!");

        }


        else if (f==1 && h==0){
            System.out.println("you win!!");

        }


        else if (f==0 && h==2){
            System.out.println("you win!!");

        }


        else if (f==2 && h==0){
            System.out.println("you loose!!");

        }


        else if (f==1 && h==1){
            System.out.println("Draw!!");

        }


        else if (f==1 && h==2){
            System.out.println("you loose!!");

        }

        else if (f==2 && h==1){
            System.out.println("you win!!");

        }



        else if (f==2 && h==2){
            System.out.println("Draw!!");

        }














        Scanner kd= new Scanner(System.in);
        System.out.println("Round 3");
        System.out.println("enter the no.");
        int k=kd.nextInt();
        if (k==0){
            System.out.println("stone");
        }


        else if (k==1){
            System.out.println("paper");
        }




        else if (k==2){
            System.out.println("scissor");
        }






        Random at= new Random();
        int t=as.nextInt(0,2);
        if (t==0){
            System.out.println("stone");
        }

        else if (t==1){
            System.out.println("paper");
        }

        else if (t==2){
            System.out.println("scissor");
        }








        if (k==0 && t==0){
            System.out.println("draw!!");

        }

        else if (k==0 && t==1){
            System.out.println("you loose!!");

        }


        else if (k==1 && t==0){
            System.out.println("you win!!");

        }


        else if (k==0 && t==2){
            System.out.println("you win!!");

        }



        else if (k==2 && t==0){
            System.out.println("you loose!!");

        }


        else if (k==1 && t==1){
            System.out.println("Draw!!");

        }


        else if (k==1 && t==2){
            System.out.println("you loose!!");

        }



        else if (k==2 && t==1){
            System.out.println("you win!!");

        }



        else if (k==2 && t==2){
            System.out.println("Draw!!");

        }


        System.out.println("GAME OVER!!!!");














    }

}
