package View;

import javax.swing.JOptionPane;

public class Interface {
    public static int y;
    
    public static void Message(){
    y=1000;
        
    while(y!=0){
        String x = JOptionPane.showInputDialog(null,"1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir\n\n\n 0 - Sair","CALCULADORA",3);
        y = Integer.parseInt(x);
        switch (y){
                case 1: 
                    Service.Operacoes_DAO.Soma();
                break;
                case 2: 
                    Service.Operacoes_DAO.Subtracao();
                break;
                case 3: 
                    Service.Operacoes_DAO.Multiplicacao();
                break;
                case 4: 
                    Service.Operacoes_DAO.Divisao();
                break;
                case 0: y=0;
                break;
                default:System.out.println("Erro, tente novamente ou digite 0 para sair");
            }
        }
    }
}
