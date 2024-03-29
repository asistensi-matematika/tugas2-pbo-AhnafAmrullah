package pbo_asis_soal_b;
public class DiscountRate {
    private static double serviceDiscountPremium = 0.2 ;
    private static double serviceDiscountGold = 0.15 ;
    private static double serviceDiscountSilver = 0.1 ;
    private static double productDiscountPremium = 0.1 ;
    private static double productDiscountGold = 0.1 ;
    private static double productDiscountSilver = 0.1 ;
    
    static double getServiceDiscountRate (String type){
        if ("Premium".equals(type)){
            return serviceDiscountPremium;
        }else if("Gold".equals(type)){
            return serviceDiscountGold;
        }else if("Silver".equals(type)){
            return serviceDiscountSilver;
        }else{
            return 0;
        }
    }
    static double getProductDiscountRate (String type){
        if ("Premium".equals(type)){
            return productDiscountPremium;
        }else if("Gold".equals(type)){
            return productDiscountGold;
        }else if("Silver".equals(type)){
            return productDiscountSilver;
        }else{
            return 0.1;
        }
    }
}
