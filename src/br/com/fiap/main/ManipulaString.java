package br.com.fiap.main;

public class ManipulaString {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        System.out.println(frase);
        System.out.println(frase.length()); //Conta os caracteres que tem na string(ate os espaços)
        System.out.println(frase.toUpperCase()); //uppercase deixa tudo maiusculo.
        System.out.println(frase.toLowerCase()); //lowercase gera uma copia minuscula da frase
        System.out.println(frase.substring(23,26)); //substring puxa uma parte do texto da string de um indice até o outro
        System.out.println(frase.replace("roeu","comeu")); //O replace faz a substituição de toda a correspondencia da string(troca uma palavra por outra que desejar)
    }
}
