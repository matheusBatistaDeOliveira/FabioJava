package model;

import static view.Inicio_GUI.panelImage1;
import static view.Inicio_GUI.panelImage2;
import static view.Inicio_GUI.panelImage3;
import static view.Inicio_GUI.panelImage4;
import static view.Inicio_GUI.panelImage5;
import static view.Inicio_GUI.textoAltura;
import static view.Inicio_GUI.textoPeso;



public class IMC_calc {
    public static String peso, altura;
    public static double pesoDouble, alturaDouble, resp;
    
    public static void calculo(){
        peso = textoPeso.getText();
        altura = textoAltura.getText();
        alturaDouble = Double.parseDouble(altura);
        pesoDouble = Double.parseDouble(peso);
        resp = pesoDouble/(alturaDouble * 2);
        System.out.println(resp);
        
        
        if(resp<18.5){
            panelImage1.setVisible(true);
            System.out.println("nvl 1");
            panelImage2.setVisible(false);
            panelImage3.setVisible(false);
            panelImage4.setVisible(false);
            panelImage5.setVisible(false);
        }else if(resp<25){
            panelImage2.setVisible(true);
            System.out.println("nvl 2");
            panelImage1.setVisible(false);
            panelImage3.setVisible(false);
            panelImage4.setVisible(false);
            panelImage5.setVisible(false);
        }else if(resp<30){
            panelImage3.setVisible(true);
            System.out.println("nvl 3");
            panelImage1.setVisible(false);
            panelImage2.setVisible(false);
            panelImage4.setVisible(false);
            panelImage5.setVisible(false);
        }else if(resp<36){
            panelImage4.setVisible(true);
            System.out.println("nvl 4");
            panelImage1.setVisible(false);
            panelImage2.setVisible(false);
            panelImage3.setVisible(false);
            panelImage5.setVisible(false);
        }else{
            panelImage5.setVisible(true);
            System.out.println("nvl 5");
            panelImage1.setVisible(false);
            panelImage2.setVisible(false);
            panelImage3.setVisible(false);
            panelImage4.setVisible(false);
        }
    }
    
//    public static void validacao(){
//        if(textoPeso != null && textoAltura != null){
//            model.IMC_calc.calculo();
//        }
//    }
}
