package javaaula2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);
        
        int a,b,c;
        
        
        System.out.println("Digite o tamanho deste lado do triangulo: ");
        a = mag.nextInt();
        
        System.out.println("Digite o tamanho deste lado do triangulo: ");
        b = mag.nextInt();
        
        System.out.println("Digite o tamanho deste lado do triangulo: ");
        c = mag.nextInt();
        
        if(a==0 || b==0 || c==0){
            System.out.println("Não é um Triangulo!");
        }else if(a==b && a==c){
            System.out.println("Você possui um Equilátero");
        }else if(a==b || b==c || c==a){
            System.out.println("Você possui um Isósceles");
        }else if(a!=b && b!=c && a!=c){
            System.out.println("Você possui um Escaleno");
        }else{
            System.out.println("Resultado impossível!");
        }
    }
}
