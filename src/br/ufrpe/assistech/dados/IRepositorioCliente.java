/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Cliente;

/**
 *
 * @author alheirosb
 *///teste
public interface IRepositorioCliente {
  RepositorioCliente repositorio = new RepositorioCliente(100);
    
    void cadastrar(Cliente c);   
        
    
    int procurarIndice(String str);
       
   
    Cliente procurar(String str);
    
    boolean existe(String str);
   
     void remover(String str);    
}

