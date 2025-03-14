import javax.swing.*;

public class Exercicio3 {

    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o altura:"));
        double imc = peso / ( altura * altura );

        JOptionPane.showMessageDialog(null,"IMC: " + String.format("%.2f",imc));

        }
}
