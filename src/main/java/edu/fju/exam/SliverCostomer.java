package edu.fju.exam;

public class SliverCostomer extends Customer{
    public SliverCostomer(int id , int name){
        super(id,name);
    }
    @Override
    public int print(){
        return 6;
    }
}
