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
public class Fachada implements IFachada {
    //Atributos como referências para os cadastros 
    private CadastroCliente clientes;
    private CadastroEquipamento equipamentos;
    private CadastroOS ordens;
    private static Fachada instance;
    
    private Fachada () {
        //Contrutor privado para garantir que não haja instâncias fora da classe
        this.clientes = new CadastroCliente();
        this.equipamentos = new CadastroEquipamento();
        this.ordens = new CadastroOS();
    }
    
    public static Fachada getInstance(){ //Singleton
        if (instance == null) {
            instance = new Fachada();
        }
        return instance;          
    }
    //Chamada de Métodos 
    @Override
    public void cadastrarCliente (Cliente c) {
        this.clientes.cadastrar(c);
    }
    
    @Override
    public void cadastrarEquipamento (Equip e) {
        this.equipamentos.cadastrar(e);
    }
    
    @Override
    public void gerarOS (OS o) {
        this.ordens.cadastrar(o);
    }

    @Override
    public Cliente procurarCliente(String cpf){
        return this.clientes.procurar(cpf);
    }
    
    @Override
    public Equip procurarEquipamento(String serie) {
        return this.equipamentos.procurar(serie);
    }
    
    @Override
    public OS procurarOrdem (Double no) {
        return this.ordens.procurar(no);
    }
    
    @Override
    public void descadastrarCliente (String cpf) {
        this.clientes.descadastrar(cpf);
    }
    
    @Override
    public void descadastraEquipamento (String serie) {
        this.equipamentos.descadastrar(serie);
    }
    
    @Override
    public void encerrarOS (Double no) {
        this.ordens.finalizarServico(no);
    }
}
