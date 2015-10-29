/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.entityBeans.Equip;
import br.ufrpe.assistech.entityBeans.OS;

/**
 *
 * @author Michel
 */
public class Controlador {
    //Atributos como referência 
    private CadastroCliente clientes;
    private CadastroEquipamento equipamentos;
    private CadastroOS ordens;
    private static Controlador instance;
    
    public Controlador () {
        //Contrutor privado para garantir que não haja instâncias fora da classe
        this.clientes = new CadastroCliente();
        this.equipamentos = new CadastroEquipamento();
        this.ordens = new CadastroOS();
    }
    
    public static Controlador getInstace(){ //Singleton
        if (instance == null) {
            instance = new Controlador();
        }
        return instance;          
    }
    //Chamada de Métodos 
    public void cadastrarCliente (Cliente c) {
        this.clientes.cadastrar(c);
    }
    
    public void cadastrarEquipamento (Equip e) {
        this.equipamentos.cadastrar(e);
    }
    
    public void gerarOS (OS o) {
        this.ordens.cadastrar(o);
    }

    public Cliente procurarCliente(String cpf){
        return this.clientes.procurar(cpf);
    }
    
    public Equip procurarEquipamento(String serie) {
        return this.equipamentos.procurar(serie);
    }
    
    public OS procurarOrdem (String no) {
        return this.ordens.procurar(no);
    }
    
    public void descadastrarCliente (String cpf) {
        this.clientes.descadastrar(cpf);
    }
    
    public void descadastraEquipamento (String serie) {
        this.equipamentos.descadastrar(serie);
    }
    
    public void encerrarOS (String no) {
        this.ordens.finalizarServico(no);
    }
}
