package edu.fju;

public class GoldenCustomer extends Customer {
    public GoldenCustomer(String id,int amount){
        super(id,amount);
    }

    public int total(){
        return amount-((amount/1000)*200);
    }
}
