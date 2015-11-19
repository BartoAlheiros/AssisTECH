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
RepositorioOS repositorio = new RepositorioOS(100);
    
    void cadastrar(OS o);   
        
    
    int procurarIndice(String str);
       
   
    OS procurar(String str);
    
    boolean existe(String str);
   
     void remover(String str);  
}
