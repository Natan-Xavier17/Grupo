import javax.swing.*;

public class Exercicio4 {

    public static void main(String[] args) {

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um valor: "));
        double quadrado = Math.pow(valor, 2);
        double cubo = Math.pow(valor, 3);

        JOptionPane.showMessageDialog(null,"O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);


    }
}
