package model;

import java.util.Calendar;
import java.util.Timer;

public class RentalDetails {
    String id;
    Timer withDrawTime;
    Timer feeExtraTime;
    Customer cust;



    public RentalDetails(Customer cust) {
        this.cust = cust;
    }



    public boolean validating(){
          if (isActive()){
              System.out.println("Card is locked");
              return false;
        }
          if (isExpired()){
              System.out.println("Your card is expired!");
              return false;
        }
          if (getBalance()){
              System.out.println("Low balance");
              return false;
        }
         else {
              System.out.println(toString());
          }
        return true;
    }


    private boolean isActive() {
        if(cust.getCard().active){
            return false;
        }else {
            return true;
        }
    }


    public boolean isExpired(){
        if(cust.getCard().getExpideredDate().after(Calendar.getInstance())){
            return false;
        }else {
            return true;
        }
    }

     public boolean getBalance(){
         if(cust.balance<0) {
             return true;
         }else {
             return false;
         }
     }

    @Override
    public String toString() {
        return "Your account is updated.";
    }
}
