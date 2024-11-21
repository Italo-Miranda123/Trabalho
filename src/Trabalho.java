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


    }
}