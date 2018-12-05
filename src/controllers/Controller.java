package controllers;


import model.CardVerification;
import views.View;

import java.util.Scanner;


public class Controller {
    Scanner sn = new Scanner(System.in);

    public void start() {

        //Instantiate View
        View v1 = new View();

        //Display "Tap your card!" and return the cardNumber tapped from Model
        String cardNumber= v1.tapCard();



        //Instantiate CardVerification for validating card and for authenticating
        CardVerification cv = new CardVerification();
        cv.cardValidation(cardNumber);


        //Show Main Menu
        v1.displayMainMenu();





    }
}
