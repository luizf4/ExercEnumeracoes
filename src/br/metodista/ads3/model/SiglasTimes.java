
package br.metodista.ads3.model;

/**
 *
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 
 * ADS - POLO SOROCABA
 */
public enum SiglasTimes {
    
    SCCP("Sport Club Corinthians Paulista"),
    SPFC("São Paulo Futebol Clube"),
    CAM("Clube Atletico Mineiro"),
    SEP("Sociedade Esportiva Palmeiras"),
    ECB("Esporte Clube Bahia"),
    CRF("Clube Regatas Flamengo");
    
    private String nome;

    private SiglasTimes(String nome) {
        this.nome = nome;
    }   

    public String getNome() {
        return nome;
    }
     
    
}
