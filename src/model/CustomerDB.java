package model;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class CustomerDB {


    public CustomerDB(ArrayList<Customer> customerList){


        Customer c1=new Customer("Thiago",1234,30,"thi@thi.com","wexford",10,null);
        Customer c2=new Customer("Bene",1235,25,"bene@bene.com","wexford",30,null);


        ArrayList<Card> cardList=new ArrayList<>();

        Card card1=new Card("1","a",new GregorianCalendar(2019,0,31),true,c1);
        Card card2=new Card("2","b",new GregorianCalendar(2019,0,31),true,c2);

        cardList.add(card1);
        cardList.add(card2);

        c1.setCard(card1);
        c2.setCard(card2);

        customerList.add(c1);
        customerList.add(c2);
    }




}
