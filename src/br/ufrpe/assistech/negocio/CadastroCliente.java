
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.RepositorioClientesArray;
import entityBeans.Cliente;

/**
 *
 * @author alheirosb: CadastroCliente é uma Classe Controlador.
 */
public class CadastroCliente {
    private RepositorioClientesArray repositorio;
    
    public CadastroCliente(){
        this.repositorio = new RepositorioClientesArray(100);/*Cria, incialmente,
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
    
    public void descadastrar(String cpf){ 
        Cliente c = this.repositorio.procurar(cpf);
        if(c != null){
            this.repositorio.remover(cpf);
        }else{
            //Conta inexistente ou conta ainda ativa.
        }
        
    }
    
}
