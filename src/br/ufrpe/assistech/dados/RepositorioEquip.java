/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Equip;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Michel
 */
public class RepositorioEquip implements IRepositorioEquip {
    
    private Equip[] Equip; 
    private int proxima;
    private static RepositorioEquip instance;/*proximo Equipamento,
                        *dentro do array de Equip, que será criado
                        *com o tamanho, passado pelo usuário,
                        *como parâmetro para o Construtor da classe
                        *RepositorioEquip abaixo.
                        */
    public RepositorioEquip(){
        
    }
    public RepositorioEquip(int tamanho){
        this.Equip = new Equip[tamanho];
        this.proxima = 0;
    }
    
 public static RepositorioEquip getInstance(){ //Singleton
        if (instance == null) {
            instance = new RepositorioEquip();
        }
        return instance;          
    }
    public void cadastrar(Equip c){           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma conta
                                                */
        this.Equip[this.proxima] = (Equip) c;
        this.proxima = proxima + 1;
    }
        

   public int procurarIndice(String serie) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proxima)) {
            if (serie.equals(this.Equip[i].getSerie())) {
            achou = true;
            
            } 
            else {
            i = i + 1;
            }
       
       }
      return i;
    }
   

    public boolean existe(String serie){
       boolean existe = false;
       int indice = this.procurarIndice(serie);
       if (indice != proxima){
           existe = true;
       }
       return existe;
    }
   

    public Equip procurar(String serie){        /*procura um Equipamento, recebendo
                                                *como parâmetro o número de serie desse
                                                *equipamento.
                                                */
     
        int i = this.procurarIndice(serie);
        Equip resultado = null;
        
        if (i != this.proxima) {
        resultado = this.Equip[i];
        }
        
        return resultado;
          
    }
   

    public void remover(String serie) {
        int i = this.procurarIndice(serie);
    
        if (i != this.proxima) {
        
        this.Equip[i] = this.Equip[this.proxima - 1];
        this.Equip[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
    
        
        } else {
        
        
        
        }
    }
public void salvador(){
        try{
            ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("REPEQUIP.dat")));              
            objectOut.writeObject(this);  
            objectOut.close();  
        }catch (IOException e){
            
        }
    }
  
}
