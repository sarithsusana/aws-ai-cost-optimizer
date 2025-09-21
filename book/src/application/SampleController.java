package application;

import java.util.ArrayList;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

public class SampleController {

ArrayList<Book> books = new ArrayList<>();


@FXML

private TextField title,author,isbn;

private String titleText,authorText,isbnText;

@FXML

private Button register;

@FXML

private void saveBook() {

titleText = title.getText();

authorText = author.getText();

isbnText = isbn.getText();


books.add(new Book(titleText,authorText,Long.parseLong(isbnText),true));

for(int i=0; i<books.size();i++) {

books.get(i).displayInfo();


}

}



}



