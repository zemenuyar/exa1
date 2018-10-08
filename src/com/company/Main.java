package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("enter number: ");
        int number= input.nextInt();

        for (int i = number; i < 10; i++){
            System.out.println(i);
        }
    }
}
