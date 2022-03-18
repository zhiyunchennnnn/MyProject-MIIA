package edu.fju;

public class SilverCustomer extends Customer {

    public SilverCustomer(String id, int amount) {
        super(id,amount );
    }
    public int gift (){
        return ((amount/1000)*100);
    }
    @Override
    public void print(){
        System.out.println(id+" "+amount+" "+total()+" ("+gift()+")");
    }

}
