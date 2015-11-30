/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.entityBeans.Endereco;
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
 * @author alheirosb
 */
public class RepositorioEndereco implements IRepositorioEndereco {
    
    
    private Endereco[] endereco;
   
    private int proxima;
    private static RepositorioEndereco instance;
    
    public RepositorioEndereco(int tamanho){
         this.endereco = new Endereco[tamanho];
         this.proxima = 0;
    }
    public RepositorioEndereco(){
        
    }
  public static RepositorioEndereco getInstance(){ //Singleton
        if (instance == null) {
            instance = new RepositorioEndereco();
        }
        return instance;          
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
    
    public void salvador(){
        
        try {
            FileOutputStream out = new FileOutputStream("repEndereco");
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
       
        /*FileOutputStream out = new FileOutputStream("repCliente");
            ObjectOutputStream objectOut = new ObjectOutputStream(out);
            objectOut.writeObject(objectOut);  
            objectOut.close();  */
    
    }
    
    
    public RepositorioEndereco recuperar(){
        
        //RepositorioCliente repCliente = new RepositorioCliente(100);
        
        try {
            FileInputStream in = new FileInputStream("repEndereco");
            ObjectInputStream objIn = new ObjectInputStream(in);
            
            instance = (RepositorioEndereco) objIn.readObject();
            
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
