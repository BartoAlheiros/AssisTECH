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
 */
public abstract class Repositorio {
    protected Object[] objeto;
    private int proximo;
    
    
    
public abstract void inutil(); 

    public Repositorio(int tamanho){
         this.objeto = new Object[tamanho];
         this.proximo = 0;
    }
    
    /*public void cadastrar(Cliente c){           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma conta
                                                
        this.cliente[this.proxima] = c;
        this.proxima = proxima + 1;
    }*/
    
   public int procurarIndice(String cpf) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proximo)) {
            if (cpf.equals(this.objeto[i].getCpf())) {
            achou = true;
            } else {
            i = i + 1;
            }
       
       }
      return i;
    }
   
    public boolean existe(String cpf){
       boolean existe = false;
       int indice = this.procurarIndice(cpf);
       if (indice != proximo){
           existe = true;
       }
       return existe;
    }
    public Cliente procurar(String cpf){        /*procura uma conta, recebendo
                                                *como parâmetro o número dessa
                                                *conta.
                                                */
     
        int i = this.procurarIndice(cpf);
        Cliente resultado = null;
        
        if (i != this.proxima) {
        resultado = this.cliente[i];
        }
        
        return resultado;
          
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

    @Override
    public void cadastrar(Object o) {
        this.cliente[this.proxima] = (Cliente) o;
        this.proxima = proxima + 1;
    }
}



