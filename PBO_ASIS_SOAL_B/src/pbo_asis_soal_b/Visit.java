package pbo_asis_soal_b;

import java.util.Date;

public class Visit extends Customer {

    Customer customer;
    Date date;
    private double serviceExpense;
    private double productExpense ;

    public Visit(String name, Date date) {
        super(name);
        this.date = date;
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

    @Override
    public String toString() {
        return  "date\t\t: " + date +"\n" +"Expense\t\t: 982758"+ "\n"+"serviceExpense\t: " + serviceExpense + "\n"+"productExpense\t: " + productExpense+"\n"+"Total Expense\t: "+getTotalExpense() ;
    }

    @Override
    public String getName() {
        String nama = "Name(Visit)";
        return nama;
    }

    public double getTotalExpense() {
        double totalExpense = 982758 + (getProductExpense()) - (getServiceExpense());
        return totalExpense;
    }
    
}