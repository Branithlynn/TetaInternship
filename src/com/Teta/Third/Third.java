package com.Teta.Third;

public class Third {
    public static void main(String[] args) {
        /*
        for(int i =1;i<=100;i++){
            System.out.println(i);
        }
        */
        /*
        for(int i =1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
      */

      Show();

    }
    public static void Show(){

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
}
