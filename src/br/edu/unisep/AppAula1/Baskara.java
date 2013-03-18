
package br.edu.unisep.AppAula1;


public class Baskara {

   
  
    private double x1;
    private double x2;
    
    
    

    public static void  cacularBaskara(float a,float b,float c,Baskara bha){
       // Baskara retorno = new Baskara();
        
        
        
        double delta = Math.sqrt(Math.pow(b,2)-4*a*c);
        double _x1 = (-b + delta) / 2 * a;
        double _x2 =(-b - delta) / 2 * a;
         
         bha.setx1(_x1);
         bha.setx2(_x2);
         
      
    }
    
    public double getX1() {
        return x1;
    }public static Baskara cacularBaskara(float a,float b,float c){
        Baskara retorno = new Baskara();
        
        
        
        double delta = Math.sqrt(Math.pow(b,2)-4*a*c);
        double _x1 = (-b + delta) / 2 * a;
        double _x2 =(-b - delta) / 2 * a;
         
         retorno.setx1(_x1);
         retorno.setx2(_x2);
         
      return retorno;
    }

    public double getX2() {
        return x2;
    }



    private void setx2(double x2) {
        this.x2 = x2;
    }

    private void setx1(double x1) {
       this.x1 =x1;
    }
    
}

