package exercicio3;

public class Main {

    public static void main(String[] args) {

        Esportivo esportivo1 = new Esportivo("Gasolina.");
        Caminhao caminhao1 = new Caminhao("Diesel.");

        System.out.println("O Combustível do esportivo é: " + esportivo1.obterCombustivel());
        System.out.println("O Combustível do caminhão é: " + caminhao1.obterCombustivel());

    }
}



/*      Faça um programa que contenha a classe automóvel com um atributo
        combustível e duas classes que herdam desta Esportivo e Caminhão e um
        programa que receba um Esportivo ou um caminhão e retorne o
        combustível correspondente, a saber: Esportivo utiliza Gasolina e
        Caminhão utiliza Diesel. (vale 3 pontos)
*/

