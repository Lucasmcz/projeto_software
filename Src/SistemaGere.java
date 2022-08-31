import java.io.*;
import java.util.Scanner;

public class /* TIPO */ SistemaGere
{
    public String Identificacao;
    public String Descricao;
    public String DataInicio;
    public String HoraInicio;
    public String DataFinal;
    public String HoraFinal;
    public String Coordernador;
    public String Profissionais;
    public String Atividades;
    public int ValorBolsa;
    public int PeriodoVigenciaBolsa;//Em Horas




public SistemaGere( final String Identificacao, final String Descricao, final String DataInicio, final String HoraInicio,
        final String DataFinal, final String HoraFinal, final String Coordernador, final String Profissionais,
        final String Atividades, final int ValorBolsa, final int PeriodoVigenciaBolsa)

{

    System.out.println("Em processo de criação");

    this.Identificacao = Identificacao;

    this.Descricao = Descricao;

    this.DataInicio = DataInicio;
    

    this.HoraInicio = HoraInicio;
    

    this.HoraFinal = HoraFinal;
   

    this.DataFinal = DataFinal;


    this.Coordernador = Coordernador;
    

    this.Profissionais = Profissionais;
  

    this.Atividades = Atividades;
    

    this.ValorBolsa = ValorBolsa;
   

    this.PeriodoVigenciaBolsa = PeriodoVigenciaBolsa;
  

}

public void Destruidor_SistemaGere(final String Identificacao, final String Descricao, final String DataInicio,
        final String HoraInicio, final String DataFinal, final String HoraFinal, final String Coordernador,
        final String Profissionais, final String Atividades, final int ValorBolsa, final int PeriodoVigenciaBolsa) {

    System.out.println("Em processo de Remoção ou Seja deixar alguns atributos com Valor NULL ou ZERO");
    this.Identificacao = null;
   

    this.Descricao = null;
    

    this.DataInicio = null;
   

    this.HoraInicio = null;
    

    this.HoraFinal = null;
    

    this.DataFinal = null;
   

    this.Coordernador = null;
   

    this.Profissionais = null;
    
    this.Atividades = null;
   

    this.ValorBolsa = 0;
    

    this.PeriodoVigenciaBolsa = 0;
   
}

public static void main(final String[] args) {
    final SistemaGere sistema_Aleatorio = new SistemaGere("Identificacao", "Descricao", "DataInicio", "HoraInicio",
            "DataFinal", "HoraFinal", "Coordernador", "Profissionais", "Atividades", 200, 200);
    /*Exemplo de um projeto que foi criado com com as informações referentes ao Projeto*/
    
    sistema_Aleatorio.Destruidor_SistemaGere("Identificacao","Descricao", "DataInicio", "HoraInicio", "DataFinal", "HoraFinal", "Coordernador", "Profissionais", "Atividades", 0, 0);
    /*Exemplo de um projeto que foi removido Informações dele*/
}





}
