package javaaula2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner mag;
        mag = new Scanner(System.in);

        double pagamento, valor, troco;
        
        System.out.println("Qual o valor do produto?: ");
        valor = mag.nextDouble();
 
        System.out.println("Qual o valor dado pelo cliente?: ");
        pagamento = mag.nextDouble();
        
        troco = pagamento - valor;
        
        System.out.println("Devolver R$" + troco + " reais para o cliente");
        
    }    
}
