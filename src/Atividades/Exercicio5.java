package Atividades;

import javax.swing.*;

public class Exercicio5 {

    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Base:"));

        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a Altura:"));

        double area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null,"A Área do Triângulo é: " + area);

    }
}
