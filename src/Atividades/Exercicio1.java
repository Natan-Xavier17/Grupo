package Atividades;

import javax.swing.*;

public class Exercicio1 {

    public static void main(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a temperatura em Celsius: "));

        double conversao = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null,"Valor em Farenheit: " + conversao);

    }

}
