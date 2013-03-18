
package br.edu.unisep.AppAula1;

import br.com.jubelli.utilitarios.io.console;


public class App4 {
  
    public static void main (String[]args){
        
        Baskara b = Baskara.cacularBaskara(-2, -2,5);
     
             console.escrever("x1= "+ b.getX1() );
             console.escrever("x2" +b.getX2() );
             
             
             
       Baskara bha= new Baskara();
             console.escrever("Antes");
             console.escrever("x2" +b.getX2() );
             console.escrever("x1= "+ b.getX1() );
             
             
             
       Baskara.cacularBaskara(-2,-2,5,bha);
             console.escrever("x1= "+ b.getX1() );
             console.escrever("x2" +b.getX2() );
                   
             
    }
    
    
}

