package br.metodista.ads3.model;

/**
 *
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 
 * ADS - POLO SOROCABA
 */
public enum FaixaEtaria {

    Livre("Classificação LIVRE - \n"
            + "Faixa de horário: Qualquer Horário."),
    Dez("Não recomendado para menores de 10 anos\n"
            + "Faixa de Horário: Qualquer Horário.\n"),
    Doze("Não recomendado para menores de 12 anos\n"
            + "Faixa de Horário: 20h - 06h."),
    Quatorze("Não recomendado para menores de 14 anos\n"
            + "Faixa de Horário: 21h - 06h.\n"),
    Dezesseis("Não recomendado para menores de 16 anos\n"
            + "Faixa de Horário: 22h - 06h.\n"),
    Dezoito("Não recomendado para menores de 18 anos\n"
            + "Faixa de Horário: 23h - 06h.\n");

    private String descricao;

    private FaixaEtaria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    

}
