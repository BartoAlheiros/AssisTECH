/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

/**
 *
 * @author alheirosb
 *///teste
public interface IRepositorio {
    void cadastrar(Object o);   /*para indicar a proxima            
                                                /*posição vazia do Array.    
                                                *2 - Método que cadastra uma conta
                                                */
        
    
    int procurarIndice(String str);
       
   
    Object procurar(String str);
    
    boolean existe(String str);
   
    abstract void remover(String str);    
}

