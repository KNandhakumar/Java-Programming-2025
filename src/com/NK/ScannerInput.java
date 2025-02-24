package com.NK;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // user give input number value
        System.out.println(input.nextInt());
        // user give input first string
        System.out.println(input.next());
        //user give input full String value
        System.out.println(input.nextLine());
    }
}
