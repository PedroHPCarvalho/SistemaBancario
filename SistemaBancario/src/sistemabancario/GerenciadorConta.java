/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class GerenciadorConta {
    private ArrayList<ContaBase> contas;

    public GerenciadorConta() {
        contas = new ArrayList<>();
    }

    public GerenciadorConta(ContaBase contaBase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void adicionarConta(ContaBase conta) {
        contas.add(conta);
    }
    
    public ContaBase encontrarConta(String numConta) {
    for (ContaBase conta : contas) {
         if (conta.trazerNumC().equals(numConta)) {
            return conta;
         }
        }
    return null; // retorna null se não encontrar a conta
    }
    
}   


