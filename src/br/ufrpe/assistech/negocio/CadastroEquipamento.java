
package br.ufrpe.assistech.negocio;

import entityBeans.Equip;
import br.ufrpe.assistech.dados.RepositorioCliente;
import br.ufrpe.assistech.dados.RepositorioEquip;

/**
 *
 * @author Michel
 */
public class CadastroEquipamento {
        private RepositorioEquip repositorio;
    
    public CadastroEquipamento(){
        this.repositorio = new RepositorioEquip(100);/*Cria, incialmente,
                                                             um Repositorio de Clientes
                                                             com 100 contas de cliente.
                                                             **Ver construtor da Classe
                                                             **RepositorioClientesArray.
                                                             */
    }
    
    public void Cadastrar(Equip a){
        if(a != null && !this.existe(a.getSerie())){
            this.repositorio.cadastrar(a);
        }else{
            
        }
        
    }
    
    public Equip procurar(String serie){
        return this.repositorio.procurar(serie);//Método que delega a responsabilidade
                                               // de procurar a conta para o repositório.
    }
    
     public boolean existe(String cpf){
        return this.repositorio.existe(cpf);
    }
    
    public void descadastrar(String serie){ 
        Equip a = this.repositorio.procurar(serie);
        if(a != null){
            this.repositorio.remover(serie);
        }else{
            //Conta inexistente ou conta ainda ativa.
        }
        
    }
}
