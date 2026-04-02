package javaaula1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);

        int idade;
        
        System.out.println("Qual a idade de seu filho: ");
        idade = mag.nextInt();
        
        if(idade >= 1 && idade <=10){
            System.out.println("Infantil - manhã");
        }else if(idade >10 && idade <=13){
            System.out.println("Infantil-Juvenil");
        }else if(idade >=18){
            System.out.println("Adulto");
        }else if(idade >13 && idade <=17){
            System.out.println("ADOLESCENTE");
        }else{
            System.out.println("Idade Invalida");
        }
        
        if(idade<=0){
            System.out.println("Idade Invalida");
        }else if (idade <=10){
            System.out.println("Infantil - Manhã");
        }else if (idade <=13){
            System.out.println("PRÉ-ADOLESCENTE");
        }else if (idade <=17){
            System.out.println("ADOLESCENTE");
        }else{
            System.out.println("Maior de Idade");
        }
        
        
    }    
}
