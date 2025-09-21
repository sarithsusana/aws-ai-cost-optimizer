package application;

public class Book {

private String title;

private String author;

private long isbn;

private boolean avalible;


public Book(String title, String author, long isbn, boolean avalible) {

this.title = title;

this.author = author;

this.isbn = isbn;

this.avalible = avalible;

}


public void update(String title, String author, long isbn, boolean avalible) {

this.title = title;

this.author = author;

this.isbn = isbn;

this.avalible = avalible;


}

public void displayInfo() {

System.out.println("Title: "+title+"author: "+author+"ISBN: "+isbn+"avalible"+avalible);

}

}

