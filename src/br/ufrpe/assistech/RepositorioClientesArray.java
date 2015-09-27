
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
    
    public Cliente procurar(String num){        /**procura uma conta, recebendo
                                                *como parâmetro o número dessa
                                                *conta.
                                                */
        int i = 0;
        boolean achou = false;
        while((!achou) && (i < this.proxima)){
            if(num.equals(this.contas[i].getNumero()));
        }
    }
}
