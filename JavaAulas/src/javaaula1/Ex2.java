package javaaula1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);
        
        double kilometragem, l, consumo;
        
        System.out.println("Qual a distÂncia percorrida em km?: ");
        kilometragem = mag.nextDouble();
        
        System.out.println("Quantos litros foram gastos?: ");
        l = mag.nextDouble();
        
        consumo = l/kilometragem;
        
        System.out.println("Seu carro está fazendo o consumo de: " + consumo + " por litro");
        
    }    
}
