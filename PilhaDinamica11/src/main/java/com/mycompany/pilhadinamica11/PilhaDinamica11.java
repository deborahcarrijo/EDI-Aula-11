/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilhadinamica11;

import javax.swing.JOptionPane;

/**
 *
 * @author deborah
 */
public class PilhaDinamica11 {

    public static void main(String[] args) {
        String expressao;
        PilhaEncadeada pilhaDinamica = new PilhaEncadeada();

        expressao = JOptionPane.showInputDialog("Entre com a expressão: ");
        
        pilhaDinamica.verifica(expressao);
    }
}
