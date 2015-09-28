
package br.ufrpe.assistech;


public class OS {
    private String no;//número da OS
    private double data;
    private double entrega;
    private Cliente cliente; 

    public OS(String no, double data, double entrega) { //construtor, aplicar Java.Time nas datas e gerador de número no NO
        this.no = no;
        this.data = data;
        this.entrega = entrega;
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
   
   public Cliente getCliente() {
       return cliente;
   }
   
    public String toString(){
         
    }
    
}

