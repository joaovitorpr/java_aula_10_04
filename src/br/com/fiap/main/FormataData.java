package br.com.fiap.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class FormataData {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now(); //Cria a instanciação para pegar a data atual
        LocalDate fimDosTempos = LocalDate.parse("2012-12-21");
        Period bonus = Period.between(fimDosTempos, dataAtual); //Calcula o intervalo de tempo entre duas datas.
        System.out.printf("Desde o fim dos tempos, passaram:\n%d anos\n%d meses\n%d dias\n", bonus.getYears(), bonus.getMonths(),bonus.getDays());

        System.out.println(dataAtual);
        DateTimeFormatter dataformato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Muda o formato de exibição da data (neste caso para o brasileiro)
        System.out.println(dataAtual.format(dataformato));
    }
}
