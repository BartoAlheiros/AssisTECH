
package br.ufrpe.assistech;


public class RepositorioClientesArray {
    private Cliente[] clientes;
    private int proxima;/*proxima conta de Cliente,
                        *dentro do array de Clientes, que será criado
                        *com o tamanho, passado pelo usuário,
                        *como parâmetro para o Construtor da classe
                        *RepositorioContasArray, abaixo.
                        */
    
    public RepositorioClientesArray(int tamanho){
        this.clientes = new Cliente[tamanho];
        this.proxima = 0;
    }
    
    public void cadastrar(Cliente c){           /*atualiza a variavel proxima
                                                *para indicar a proxima            
                                                *posição vazia do Array.    
                                                */
        this.clientes[this.proxima] = c;
        this.proxima = proxima + 1;
    }
    
   private int procurarIndice(String cpf) {
       int i = 0;
       boolean achou = false;
       while ((!achou) && (i < this.proxima)) {
       if (cpf.equals(this.clientes[i].getCpf())) {
       achou = true;
     } else {
         i = i + 1;
       }
    }
      return i;
   }
    public Cliente procurar(String cpf){        /*procura uma conta, recebendo
                                                *como parâmetro o número dessa
                                                *conta.
                                                */
     
    int i = this.procurarIndice(cpf);
    Cliente resultado = null;
    if (i != this.proxima) {
    resultado = this.clientes[i];
    }
    return resultado;
          
    }
   
    public void remover(String cpf) {
    int i = this.procurarIndice(cpf);
    if (i != this.proxima) {
    this.clientes[i] = this.clientes[this.proxima - 1];
    this.clientes[this.proxima - 1] = null;
    this.proxima = this.proxima - 1;
    System.out.println("Cliente " + cpf + " removido");
    } else {
    System.out.println("Cadastro não existente.");
        }
    }    
}

