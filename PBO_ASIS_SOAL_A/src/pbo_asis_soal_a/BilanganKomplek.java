package pbo_asis_soal_a;
public class BilanganKomplek {
 
    private double riil, imajiner;
    public BilanganKomplek(double R, double I){
        this.riil = R;
        this.imajiner = I;
    }
 
    public double getRiil(){
        return this.riil;
    }
 
    public double getImajiner(){
        return this.imajiner;
    }
    
    public BilanganKomplek add(BilanganKomplek BK){
        double a1  = riil + BK.getRiil();
        double a2  = imajiner + BK.getImajiner();
        return new BilanganKomplek(a1, a2);
    }
  
    public BilanganKomplek multiply(BilanganKomplek BK){
        double a1  = riil * BK.getRiil() - imajiner * BK.getImajiner();
        double a2  = imajiner * BK.getRiil() + riil * BK.getImajiner();
        return new BilanganKomplek(a1, a2);
    }

    public String toString(){
        String result;
        if(imajiner == 0){
            result = riil + "";
        }else if(riil == 0){
            result = imajiner + "i";
        }else if (imajiner < 0){
            result = riil + " - " + (imajiner * (-1)) + "i";
        }else{
            result = riil + " + " + imajiner + "i";
        }
        return result;
    }       
}
