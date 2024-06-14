package br.cesul.ex02;

import java.time.LocalDate;

public class Shareholder extends Person{

    private Double share;

    private Double stockValue;

    public Shareholder(String name, String rg, String cpf, LocalDate birthDate, Sex gender, Double share, Double stockValue) {
        super(name, rg, cpf, birthDate, gender);
        this.share = share;
        this.stockValue = stockValue;
    }




}
