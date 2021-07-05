package com.Teta.Nineth;

import java.util.Scanner;

public class Nineth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write numbers to fill the array");
        String[] res = sc.nextLine().split(",");
        int[] a = new int[res.length];
        for (int c= 0;c<res.length;c++) {
            a[c]= Integer.parseInt(res[c]);
        }
        fliparray(a);
    }
    public static void fliparray(int[] array){
        int[] temp = new int[array.length];
        int count =0;
        for(int i =array.length-1;i>=0;i--){
            temp[count]=array[i];
            count++;
        }

        for(int i = 0 ;i<temp.length;i++){
            System.out.print(temp[i]+",");
        }


        //imagine writing return in a void function lmaooooo
        //Polsko Kosovo za stolica

    }
}
