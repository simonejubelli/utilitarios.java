//contrua um algoritmo que, dentro como dados de entrada quais 2 pontos do plano 
//imprima a distancia entre eles 
//formula :
// 
package br.edu.unisep.AppAula1;

import br.com.jubelli.utilitarios.io.console;

public class App2 {

    public static void main(String[] args) {
        console.escrever("Digite a coordenada x do primeiro ponto: ");
        String _x1 = console.ler();
        console.escrever("Digite a coordenada y do segundo ponto: ");
        String _y1 = console.ler();
        console.escrever("Digite a coordenada x do segundo ponto: ");
        String _x2 = console.ler();
        console.escrever("Digite a coordenada y do segundo ponto: ");
        String _y2 = console.ler();

        int x1 = Integer.parseInt(_x1);
        int x2 = Integer.parseInt(_x2);
        
        Ponto pontoA = new Ponto (x1,x2);
        
        int y1 = Integer.parseInt(_y1);
        int y2 = Integer.parseInt(_y2);
        
        Ponto pontoB = new Ponto (x2,y2);
        double distanciaAB = pontoA.distancia(pontoB);
       console.escrever("Distancia entre AB = " + distanciaAB);
    }
}

