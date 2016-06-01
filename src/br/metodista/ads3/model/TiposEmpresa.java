package br.metodista.ads3.model;
/**
 *
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 
 * ADS - POLO SOROCABA
 */
public enum TiposEmpresa {

    EI("Empresario Individual."),
    CIA("Sociedade em Nome Coletivo."),
    LTDA("Sociedade Limitada."),
    ME("Microempresa."),
    EPP("Empresa de Pequeno Porte."),
    SA("Sociedade Anônima."),
    EIRELI("Empresa Individual de Responsabilidade Limitada."),
    SCS("Sociedade em Comandita Simples."),
    SCA("Sociedade em Comandita por Ações.");

    private String descricao;

    private TiposEmpresa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
