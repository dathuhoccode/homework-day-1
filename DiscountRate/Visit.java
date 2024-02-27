package DiscountRate;

import java.time.LocalDate;
import java.util.Date;

public class Visit {
    private custom custom;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    public Visit(String name, LocalDate date){
        custom.setName(name);
    }
    public String getName(){
        return custom.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getTotalExpense(){
        return getProductExpense()+getServiceExpense();
    }
    public String toString(){
        return "[Name: "+getName()+" Total Expense: "+getTotalExpense()+"]";
    }
}
