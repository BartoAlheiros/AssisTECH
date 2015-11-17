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
 * @author alheirosb
 */
public class RepositorioEndereco implements IRepositorioEndereco {
    
    
    private Endereco[] endereco;
   
    private int proxima;
    
    public RepositorioEndereco(int tamanho){
         this.endereco = new Endereco[tamanho];
         this.proxima = 0;
    }
    
 
   public int procurarIndice(Cliente c) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proxima)) {
            if (c.getEndereco().equals(this.endereco[i])) {
            achou = true;
            } else {
            i = i + 1;
            }
       
       }
      return i;
    }
   

    public void remover(Cliente c) {
        int i = this.procurarIndice(c);
     
        if (i != this.proxima) {
        this.endereco[i] = this.endereco[this.proxima - 1];
        this.endereco[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
    
       
        } else {
      
       
        }
    }    

    
    public void cadastrar(Endereco o) {
        this.endereco[this.proxima] = (Endereco) o;
        this.proxima = proxima + 1;
    }
}
