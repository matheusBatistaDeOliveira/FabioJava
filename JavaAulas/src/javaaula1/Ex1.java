package javaaula1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);
        
        String nome = "mag";
        double peso;
        double altura;
        
        
        
        System.out.println("Digite o seu nome: ");
        nome = mag.next();
        
        System.out.println("Digite seu peso " + nome + ": ");
        peso = mag.nextDouble();
        
        System.out.println("Digite sua altura" + nome + ": ");
        altura = mag.nextDouble();
        
        double imc = peso / (altura*altura);
        
        double imc2 = peso / (altura*2);
        
        System.out.println("Seu imc " + nome + ": " + imc);      
    }    
}
