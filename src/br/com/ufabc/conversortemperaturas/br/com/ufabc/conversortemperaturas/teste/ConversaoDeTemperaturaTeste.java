package br.com.ufabc.conversortemperaturas.br.com.ufabc.conversortemperaturas.teste;

import br.com.ufabc.conversortemperaturas.ConversaoDeTemperatura;

import java.util.Scanner;

public class ConversaoDeTemperaturaTeste {

    public static void main(String[] args){

        System.out.println();
        ConversaoDeTemperatura conversor = new ConversaoDeTemperatura();

        int opcao = -1;
        int temp = 0;
        double tempD = 0.0;
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("---------- Menu -----------");
            System.out.println("---- Escolha uma opção ----");
            System.out.println("1. Converter Celsius (C) para Fahrenheit (F)");
            System.out.println("2. Converter Celsius (C) para Kelvin (K)");
            System.out.println("3. Converter Fahrenheit (F) para Celsius (C)");
            System.out.println("4. Converter Fahrenheit (F) para Kelvin (K)");
            System.out.println("5. Converter Kelvin (K) para Celsius (C)");
            System.out.println("6. Converter Kelvin (K) para Fahrenheit (F)");
            System.out.println("0. Sair");
            System.out.println("---------- Fim Menu -----------");

            opcao = scanner.nextInt();

            if(opcao == 0)
                break;
            else if(opcao > 6 || opcao < 0){
                System.out.println("Opção com esse valor inexistente! Tente novamente.");
                continue;
            }

            System.out.println("Digite o valor para conversão: ");

            switch (opcao){
                case 1:
                    temp = scanner.nextInt();
                    System.out.println("temperatura em (F) = " + conversor.CelsiusToFahrenheit(temp) + " graus");
                    break;
                case 2:
                    temp = scanner.nextInt();
                    System.out.println("temperatura em (K) = " + conversor.CelsiusToKelvin(temp)+ " graus");
                    break;
                case 3:
                    temp = scanner.nextInt();
                    System.out.println("temperatura em (C) = " + conversor.FahrenheitToCelsius(temp)+ " graus");
                    break;
                case 5:
                    tempD = scanner.nextDouble();
                    System.out.println("temperatura em (C) = " + conversor.KelvinToCelsius(tempD)+ " graus");
                    break;
                case 4:
                    temp = scanner.nextInt();
                    System.out.println("temperatura em (K) = " + conversor.FahrenheitToKelvin(temp)+ " graus");
                    break;
                case 6:
                    tempD = scanner.nextDouble();
                    System.out.println("temperatura em (F) = " + conversor.KelvinToFarenheit(tempD)+ " graus");
                    break;
            }

        }
    }
}
