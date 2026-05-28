package Model;

import static View.Inicio_GUI.*;

public class Funcoes_DAO {
        public static double res;
        public static double var1;
        public static double var2;
    
    public static void Soma(){
        RESULTADO_TXT.setText("");
        var1 = Integer.parseInt(v1.getText());
        var2 = Integer.parseInt(v2.getText());
        RESULTADO_TXT.setVisible(true);
        textResultado.setVisible(true);
        RESULTADO2_TXT.setVisible(true);
        res = var1+var2;
        
        RESULTADO_TXT.setText(String.valueOf(res));
    }
    
    public static void Subtracao(){
        RESULTADO_TXT.setText("");
        var1 = Integer.parseInt(v1.getText());
        var2 = Integer.parseInt(v2.getText());
        RESULTADO_TXT.setVisible(true);
        textResultado.setVisible(true);
        RESULTADO2_TXT.setVisible(true);
        res = var1-var2;
        
        RESULTADO_TXT.setText(String.valueOf(res));
    }
        
    public static void Vezes(){
        RESULTADO_TXT.setText("");
        var1 = Integer.parseInt(v1.getText());
        var2 = Integer.parseInt(v2.getText());
        RESULTADO_TXT.setVisible(true);
        textResultado.setVisible(true);
        RESULTADO2_TXT.setVisible(true);
        res = var1*var2;
        
        RESULTADO_TXT.setText(String.valueOf(res));
    }
        
    public static void Divisao(){
        RESULTADO_TXT.setText("");
        var1 = Integer.parseInt(v1.getText());
        var2 = Integer.parseInt(v2.getText());
        RESULTADO_TXT.setVisible(true);
        textResultado.setVisible(true);
        RESULTADO2_TXT.setVisible(true);
        res = var1/var2;
        
        RESULTADO_TXT.setText(String.valueOf(res));
    }
    
    public static void Resto(){
        RESULTADO_TXT.setText("");
        var1 = Double.parseDouble(v1.getText());
        var2 = Double.parseDouble(v2.getText());
        RESULTADO_TXT.setVisible(true);
        textResultado.setVisible(true);
        RESULTADO2_TXT.setVisible(true);
        res = var1*(var2/100);
        
        RESULTADO_TXT.setText(String.valueOf(res));
    }    
        
    public static void Limpar(){
        v1.setText("");
        v2.setText("");
        RESULTADO_TXT.setText("");
        RESULTADO_TXT.setVisible(false);
        textResultado.setVisible(false);
        RESULTADO2_TXT.setVisible(false);
    }
}