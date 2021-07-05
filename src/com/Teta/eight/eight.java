package com.Teta.eight;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");
        equality(input1,input2);
    }
    public static void equality(String[] input1, String[] input2){
        for(int i = 0; i<input2.length;i++){
            for(int k = 0; k<input1.length;k++){
               if(input2[i].equals(input1[k])){
                   System.out.print(input2[i]+ " ");
               }
            }
        }
    }
}
