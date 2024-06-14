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

        if(salary >= 2.259 && salary <= 2.826){

        }


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
