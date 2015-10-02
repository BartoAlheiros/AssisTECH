
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
    System.out.println("Bem vindo a AssisTECH!");
        System.out.println("Escolha uma opcão: ");
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Equipamento");
        System.out.println("3 - Nova OS");
        System.out.println("4 - procurar cliente");
        System.out.println("5 - procurar equipamento");
        System.out.println("6 - procurar OS");
        System.out.println("7 - fechar os");
       CadastroCliente c1 = new CadastroCliente();
       CadastroEquipamento ce = new CadastroEquipamento ();
        CadastrarOS co = new CadastrarOS();
        
        int opt = input.nextInt();
        
        switch(opt){
        
            case 1:
       Cliente c = new Cliente ("", "", "","","", "");
                System.out.print("Dados do cliente :");                
                System.out.print("Nome :");    c.setNome(input.nextLine());
                System.out.print("CPF :");   c.setCpf(input.nextLine());
                System.out.print("Endereço :");  c.setEndereco(input.nextLine());
                System.out.print("Telefone Fixo :");  c.setTelefone1(input.nextLine());
               System.out.print("Telefone celular :");c.setTelefone2 (input.nextLine());
                System.out.print("Email :"); c.setEmail(input.nextLine());
       c1.Cadastrar(c); 
                break;
            case 2:
                        Equip e = new Equip ("", "", "", "");
                System.out.println("Dados do Equipamento");
                System.out.println("Marca :");
                e.setMarca(input.nextLine());
                System.out.println("Modelo :");
                e.setModelo(input.nextLine());
                System.out.println("Caracteristica :");
                e.setCaracteristica(input.nextLine());
                System.out.println("Número de série :");
                e.setSerie(input.nextLine());
       ce.Cadastrar(e);
                break;
            case 3:
               OS o = new OS("");
                System.out.println("Numéro de Ordem:" + o.getNo());
                System.out.println("Serviço :");
                o.setServico(input.nextLine());
                 System.out.println("projeção de entrega:" + o.getEntrega());
       co.Cadastrar(o);
                break;
            case 4:
                System.out.println("Digite um CPF para a busca, no formato 000.000.000-00");
        System.out.println(c1.procurar(input.nextLine()));
                break;
            case 5:
                System.out.println("Digite um número de série para a busca");
        System.out.println(ce.procurar(input.nextLine()));
            break;
            case 6:
                System.out.println("Digite o número da ordem de serviço");
         System.out.println(co.procurar(input.nextLine()));
                break;
            case 7: 
                System.out.println("Digite um CPF para continuar, no formato 000.000.000-00");
           boolean aux = c1.descadastrar(input.nextLine());
           if (aux == true) System.out.println("Cliente deletado da base de dados");
           else System.out.println("ERROR!");       
                break;
            case 8:
                System.out.println("Digite um número de série para continuar");
           boolean aux1 = ce.descadastrar(input.nextLine());
           if (aux1 == true) System.out.println("Equipamento Deletado da base de dados");
           else System.out.println("ERROR!"); 
                break;
            case 9:
                System.out.println("Digite o número da ordem para continuar");
           boolean aux2 = co.finalizarServico(input.nextLine());
           if (aux2 == true) System.out.println("Ordem de serviço finalizada com sucesso");
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
