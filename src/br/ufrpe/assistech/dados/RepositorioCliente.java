
package br.ufrpe.assistech.dados;

import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.negocio.Fachada;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;



public class RepositorioCliente implements IRepositorioCliente, Serializable{
    private Cliente[] cliente;
    private int proxima;
    private static RepositorioCliente instance;
    /*proxima conta de Cliente,
                        *dentro do array de Clientes, que será criado
                        *com o tamanho, passado pelo usuário,
                        *como parâmetro para o Construtor da classe
                        *RepositorioContasArray, abaixo.
                        */
    
    
    
    public RepositorioCliente(int tamanho){
         this.cliente = new Cliente[tamanho];
         this.proxima = 0;
    }
    
    /*public void cadastrar(Cliente c){           /*1 - atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                *2 - Método que cadastra uma conta
                                                
        this.cliente[this.proxima] = c;
        this.proxima = proxima + 1;
    }*/

    RepositorioCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public static RepositorioCliente getInstance(){ //Singleton
        if (instance == null) {
            instance = new RepositorioCliente(100);
        }
        return instance;          
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
   

    public boolean existe(String cpf){
       boolean existe = false;
       int indice = this.procurarIndice(cpf);
       if (indice != proxima){
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

  
    public void cadastrar(Cliente c) {
        this.cliente[this.proxima] = (Cliente) c;
        this.proxima = proxima + 1;
    }
            /*ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("REPEQUIP.dat")));              
            objectOut.writeObject(this);  
            objectOut.close();  */
    
    private void duplicaArrayClientes() {
        if (this.cliente != null && this.cliente.length > 0) {
            Cliente[] arrayDuplicado = new Cliente[this.cliente.length * 2];
            for (int i = 0; i < this.cliente.length; i++) {
                arrayDuplicado[i] = this.cliente[i];
            }
            this.cliente = arrayDuplicado;
        }
    }
    
    public void salvador(){
        
        try {
            FileOutputStream out = new FileOutputStream("repCliente");
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
    
    
    public RepositorioCliente recuperar(){
        
        //RepositorioCliente repCliente = new RepositorioCliente(100);
        
        try {
            FileInputStream in = new FileInputStream("repCliente");
            ObjectInputStream objIn = new ObjectInputStream(in);
            
            instance = (RepositorioCliente) objIn.readObject();
            
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

