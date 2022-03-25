package edu.fju.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer jane = new Customer("001",1200);
        Customer Tom = new Customer("002",800);
        SilverCustomer Candy = new SilverCustomer("003",2000);
        GoldenCustomer Bee = new GoldenCustomer("004",2000);
        GoldenCustomer Sandy = new GoldenCustomer("005",5000);
        jane.print();
        Tom.print();
        Candy.print();
        Bee.print();
        Sandy.print();
    }
}
