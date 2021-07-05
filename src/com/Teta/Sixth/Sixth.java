package com.Teta.Sixth;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the numbers to fill the array");
        String[] res = sc.nextLine().split(",");
        int[] a = new int[res.length];
        for (int c= 0;c<res.length;c++) {
            a[c]= Integer.parseInt(res[c]);
        }
        Difference(a);
    }
    public static void Difference(int[] a){
        int smallest=a[0];
        int largest=a[0];

        for (int i =1;i<a.length;i++){
            if(smallest>a[i]){
                smallest = a[i];
            }
            if(largest<a[i]){
               largest=a[i];
            }


        }
        System.out.println("The difference between {"+largest+"} and {"+smallest+"} is "+(largest-smallest));
    }
}
