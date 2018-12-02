package com.lab_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book book = new Book( " ", " ", 0);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name book: ");
        book.setName(in.next());
        System.out.print("Enter name author: ");
        book.setAuthor(in.next());
        System.out.print("Enter create year: ");
        book.setYear(in.nextInt());

        System.out.println("Name: " + book.getName());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println(book);
        in.close();

    }
}
