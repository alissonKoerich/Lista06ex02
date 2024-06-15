package br.cesul.ex02;

import java.time.LocalDate;

public class Shareholder extends Person{

    private final Double share;

    private final Double stockValue;

    public Shareholder(String name, String rg, String cpf, LocalDate birthDate, Sex gender, Double share, Double stockValue) {
        super(name, rg, cpf, birthDate, gender);
        this.share = share;
        this.stockValue = stockValue;
    }

    public Double getCapital(){

        return stockValue * share;

    }

        @Override
    public Double calculateIncome() {
        Double capital = getCapital();


        if (share <= 25.0) {
            return capital * 0.01;
        } else if (share <= 50.0) {
            return capital * 0.05;
        } else
            return capital * 0.10;
    }

    public Double getShare() {
        return share;
    }

    public Double getStockValue() {
        return stockValue;
    }
}
