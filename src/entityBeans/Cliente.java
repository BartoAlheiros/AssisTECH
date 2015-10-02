
package entityBeans;


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

    public String getEndereco() {
        return endereco;
    }
    
    public void setEmail(){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String toString (){
        String text = "";
        text += "Nome :" + this.nome + "";
        text += "CPF :" + this.cpf + "";
        text += "Endereço :" + this.endereco + "";
        text += "Telefone celular :" + this.telefone1 + "";
        text += "Telefone fixo :" + this.telefone2 + "";
        text += "Email :" + this.email + "";
        return text;
    }
    public static void main(String[] args) {
        
    }
}
