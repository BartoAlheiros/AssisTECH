
package br.ufrpe.assistech.entityBeans;

import br.ufrpe.assistech.entityBeans.Cliente;

/**
 *
 * @author Michel
 */
public class Equip {
    
    private String marca;
    private String modelo;
    private String caracteristica;
    private String serie;
    private Cliente cliente;
    
    public Equip (String marca, String modelo, String caracteristica, String serie, Cliente cliente){
        this.marca = marca;
        this.modelo = modelo;
        this.caracteristica = caracteristica;
        this.serie = serie;
        this.cliente = cliente;
    }
    
    public String getMarca (){
        return marca;
    }
    
    public void setMarca(){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(){
        this.modelo=modelo;
    }
    
    public String getCaracteristica(){
        return caracteristica;
    }
    
    public void setCaracteristica(){
        this.caracteristica=caracteristica;
    }
    
    public String getSerie(){
        return serie;
    }
    
    public void setSerie(){
        this.serie=serie;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public String toString(){
        String text = "";
        text += "Marca :" + this.marca + "";
        text += "Modelo :" +this.modelo + "";
        text += "Caracteristica do Equipamento: " + this.caracteristica + "";
        text += "Número de série :" + this.serie + "";
        text += "Dono :" + this.cliente.toString() + "";
        return text; 
    }
    
    public void cadastrarEquip(){
        
    }
}
