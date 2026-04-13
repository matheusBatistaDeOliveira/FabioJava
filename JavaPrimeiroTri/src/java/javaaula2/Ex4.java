package javaaula2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);
        
        int veiculo;
        int eixo;
        

        System.out.println("--------------------");
        System.out.println("1 - Carro de Passeio");
        System.out.println("2 - Caminhonete");
        System.out.println("3 - Ônibus");
        System.out.println("4 - Caminhão");
        System.out.println("--------------------");
        System.out.print("Escolha um veiculo: ");
        veiculo = mag.nextInt();        
        System.out.println("--------------------");
        
        
        
        
        switch(veiculo){
        case 1:
            System.out.println("Valor fixo de pedágio: R$10,00");
            break;
        case 2:
            System.out.println("Valor fixo de pedágio: R$15,00");
            break;
        case 3:
            System.out.println("Quantos Eixos?: ");
            eixo = mag.nextInt();
            System.out.println("Valor fixo de pedágio: R$"+5*eixo);
            break;
        case 4:
            System.out.println("Quantos Eixos?: ");
            eixo = mag.nextInt();
            System.out.println("Valor fixo de pedágio: R$"+8*eixo);
            break;
        default: System.out.println("Valor Inválido, tente novamente");
        }
    }
}