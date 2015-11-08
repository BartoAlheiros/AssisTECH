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
 * @author alheirosb
 */
public interface IFachada {
    
    void cadastrarCliente (Cliente c);
    
    void cadastrarEquipamento (Equip e);
    
    void gerarOS (OS o);
    
    Cliente procurarCliente(String cpf);
    
    Equip procurarEquipamento(String serie);
    
    OS procurarOrdem (String no);
    
    void descadastrarCliente (String cpf);
    
    void descadastraEquipamento (String serie);
    
    void encerrarOS (String no);
}
