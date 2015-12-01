/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.entityBeans;

import java.time.LocalDate;

/**
 *
 * @author Michel
 */
public enum EnumServicos {
    FORMATACAO(50,2), TROCADEPECAS(30,7), MANUTENCAOPREVENTIVA(70,3), REMOCAODEVIRUS(40,3), INSTALACAODESOFTWARE(40,2); 
    
    //private LocalDate hoje;
    //private LocalDate previsao; 
    private double valor;
    private int prazo;
    
    private EnumServicos(/*LocalDate hoje, LocalDate previsao,*/ double valor, int prazo){
        //this.hoje=hoje;
        //this.previsao=previsao;
        this.valor=valor;
        this.prazo=prazo; //Número de dias levado para conclusão de um serviço
        
    }
    
}
