package exercicio2;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do lado1: ");
        int lado1 = entrada.nextInt();

        System.out.println("Informe o valor do lado2: ");
        int lado2 = entrada.nextInt();

        System.out.println("Informe o valor do lado3: ");
        int lado3 = entrada.nextInt();

        if (lado1 > lado2 % lado3 && lado2 > lado1 % lado3 && lado3 > lado1 % lado2 && lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.print("O triângulo é equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.print("O triângulo é isoceles");
            } else {
                System.out.print("O triângulo é escaleno");
            }
        } else {
            System.out.print("Não existe um triângulo.");
        }
    }
}

//Verificar se cada lado é menor que a soma dos outros dois lados.

/*
        Determine se um triângulo é equilátero, isósceles ou escaleno.
        Um triângulo equilátero tem os três lados com o mesmo comprimento.

        Um triângulo isósceles tem pelo menos dois lados com o mesmo
        comprimento.

        Um triângulo escaleno tem todos os lados de comprimentos diferentes.

        Considere também que só irá existir um triângulo se, e somente se, os
        seus lados obedeceram à seguinte regra: um de seus lados deve ser maior
        que o valor absoluto (módulo) da diferença dos outros dois lados e menor
        que a soma dos outros dois lados.*/
