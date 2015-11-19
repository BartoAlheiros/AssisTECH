/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Equip;

/**
 *
 * @author Michel
 */
public interface IRepositorioEquip {
     RepositorioEquip repositorio = new RepositorioEquip(100);
    
    void cadastrar(Equip e);    
        
    
    int procurarIndice(String str);
       
   
    Equip procurar(String str);
    
    boolean existe(String str);
   
     void remover(String str);  
}
