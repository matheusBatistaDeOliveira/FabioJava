package exercicios;

import javax.swing.JOptionPane;

public class Revisao {
    
    public static void Ex3(){
    
        int valor1=0, valor2=0, valor3=0, valorT=0;
        String x;
        
        x = JOptionPane.showInputDialog(null, "Digite o Valor 1");
        valor1 = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o Valor 2");
        valor2 = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Digite o Valor 3");
        valor3 = Integer.parseInt(x);
        
        for(int count=1; count<=3; count++){
            if(valor1>valor2){
                valorT=valor1;
                
                valor1=valor2;
                valor2=valorT;
            }
            else if(valor2>valor3){
                valorT=valor2;
                
                valor2=valor3;
                valor3=valorT;
            }
        }
        
        JOptionPane.showMessageDialog(null, "a sequência crescente é "+valor1+" "+valor2+" "+valor3);
    }
}
