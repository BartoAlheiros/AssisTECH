
package br.ufrpe.assistech.gui;


import br.ufrpe.assistech.dados.RepositorioCliente;
import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.entityBeans.Equip;
import br.ufrpe.assistech.entityBeans.OS;
import br.ufrpe.assistech.negocio.CadastroOS;
import br.ufrpe.assistech.negocio.CadastroCliente;
import br.ufrpe.assistech.negocio.CadastroEquipamento;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AssistechMain {
       
    public static void main(String[] args){
     
        GUI gui = new GUI();

        gui.mostrarMenu();
        
         JOptionPane.showMessageDialog(null, "Pelo menos sabe programar em Java!\n");
    }
        

}
    

