package Service;

import javax.swing.JOptionPane;

public class Operacoes_DAO {

    public static String x;
    public static double n1, n2;

    public static void Soma() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro n°: ");
        n1 = Integer.parseInt(x);

        x = JOptionPane.showInputDialog(null, "Digite o segundo n°: ");
        n2 = Integer.parseInt(x);

        n1 = n1 + n2;

        JOptionPane.showMessageDialog(null, "O resultado é " + n1);
    }

    public static void Subtracao() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro n°: ");
        n1 = Integer.parseInt(x);

        x = JOptionPane.showInputDialog(null, "Digite o segundo n°: ");
        n2 = Integer.parseInt(x);

        n1 = n1 - n2;

        JOptionPane.showMessageDialog(null, "O resultado é: " + n1);
    }

    public static void Multiplicacao() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro n°: ");
        n1 = Integer.parseInt(x);

        x = JOptionPane.showInputDialog(null, "Digite o segundo n°: ");
        n2 = Integer.parseInt(x);

        n1 = n1 * n2;

        JOptionPane.showMessageDialog(null, "O resultado é: " + n1);
    }

    public static void Divisao() {
        x = JOptionPane.showInputDialog(null, "Digite o primeiro n°: ");
        n1 = Integer.parseInt(x);

        x = JOptionPane.showInputDialog(null, "Digite o segundo n°: ");
        n2 = Integer.parseInt(x);

        n1 = n1 / n2;

        JOptionPane.showMessageDialog(null, "O resultado é: " + n1);
    }
}
