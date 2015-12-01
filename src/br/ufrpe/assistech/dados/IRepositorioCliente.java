/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.exceptions.CNEException;

/**
 *
 * @author alheirosb
 *///teste
public interface IRepositorioCliente {
   
    void cadastrar(Cliente c);   
        
    
    int procurarIndice(String str) throws CNEException;

    Cliente procurar(String str) throws CNEException;
    
    boolean existe(String str) throws CNEException;
   
    void remover(String str) throws CNEException; 
     
    void salvar();
}

