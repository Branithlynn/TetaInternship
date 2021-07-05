package com.Teta.Fifth;
import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the numbers to fill the array");
        String text = sc.nextLine();
        String[] res = text.split(",");
        int[] a = new int[res.length];
        for(int c= 0;c<res.length;c++){
            a[c]= Integer.parseInt(res[c]);
        }
        Calculate(a);
    }
    public static void Calculate(int[] a){
        int c = 0;
        int count =0;
        for(int i= 0;i<a.length;i++){
            c=c+a[i];
            count++;
        }
        double m = c/count;
        System.out.println(m);
    }



}
