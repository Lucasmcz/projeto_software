public class Atividades
{
    String Id;
    String descricao;
    String data_inicial;
    String hora_inicial;
    String data_termino;
    String hora_termino;
    String responsavel;
    String profissionais;
    String Alunos_envolvidos;
    String tarefas;


    public Atividades
    (
    String Id,
    String descricao,
    String data_inicial,
    String hora_inicial,
    String data_termino,
    String hora_termino,
    String responsavel,
    String profissionais,
    String Alunos_envolvidos,
    String tarefas
    )
    {

    }

    /*String Id, -- OK
    String descricao, -- OK
    String data_inicial, -- OK
    String hora_inicial, -- OK
    String data_termino, -- OK
    String hora_termino, -- OK
    String responsavel, -- OK
    String profissionais, -- OK
    String Alunos_envolvidos, --
    String tarefas -- OK
    */
    public String  GetId()
    {
        return this.Id;
    }
    
    public String SetID(String Id)
    {
        this.Id = Id;
        return Id;
    }

    public String GetDescricao()
    {
        return this.descricao;
    }

    public String SetDescricao(String descricao)
    {
        this.descricao = descricao;
        return descricao;
    }

    public String Getdata_inicial()
    {
        return this.data_inicial;
    }

    public String Setdata_inicial(String data_inicial)
    {
        this.data_inicial = data_inicial;
        return data_inicial;
    }

    public String Get_hora_inicial()
    {
        return this.hora_inicial;
    }

    public String Set_hora_inicial(String hora_inicial)
    {
        this.hora_inicial = hora_inicial;
        return hora_inicial;
    }

    public String GetData_termino()
    {
        return this.data_termino;
    }

    public String SetData_termino(String data_termino)
    {
        this.data_termino = data_termino;
        return data_termino;
    }

    public String Set_hora_final(String hora_final)
    {
        this.hora_termino = hora_final;
        return hora_final;
    }

    public String Get_hora_final()
    {
        return this.hora_termino;
    }

    public String Get_responsavel()
    {
        return this.responsavel;
    }

    public String Set_responsavel(String responsavel)
    {
        this.responsavel = responsavel;
        return responsavel;
    }

    public String Get_Profissionais()
    {

        return this.responsavel;
    }

    public String Set_Profissionais(String profissionais)
    {
        this.profissionais = profissionais;
        return profissionais;
    }

    public String Get_tarefas()
    {
        return this.tarefas;
    }

    public String Set_tarefas(String tarefas)
    {
        this.tarefas = tarefas;
        return tarefas;
    }

    


}