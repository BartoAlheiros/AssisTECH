
package entityBeans;

import entityBeans.Equip;


public class OS {
    private String no;//número da OS
    private double data;
    private double entrega;
    private Equip equipamento;
    

    public OS(String no, double data, double entrega, Equip equipamento) { //construtor, aplicar Java.Time nas datas e gerador de número no NO
        this.no = no;
        this.data = data;
        this.entrega = entrega;
        this.equipamento = equipamento;
    }
  
   public String getNo (){
       return no;
   }
   
   public double getData() {
       return data;
   }
   
   public double getEntrega(){
       return entrega;
   }
   
   public void setEntrega() {
       this.entrega = entrega;
   }
   
   public Equip getEquipamento() {
       return equipamento;
   }
   
    public String toString(){
         String text = "";
         text += "Dados do Equipmento :" + this.equipamento.toString() + "";
         text += "Numero da Ordem :" + this.no + "";
         text += "Data de entrada" + this.data + "";
         text += "Previsão de Entrega" + this.entrega + "";
         return text;
    }
    
}

