package edu.fju.sales;

public class DiscountCustomer extends Customer{
    public DiscountCustomer(String id , int amount){
        super(id,amount);
    }
    @Override
    public int total(){
        return (amount*9/10);
    }
}
