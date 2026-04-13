package javaaula1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);

        int idade, dias, horas;
        String nome;
        
        System.out.println("Qual teu nome?: ");
        nome = mag.next();
        
        System.out.println("Quantos anos você tem?: ");
        idade = mag.nextInt();
        
        
        dias = idade * 365;
        horas = dias * 24;
        
        System.out.println(nome + "você viveu " + dias + " dias e " + horas + " horas");
        
        
    }    
}
