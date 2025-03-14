import javax.swing.*;

public class Exercicio6 {

    public static void main(String[] args) {

         JOptionPane.showMessageDialog(null,"Equação: ax² + bx + c = 0");

         int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A: "));

         int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de B: "));

         int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor de C: "));

         int delta = (b * b) - (4 * a * c);

         JOptionPane.showMessageDialog(null,"O Delta é "+ delta);
        }

    }
