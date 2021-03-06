
package br.ufrpe.assistech.entityBeans;

import br.ufrpe.assistech.entityBeans.Cliente;
import java.io.Serializable;

/**
 *
 * @author Michel
 */
public class Equip implements Serializable{
    
    private String marca;
    private String modelo;
    private String caracteristica;
    private String serie;
    private int qtdOS=0;
    
  
    public Equip (String marca, String modelo, String caracteristica, String serie) {
        this.marca = marca;
        this.modelo = modelo;
        this.caracteristica = caracteristica;
        this.serie = serie;
    }

    public Equip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public int getQtdOS(){
        return qtdOS;
    }
    
    public void setQtdOS(int qtd){
        this.qtdOS=qtd;
    }
    
    public String getMarca (){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public String getCaracteristica(){
        return caracteristica;
    }
    
    public void setCaracteristica(String caracteristica){
        this.caracteristica=caracteristica;
    }
    
    public String getSerie(){
        return serie;
    }
    
    public void setSerie(String serie){
        this.serie=serie;
    }
    
    
    public String toString(){
        String text = "";
        text += "Marca :" + this.marca + "\n";
        text += "Modelo :" +this.modelo + "\n";
        text += "Caracteristica do Equipamento: " + this.caracteristica + "\n";
        text += "Número de série :" + this.serie + "\n";
        return text; 
    }
    
        
    
}
