package com.example.week02;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        Book book1 = new Book(1, "Harry potter", "JK Rowling", "Thriller", 19.99, true);
        Book book2 = new Book(2, "asd", "asdfg", "Fantasy", 21.2, false);
        System.out.println(book1);
        System.out.println(book2);
    }
}