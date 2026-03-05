package javaaula3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);
        
        double kWh, resp;
        
        System.out.println("Digite os kWh gastos este mês: ");
        kWh = mag.nextDouble();
        
        if(kWh<0){
            System.out.println("Valor Inválido, tente novamente");
        }else if(kWh<50){
            resp = kWh * 0.20;
            System.out.println("pagará: " + resp + " na fatura");
        }else if(kWh<150){
            resp = kWh * 0.25;
            System.out.println("pagará: " + resp + " na fatura");
        }else if(kWh<300){
            resp = kWh * 0.30;
            System.out.println("pagará: " + resp + " na fatura");
        }else if(kWh>300){
            resp = kWh * 0.40;
            System.out.println("pagará: " + resp + " na fatura");
        }
    }
    
}
