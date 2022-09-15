import java.util.Scanner;

public class Usuarios {
     String login;
     String senha;
     String nome;
     String funcao;


    public  Usuarios
    ( 
    String login,
    String senha,
    String nome,
    String funcao
    )
    {
    }
    
 
   public String SetNome(String nome)
   {
    this.nome = nome;
    return nome;

   }
   public String getNome()
   {
 
    return this.nome;
   }

   public String SetLogin(String login)
   {
    this.login = login;
    return login;
   }
   
   public String getLogin()
   {
   
    return this.login;
   }

   public String getSenha()
   {
    
    return this.senha;
   }

   public String SetSenha(String senha)
   {
    this.senha = senha;
    return senha;
   }

   
   public String getFuncao(String funcao)
   {
    
    return this.funcao;
   }

   public String SetFuncao(String funcao)
   {
    this.funcao = funcao;
    return funcao;
   }

  



    public static void main(String[] args) {
        return;
        
    }



}
