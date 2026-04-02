package javaaula2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);
        
        String nome, cat = null;
        double peso;
        double altura;
        
        
        
        System.out.println("Digite o seu nome: ");
        nome = mag.next();
        
        System.out.println("Digite seu peso " + nome + ": ");
        peso = mag.nextDouble();
        
        System.out.println("Digite sua altura " + nome + ": ");
        altura = mag.nextDouble();
        
        double imc = peso / (altura*altura);
        
        double imc2 = peso / (altura*2);
        
        System.out.println("Seu imc " + nome + " é: " + imc);
        
        if(imc<0){
            System.out.println("Valor Inválido, tente novamente");
        }else if(imc<18.6){
            cat = "Abaixo do peso";
        }else if(imc<25){
            cat = "Peso normal";
        }else if(imc<30){
            cat = "Sobrepeso";
        }else if(imc<35){
            cat = "Obesidade Grau I";
        }else if(imc<40){
            cat = "Obesidade Grau II";
        }else{
            cat = "Obesidade Grau III";
        }
        
        System.out.println("E sua categoria é " +cat);
    }    
}
