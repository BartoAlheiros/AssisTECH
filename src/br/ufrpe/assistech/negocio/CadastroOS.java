/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.IRepositorioOS;
import br.ufrpe.assistech.entityBeans.OS;

/**
 *
 * @author Michel
 */
public class CadastroOS  {
    private IRepositorioOS repositorio;
    
    public CadastroOS(){
        
    }
    
    public CadastroOS(IRepositorioOS repositorio){
        this.repositorio = repositorio;/*Cria, incialmente,
                                                             um Repositorio de OS
                                                             com 100 Ordens.
                                                             **Ver construtor da Classe
                                                             **RepositorioOS.
                                                             */
    }
    
    public void cadastrar(OS o){
        if( o!= null && !this.existe(o.getNo())){
            this.repositorio.cadastrar(o);
        }else{
            
        }
        
    }
    
    public OS procurar(Double no){
        return this.repositorio.procurar(no);//Método que delega a responsabilidade
                                               // de procurar a conta para o repositório.
    }
    
     public boolean existe(Double no){
        return this.repositorio.existe(no);
    }
     
    public void salvar(){
         this.repositorio.salvar();
     } 
    
    public boolean finalizarServico(Double no){ //método para descadastrar
                                                   //uma OS.
        OS d = this.repositorio.procurar(no);
        if(d != null && d.getNaoAtiva() == true){
            this.repositorio.remover(no);
            return true;
        }else{
            return false;//a a OS ainda está ativa e não pode ser removida.
        }
        
    }
}
