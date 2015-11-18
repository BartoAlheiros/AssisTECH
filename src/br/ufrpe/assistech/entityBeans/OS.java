
package br.ufrpe.assistech.entityBeans;

import br.ufrpe.assistech.entityBeans.Equip;
import java.time.LocalDate;


public class OS {
    private String no;//número da OS
    private String data; //Paara datas será usada a  API Java.Time, que usa tipo Double, tipo String usado temporariamente para testes
    private String entrega;
    public Equip equipamento;
    public Cliente cliente;
    private boolean naoAtiva; // para o método descadastrar do controlador de OS saber se a OS está ativa
    private String servico;   //ou não e assim poder eliminá-la ou não.
                               //
    LocalDate hoje = LocalDate.now();
    
    public OS(Cliente cliente, Equip equipamento){
        this.cliente=cliente;
        this.equipamento = equipamento;
        
    }
    
    public OS(String servico) { //construtor, aplicar Java.Time nas datas e gerador de número no NO
        this.no = "0001";
        this.servico = servico;
        this.data = "03/10/2015";
        this.entrega = "19/10/2015";
        this.naoAtiva =  false; 
    }

    public OS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
   public String getNo (){
       return no;
   }
   
   public String getData() {
       return data;
   }
   
   public String getEntrega(){
       return entrega;
   }
   
   public void setEntrega() {
       this.entrega = entrega;
   }
   
   public Equip getEquipamento() {
       return equipamento;
   }
   
   public boolean getNaoAtiva(){
       return this.naoAtiva;
   }
   
   public String getServico() {
       return this.servico;
   }
   
   public void setServico(String servico) {
       this.servico = servico;
   }
   
   public Cliente getCliente(){
       return cliente;
   }
   
   
    public String toString(){
         String text = "";
         text += "Dados do Equipmento :\n" + this.equipamento.toString() + "\n";
         text += "Numero da Ordem :" + this.no + "\n";
         text += "Data de entrada" + this.data + "\n";
         text += "Previsão de Entrega" + this.entrega + "\n";
         return text;
    }
    
}

