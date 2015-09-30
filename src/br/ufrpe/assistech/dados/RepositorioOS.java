/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.negocio.OS;

/**
 *
 * @author Michel
 */
public class RepositorioOS {
    
    private OS[] OS;
    private int proxima;/*proxima conta de OS,
                        *dentro do array de OS, que será criado
                        *com o tamanho, passado pelo usuário,
                        *como parâmetro para o Construtor da classe
                        *RepositorioOS, abaixo.
                        */
    
    public RepositorioOS(int tamanho){
        this.OS = new OS[tamanho];
        this.proxima = 0;
    }
    
    public void cadastrar(OS c){           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma OS
                                                */
        this.OS[this.proxima] = c;
        this.proxima = proxima + 1;
    }
    
   private int procurarIndice(String no) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proxima)) {
            if (no.equals(this.OS[i].getNo())) {
            achou = true;
            } else {
            i = i + 1;
            }
       
       }
      return i;
    }
    public OS procurar(String no){        /*procura uma OS, recebendo
                                                *como parâmetro o número dessa
                                                *OS.
                                                */
     
        int i = this.procurarIndice(no);
        OS resultado = null;
        
        if (i != this.proxima) {
        resultado = this.OS[i];
        }
        
        return resultado;
          
    }
   
    public void remover(String no) {
        int i = this.procurarIndice(no);
    
        if (i != this.proxima) {
        
        this.OS[i] = this.OS[this.proxima - 1];
        this.OS[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
    
        System.out.println("Ordem de Serviço " + no + " removido");
        } else {
        
        System.out.println("Ordem não existente.");
        
        }
    }
}
