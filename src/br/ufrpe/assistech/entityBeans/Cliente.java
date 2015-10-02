
package br.ufrpe.assistech.entityBeans;


public class Cliente {
    //private int numero;
    private String cpf;
    private String nome;
    private String telefone1;
    private String telefone2;
    private String endereco;
    private String email;
    

     public Cliente(String nome, String cpf, String endereco, String telefone1, String telefone2, String email) {
        this.cpf = cpf;
        this.nome = nome; 
        this.endereco = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }
    
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String toString (){
        String text = "";
        text += "Nome :" + this.nome + "\n";
        text += "CPF :" + this.cpf + "\n";
        text += "Endereço :" + this.endereco + "\n";
        text += "Telefone celular :" + this.telefone1 + "\n";
        text += "Telefone fixo :" + this.telefone2 + "\n";
        text += "Email :" + this.email + "";
        return text;
    }
    public static void main(String[] args) {
        
    }
}
