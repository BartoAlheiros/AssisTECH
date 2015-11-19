
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.IRepositorioEquip;
import br.ufrpe.assistech.entityBeans.Equip;

/**
 *
 * @author Michel
 */
public class CadastroEquipamento {
    
    private IRepositorioEquip repositorio;
    
    public CadastroEquipamento(){
        
    }
    
    public CadastroEquipamento(IRepositorioEquip repositorio){
        this.repositorio = repositorio;/*Cria, incialmente,
                                                             um Repositorio de Clientes
                                                             com 100 contas de cliente.
                                                             **Ver construtor da Classe
                                                             **RepositorioClientesArray.
                                                             */
    }
    
    public void cadastrar(Equip a){
        if(a != null && !this.existe(a.getSerie())){
            this.repositorio.cadastrar(a);
        }else{
            
        }
        
    }
    
    public Equip procurar(String serie){
        return this.repositorio.procurar(serie);//Método que delega a responsabilidade
                                               // de procurar a conta para o repositório.
    }
    
     public boolean existe(String serie){
        return this.repositorio.existe(serie);
    }
    
    public boolean descadastrar(String serie){ 
        Equip a = this.repositorio.procurar(serie);
        boolean aux = false;
        if(a != null){
            if (a.getQtdOS() > 0) {
            this.repositorio.remover(serie);
            aux = true;
            }else{
               aux = false;  //Equimento com OS aberta
            }     
        }else{
           aux = false; //Equipamento inexistente
        }
            return aux ;
        
    }
}
