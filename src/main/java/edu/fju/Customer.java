package edu.fju;

public class Customer {
    String  id;
    int amount;
    float off =0.1f;
    public Customer(String id, int amount){
        this.id=id;
        this.amount=amount;
    }
    public int total(){
        return amount-((amount/1000)*100);
    }
    public void print(){
        //float offMoney=(amount/1000)*;
        System.out.println(id+" "+amount+" "+total());
        //System.out.println(id+" "+amount+" "+(amount-offMoney));

    }
}
