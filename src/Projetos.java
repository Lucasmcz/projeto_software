
public class Projetos {
    String Identificacao;
    String Descricao;
    String DataInicio;
    String HoraInicio;
    String DataFinal;
    String HoraFinal;
    String Coordernador;
    String Profissionais;
    int ValorBolsa;
    int PeriodoVigenciaBolsa;


    public Projetos
    (
    String Identificacao, 
    String Descricao,  
    String DataInicio, 
    String HoraInicio,
    String DataFinal,  
    String HoraFinal,  
    String Coordernador,  
    String Profissionais,
    int ValorBolsa, 
    int PeriodoVigenciaBolsa
    )
    
    {
        


    }
    public String  GetId()
    {
        return this.Identificacao;
    }
    
    public String SetID(String Id)
    {
        this.Identificacao = Id;
        return Id;
    }

    public String GetDescricao()
    {
        return this.Descricao;
    }

    public String SetDescricao(String descricao)
    {
        this.Descricao = descricao;
        return descricao;
    }

    public String Getdata_inicial()
    {
        return this.DataInicio;
    }

    public String Setdata_inicial(String data_inicial)
    {
        this.DataInicio = data_inicial;
        return data_inicial;
    }

    public String Get_hora_inicial()
    {
        return this.HoraInicio;
    }

    public String Set_hora_inicial(String hora_inicial)
    {
        this.HoraInicio = hora_inicial;
        return hora_inicial;
    }

    public String GetData_termino()
    {
        return this.DataFinal;
    }

    public String SetData_termino(String data_termino)
    {
        this.DataFinal = data_termino;
        return data_termino;
    }

    public String Set_hora_final(String hora_final)
    {
        this.HoraFinal = hora_final;
        return hora_final;
    }

    public String Get_hora_final()
    {
        return this.HoraFinal;
    }

    public String Get_Coordernador()
    {
        return this.Coordernador;
    }

    public String Set_Coordernador(String Coordernador)
    {
        this.Coordernador = Coordernador;
        return Coordernador;
    }

    public String Get_profissionais()
    {
        return this.Profissionais;
    }

    public String Set_profissionais(String profissionais)
    {
        this.Profissionais = profissionais;
        return profissionais;
    }

    public int Get_ValorBolsa()
    {
        return this.ValorBolsa;
    }

    public  int Set_ValorBolsa(int ValorBolsa)
    {
        this.ValorBolsa = ValorBolsa;
        return ValorBolsa;
    }

    public int Get_periodoVigencia()
    {
        return this.PeriodoVigenciaBolsa;
    }

    public int Set_periodoVigencia(int periodovigencia)
    {
        this.PeriodoVigenciaBolsa = periodovigencia;
        return periodovigencia;
    }



}
