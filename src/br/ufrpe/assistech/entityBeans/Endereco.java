
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.entityBeans;

/**
 *
 * @author Michel
 */
public class Endereco {
    
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
 
    
    
    public Endereco () {
        
    }
    public Endereco (String rua, String numero, String bairro, String cidade) {
        this.rua=rua;
        this.numero=numero;
        this.bairro=bairro;
        this.cidade=cidade;
       
     
    }
    
    public String getRua (){
        return rua;
    }
    
    public String getNumero (){
        return numero;
    }
    
    public String getBairro (){
        return bairro;
    }
    
    public String getCidade (){
        return cidade;
    }
    
   
    
    
    public void setRua (String rua) {
        this.rua=rua;
    }
    
    public void setNumero (String numero) {
        this.numero=numero;
    }
    
    public void setBairro (String bairro) {
        this.bairro=bairro;
    }
    
    public void setCidade (String cidade) {
        this.cidade=cidade;
    }
    
 
    
   
    
    public String toString() {
        String text = "";
        text += "Rua:" + "" + getRua() + "," + getNumero() + "-" + getBairro() + "\n";
        text += getCidade() + "\n";
 
        return text;
    }
}
