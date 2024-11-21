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

        System.out.println("-----------------------------------------------------");























    }
}



