
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.IRepositorioCliente;
import br.ufrpe.assistech.entityBeans.Cliente;

/**
 *
 * @author alheirosb: CadastroCliente é uma Classe Controlador.
 */
public class CadastroCliente implements IRepositorioCliente{

   private IRepositorioCliente repositorio;
    
    public CadastroCliente(IRepositorioCliente repo){
        this.repositorio = repo;
       
        
                                                            /*Cria, incialmente,
                                                             um Repositorio de Clientes
                                                             com 100 contas de cliente.
                                                             **Ver construtor da Classe
                                                             **RepositorioClientesArray.
                                                             */
    }
    
    public void cadastrar(Cliente c){
        if(c != null && !this.existe(c.getCpf())){
            this.cadastrar(c);
            this.repositorio.cad
            this.cadastrar(c.getEndereco());
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
        boolean aux = false;
        if(c != null){
            if (c.getQtdOS() > 0) {
            this.repositorio.remover(cpf);
            this.repositorio2.remover(c);
            aux = true;
            }else{
                aux = false; //OS aberta em nome do cliente
            }
        }else{
           aux = false; //Cliente inexistente
        }
        return aux;
    }
    
}
