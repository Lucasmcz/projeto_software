import java.io.*;
import java.util.*;


public class Arquivo2 {
    public static void main(String[] args) throws IOException{
        //Criação de um Usuário
        OutputStream os = new FileOutputStream("Usuarios.txt");
        Writer wr = new OutputStreamWriter(os);
        BufferedWriter br = new BufferedWriter(wr);
        Usuarios users = new Usuarios("login", "senha", "nome", "funcao");
        Scanner sc1 = new Scanner(System.in);
        String nome,login,senha,funcao;
        System.out.println("Digite seu Nome:");
        nome = sc1.nextLine();
        System.out.println("Digite seu Login");
        login = sc1.nextLine();
        System.out.println("Digite sua Senha");
        senha = sc1.nextLine();
        System.out.println("Digite sua Função");
        funcao = sc1.nextLine();
        String aux = users.SetNome(nome);//Auxiliar que pega o Nome
        String aux2 = users.SetLogin(login);//Auxiliar que pega do Login
        String aux3 = users.SetSenha(senha);//Auxiliar que pega da Senha
        String aux4 = users.SetFuncao(funcao);//Auxiliar que pega da Função
        br.write("Nome:"+aux);
        br.newLine();
        br.write("Login:"+aux2);
        br.newLine();
        br.write("Senha:"+aux3);
        br.newLine();
        br.write("Função:"+aux4);
        br.close();
        

        //-Remoção de Informações----------------------------------------------------------
        
        int escolha = 0;
        System.out.println("Digite 1: Se deseja retirar o Login");
        System.out.println("Digite 2: Se deseja retirar a senha");
        System.out.println("Digite 3: Se deseja retirar o nome");
        System.out.println("Digite 4: Se deseja retirar a Função");
        System.out.println("Digite 0: Se não queira fazer uma Remoção");

        escolha = sc1.nextInt();

        if(escolha == 1)
        {
        
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        brModificado.write("Nome:"+aux);
        brModificado.newLine();
        brModificado.write("Login:Nulo");
        brModificado.newLine();
        brModificado.write("Senha:"+aux3);
        brModificado.newLine();
        brModificado.write("Função:"+aux4);
        brModificado.close();
    
        }
        
        else if(escolha ==2)
        {
        
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        brModificado.write("Nome:"+aux);
        brModificado.newLine();
        brModificado.write("Login:"+aux2);
        brModificado.newLine();
        brModificado.write("Senha:Nulo");
        brModificado.newLine();
        brModificado.write("Função:"+aux4);
        brModificado.close();

        }
        
        else if(escolha == 3)
        {
        
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        brModificado.write("Nome:Nulo");
        brModificado.newLine();
        brModificado.write("Login:"+aux2);
        brModificado.newLine();
        brModificado.write("Senha:"+aux3);
        brModificado.newLine();
        brModificado.write("Função:"+aux4);
        brModificado.close();


        }
        
        else if(escolha == 4)
        {
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        brModificado.write("Nome:Nulo");
        brModificado.newLine();
        brModificado.write("Login:"+aux2);
        brModificado.newLine();
        brModificado.write("Senha:"+aux3);
        brModificado.newLine();
        brModificado.write("Função:Nulo");
        brModificado.close();

        }

        else if(escolha == 0)
        {
            System.out.println("Nenhuma edição foi feita");
        }

        
        //-Edição de Informações de Informações----------------------------------------------------------
        int edit = 0;
        System.out.println("Digite 1: Se deseja alterar o Login");
        System.out.println("Digite 2: Se deseja alterar a senha");
        System.out.println("Digite 3: Se deseja alterar o nome");
        System.out.println("Digite 4: Se deseja alterar a Função");
        System.out.println("Digite 0: Se não queira fazer uma edição");

        edit = sc1.nextInt();

        if(edit == 1)
        {
        
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosEditado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        brModificado.write("Nome:"+aux);
        brModificado.newLine();
        System.out.println("Qual o novo seu novo Login");
        aux2 = sc1.nextLine();
        brModificado.write("Login:"+aux2);
        brModificado.newLine();
        brModificado.write("Senha:"+aux3);
        brModificado.newLine();
        brModificado.write("Função:"+aux4);
        brModificado.close();
    
        }
        
        else if(edit ==2)
        {
        
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        brModificado.write("Nome:"+aux);
        brModificado.newLine();
        brModificado.write("Login:"+aux2);
        brModificado.newLine();
        aux3 = sc1.nextLine();
        brModificado.write("Senha: "+aux3);
        brModificado.newLine();
        brModificado.write("Função:"+aux4);
        brModificado.close();

        }
        
        else if(edit == 3)
        {
        
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        aux = sc1.nextLine();
        brModificado.write("Nome:"+aux);
        brModificado.newLine();
        brModificado.write("Login:"+aux2);
        brModificado.newLine();
        brModificado.write("Senha:"+aux3);
        brModificado.newLine();
        brModificado.write("Função:"+aux4);
        brModificado.close();


        }
        
        else if(edit == 4)
        {
        OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
        Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
        BufferedWriter brModificado = new BufferedWriter(wrModificado);
        brModificado.write("Nome:Nulo");
        brModificado.newLine();
        brModificado.write("Login:"+aux2);
        brModificado.newLine();
        brModificado.write("Senha:"+aux3);
        brModificado.newLine();
        aux4 = sc1.nextLine();
        brModificado.write("Função:"+aux4);
        brModificado.close();

        }

        else if(edit == 0)
        {
            System.out.println("Nenhuma edição foi feita");
        }

        




        


        
    }
}
