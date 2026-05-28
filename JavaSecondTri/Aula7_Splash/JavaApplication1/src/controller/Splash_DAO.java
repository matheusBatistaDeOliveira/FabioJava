/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import view.Login_GUI;
import view.Splash_GUI;
import static view.Splash_GUI.barra;
import static view.Splash_GUI.men_TXT;

/**
 *
 * @author Laboratorio-Info
 */
public class Splash_DAO {
    //---------------------Inicio
public static void carrega() {

    new Thread() {
        public void run() {

            for (int i = 0; i < 101; i++) {
                try {
                    sleep(60);

                    barra.setValue(i);

                    if (barra.getValue() == 10) {
                        men_TXT.setText("Fazendo a conexao com o banco de dados");
                        // driver_conexao.carregardriver();
                        sleep(2000);

                    } else if (barra.getValue() <= 30) {
                        men_TXT.setText("Carregando o sistema");
                        sleep(100);

                    } else if (barra.getValue() <= 99) {
                        men_TXT.setText("Carregamento quase completo");

                    } else {
                        men_TXT.setText("Carregamento completo. Seu programa sera iniciado.");
                        sleep(3000);

                        // Executa abertura do Login_GUI na EDT
                        SwingUtilities.invokeLater(() -> {
                            new Login_GUI().setVisible(true);
                            
                            // Fecha o próprio Splash_GUI
                            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(barra);
                            if (frame != null) {
                                frame.dispose();
                            }
                        });
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }.start();
}
    //---------------------Fim
}
