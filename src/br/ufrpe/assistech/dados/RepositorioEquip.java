/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Equip;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michel
 */
public class RepositorioEquip implements IRepositorioEquip {
    
    private Equip[] equip; 
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
        this.equip = new Equip[tamanho];
        this.proxima = 0;
    }
    
    public static IRepositorioEquip getInstance() {
        if (instance == null) {
            instance = lerDoArquivo();
        }
        return instance;
    }
    public void cadastrar(Equip c){           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma conta
                                                */
        this.equip[this.proxima] = (Equip) c;
        this.proxima = proxima + 1;
    }
        

    public int procurarIndice(String serie) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proxima)) {
            if (serie.equals(this.equip[i].getSerie())) {
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
        resultado = this.equip[i];
        }
        
        return resultado;
          
    }
    
    private void duplicaArrayEquip() {
        if (this.equip != null && this.equip.length > 0) {
            Equip[] arrayDuplicado = new Equip[this.equip.length * 2];
            for (int i = 0; i < this.equip.length; i++) {
                arrayDuplicado[i] = this.equip[i];
            }
            this.equip = arrayDuplicado;
        }
    }
   

    public void remover(String serie) {
        int i = this.procurarIndice(serie);
    
        if (i != this.proxima) {
        
        this.equip[i] = this.equip[this.proxima - 1];
        this.equip[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
    
        
        } else {
        
        
        
        }
    }
    
    public void salvar(){
        
         
        if (instance == null) {
            return;
        }//se a instância é nula, eu fecho o método salvarArquivo com o comando return;
        try {
            FileOutputStream out = new FileOutputStream("repEquip");
            BufferedOutputStream buffer = new BufferedOutputStream(out);
            ObjectOutputStream objOut = new ObjectOutputStream(buffer);
            objOut.writeObject(instance);
            
            objOut.close();
            
            System.out.println("Escrevi!");
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RepositorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RepositorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
    private static RepositorioEquip lerDoArquivo(){
        
        //RepositorioCliente repCliente = new RepositorioCliente(100);
        
        try {
            FileInputStream in = new FileInputStream("repEquip");
            ObjectInputStream objIn = new ObjectInputStream(in);
            
            instance = (RepositorioEquip) objIn.readObject();
            
            //System.out.println(av.getNome());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RepositorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RepositorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RepositorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return instance;
    }
  
}
