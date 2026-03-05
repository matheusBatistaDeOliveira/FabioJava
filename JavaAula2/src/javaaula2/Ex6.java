package javaaula2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);

        String nome;
        
        System.out.println("Digite seu Nome: ");      
        nome = mag.next();
        
        nome = nome.toUpperCase();
        nome = nome.toLowerCase();
        
        if(nome.equalsIgnoreCase(nome)){
            nome.equals("jose");
        }
    }    
}
