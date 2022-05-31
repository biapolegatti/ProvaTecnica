package exercicio2;

import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor ");



        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;




        if(lado1 == lado2 && lado2 == lado3


        ) {

            System.out.println("O triângulo é equilátero");

        }


        if(lado1 == lado2 && lado2 == lado3) {

            System.out.println("O triângulo é equilátero");

        }




    }


}


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
