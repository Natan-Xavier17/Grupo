package Atividades;

import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {

        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a temperatura em Fahrenheit: "));
        double conversao = (fahrenheit - 32) / 1.8;
        JOptionPane.showMessageDialog(null,"Valor em Celsius: " + String.format("%.2f",conversao));


    }
}
