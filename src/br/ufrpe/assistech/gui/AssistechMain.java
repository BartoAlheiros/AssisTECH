
package br.ufrpe.assistech.gui;


import br.ufrpe.assistech.dados.RepositorioCliente;
import br.ufrpe.assistech.entityBeans.Cliente;
import br.ufrpe.assistech.entityBeans.Equip;
import br.ufrpe.assistech.entityBeans.OS;
import br.ufrpe.assistech.negocio.CadastrarOS;
import br.ufrpe.assistech.negocio.CadastroCliente;
import br.ufrpe.assistech.negocio.CadastroEquipamento;
import java.util.Scanner;


public class AssistechMain {
    
    
    public static void Menu(){
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
       CadastroCliente c1 = new CadastroCliente();
       CadastroEquipamento ce = new CadastroEquipamento ();
        CadastrarOS co = new CadastrarOS();
        
        int opt = input.nextInt();
        
        switch(opt){
        
            case 1:
       Cliente c = new Cliente ("", "", "","","", "");
                System.out.println("Dados do cliente");                
                System.out.println("");
                System.out.println("Nome :");
                c.setNome(input.next());
                System.out.println("CPF : ");
                c.setCpf(input.next());
                System.out.println("Endereço :");  
                c.setEndereco(input.next());
                System.out.println("Telefone Fixo :");  
                c.setTelefone1(input.next());
               System.out.println("Telefone celular :");
               c.setTelefone2(input.next());
                System.out.println("Email :"); 
                c.setEmail(input.next());
       c1.Cadastrar(c); 
                System.out.println("Cliente Cadastrado com sucesso");
                System.out.println("");
       Equip e = new Equip ("", "", "", "", c);
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
                
       ce.Cadastrar(e);
                System.out.println("Equipamento Cadastrado com Sucesso");
                System.out.println("");
               OS o = new OS("", e);
                System.out.println("Numéro de Ordem:" + o.getNo());
                System.out.println("Serviço :");
                o.setServico(input.next());
                 System.out.println("projeção de entrega:" + o.getEntrega());
       co.Cadastrar(o);
              
            case 2:
                System.out.println("Procurar com base no cliente");
                System.out.println("Digite um CPF para a busca, no formato 000.000.000-00");
                String aux = input.next();
        System.out.println(c1.procurar(aux));
              
            case 3:
                System.out.println("Procurar com base no equipamento");
                System.out.println("Digite um número de série para a busca");
                String aux1 = input.next();
        System.out.println(ce.procurar(aux1));
           
            case 4:
                System.out.println("Procurar OS");
                System.out.println("Digite o número da ordem de serviço");
                String aux2 = input.next();
         System.out.println(co.procurar(aux2));
           
            case 5:
                System.out.println("DELETAR CLIENTE - Digite um CPF para continuar, no formato 000.000.000-00");
           boolean aux4 = c1.descadastrar(input.next());
           if (aux4 == true) System.out.println("Cliente deletado da base de dados");
           else System.out.println("ERROR!");       
          
            case 6:
                System.out.println("DELETAR EQUIPAMENTO - Digite um número de série para continuar");
           boolean aux5 = ce.descadastrar(input.next());
           if (aux5 == true) System.out.println("Equipamento Deletado da base de dados");
           else System.out.println("ERROR!"); 
           
            case 7:
                System.out.println("FECHAR OS - Digite o número da ordem para continuar");
           boolean aux6 = co.finalizarServico(input.next());
           if (aux6 == true) System.out.println("Ordem de serviço finalizada com sucesso");
           else System.out.println("ERROR!"); 
                break;
        }
        
    
    }
    
    
    public static void main(String[] args){
     
       Menu();
        /*Cliente: Nome, CPF, Endereço, Telefone1, Telefone2 e Email
        Equipamento: Marca, Modelo, Caracteristica, numero de série e um Cliente
        OS: Número da OS, Data de entrada do aparelho, Previsão de entrega e um Equipamento
        */        
       /*Cliente c = new Cliente ("Assis", "111.111.111-11", "Rua Manuel de Medeiros, 45, Dois Irmãos, Recife - PE","81988888888","81999999999", "assistech@email.com");
       c.setNome("Assis Silva");
        CadastroCliente c1 = new CadastroCliente();
       c1.Cadastrar(c);
       
       Equip e = new Equip ("HP", "EliteOne800", "PC - All in one", "11111111", c);
       CadastroEquipamento ce = new CadastroEquipamento ();
       ce.Cadastrar(e);
          
       OS o = new OS ("0001", "02/10/2015", "19/10/2015", e);
       CadastrarOS co = new CadastrarOS();
       co.Cadastrar(o);
       
        //System.out.println(o); //imprimindo uma Ordem de Serviço
 
        System.out.println(c1.procurar("111.111.111-11"));    //procurando e retornando informações do cliente 
      boolean aux = c1.descadastrar("111.111.111-11");        
       if (aux == true) System.out.println("Conta Deletada");
       else System.out.println("ERROR!");
       */
       
    }
    
}
