
package br.ufrpe.assistech.entityBeans;


public class Cliente {
    private String cpf;
    private String nome;
    private String telefoneFixo;
    private String celular;
    private Endereco endereco;
    private String email;
    private Equip equipamento;
    private int qtdOS=0;
     
    public Cliente(){//Construtor padrão.
        
    }    
    
    public Cliente(String nome, String cpf, Endereco endereco, String telefoneFixo, String celular, String email, Equip equipamento) {
        this.cpf = cpf;
        this.nome = nome; 
        this.endereco = endereco;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
        this.email = email;
        this.equipamento=equipamento;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco end){
        this.endereco=end;
    }
    
    public int getQtdOS(){
        return qtdOS;
    }
    
    public void setQtdOS(int qtd){
        this.qtdOS=qtd;
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
        text += "Endereço :" + this.endereco.toString() + "\n";
        text += "Telefone celular :" + this.telefoneFixo + "\n";
        text += "Telefone fixo :" + this.celular + "\n";
        text += "Email :" + this.email + "";
        return text;
    }
   
}
