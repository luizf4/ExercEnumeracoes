package br.metodista.ads3.view;

import br.metodista.ads3.model.Estados;
import br.metodista.ads3.model.FaixaEtaria;
import br.metodista.ads3.model.SiglasTimes;
import br.metodista.ads3.model.TiposCombustivel;
import br.metodista.ads3.model.TiposEmpresa;

/**
 *
 * @author Luiz Fernando de Souza 
 * Matricula: 225272 
 * ADS - POLO SOROCABA
 */
public class TesteEnum {

    public static void main(String[] args) {

        for (Estados estado : Estados.values()) {

            System.out.println(estado.getNome());

        }

        System.out.println("--------------------------------\n");

        for (FaixaEtaria faixa : FaixaEtaria.values()) {

            System.out.println(faixa.getDescricao());
        }
        
        System.out.println("--------------------------------\n");
        
        TiposCombustivel combustivel = TiposCombustivel.GAS;        
        
        switch (combustivel) {

            case GAS:
                combustivel.calcular(50.0, 3.30);
                break;
            case AA:
                combustivel.calcular(50.0, 2.40);
                break;
            case DIE:
                combustivel.calcular(50.0, 3.00);
                break;
            case GNV:
                combustivel.calcular(50.0, 1.95);
                break;
            case NIT:
                combustivel.calcular(50.0, 10.0);
                break;
            default:
                System.out.println("Combustivel não existe!");

        }
        
        System.out.println("--------------------------------\n");
        
        
        for(SiglasTimes times: SiglasTimes.values()){
            
            System.out.println(times.getNome());
            
            
        }
        
        System.out.println("--------------------------------\n");
        
        for(TiposEmpresa tipos:TiposEmpresa.values()){
            
            
            System.out.println(tipos.getDescricao());
            
        }

    }
    
    

}
