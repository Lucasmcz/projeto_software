import java.io.*;
import java.util.*;
public class Arquivo {
    public static void main(String[] args) throws IOException
    {
        OutputStream os = new FileOutputStream("Projetos.txt");
        Writer wr = new OutputStreamWriter(os);
        BufferedWriter br = new BufferedWriter(wr);

        Projetos project = new Projetos("Id","Descrição","xx/xx/xxxx","xx:xx","xx/xx/xxxx","xx:xx","Coordernador","Profissionais",10,10);
        Scanner sc2 = new Scanner(System.in);

        String id,descricao,data_inicio,hora_inicio,data_final,hora_final,coordernador,profissionais;
        int valor_bolsa,periodovigencia;
        System.out.println("Digite a Identificação do projeto:");
        id = sc2.nextLine();
        System.out.println("Digite a descrição do projeto:");
        descricao = sc2.nextLine();
        System.out.println("Digite a data inicial do projeto em xx/xx/xxxx");
        data_inicio = sc2.nextLine();
        System.out.println("Digite a Hora Inicial do Projeto em xx:xx");
        hora_inicio = sc2.nextLine();
        System.out.println("Digite a data final do Projeto em xx/xx/xxxx");
        data_final = sc2.nextLine();
        System.out.println("Digite a Hora final do Projeto em xx:xx");
        hora_final = sc2.nextLine();
        System.out.println("Digite o coordernador do projeto:");
        coordernador = sc2.nextLine();
        System.out.println("Digite os profissionais envolvidos nesse projeto:");
        profissionais = sc2.nextLine();
        System.out.println("Digite o Valor Bolsa para os bolsistas desse projeto:");
        valor_bolsa = sc2.nextInt();
        System.out.println("Digite o Periodo de Vigencia:(em meses)");
        periodovigencia = sc2.nextInt();

        String aux = project.SetID(id);
        String aux2 = project.SetDescricao(descricao);
        String aux3 = project.Setdata_inicial(data_inicio);
        String aux4 = project.Set_hora_inicial(hora_inicio);
        String aux5 = project.SetData_termino(data_final);
        String aux6 = project.Set_hora_final(hora_final);
        String aux7 = project.Set_Coordernador(coordernador);
        String aux8 = project.Set_profissionais(profissionais);
        int aux9 = project.Set_ValorBolsa(valor_bolsa);
        int aux10 = project.Set_periodoVigencia(periodovigencia);

        br.write("Identificação:" +aux);
        br.newLine();
        br.write("Descrição:" +aux2);
        br.newLine();
        br.write("Data inicio:" +aux3);
        br.newLine();
        br.write("Hora Inicio do projeto:" +aux4);
        br.newLine();
        br.write("Data Final do projeto:" +aux5);
        br.newLine();
        br.write("Hora Final do projeto:"+aux6);
        br.newLine();
        br.write("Coordernador do projeto:"+aux7);
        br.newLine();
        br.write("Profissionais envolvidos do projeto:" +aux8);
        br.newLine();
        br.write("O Valor da bolsa:" +aux9);
        br.newLine();
        br.write("Periodo de vigencia da Bolsa:"+aux10);

        br.close();


        //-Remoção de Informações-----------------------------------------------------------------------------------------------------------------------
        int escolha = 0;
        System.out.println("Digite 1: Se deseja retirar a Identificação");
        System.out.println("Digite 2: Se deseja retirar a Descrição");
        System.out.println("Digite 3: Se deseja retirar a data de Inicio");
        System.out.println("Digite 4: Se deseja retirar a hora de Inicio");
        System.out.println("Digite 5: Se deseja retirar a data final");
        System.out.println("Digite 6: Se deseja retirar a hora final");
        System.out.println("Digite 7: Se deseja retirar o coordernador");
        System.out.println("Digite 8: Se deseja retirar os profissionais");
        System.out.println("Digite 9: Se deseja retirar o Valor da Bolsa");
        System.out.println("Digite 10: Se deseja retirar o Periodo de Vigencia");
        System.out.println("Digite 0: Se não queira fazer uma edição");
        
        escolha = sc2.nextInt();

        if(escolha == 1)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:Nulo");
            brModificado.newLine();
            brModificado.write("Descrição:" +aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();

        }
        else if(escolha == 2)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:Nulo");
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();

        }

        else if(escolha == 3)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+ aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:Nulo");
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();

        }

        else if(escolha == 4)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:Nulo");
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(escolha == 5)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:Nulo");
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(escolha == 6)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:Nulo");
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(escolha == 7)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:Nulo");
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }
        else if(escolha == 8)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+ aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:Nulo");
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(escolha == 9)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+ aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:"+ aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:Nulo");
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);
            brModificado.close();

            br.close(); 
        }

        else if(escolha == 10)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+ aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:"+ aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:"+ aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:Nulo");
            brModificado.close();
            
            br.close(); 
        }

        else if(escolha == 0)
        {
            System.out.println("Não ouve nenhuma alteração");
        }

        //-Edição de Informações-----------------------------------------------------------------------------------------------------------------------
        int edit = 0;
        System.out.println("Digite 1: Se deseja alterar a Identificação");
        System.out.println("Digite 2: Se deseja alterar a Descrição");
        System.out.println("Digite 3: Se deseja alterar a data de Inicio");
        System.out.println("Digite 4: Se deseja alterar a hora de Inicio");
        System.out.println("Digite 5: Se deseja alterar a data final");
        System.out.println("Digite 6: Se deseja alterar a hora final");
        System.out.println("Digite 7: Se deseja alterar o coordernador");
        System.out.println("Digite 8: Se deseja alterar os profissionais");
        System.out.println("Digite 9: Se deseja alterar o Valor da Bolsa");
        System.out.println("Digite 10: Se deseja alterar o Periodo de Vigencia");
        System.out.println("Digite 0: Se não queira fazer uma edição");
        
        edit = sc2.nextInt();

        if(edit == 1)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            System.out.println("Qual alteração deseja fazer na Identificação");
            aux = sc2.nextLine();
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:" +aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();

        }
        else if(edit == 2)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer na Descrição");
            aux2 = sc2.nextLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();

        }

        else if(edit == 3)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+ aux2);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer na Data de Inicio");
            aux3 = sc2.nextLine();
            brModificado.write("Data inicio:"+aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();

        }

        else if(edit == 4)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer na Hora de Inicio do Projeto");
            aux4 = sc2.nextLine();
            brModificado.write("Hora Inicio do projeto:"+aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(edit == 5)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer na Data final do Projeto");
            aux5 = sc2.nextLine();
            brModificado.write("Data Final do projeto:"+aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(edit == 6)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer na Hora final do Projeto");
            aux6 = sc2.nextLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(edit == 7)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer no coordernador");
            aux7 = sc2.nextLine();
            brModificado.write("Coordernador do projeto:"+aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:" +aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }
        else if(edit == 8)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+ aux7);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer nos projetos envolvidos");
            aux8 = sc2.nextLine();
            brModificado.write("Profissionais envolvidos do projeto:"+aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:" +aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);

            brModificado.close();

            br.close();
        }

        else if(edit == 9)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+ aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:"+ aux8);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer no valor da bolsa");
            aux9 = sc2.nextInt();
            brModificado.write("O Valor da bolsa:"+aux9);
            brModificado.newLine();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);
            brModificado.close();

            br.close(); 
        }

        else if(edit == 10)
        {
            OutputStream ArquivoModificado = new FileOutputStream("ProjetosModificados.txt");
            Writer wrModificado = new OutputStreamWriter(ArquivoModificado);
            BufferedWriter brModificado = new BufferedWriter(wrModificado);
            brModificado.write("Identificação:"+aux);
            brModificado.newLine();
            brModificado.write("Descrição:"+aux2);
            brModificado.newLine();
            brModificado.write("Data inicio:" +aux3);
            brModificado.newLine();
            brModificado.write("Hora Inicio do projeto:" +aux4);
            brModificado.newLine();
            brModificado.write("Data Final do projeto:" +aux5);
            brModificado.newLine();
            brModificado.write("Hora Final do projeto:"+aux6);
            brModificado.newLine();
            brModificado.write("Coordernador do projeto:"+ aux7);
            brModificado.newLine();
            brModificado.write("Profissionais envolvidos do projeto:"+ aux8);
            brModificado.newLine();
            brModificado.write("O Valor da bolsa:"+ aux9);
            brModificado.newLine();
            System.out.println("Qual alteração deseja fazer na Descrição");
            aux10 = sc2.nextInt();
            brModificado.write("Periodo de vigencia da Bolsa:"+aux10);
            brModificado.close();
            
            br.close(); 
        }

        else if(edit == 0)
        {
            System.out.println("Não ouve nenhuma alteração");
        }




        

    
    
    }
}
