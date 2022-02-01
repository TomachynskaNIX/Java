package com.welcome;
import java.util.Scanner;

public class Hello {
    private String name;
    public static void setupName (String username) {
        this.username = name;
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        String username = input.nextLine();
        System.out.println("Hello, " + username);
    }
}
