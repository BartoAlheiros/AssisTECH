/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

/**
 *
 * @author alheirosb
 */
public abstract class Repositorio {
    private Object[] objeto;
    private int proximo;
    
    public Repositorio(int tamanho){
        this.proximo = 0;
    }
    
    public abstract void cadastrar(Object o);           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma conta
                                                */
        
    
    public abstract int procurarIndice(String str);
       
   
    public abstract Object procurar(String str);
    
    public abstract boolean existe(String str);
   
    public abstract void remover(String str);    
}
