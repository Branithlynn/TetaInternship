package com.Teta.Fourth;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Ex1 exercise1 = new Ex1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of the array length");
        int l = sc.nextInt();
        int[] arr = new int[l];
        exercise1.FillArray(arr);
        exercise1.SumTheArray(arr);



    }

    static class Ex1{
        public void FillArray(int[] b){
            Scanner sc = new Scanner(System.in);
            System.out.println("Write the numbers to fill the array");
            String text = sc.nextLine();
            String[] res = text.split(",");
            for(int a= 0;a<res.length;a++){
                b[a]= Integer.parseInt(res[a]);
            }

        }

        public static void SumTheArray(int[] b){
            int m = 0;
            for(int i = 0; i<b.length;i++){
                m=m+b[i];
            }
            System.out.println(m);
        }
    }

}
