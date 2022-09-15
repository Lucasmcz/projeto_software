import java.io.*;
import java.util.*;
public class Arquivo3 {
 
    public static void main(String[] args) throws IOException {
        
            OutputStream arquivo = new FileOutputStream("Atividades.txt");
            Writer escrever = new OutputStreamWriter(arquivo);
            BufferedWriter br = new BufferedWriter(escrever);
    
            Atividades activity = new Atividades("Id", "descricao", "data_inicial", "hora_inicial", "data_termino", "hora_termino", "responsavel", "profissionais", "Alunos_envolvidos", "tarefas");
            Scanner sc2 = new Scanner(System.in);
            String id,descricao,data_inicial,data_final,hora_inicial,hora_final,responsaveis,profissionais,alunos_envolvidos,tarefas;
            System.out.println("Digite sua identificação");
            id = sc2.nextLine();
            System.out.println("Digite a descrição da Atividade:");
            descricao = sc2.nextLine();
            System.out.println("Digite a data inicial do projeto em xx/xx/xxxx");
            data_inicial = sc2.nextLine();
            System.out.println("Digite a data final da atividade em xx/xx/xxxx");
            data_final = sc2.nextLine();
            System.out.println("Digite a hora inicial");
            hora_inicial = sc2.nextLine();
            System.out.println("Digite a hora final");
            hora_final = sc2.nextLine();
            System.out.println("Digite os responsáveis pela Atividade");
            responsaveis = sc2.nextLine();
            System.out.println("Digite os profissionais envolvidos na Atividade");
            profissionais = sc2.nextLine();
            System.out.println("Digite as tarefas envolvidas nessa  Atividade");
            tarefas = sc2.nextLine();
    
            String aux =  activity.SetID(id);//Auxiliar que pega o Id
            String aux2 = activity.SetDescricao(descricao);
            String aux3 = activity.Setdata_inicial(data_inicial);
            String aux4 = activity.SetData_termino(data_final);
            String aux45 = activity.Set_hora_inicial(hora_inicial);
            String aux5 = activity.Set_hora_final(hora_final);
            String aux6 = activity.Set_responsavel(responsaveis);
            String aux7 = activity.Set_Profissionais(profissionais);
            String aux8 = activity.Set_tarefas(tarefas);
            
    
            br.write("Identificação da Atividade: "+aux);
            br.newLine();
            br.write("Descrição da Atividade: "+aux2);
            br.newLine();
            br.write("Data Inicial da Atividade: "+aux3);
            br.newLine();
            br.write("Data final da Atividade: "+aux4);
            br.newLine();
            br.write("Hora Inicial da Atividade: " +aux45);
            br.newLine();
            br.write("Hora final da Atividade: "+aux5);
            br.newLine();
            br.write("Responsaveis pela Atividade: "+aux6);
            br.newLine();
            br.write("Profissionais envolvidos na Atividade: "+ aux7);
            br.newLine();
            br.write("Tarefas envolvidas na Atividade: "+ aux8);

            System.out.println("Deseja remover informações?");
            
            br.close();

            //Remoção de Informações---------------------------------------------------------------------------------------
            
            int escolha = 0;
            System.out.println("Digite 1: Se deseja retirar a Identificação");//id
            System.out.println("Digite 2: Se deseja retirar a Descrição");//des
            System.out.println("Digite 3: Se deseja retirar a data de Inicial da atividade");//data inicial
            System.out.println("Digite 4: Se deseja retirar a data final da atividade");//data final
            System.out.println("Digite 5: Se deseja retirar a Hora inicial da atividade");//hora inicial
            System.out.println("Digite 6: Se deseja retirar a Hora final da atividade");//hora inicial
            System.out.println("Digite 7: Se deseja retirar os Responsaveis pela atividade");//responsaveis
            System.out.println("Digite 8: Se deseja retirar os profissionais envolvidos na atividade");//profissionais
            System.out.println("Digite 9:Se deseja retirar as tarefas envolvidas na Atividade");//Atividades
            System.out.println("Digite 0: Se não queira fazer uma edição");

            escolha = sc2.nextInt();

            if(escolha == 1)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Descrição da Atividade: "+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade: "+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade: "+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(escolha == 2)
            {
                
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade: "+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade: "+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(escolha == 3)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:Nulo"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Data final da Atividade: "+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(escolha == 4)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:Nulo"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(escolha == 5)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(escolha == 6)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(escolha == 7)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade:"+ aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(escolha == 8)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade:"+ aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade"+ aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(escolha == 9)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade:"+ aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade"+ aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade:" + aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade Nulo");
                brModificado.close();
            }

            else if(escolha == 0)
            {
                System.out.println("Não ouve nenhuma alteração");
            }

            //---Edição de Informações----------------------
            int edit = 0;
            System.out.println("Digite 1: Se deseja editar a Identificação");//id
            System.out.println("Digite 2: Se deseja editar a Descrição");//des
            System.out.println("Digite 3: Se deseja editar a data de Inicial da atividade");//data inicial
            System.out.println("Digite 4: Se deseja editar a data final da atividade");//data final
            System.out.println("Digite 5: Se deseja editar a Hora inicial da atividade");//hora inicial
            System.out.println("Digite 6: Se deseja editar a Hora final da atividade");//hora inicial
            System.out.println("Digite 7: Se deseja editar os Responsaveis pela atividade");//responsaveis
            System.out.println("Digite 8: Se deseja editar os profissionais envolvidos na atividade");//profissionais
            System.out.println("Digite 9: Se deseja  editar as tarefas envolvidas na Atividade");//Atividades
            System.out.println("Digite 0: Se não queira fazer uma edição");

            edit = sc2.nextInt();

            if(edit == 1)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                System.out.println("Qual alteração deseja fazer na Identificação da Atividade");
                aux = sc2.nextLine();
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade: "+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade: "+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade: "+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(edit == 2)
            {
                
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer na Descrição da Atividade");
                aux2 = sc2.nextLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade: "+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade: "+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(edit == 3)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:Nulo"+aux2);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer na Data Inicial da Atividade");
                aux3 = sc2.nextLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade: "+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(edit == 4)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:Nulo"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer na Data final da Atividade");
                aux4 = sc2.nextLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade: " +aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }
            else if(edit == 5)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer na Hora Inicial da Atividade");
                aux45 = sc2.nextLine();
                brModificado.write("Hora Inicial da Atividade:"+aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade: "+aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(edit == 6)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer nos profissionais");
                aux5 = sc2.nextLine();
                brModificado.write("Hora final da Atividade:Nulo");
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade: "+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(edit == 7)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade:"+ aux5);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer nos profissionais");
                aux6 = sc2.nextLine();
                brModificado.write("Responsaveis pela Atividade:"+aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade: "+ aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(edit == 8)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade:"+ aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade"+ aux6);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer nos profissionais");
                aux7 = sc2.nextLine();
                brModificado.write("Profissionais envolvidos na Atividade:"+aux7);
                brModificado.newLine();
                brModificado.write("Tarefas envolvidas na Atividade"+ aux8);
                brModificado.close();
            }

            else if(edit == 9)
            {
                OutputStream arquivo_modificado = new FileOutputStream("UsuariosModificado.txt");
                Writer wrModificado = new OutputStreamWriter(arquivo_modificado);
                BufferedWriter brModificado = new BufferedWriter(wrModificado);
                brModificado.write("Identificação da Atividade:"+aux);
                brModificado.newLine();
                brModificado.write("Descrição da Atividade:"+aux2);
                brModificado.newLine();
                brModificado.write("Data Inicial da Atividade:"+aux3);
                brModificado.newLine();
                brModificado.write("Data final da Atividade:"+aux4);
                brModificado.newLine();
                brModificado.write("Hora Inicial da Atividade:"+ aux45);
                brModificado.newLine();
                brModificado.write("Hora final da Atividade:"+ aux5);
                brModificado.newLine();
                brModificado.write("Responsaveis pela Atividade"+ aux6);
                brModificado.newLine();
                brModificado.write("Profissionais envolvidos na Atividade:" + aux7);
                brModificado.newLine();
                System.out.println("Qual alteração deseja fazer nas Tarefas das atividades");
                aux8 = sc2.nextLine();
                brModificado.write("Tarefas envolvidas na Atividade:"+aux8);
                brModificado.close();
            }

            else if(edit == 0)
            {
                System.out.println("Não ouve nenhuma alteração");
            }

          
    
   
}
}
