package aulas;

import javax.swing.JOptionPane;

public class Aula1 {
    public static void Ex1(){

        // O JOptionPane é uma classe da biblioteca Swing do Java que fornece uma maneira fácil de criar caixas de diálogo
        // para entrada e exibição de mensagens INPUT e OUTPUT.


        String x = JOptionPane.showInputDialog
        (null,"Digite seu nome", "Cadastro de Cliente", 0);
        
        JOptionPane.showInputDialog
        (null,"O Nome Armazenado é: " + x);
    }
}


//Não funciona dentro do Package de um projeto com outro main, por causa da sintaxe da biblioteca JOptionPane.
// para funcionar tem que ser o único main do projeto, ou seja, tem que ser o único arquivo .java com a função main() no projeto.
