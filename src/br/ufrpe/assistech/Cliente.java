
package br.ufrpe.assistech;


public class Cliente {
    //private int numero;
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;

     public Cliente(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome; 
    }
    
    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    
    
}
