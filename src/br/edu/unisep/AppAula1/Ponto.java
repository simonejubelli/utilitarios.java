
package br.edu.unisep.AppAula1;


public class Ponto {
    private int x;
    private int y;
    
    public Ponto(int x, int y ){
        this.x =y;
        this.y =y;
}
    public void setX(int x){
        this.x =y;
       
    }
    public int getX(){
        return this.x;
    }
    public double distancia(Ponto outro){
        return Math.sqrt(Math.pow(outro.x -this.x,2) +Math.pow(outro.y-this.y,2));
        
        
}
    
 
    
}