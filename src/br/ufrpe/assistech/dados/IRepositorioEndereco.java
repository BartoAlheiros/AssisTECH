/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.entityBeans.Endereco;

/**
 *
 * @author Michel
 */
public interface IRepositorioEndereco {
    RepositorioEndereco repositorio = new RepositorioEndereco(100);
      void cadastrar(Endereco end);   
        
    
    int procurarIndice(Cliente c);
    
   
     void remover(Cliente c);  
}
