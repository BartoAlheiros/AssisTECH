
package br.ufrpe.assistech.entityBeans;

import br.ufrpe.assistech.entityBeans.Equip;


public class OS {
    private String no;//número da OS
    private String data; //Paara datas será usada a  API Java.Time, que usa tipo Double, tipo String usado temporariamente para testes
    private String entrega;
    private Equip equipamento;
    private boolean naoAtiva; /* para o método descadastrar do controlador de OS saber se a OS está ativa 
                          *ou não e assim poder eliminá-la ou não.
                          */

    public OS(String no, String data, String entrega, Equip equipamento) { //construtor, aplicar Java.Time nas datas e gerador de número no NO
        this.no = no;
        this.data = data;
        this.entrega = entrega;
        this.equipamento = equipamento;
        this.naoAtiva =  false; 
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
   
    public String toString(){
         String text = "";
         text += "Dados do Equipmento :\n" + this.equipamento.toString() + "\n";
         text += "Numero da Ordem :" + this.no + "\n";
         text += "Data de entrada" + this.data + "\n";
         text += "Previsão de Entrega" + this.entrega + "\n";
         return text;
    }
    
}

