
package br.ufrpe.assistech.entityBeans;


public class Cliente {
    //private int numero;
    private String cpf;
    private String nome;
    private String telefoneFixo;
    private String celular;
    private Endereço endereco;
    private String email;
     
    public Cliente(){//Construtor padrão.
        
    }    
    
    public Cliente(String nome, String cpf, Endereço endereco, String telefoneFixo, String celular, String email) {
        this.cpf = cpf;
        this.nome = nome; 
        this.endereco = endereco;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public String getCelular() {
        return celular;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        text += "Endereço :" + endereco.toString();
        text += "Telefone celular :" + this.telefoneFixo + "\n";
        text += "Telefone fixo :" + this.celular + "\n";
        text += "Email :" + this.email + "";
        return text;
    }
    public static void main(String[] args) {
        
    }
}
