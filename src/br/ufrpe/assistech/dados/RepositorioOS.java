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
public class RepositorioOS {
    
    private OS[] ArrayOS;
    private int proxima;/*proxima conta de ArrayOS,
                        *dentro do array de ArrayOS, que será criado
                        *com o tamanho, passado pelo usuário,
                        *como parâmetro para o Construtor da classe
                        *RepositorioOS, abaixo.
                        */
    
    public RepositorioOS(int tamanho){
        this.ArrayOS = new OS[tamanho];
        this.proxima = 0;
    }
    
    public void cadastrar(OS c){           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma ArrayOS
                                                */
        this.ArrayOS[this.proxima] = c;
        this.proxima = proxima + 1;
    }
    
   private int procurarIndice(String no) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proxima)) {
            if (no.equals(this.ArrayOS[i].getNo())) {
            achou = true;
            } else {
            i = i + 1;
            }
       
       }
      return i;
    }
   
    public boolean existe(String numero){
       boolean existe = false;
       int indice = this.procurarIndice(numero);
       if (indice != proxima){
           existe = true;
       }
       return existe;
    }
   
    public OS procurar(String no){        /*procura uma ArrayOS, recebendo
                                                *como parâmetro o número dessa
                                                *ArrayOS.
                                                */
     
        int i = this.procurarIndice(no);
        OS resultado = null;
        
        if (i != this.proxima) {
        resultado = this.ArrayOS[i];
        }
        
        return resultado;
          
    }
   
    public void remover(String no) {
        int i = this.procurarIndice(no);
    
        if (i != this.proxima) {
        
        this.ArrayOS[i] = this.ArrayOS[this.proxima - 1];
        this.ArrayOS[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
    
        
        } else {
        
        
        
        }
    }
}
