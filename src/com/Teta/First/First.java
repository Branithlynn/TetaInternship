package com.Teta.First;

import java.util.Formatter;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Formatter form = new Formatter();
        Scanner sc = new Scanner(System.in);




     /*   Task 2 POLSKO KOSOVO ZA STOLICA
         System.out.println("Write the seconds three times: ");
        int TotalSeconds = 0;
        for(int i =0;i<3;i++){
            int a = sc.nextInt();
            if(a>=1&&a<=50){
                TotalSeconds=TotalSeconds+a;
            }
            else{
                i--;
            }


        }


        int LeftSeconds = TotalSeconds%60;
        int Minutes = (TotalSeconds-LeftSeconds)/60;

        if(LeftSeconds<10){
            System.out.println("It took him "+ Minutes+":0"+LeftSeconds+" Minutes!");
        }
        else{
            System.out.println("It took him "+ Minutes+":"+LeftSeconds+" minutes!");
        }
*/


        /*

        Task1
        double usd = sc.nextDouble();
        System.out.println("The strange weird and awesome int you selected is: "+usd);
        double convert = 1.64549;
        double ll = usd*convert;
        double roundoff = (double) Math.round(ll*100)/100;
      //  form.format(m,)
        System.out.println(roundoff);
*/
/*
      char[][]  ch = new char[5][5];



         int[] sss = new int[5];
         ArrayFill(sss);
         Show(sss);

         Grid(ch);
         while(true){
             System.out.flush();
             show(ch);
             System.out.println("Write coordinates between 0,0 and 4,4");
             int x = sc.nextInt();
             int y = sc.nextInt();
             ch[x][y]='*';
         }
*/
    }
/*
    public static void Grid(char[][] a){
        for(int i =0; i<5;i++){
            for(int k =0; k<5;k++){
               a[i][k]=' ';
            }
        }
    }

    public static void show(char[][] a){
        for(int i =0; i<5;i++){
            for(int k =0; k<5;k++){
               System.out.print(a [i][k]);
            }
            System.out.println();
        }
    }


    public static void ArrayFill(int[] a){

        for (int i = 0; i <5; i++){
            a[i]= i;

        }
    }
    public static void Show(int[] a){
        for(int i = 0; i <5;i++){
            System.out.println(a[i]);
        }
    }

*/
}

