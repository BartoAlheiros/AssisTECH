
package br.ufrpe.assistech.negocio;

import br.ufrpe.assistech.dados.RepositorioOS;
import br.ufrpe.assistech.entityBeans.OS;

/**
 *
 * @author Bartô
 */
public class CadastrarOS {
    private RepositorioOS repositorio;
    
    public CadastrarOS() {
        this.repositorio = new RepositorioOS(100);
    }
    
    public boolean existe(String numero){
        return this.repositorio.existe(numero);
    }
    
    public void cadastrar(OS c) {
        if(c != null && !this.existe(c.getNo())){
            this.repositorio.cadastrar(c);
        }else{
            //Conta já existe ou objeto é nulo.
        }
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
