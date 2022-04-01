package edu.fju.sales;

public class PlatinumCustomer extends SilverCustomer{
    public PlatinumCustomer (String id , int amount){
        super(id, amount);
    }
    @Override
    public int backMoney(){
        return amount*2/10;
    }
    @Override
    public int total (){
        return amount*7/10;
    }
}
