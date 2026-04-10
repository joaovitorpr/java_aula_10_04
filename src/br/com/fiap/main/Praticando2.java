package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Praticando2 {
    public static void main(String[] args) {
        //Exercício.2
        LocalDate dataAtual = LocalDate.now();
        LocalDate datafinal = LocalDate.parse("2014-02-11");
        Period bonus = Period.between(datafinal,dataAtual);
        DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        JOptionPane.showMessageDialog(null,"Data inicial:" + dataAtual.format(dataformatada) + "\nData final: " + datafinal.format(dataformatada) + "\nEntre as duas fornecidas existem:" + bonus.getYears() + "Ano(s)" + bonus.getMonths() + "mês(es)" + bonus.getDays() + "dia(s)!" );
    }
}
