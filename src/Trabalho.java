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

        questao1.escrevanatela();
        resposta = questao1.leiaResposta();

        if (questao1.verdadeira(resposta)){
            cont++;
        }


        Questao questao2 = new Questao();
        questao2.pergunta = "2 - Qual é o maior planeta do Sistema Solar?";
        questao2.A = "A) Terra";
        questao2.B = "B) Marte";
        questao2.C = "C) Júpiter";
        questao2.D = "D) Saturno";
        questao2.E = "E) Vênus";
        questao2.correta = "C";



        questao1.escrevanatela();
        resposta = questao1.leiaResposta();

        if (questao1.verdadeira(resposta)){
            cont++;
        }


        Questao questao3 = new Questao();
        questao3.pergunta = "3 - Em que ano o homem chegou à Lua pela primeira vez?";
        questao3.A = "A) 1967";
        questao3.B = "B) 1969";
        questao3.C = "C) 1972";
        questao3.D = "D) 1980";
        questao3.E = "E) 1991";
        questao3.correta = "B";



        questao1.escrevanatela();
        resposta = questao1.leiaResposta();

        if (questao1.verdadeira(resposta)){
            cont++;
        }


        double percent = ((double) cont / 15.0) * 100;

    }
}
