package exercicio3;

public class Esportivo extends Automovel{

    public Esportivo(String combustivel) {
        super(combustivel);
    }

    @Override
    public String obterCombustivel() {
        return "Gasolina";
    }


}


/*  Faça um programa que contenha a classe automóvel com um atributo
        combustível e duas classes que herdam desta Esportivo e Caminhão e um
        programa que receba um Esportivo ou um caminhão e retorne o
        combustível correspondente, a saber: Esportivo utiliza Gasolina e
        Caminhão utiliza Diesel. (vale 3 pontos)
*/
