package exercicios;

import javax.swing.JOptionPane;

public class Vetores {
    public static void Ex1(){
        String x;
        int [] vetor1 = new int [10];
        int [] vetor2 = new int [10];
        int [] totais = new int [10];
        String texto="";
        
        
        for(int i=0;i<10;i++){
        x = JOptionPane.showInputDialog(null, "Digite o Slot do Vetor1 de número: "+(i+1)+": ");
        vetor1[i]=Integer.parseInt(x);
        }
        
        for(int i=0;i<10;i++){
        x = JOptionPane.showInputDialog(null, "Digite o Slot do Vetor2 de número "+(i+1)+": ");
        vetor2[i]=Integer.parseInt(x);
        }
                
        for(int i=0;i<10;i++){
        totais[i]= vetor1[i]*vetor2[i];
        texto += totais[i]+" | ";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static void Ex2(){
        int [] vetor = new int [10];
        String x;
        String texto="";
        
        for(int i=0;i<10;i++){
        
        x = JOptionPane.showInputDialog(null, "Digite o Slot do Vetor1 de número: "+(i+1)+": ");
        vetor[i]=Integer.parseInt(x);
        texto += vetor[i]+" | ";
        }
        
        JOptionPane.showMessageDialog(null, texto);
        JOptionPane.showMessageDialog(null, "há "+ vetor.length+" Slots neste array");
        
    }
    
}


//        Verificação        

//        for(int i=0;i<10;i++){
//          JOptionPane.showMessageDialog(null, vetor1[i]);
//          JOptionPane.showMessageDialog(null, "Há " + vetor1.length);
//        }
        