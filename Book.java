package com.lab_2;

public class Book {
    private String name;
    private String author;
    private int year;

    public Book(String n, String a, int y){
        name = n;
        author = a;
        year = y;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

    public int getYear(){
        return year;
    }

    public void setName(String n){
        name = n;
    }

    public  void setAuthor(String a){
        author = a;
    }

    public void setYear(int y){
        year = y;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
