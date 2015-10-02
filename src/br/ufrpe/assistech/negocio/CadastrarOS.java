/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.RepositorioOS;
import br.ufrpe.assistech.entityBeans.OS;

/**
 *
 * @author Michel
 */
public class CadastrarOS {
    private RepositorioOS repositorio;
    
    public CadastrarOS(){
        this.repositorio = new RepositorioOS(100);/*Cria, incialmente,
                                                             um Repositorio de OS
                                                             com 100 Ordens.
                                                             **Ver construtor da Classe
                                                             **RepositorioOS.
                                                             */
    }
    
    public void Cadastrar(OS o){
        if( o!= null && !this.existe(o.getNo())){
            this.repositorio.cadastrar(o);
        }else{
            
        }
        
    }
    
    public OS procurar(String no){
        return this.repositorio.procurar(no);//Método que delega a responsabilidade
                                               // de procurar a conta para o repositório.
    }
    
     public boolean existe(String no){
        return this.repositorio.existe(no);
    }
    
    public void finalizarServico(String osNumber){ //método para descadastrar
                                                   //uma OS.
        OS d = this.repositorio.procurar(osNumber);
        if(d != null && d.getAtiva() != true){
            this.repositorio.remover(osNumber);
        }else{
            //a a OS ainda está ativa e não pode ser removida.
        }
        
    }
}