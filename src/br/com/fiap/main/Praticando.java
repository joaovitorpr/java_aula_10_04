package br.com.fiap.main;

import java.util.Scanner;

public class Praticando {
    public static void main(String[] args) {

        String frase, novapalavra, substituida, frase2;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite uma frase:");
            frase = scan.nextLine();

            System.out.println("Frase: " + frase);
            System.out.println("Quantidade de caracteres da frase: " + frase.length());
            System.out.println("Frase com tudo maiúsculo: " + frase.toUpperCase());

            System.out.println("Digite a palavra que deseja substituir:");
            substituida = scan.nextLine();

            System.out.println("Digite a nova palavra:");
            novapalavra = scan.nextLine();

            frase2 = frase.replace(substituida, novapalavra);

            System.out.println("Frase atualizada: " + frase2);
            System.out.println("Quantidade de caracteres da nova frase: " + frase2.length());

        } catch (Exception e) {
            System.out.println("ERRO: Informações inválidas!");
        }

        scan.close();
    }
}