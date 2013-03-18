package br.edu.unisep.AppAula1;

import java.util.Scanner;

public class APP {

    public static void main(String[] args) {
        String valor = "123";
        byte valorByte = Byte.parseByte(valor);
        short valorShort = Short.parseShort(valor);
        int valorInt = Integer.parseInt(valor);
        long valorLong = Long.parseLong(valor);
        float valorFloat = Float.parseFloat(valor);
        double valorDouble = Double.parseDouble(valor);
         
        System.out.print("Ola \n");
        System.out.print("Ola ");
        
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        System.out.print(nome);
    }
}
