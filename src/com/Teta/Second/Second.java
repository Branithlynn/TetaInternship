package com.Teta.Second;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many kg is your body weight: ");
        double kg = sc.nextDouble();
        //switch ne stava zashtoto po uslovie iska promenlivata da e tip Double
        if (kg <= 50) {
            System.out.println("You are anorexic. EAT!");
        } else if (kg <= 70) {
            System.out.println("You are skinni!");
        } else if (kg <= 90) {
            System.out.println("You are skinni fat! A gym might be a good idea bud.");
        } else if (kg <= 110) {
            System.out.println("You are obese.");
        } else {
            System.out.println("You are extra obese.");
        }
    }
}
