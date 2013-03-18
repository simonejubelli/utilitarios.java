
package br.edu.unisep.AppAula1;

import br.com.jubelli.utilitarios.io.console;
import br.com.jubelli.utilitarios.validadores.StringUtils;


public class App3 {
    

public static boolean main(String[] args, boolean equalsIgnoreCase, int str, int start) {
        console.escrever("Digite a coordenada x do primeiro ponto [x,y]:");
        String _p1 = console.ler();
        String []p1 = _p1.split(",");
        
        console.escrever("Digite a coordenada x do primeiro ponto [x,y]:");
        String _p2 = console.ler();
        String[]p2 = _p2.split(",");
        
        //validar  se e numero ou não
        
        if (StringUtils.ehInteiro(p1[0])&& StringUtils.ehInteiro(p2[1]));
        System.out.println("Digite Novamente: ");
        
        System.out.println("p1[0] ");
        System.out.println("p2[1] ");
        
        int x1 = Integer.parseInt(p1[0]);
        int y1 = Integer.parseInt(p1[1]);
        
        Ponto PontoA = new Ponto (x1,y1);
        
        int x2 = Integer.parseInt(p2[0]);
        int y2 = Integer.parseInt(p2[1]);
        
        System.out.println(p1[0]);
        
        Ponto pontoB = new Ponto (x2,y2);
        
        double distanciaAB = PontoA.distancia(pontoB);
        
        console.escrever("Distancia entre AB = " + distanciaAB);
        
        
        
        
        
        
        
        
    ///=========================================
//Compara dois objetos String especificados
// e retorna um número inteiro que indica sua posição relativa na ordem de
 //classificação.
  int String = " ".compareTo(String  );
   System.out.println("");
   
   
   
  //=========================================
   //Executa uma série de afirmações que repetidamente se refere a um
   //único objeto ou estrutura.
   
        boolean string = "".endsWith("true");
        System.out.println("endsWith");
    
//=========================================
        //Retorna os caracteres em uma string entre os valores de
         //"from" indo ate “to”.
        //retorna  uma nova string que e uma sbstring da string ou pedaços.
        String nome = null;
        String substring = nome.substring(from, [to]);
           System.out.println("Digite um nome :");

       
 //=========================================
//TRIM Remove espaços de sobra antes e depois de qualquer string.
           
           String  = " maria ".trim( );
             System.out.println("trim");
      
      
  //=========================================
                  //compara uma string para outra 
             String  = " ".equalsIgnoreCase("");
             System.out.println("equalsIgnoreCase");
    
             
 //=========================================      
  //  retorna o indice do caractere procurado.
//Se não for encontrado nada, -1 será retornado. "Start"
//até um argumento opcional que especifica a posição
//inicial dentro da string que será feita a pesquisa. O valor
//padrão até 0.
           String = "  ".indexOf(substr,[start]); 
           System.out.println("");
  //=========================================
           
         // retorna verdadeiro somente se ,e somente se for o 0 senao falso; 
           boolean  =  "  ".isEmpty(); 
           System.out.println("isEmpty");
           
  //=========================================
           
           //procurado, a pesquisa começa do fim para o início.

          String = str"  ".lastIndexOf(substr,[start]) 
           System.out.println(""); 
           
    //=========================================
           //substitui cada sustring com a string com a substituicao dada;
          String = "  "str.replaceAll(String reger,String replacement);
           System.out.println(); 
           
    //=========================================
          //substitui cada sustring com a string com a substituicao dada;
          String s = "".startsWith(String prefix);
           System.out.println("s"); 
           
           
}  
}

  
   
    

    



   
    

    
    



