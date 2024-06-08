import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsDatas {
    public static void main(String[] args) {

        String nome = "Marina";
        System.out.println(nome.toUpperCase()); // converter para letras maiusculas
        System.out.println(nome.toLowerCase()); // converter para letras minusculas
        System.out.println(nome.length()); // mostra a quantidade de caracteres da string

        String nomeOutro = "marina";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));
    
        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = Locale.of("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao; 
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(diaSemana);
        if (agora.getHour() >= 0 && agora.getHour() <= 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toLowerCase());

        
    }

}
