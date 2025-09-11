import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class stringsDatas {
    public static void main(String[] args) {
        String nome = "Giovana";

        //Deixa todo o texto em maiusculo
        System.out.println(nome.toUpperCase());

        //Deixa todo o texto em minusculo
        System.out.println(nome.toLowerCase());

        //Exibe quantos caracteres contém
        System.out.println(nome.length());

        String nomeOutro = "giovana";
        System.out.println(nome.equals(nomeOutro)); //verifica se são verdadeiros
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); //Verifica se são verdadeiros independente de ser maiusculo ou minusculo

        //ISO 8601 (yyyy-mm-dd)
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //imprir por dia da semana
        System.out.println(hoje.getDayOfWeek());

        //trazer tradução dos dias da semana
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        //Olá, {nome}. Hoje é {dia-da-semana}, Bom dia!
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil); //trazer dia da semana
        String saudacao; //adicionar saudacao

        LocalDateTime agora = LocalDateTime.now(); //hora atual

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        }  else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        }else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }else {
            saudacao = "Olá";
        }

        //printlf = define o formato e depois definir os valores
        System.out.printf("Olá, %s. Hoje é %s, %S. %n", nome, diaSemana, saudacao.toUpperCase()); //%s = string; %n = quebra de linha
    }
}