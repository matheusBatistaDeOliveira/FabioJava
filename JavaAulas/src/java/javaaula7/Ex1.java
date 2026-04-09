

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        
        //Não funciona dentro do Package de um projeto com outro main
        
        String x = JOptionPane.showInputDialog
        (null,"Digite seu nome", "Cadastro de Cliente", 0);
        
        JOptionPane.showInputDialog
        (null,"O Nome Armazenado é: " + x);
    }
}
