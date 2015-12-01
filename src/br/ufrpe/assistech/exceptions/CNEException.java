/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.exceptions;

/**
 *
 * @author Michel
 */
public class CNEException extends Exception {
    private String cpf;
    
    public CNEException(String cpf){
        super("Cadastro não encontrado");
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
}
