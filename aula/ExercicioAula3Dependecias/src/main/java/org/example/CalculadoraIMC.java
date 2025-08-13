package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class CalculadoraIMC {
    private static final Logger logger = LoggerFactory.getLogger(CalculadoraIMC.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logger.info("=== Calculadora de IMC ===");

        System.out.print("Digite o seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        logger.info("Seu IMC é: {}", imc);

        if (imc < 18.5) {
            logger.warn("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            logger.info("Classificação: Peso normal");
        } else if (imc < 30) {
            logger.warn("Classificação: Sobrepeso");
        } else {
            logger.error("Classificação: Obesidade");
        }

        sc.close();
    }
}
