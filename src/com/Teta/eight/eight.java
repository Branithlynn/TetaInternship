package com.Teta.eight;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t1 = sc.nextLine().split(" ");
        String[] t2 = sc.nextLine().split(" ");
        Equality(t1,t2);
    }
    public static void Equality(String[] t1, String[] t2){
        for(int i = 0; i<t1.length;i++){
            for(int k = 0; k<t1.length;k++){
               if(t1[i].equals(t2[k])){
                   System.out.print(t1[i]+ " ");
               }
            }
        }
    }
}
