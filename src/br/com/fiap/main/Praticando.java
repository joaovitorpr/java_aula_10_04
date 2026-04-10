package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Praticando {
    public static void main(String[] args) {
        //Exercício.1
        String frase, novapalavra, substituida, frase2;
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Digite uma frase:");
            frase = scan.nextLine();
            System.out.println("Frase: " + frase);
            System.out.println("Quantidade de caracteres da frase:" + frase.length());
            System.out.println("Frase com tudo maiusculo:" + frase.toUpperCase());
            System.out.println("Digite duas palavras: Uma que a frase possui e outra que deseja substituir pela primeira palavra.");
            substituida = scan.next();
            novapalavra = scan.next();
            System.out.println(frase.replace(substituida,novapalavra));
            frase = scan.nextLine();
            frase2 = frase.replace(substituida,novapalavra);
            System.out.println(frase);
            System.out.println("Quantidade de caracteres da nova frase:" + frase2.length());
        } catch (Exception e) {
            System.out.println("ERRO: Informações inválidas!");
        }

    }
}
