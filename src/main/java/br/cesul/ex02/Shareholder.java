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

    @Override
    public Double calculateIncome() {
        var total = stockValue * share;

        if (total <= 25) {
            return total * 0.01;
        } else if (total <= 50) {
            return total * 0.05;
        } else
            return total * 0.10;
    }

    public Double getShare() {
        return share;
    }

    public Double getStockValue() {
        return stockValue;
    }
}
