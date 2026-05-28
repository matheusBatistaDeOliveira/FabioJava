/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import static view.Login_GUI.LOGIN_TXT;
import static view.Login_GUI.SENHA_TXT;
import static view.Login_GUI.count;
import view.Menu_GUI;
import view.Splash_GUI;

/**
 *
 * @author Laboratorio-Info
 */
public class Services_DAO {
    
    public static void Verifica(){
        String login = LOGIN_TXT.getText();
        String senha = SENHA_TXT.getText();
        
        if(count==3){
            JOptionPane.showMessageDialog(null, "Acesso Bloqueado\nTente Novamente mais tarde");
            System.exit(0);
        }else{
            if(login.equals("ETEC")&&senha.equals("a123")){
                JOptionPane.showMessageDialog(null,"Seja Bem vindo Ao Sistema");
                new Menu_GUI().setVisible(true);
            }else{
                LOGIN_TXT.setText("");
                SENHA_TXT.setText("");
                JOptionPane.showMessageDialog(null,"Login ou senha errados \n Tente Novamente");
                count++;
            };
        };
    }
}
