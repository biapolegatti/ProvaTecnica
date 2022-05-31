package exercicio3;

public abstract class Automovel {

    protected String combustivel;


    public abstract String obterCombustivel();


    public Automovel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}



  /*  Faça um programa que contenha a classe automóvel com um atributo
        combustível e duas classes que herdam desta Esportivo e Caminhão e um
        programa que receba um Esportivo ou um caminhão e retorne o
        combustível correspondente, a saber: Esportivo utiliza Gasolina e
        Caminhão utiliza Diesel. (vale 3 pontos)
*/