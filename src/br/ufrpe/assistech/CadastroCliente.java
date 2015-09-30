
package br.ufrpe.assistech;

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
        return this.repositorio.   //faltando inserir o método existe
                                   // ou equivalente, qeu se encontre na classe do repositório.
    }
    
}
