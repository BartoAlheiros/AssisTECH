/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.OS;

/**
 *
 * @author Michel
 */
public interface IRepositorioOS {

    
    void cadastrar(OS o);   
        
    
    int procurarIndice(Double d);
       
   
    OS procurar(Double d);
    
    boolean existe(Double d);
   
    void remover(Double d);  
     
    void salvar();
}
