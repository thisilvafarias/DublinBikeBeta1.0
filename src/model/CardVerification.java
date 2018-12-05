package model;

import java.util.ArrayList;
import java.util.Scanner;



public class CardVerification {
    Scanner sn = new Scanner(System.in);


   ArrayList<Customer> customerList = new ArrayList<>();

   CustomerDB db = new CustomerDB(customerList);


    public void cardValidation(String cardNumber) {

        for (Customer customerl : customerList) {
            //Reading card
            if (customerl.getCard().getCardNumber().equals(cardNumber)) {
                System.out.println("Card identified. ");

                //Rental request is initialized
                RentalDetails rent = new RentalDetails(customerl);

                //Check card Validation (If it is expired, low balance or locked)
                if(rent.validating()) {
                    cardAuthentication(customerl.getName());

                }
            }else{
                System.out.println("Card not recognized");
                System.exit(0);
            }

            break;
        }
    }

    public void cardAuthentication(String CustomerName) {
        boolean isWrong = true;
        int tries = 0;

        while(isWrong){
            System.out.println("Please enter your Password. \n");
            String passwordEntered = sn.next();

            // verify password
            for (Customer customerl : customerList) {
                //Call method verifyPassword with password entered, if not found do (ask) it again
                if ((customerl.getCard().verifyPassword(passwordEntered))) {
                    isWrong = false;
                }else {
                        System.out.println("Entre your password again.");
                    tries ++;
                    if(tries > 3){
                        System.out.println("You locked your card, you tried more than 3 times");
                        customerl.getCard().active = false;
                        System.exit(0);

                    }
                    }
                    break;
                }
            }
        }
}
