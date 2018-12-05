package model;

public class Customer extends User{

   String email;
   String address;
   double balance;


    public Customer(String name, int userId, int age, String email, String address, double balance, Card card) {
        super();
        this.name = name;
        this.userId = userId;
        this.age = age;
        this.email = email;
        this.address = address;
        this.balance = balance;
        this.card= card;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {

        this.card = card;
    }
}
