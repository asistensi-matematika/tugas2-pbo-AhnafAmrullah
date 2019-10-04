package pbo_asis_soal_b;

import java.util.Date;

public class tesKARTU {
    
    public static void main(String[] args) {
        DiscountRate diskon=new DiscountRate();
        double harga=982758;
        Date myObj = new Date();
       
        Customer A1 = new Customer("Jack");
        A1.isMember();
        A1.setMember(true);
        A1.setMemberType("Premium");
        A1.toString();
        System.out.println(A1.toString());
        Visit B1 = new Visit("f", myObj);
        B1.setServiceExpense(harga*diskon.getServiceDiscountRate(A1.getMemberType()));
        B1.setProductExpense(harga*diskon.getProductDiscountRate(A1.getMemberType()));
        System.out.println(B1.toString());
        System.out.println("\n" + "===================================" + "\n");

        Customer A2 = new Customer("King");
        A2.isMember();
        A2.setMember(true);
        A2.setMemberType("Gold");
        A2.toString();
        System.out.println(A2.toString());
        Visit B2 = new Visit("f", myObj);
        B2.setServiceExpense(harga*diskon.getServiceDiscountRate(A2.getMemberType()));
        B2.setProductExpense(harga*diskon.getProductDiscountRate(A2.getMemberType()));
        System.out.println(B2.toString());
        System.out.println("\n" + "===================================" + "\n");

        Customer A3 = new Customer("Queen");
        A3.isMember();
        A3.setMember(true);
        A3.setMemberType("Silver");
        A3.toString();
        System.out.println(A3.toString());
        Visit B3 = new Visit("f", myObj);
        B3.setServiceExpense(harga*diskon.getServiceDiscountRate(A3.getMemberType()));
        B3.setProductExpense(harga*diskon.getProductDiscountRate(A3.getMemberType()));
        System.out.println(B3.toString());
        System.out.println("\n" + "===================================" + "\n");

        Customer A4 = new Customer("Ace");
        A4.isMember();
        A4.setMember(false);
        A4.setMemberType("Tidak Ada");
        A4.toString();
        System.out.println(A4.toString());
        Visit B4 = new Visit("f", myObj);
        B4.setServiceExpense(harga*diskon.getServiceDiscountRate(A4.getMemberType()));
        B4.setProductExpense(harga*diskon.getProductDiscountRate(A4.getMemberType()));
        System.out.println(B4.toString());
        System.out.println("\n" + "===================================" + "\n");
    }

}
