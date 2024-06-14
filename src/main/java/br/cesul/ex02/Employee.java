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
