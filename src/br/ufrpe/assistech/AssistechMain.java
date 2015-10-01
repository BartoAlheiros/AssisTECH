
package br.ufrpe.assistech;


import br.ufrpe.assistech.dados.RepositorioClientesArray;
import entityBeans.Cliente;
import java.util.Scanner;


public class AssistechMain {
    
    
    /*public static void Menu(){
    System.out.println("Bem vindo a AssisTECH!");
        System.out.println("Escolha uma opcão: ");
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - Cadastrar Cliente.");
        System.out.println("2 - Nova OS.");
        
        int opt = input.nextInt();
        
        switch(opt){
        
            case 1:
        
        
        }
    
    }*/
    
    
    public static void main(String[] args){
     
       //Menu();
    
       RepositorioClientesArray r = new RepositorioClientesArray(3); 
       
       Cliente c = new Cliente("Assis", "666.555.444-33");
       r.cadastrar(c);
       boolean x = r.remover("666.555.444-3");
       if (x == true) System.out.println("REMOVIDO COM SUCESSO");
       else System.out.println("CADASTRO NÃO EXISTENTE");
       
    }
    
}
