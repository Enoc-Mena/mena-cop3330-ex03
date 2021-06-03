/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.quotes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userQuote;
        String userAuthor;

        Scanner quote = new Scanner(System.in);
        System.out.print("Enter quote: ");
        userQuote = quote.nextLine();

        Scanner author = new Scanner(System.in);
        System.out.print("Enter author: ");
        userAuthor = author.nextLine();

        System.out.print(userAuthor + " says, " + "\"" + userQuote + "\"");

    }
}
