/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Equip;
import br.ufrpe.assistech.entityBeans.OS;
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
public class RepositorioOS implements IRepositorioOS {
    
    private OS[] ArrayOS;
    private int proxima;
     private static RepositorioOS instance;/*proxima conta de ArrayOS,
                        *dentro do array de ArrayOS, que será criado
                        *com o tamanho, passado pelo usuário,
                        *como parâmetro para o Construtor da classe
                        *RepositorioOS, abaixo.
                        */
    
    public RepositorioOS(int tamanho){
        this.ArrayOS = new OS[tamanho];
        this.proxima = 0;
    }
    public RepositorioOS(){
        
    }
   
     public static RepositorioOS getInstance(){ //Singleton
        if (instance == null) {
            instance = new RepositorioOS();
        }
        return instance;          
    }
    public void cadastrar(OS c){           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma ArrayOS
                                                */
        this.ArrayOS[this.proxima] = (OS) c;
       
                this.ArrayOS[this.proxima].getEquipamento().setQtdOS(( this.ArrayOS[this.proxima].getEquipamento().getQtdOS()) +1);
                this.ArrayOS[this.proxima].getCliente().setQtdOS(( this.ArrayOS[this.proxima].getCliente().getQtdOS()) +1);
         this.proxima = proxima + 1;
    }
    
   public int procurarIndice(Double no) {
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
   
    public boolean existe(Double numero){
       boolean existe = false;
       int indice = this.procurarIndice(numero);
       if (indice != proxima){
           existe = true;
       }
       return existe;
    }
   
    public OS procurar(Double no){        /*procura uma ArrayOS, recebendo
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
   
    public void remover(Double no) {
        int i = this.procurarIndice(no);
    
        if (i != this.proxima) {
        this.ArrayOS[this.proxima].getEquipamento().setQtdOS(( this.ArrayOS[this.proxima].getEquipamento().getQtdOS()) -1);
        this.ArrayOS[this.proxima].getCliente().setQtdOS(( this.ArrayOS[this.proxima].getCliente().getQtdOS()) -1);
        this.ArrayOS[i] = this.ArrayOS[this.proxima - 1];
        this.ArrayOS[this.proxima - 1] = null;
        this.proxima = this.proxima - 1;
    
              
        } else {
        
        
        
        }
    }

    
    
    /*public void salvador(){
        try{
            ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("REPOS.dat")));              
            objectOut.writeObject(this);  
            objectOut.close();  
        }catch (IOException e){
            
        }
    }*/
    
    public void salvador(){
        
        try {
            FileOutputStream out = new FileOutputStream("repOS");
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
    
    
    public RepositorioOS recuperar(){
        
        //RepositorioCliente repCliente = new RepositorioCliente(100);
        
        try {
            FileInputStream in = new FileInputStream("repOS");
            ObjectInputStream objIn = new ObjectInputStream(in);
            
            instance = (RepositorioOS) objIn.readObject();
            
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
