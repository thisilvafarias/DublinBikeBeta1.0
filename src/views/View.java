package views;

import model.*;

import java.util.ArrayList;
import java.util.Scanner;


public class View {

    Terminal terminal;

    Scanner sn = new Scanner(System.in);

    //Linking database to this class
    ArrayList<Customer> customerList = new ArrayList<>();
    CustomerDB db = new CustomerDB(customerList);

    public void displayMainMenu() {
        System.out.println("*** Dublin Bike *** \n " +
                "  __o       \n" +
                " _ \\<,_\n" +
                "(*)/ (*) \n");
        System.out.println("Select one of the Options");
        System.out.println("1 - Take a Bike\n" +
                "2 - Account Details \n" +
                "3 - Log out");

        int opt = sn.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Choose a bike by the number of the stand");
                System.out.println(" | 1  | 2  | 3  | 4  |  5  | ");

                ArrayList<Stand> standList=new ArrayList<>();
                Stand st1 =  new Stand ("s1s", true, null);
                Stand st2 =  new Stand ("s2s", true, null);
                Stand st3 =  new Stand ("s3s", true, null);
                Stand st4 =  new Stand ("s4s", true, null);
                Stand st5 =  new Stand ("s5s", true, null);
                standList.add(st1);
                standList.add(st2);
                standList.add(st3);
                standList.add(st4);
                standList.add(st5);

                ArrayList<Terminal> terminalList=new ArrayList<>();
                Terminal t1 = new Terminal ("t1t","Kevin Street"  , 2 ,  5 , standList);
                Terminal t2 = new Terminal ("t2t,","Oconnel Street"  , 2 ,  6,  null);
                Terminal t3 = new Terminal ("t3t","Grafton Street"  , 2 ,  7 , null);


                ArrayList<Bike> bikeList=new ArrayList<>();
                Bike b1 = new  Bike( "b1b", true);
                Bike b2 = new  Bike( "b2b", true);
                bikeList.add(b1);
                bikeList.add(b2);






                break;
            case 2:
                for (Customer customerl : customerList) {
                    System.out.println("Name: " + customerl.getName() + "\n" +
                            "Age: " + customerl.getAge() + "\n" +
                            "Id: " + customerl.getUserId() + "\n" +
                            "Card Number: " + customerl.getCard().getCardNumber() + "\n" +
                            "Balance: " + customerl.getBalance());
                    break;
                }
                break;
            case 3:
                System.out.println("Existed");
                System.exit(0);

                break;
            default:
                System.out.println("Wrong entry");

                break;
        }
    }

    public String tapCard() {
        //Tapping card
        Scanner sn = new Scanner(System.in);
        String cardNumber;
        System.out.println("Tap your card!");
        cardNumber = sn.next();

        return cardNumber;

    }
}
