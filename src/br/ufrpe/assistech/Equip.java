
package br.ufrpe.assistech;

/**
 *
 * @author Michel
 */
public class Equip {
    
    private String marca;
    private String modelo;
    private String caracteristica;
    private int serie;
    private Cliente cliente;
    
    public Equip (String marca, String modelo, String caracteristica, int serie, Cliente cliente){
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
    
    public int getSerie(){
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
        text += this.marca;
        text += this.modelo;
        text += this.caracteristica;
        text += this.serie;
        text += this.cliente.toString();
        return text; 
    }
    
    public void cadastrarEquip(){
        
    }
}
