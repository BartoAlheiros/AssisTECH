
package entityBeans;


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
    
    public String toString (){
        String text = "";
        text += this.nome;
        text += this.cpf;
        text += this.endereco;
        text += this.telefone;
        return text;
    }
    public static void main(String[] args) {
        
    }
}
