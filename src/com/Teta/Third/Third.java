package com.Teta.Third;
import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        //Vseki edin metod izpolzvan v main e zadacha
       LoopsFirstExercise();
       WriteCharsFromText();
       ShowPrime();
       Numbers();
       GuessThePassword();

    }
    public static void GuessThePassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("    Register:");
        System.out.print("Write username: ");
        String username = sc.nextLine();
        System.out.print("Write password: ");
        String password = sc.nextLine();
        System.out.println("Guess your password:");
        while(true){
            String a =sc.nextLine();
            if(a.equals(password)){
                System.out.println("Welcome "+username );
                break;
            }
            else{
                System.out.println("Wrong password!");
            }
        }
    }
    public static void LoopsFirstExercise(){
        for(int i =1;i<=100;i++){
            System.out.println(i);
        }


        for(int i =1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
    }
    public static void WriteCharsFromText(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write some text.");
        String text = sc.nextLine();

        for(int i = 0; i<text.length();i++){
            System.out.println(text.charAt(i));
        }
    }
    public static void ShowPrime(){
        for (int i =2;i<=100;i++){
            if(IsItPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean IsItPrime(int a){
        Boolean b =true;
        for (int i =2;i<=100;i++){
            if(a!=i&&a%i==0){
                b=false;
            }
        }
        return b;
    }
    public static void Numbers(){
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Write a number");

            int num = sc.nextInt();

            if(num>=1&&num<=100){
                System.out.println("Your number is:"+num);
                break;
            }
            else{
                System.out.println("Wrong number!");
            }
        }
    }
}
