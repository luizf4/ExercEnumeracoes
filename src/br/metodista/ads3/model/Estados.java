package br.metodista.ads3.model;

/**
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 
 * ADS - POLO SOROCABA
 */
public enum Estados {

    SP("São Paulo"),
    RJ("Rio de Janeiro"),
    MG("Minas Gerais"),
    RN("Rio Grande do Norte"),
    DF("Distrito Federal"),
    PB("Paraiba"),
    RS("Rio Grande do Sul");

    private String nome;
    private int qtd;

    private Estados(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {

        int i = 0;

        for (Estados est : Estados.values()) {

            i++;
        }

        return qtd = i;
    }

    public void mostrar() {

        for (Estados estado : Estados.values()) {

            System.out.println(estado.getNome());

        };

    }

}
