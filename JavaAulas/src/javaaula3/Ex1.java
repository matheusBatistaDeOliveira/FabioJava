package javaaula3;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        
        Scanner prints;
        prints = new Scanner(System.in);
        
        double km, vel;
        
        System.out.println("QUAL A VELOCIDADE PERMITIDA NA VIA: ");
        km = prints.nextDouble();
        
        System.out.println("QUAL A VELOCIDADE QUE O CARRO ESTA NO MOMENTO: ");
        vel = prints.nextDouble();
        
        if(vel <= km+10){
            System.out.println("TUDO CERTO");
        }else if(vel > km+10 && vel < km+11){
            System.out.println("MULTA DE 80,00");
        }else if(vel >= km+11 && vel<=km+39){
            System.out.println("MULTA DE 120,00");
        }else{
            System.out.println("MULTA DE 200,00");
        }
        
    }
}
