/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrpe.assistech.gui;

import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.entityBeans.Endereço;
import br.ufrpe.assistech.entityBeans.Equip;
import br.ufrpe.assistech.entityBeans.OS;
import br.ufrpe.assistech.negocio.CadastroCliente;
import br.ufrpe.assistech.negocio.CadastroEquipamento;
import br.ufrpe.assistech.negocio.CadastroOS;
import br.ufrpe.assistech.negocio.Controlador;
import br.ufrpe.assistech.negocio.IControlador;
import java.util.Scanner;
//import br.ufrpe.assistech.negocio;

/**
 *
 * @author alheirosb
 */
public class GUI{
    CadastroCliente c1 = new CadastroCliente();
    CadastroEquipamento ce = new CadastroEquipamento();
    CadastroOS co = new CadastroOS();
    Cliente c = new Cliente();
    Endereço e = new Endereço();
    
    Controlador u = Controlador.getInstance();//utilizando a fachada.
    
    
    
    
    
    public void mostrarMenu(){
        System.out.println("Bem vindo ao menu de testes AssisTECH!");
        System.out.println("Você deverá começar criando uma OS");
        System.out.println("Escolha uma opcão: ");
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("1 - Nova OS");
        System.out.println("2 - procurar cliente");
        System.out.println("3 - procurar equipamento");
        System.out.println("4 - procurar OS");
        System.out.println("5 - Deletar cliente");
        System.out.println("6 - Deletar Equipamento");
        System.out.println("7 - fechar os");
        
        int opt = input.nextInt();
        
        switch(opt){
        
            case 1:
                
                //Runtime.getRuntime().exec("clear");
                System.out.println("             Nova OS              ");
                System.out.println("");
                System.out.println("Dados do cliente");                
                System.out.println("");
                System.out.println("Nome :");
                String nome = input.next();
                c.setNome(nome);
                input.nextLine();
                System.out.println("CPF : ");
                c.setCpf(input.next());
                System.out.println("-- CadastroEndereço--"); 
                //System.out.println("Rua :");        
                //e.setRua(input.next());            
                //input.next();
                //System.out.println("Número :");     
                //e.setNumero(input.next());          
                //input.next();
                //System.out.println("Bairro :");     
                //e.setBairro(input.next());          
                //input.next();
                //System.out.println("Cidade :");     
                //e.setCidade(input.next());          
                //input.next();
                //System.out.println("Estado :");     
                //e.setEstado(input.next());          
                //input.next();
                System.out.println("Telefone Fixo :"); 
                input.next();
                c.setTelefoneFixo(input.next());
                System.out.println("Telefone celular :");
                c.setCelular(input.next());
                System.out.println("Email :"); 
                c.setEmail(input.next());
                u.cadastrarCliente(c);//cadastrou cliente no cadastrarCliente da fachada.(Cotnrolador).
                
                
                if(c != null){
                    System.out.println("Cliente Cadastrado com sucesso");
                    System.out.println("");
                }
                
                Equip e = new Equip (c);//Criando um equipamento e preenchendo-o.
                //boolean opcao = false;
                String opcao2;
                
                System.out.println("Deseja cadastrar equipamento?");
                    
                opcao2 = input.next();
                
                boolean comandoInvalido = false;
                    
                do{
                    if(opcao2.equals("S") == true| opcao2.equals("s") == true){
                        System.out.println("Dados do Equipamento");
                        System.out.println("");
                        System.out.println("Marca :");
                        e.setMarca(input.next());
                        System.out.println("Modelo :");
                        e.setModelo(input.next());
                        System.out.println("Caracteristica :");
                        e.setCaracteristica(input.next());
                        System.out.println("Número de série :");
                        e.setSerie(input.next());

                        ce.cadastrar(e);//Cadastrando o equipamento, utilizando o Construtor de equipamento
                                        //já isntanciado antes do switch.
                        System.out.println("Equipamento Cadastrado com Sucesso");
                        System.out.println("");    
                    }
                    
                    if(opcao2.equals("n") == true | opcao2.equals("N") == true)
                        break;
                           
                    else{
                         System.out.println("Comando inválido, por favor, digite o comando correto.");
                         comandoInvalido = true;
                    }     
                        
                }while(comandoInvalido = true);//CadastroEquip
                
                OS o = new OS(e);
                System.out.println("Numéro de Ordem:" + o.getNo());
                System.out.println("Serviço :");
                o.setServico(input.next());
                System.out.println("projeção de entrega:" + o.getEntrega());
                co.cadastrar(o);
                
                this.mostrarMenu();
                //gui.mostrarMenu();
                
            case 2:
                
                System.out.println("Procurar com base no cliente");
                System.out.println("Digite um CPF para a busca, no formato 000.000.000-00");
                String aux = input.next();
                System.out.println(c1.procurar(aux));
                break;
              
            case 3:
                System.out.println("Procurar com base no equipamento");
                System.out.println("Digite um número de série para a busca");
                String aux1 = input.next();
                System.out.println(ce.procurar(aux1));
                break;
                
            case 4:
                System.out.println("Procurar OS");
                System.out.println("Digite o número da ordem de serviço");
                String aux2 = input.next();
                System.out.println(co.procurar(aux2));
                break;
                
            case 5:
                System.out.println("DELETAR CLIENTE - Digite um CPF para continuar, no formato 000.000.000-00");
                boolean aux4 = c1.descadastrar(input.next());
                if (aux4 == true) System.out.println("Cliente deletado da base de dados");
                else System.out.println("ERROR!");       
                break;
                
            case 6:
                System.out.println("DELETAR EQUIPAMENTO - Digite um número de série para continuar");
                boolean aux5 = ce.descadastrar(input.next());
                if (aux5 == true) System.out.println("Equipamento Deletado da base de dados");
                else System.out.println("ERROR!"); 
                break;
                
            case 7:
                System.out.println("FECHAR OS - Digite o número da ordem para continuar");
                boolean aux6 = co.finalizarServico(input.next());
                if (aux6 == true) System.out.println("Ordem de serviço finalizada com sucesso");
                else System.out.println("ERROR!"); 
                break;
        }
    }
}
