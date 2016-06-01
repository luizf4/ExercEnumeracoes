package br.metodista.ads3.model;

/**
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 
 * ADS - POLO SOROCABA
 */

public enum TiposCombustivel {

    GAS("Gasolina"),
    AA("Alcool"),
    DIE("Diesel"),
    GNV("Gás Natural Veiculo"),
    NIT("Nitrogênio");

    private String tipoCombustivel;
    private Double total;

    private TiposCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    
    public void calcular(double qtdLitro, double vlrPorLitro){
        
        total = vlrPorLitro * qtdLitro;
        
        System.out.println("Valor total: " + total);
    }

}
