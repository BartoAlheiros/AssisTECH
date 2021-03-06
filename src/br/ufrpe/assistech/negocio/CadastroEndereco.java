/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.IRepositorioCliente;
import br.ufrpe.assistech.dados.IRepositorioEndereco;
import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.exceptions.CNEException;



/**
 *
 * @author aluno
 */
public class CadastroEndereco {
    private IRepositorioEndereco repositorio2;
    private IRepositorioCliente repositorio;
    

    public CadastroEndereco(){
        
    }
    
     public CadastroEndereco(IRepositorioCliente repositorio, IRepositorioEndereco repositorio2){
        this.repositorio = repositorio;
        this.repositorio2 = repositorio2;
        
                                                            /*Cria, incialmente,
                                                             um Repositorio de Clientes
                                                             com 100 contas de cliente.
                                                             **Ver construtor da Classe
                                                             **RepositorioClientesArray.
                                                             */
    }
    
    public void cadastrar(Cliente c)throws CNEException{
        if(c != null && !this.existe(c.getCpf())){
            repositorio.cadastrar(c);
            repositorio2.cadastrar(c.getEndereco());
        }else{
            
        }
        
    }
    
    public Cliente procurar(String cpf)throws CNEException{
        return this.repositorio.procurar(cpf);//Método que delega a responsabilidade
                                               // de procurar a conta para o repositório.
    }
    
    public boolean existe(String cpf)throws CNEException{
        return this.repositorio.existe(cpf);
    }
    
     public void salvar(){
         this.repositorio.salvar();
     }
    
    public boolean descadastrar(String cpf)throws CNEException{ 
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