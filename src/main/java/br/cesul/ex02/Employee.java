package br.cesul.ex02;

import java.time.LocalDate;

public class Employee extends Person {

    private Double salary;
    private String pis;
    private String ctps;


    public Employee(String name, String rg, String cpf, LocalDate birthDate, Sex gender, Double salary, String pis, String ctps) {
        super(name, rg, cpf, birthDate, gender);
        this.salary = salary;
        this.pis = pis;
        this.ctps = ctps;
    }

    @Override
    public Double calculateIncome() {
        var total = salary * 0.11;

        if (total <= 2259.20) {
            return 0.0;
        } else if (total <= 2826.65) {
            return total * 0.075 - 142.80;
        } else if (total <= 3751.05) {
            return total * 0.15 - 354.80;
        } else if (total <= 4664.68) {
            return total * 0.225 - 636.13;
        } else
            return total * 0.275 - 839.36;
    }

    public Double getSalary() {
        return salary;
    }

    public String getPis() {
        return pis;
    }

    public String getCtps() {
        return ctps;
    }
}
