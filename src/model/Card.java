package model;

import java.util.Calendar;

public class Card {
    String cardNumber;
    String password;
    Calendar expideredDate;
    Customer customer;
    Boolean active;

    public Card(){}

    public Card(String cardNumber, String password, Calendar expideredDate, Boolean active ,Customer customer) {
        this.active = active;
        this.cardNumber = cardNumber;
        this.password = password;
        this.expideredDate = expideredDate;
        this.customer = customer;
    }

    public boolean verifyPassword(String pw){
        if(pw.equals(customer.getCard().getPassword())){
            return true;
        }else {
            System.out.println("Wrong password");
            return false;
        }
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Calendar getExpideredDate() {
        return expideredDate;
    }

    public void setExpideredDate(Calendar expideredDate) {
        this.expideredDate = expideredDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
