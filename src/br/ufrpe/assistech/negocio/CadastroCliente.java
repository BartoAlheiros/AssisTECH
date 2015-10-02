
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.RepositorioCliente;
import br.ufrpe.assistech.entityBeans.Cliente;

/**
 *
 * @author alheirosb: CadastroCliente é uma Classe Controlador.
 */
public class CadastroCliente {
    private RepositorioCliente repositorio;
    
    public CadastroCliente(){
        this.repositorio = new RepositorioCliente(100);/*Cria, incialmente,
                                                             um Repositorio de Clientes
                                                             com 100 contas de cliente.
                                                             **Ver construtor da Classe
                                                             **RepositorioClientesArray.
                                                             */
    }
    
    public void Cadastrar(Cliente c){
        if(c != null && !this.existe(c.getCpf())){
            this.repositorio.cadastrar(c);
        }else{
            
        }
        
    }
    
    public Cliente procurar(String cpf){
        return this.repositorio.procurar(cpf);//Método que delega a responsabilidade
                                               // de procurar a conta para o repositório.
    }
    
    public boolean existe(String cpf){
        return this.repositorio.existe(cpf);
    }
    
    public boolean descadastrar(String cpf){ 
        Cliente c = this.repositorio.procurar(cpf);
        if(c != null){
            this.repositorio.remover(cpf);
            return true;
        }else{
           return false; //Conta inexistente ou conta ainda ativa.
        }
        
    }
    
}
