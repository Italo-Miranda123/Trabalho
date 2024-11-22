import java.text.DecimalFormat;
public class Trabalho {
    public static void main(String[] args) {
        Cabecalho.cabecalho();
        String resposta;
        int cont = 0;

        Questao questao1 = new Questao();
        questao1.pergunta = "1 - Qual é a capital do Brasil?";
        questao1.A = "A) São Paulo";
        questao1.B = "B) Brasília";
        questao1.C = "C) Rio de Janeiro";
        questao1.D = "D) Salvador";
        questao1.E = "E) Recife";
        questao1.correta = "B";

        questao1.escrevaresposta();
        if (questao1.verdadeira())
        {
                cont++;
            }
        int contadore1 = 1-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao2 = new Questao();
        questao2.pergunta = "2 - Em que ano o homem chegou à Lua pela primeira vez?";
        questao2.A = "A) 1967";
        questao2.B = "B) 1969";
        questao2.C = "C) 1972";
        questao2.D = "D) 1980";
        questao2.E = "E) 1991";
        questao2.correta = "B";

        questao2.escrevaresposta();
        if (questao2.verdadeira())
        {
                cont++;
        }
        int contadore2 = 2-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao3 = new Questao();
        questao3.pergunta = "3 - Qual é a capital da França?";
        questao3.A = "A) Madri";
        questao3.B = "B) Roma";
        questao3.C = "C) Paris";
        questao3.D = "D) Londres";
        questao3.E = "E) Berlim";
        questao3.correta = "C";

        questao3.escrevaresposta();
        if (questao3.verdadeira())
        {
            cont++;
        }
        int contadore3 = 3-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao4 = new Questao();
        questao4.pergunta = "4 - Qual desses países não faz parte da América Latina?";
        questao4.A = "A) México";
        questao4.B = "B) Brasil";
        questao4.C = "C) Argentina";
        questao4.D = "D) Canadá";
        questao4.E = "E) Chile";
        questao4.correta = "D";

        questao4.escrevaresposta();
        if (questao4.verdadeira())
        {
            cont++;
        }
        int contadore4 = 4-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao5 = new Questao();
        questao5.pergunta = "5 - Em que país está localizada a cidade de Kyoto?";
        questao5.A = "A) Japão";
        questao5.B = "B) China";
        questao5.C = "C) Coréia do Sul";
        questao5.D = "D) Tailândia";
        questao5.E = "E) Indonésia";
        questao5.correta = "A";

        questao5.escrevaresposta();
        if (questao5.verdadeira())
        {
            cont++;
        }
        int contadore5 = 5-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao6 = new Questao();
        questao6.pergunta = "6 - Qual é o continente onde se encontra o deserto do Saara?";
        questao6.A = "A) Ásia";
        questao6.B = "B) África";
        questao6.C = "C) América do Norte";
        questao6.D = "D) Oceania";
        questao6.E = "E) América do Sul";
        questao6.correta = "B";

        questao6.escrevaresposta();
        if (questao6.verdadeira())
        {
            cont++;
        }
        int contadore6 = 6-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao7 = new Questao();
        questao7.pergunta = "7 - Quem escreveu a obra Dom Quixote?";
        questao7.A = "A) Clarice Lispector";
        questao7.B = "B) Machado de Assis";
        questao7.C = "C) William Shakespeare";
        questao7.D = "D) Miguel de Cervantes";
        questao7.E = "E) Jorge Luis Borges";
        questao7.correta = "D";

        questao7.escrevaresposta();
        if (questao7.verdadeira())
        {
            cont++;
        }
        int contadore7 = 7-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao8 = new Questao();
        questao8.pergunta = "8 - Qual é o maior animal terrestre?";
        questao8.A = "A) Elefante africano";
        questao8.B = "B) Girafa";
        questao8.C = "C) Urso Polar";
        questao8.D = "D) Búfalo africano";
        questao8.E = "E) Hipopótamo";
        questao8.correta = "A";

        questao8.escrevaresposta();
        if (questao8.verdadeira())
        {
            cont++;
        }
        int contadore8 = 8-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao9 = new Questao();
        questao9.pergunta = "9 - Em que ano ocorreu a Independência do Brasil?";
        questao9.A = "A) 1500";
        questao9.B = "B) 1822";
        questao9.C = "C) 1889";
        questao9.D = "D) 1910";
        questao9.E = "E) 1930";
        questao9.correta = "B";

        questao9.escrevaresposta();
        if (questao9.verdadeira())
        {
            cont++;
        }
        int contadore9 = 9-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao10 = new Questao();
        questao10.pergunta = "10 - Qual é o nome da moeda oficial do Japão?";
        questao10.A = "A) Iene";
        questao10.B = "B) Dólar";
        questao10.C = "C) Yuan";
        questao10.D = "D) Peso";
        questao10.E = "E) Won";
        questao10.correta = "A";

        questao10.escrevaresposta();
        if (questao10.verdadeira())
        {
            cont++;
        }
        int contadore10 = 10-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao11 = new Questao();
        questao11.pergunta = "11 - Quem pintou a obra  A Última Ceia?";
        questao11.A = "A) Michelangelo";
        questao11.B = "B) Leonardo Da Vinci";
        questao11.C = "C) Rafael";
        questao11.D = "D) Van Gogh";
        questao11.E = "E) Pablo Picasso";
        questao11.correta = "B";

        questao11.escrevaresposta();
        if (questao11.verdadeira())
        {
            cont++;
        }
        int contadore11 = 11-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao12 = new Questao();
        questao12.pergunta = "12 - Quem pintou a obra  A Última Ceia?";
        questao12.A = "A) Michelangelo";
        questao12.B = "B) Leonardo Da Vinci";
        questao12.C = "C) Rafael";
        questao12.D = "D) Van Gogh";
        questao12.E = "E) Pablo Picasso";
        questao12.correta = "B";

        questao12.escrevaresposta();
        if (questao12.verdadeira())
        {
            cont++;
        }
        int contadore12 = 12-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao13 = new Questao();
        questao13.pergunta = "13 - Quem descobriu a teoria da relatividade?";
        questao13.A = "A) Albert Einstein";
        questao13.B = "B) Isaac Newton";
        questao13.C = "C) Nikola Tesla";
        questao13.D = "D) Charles Darwin";
        questao13.E = "E) Marie Curie";
        questao13.correta = "A";

        questao13.escrevaresposta();
        if (questao13.verdadeira())
        {
            cont++;
        }
        int contadore13 = 13-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao14 = new Questao();
        questao14.pergunta = "14 - Em que país foi inventada a primeira bicicleta?";
        questao14.A = "A) França";
        questao14.B = "B) Alemanha";
        questao14.C = "C) Estados Unidos";
        questao14.D = "D) Inglaterra";
        questao14.E = "E) Itália";
        questao14.correta = "B";

        questao14.escrevaresposta();
        if (questao14.verdadeira())
        {
            cont++;
        }
        int contadore14 = 14-cont;

        System.out.println("-----------------------------------------------------");

        Questao questao15 = new Questao();
        questao15.pergunta = "15 - Qual é o nome do fenômeno natural que ocorre quando a Lua passa entre a Terra e o Sol?";
        questao15.A = "A) Eclipse lunar";
        questao15.B = "B) Aurora boreal";
        questao15.C = "C) Eclipse solar";
        questao15.D = "D) Maré alta";
        questao15.E = "E) Chuva de meteoros";
        questao15.correta = "C";

        questao15.escrevaresposta();
        if (questao15.verdadeira())
        {
            cont++;
        }
        int contadore15 = 15-cont;


        System.out.println("-----------------------------------------------------");


        int contadore = 15-cont;

        System.out.println("Voçê chegou ao final do seu questionário");
        System.out.println("Acertos: "+cont+"/15");
        System.out.println("Erros: "+contadore+"/15");

        if (cont > 7) {
            System.out.println("Parabéns, foi aprovado");
        }
        else {
            System.out.println("Reprovado");
        }


        double percent = (cont / 15.0) * 100;

        DecimalFormat df = new DecimalFormat("0,0");

        String percentformat = df.format(percent);

        System.out.println("Sua porcentagem é:"+ percentformat+"%");






























    }
}



