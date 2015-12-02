/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.entityBeans.Equip;
import br.ufrpe.assistech.entityBeans.OS;
import br.ufrpe.assistech.exceptions.CNEException;

/**
 *
 * @author alheirosb
 */
public interface IFachada {

    void salvar();
    
    void cadastrarCliente (Cliente c) throws CNEException;
    
    void cadastrarEquipamento (Equip e);
    
    void gerarOS (OS o);
    
    Cliente procurarCliente(String cpf) throws CNEException;
    
    Equip procurarEquipamento(String serie);
    
    OS procurarOrdem (Double no);
    
    void descadastrarCliente (String cpf) throws CNEException;
    
    void descadastraEquipamento (String serie);
    
    void encerrarOS (Double no);
}