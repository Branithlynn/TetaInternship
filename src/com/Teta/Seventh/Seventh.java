package com.Teta.Seventh;

import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the numbers to fill the array");
        String[] res = sc.nextLine().split(",");
        int[] a = new int[res.length];
        for (int c= 0;c<res.length;c++) {
            a[c]= Integer.parseInt(res[c]);
        }
        EvenOdd(a);
    }
    public static void EvenOdd(int[] a){
        int count = 0;
        int[] evenodd = new int[a.length];
        for (int i = 0;i<evenodd.length;i++ ){
            if(a[i]%2==0){
                evenodd[count]=a[i];
                count++;
            }
        }
        for (int i = 0;i<evenodd.length;i++ ){
            if(a[i]%2!=0){
                evenodd[count]=a[i];
                count++;
            }
        }

        for (int i = 0;i<evenodd.length;i++ ){
            System.out.print(evenodd[i]);
        }
    }
}
