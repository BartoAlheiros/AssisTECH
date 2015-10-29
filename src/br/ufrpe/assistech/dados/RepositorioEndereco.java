/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Endereço;

/**
 *
 * @author alheirosb
 */
public class RepositorioEndereco {
    
    
    /*CLASSE EM CONSTRUÇÃO
    private Endereço[] endereco;
   
    private int proxima;
    
    public RepositorioEndereco(int tamanho){
         this.endereco = new Endereço[tamanho];
         this.proxima = 0;
    }
    
 
   public int procurarIndice(String cpf) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proxima)) {
            if (cpf.equals(this.cliente[i].getCpf())) {
            achou = true;
            } else {
            i = i + 1;
            }
       
       }
      return i;
    }
   

    public void remover(String cpf) {
        int i = this.procurarIndice(cpf);
     
        if (i != this.proxima) {
        String nome = this.cliente[i].getNome();
        this.cliente[i] = this.cliente[this.proxima - 1];
        this.cliente[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
    
       
        } else {
      
       
        }
    }    

    
    public void cadastrar(Object o) {
        this.endereco[this.proxima] = (Endereço) o;
        this.proxima = proxima + 1;
    }*/
}
