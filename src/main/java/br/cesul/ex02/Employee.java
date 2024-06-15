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
        var valueInss = getInss();
        var valueIr = getIr();
        var totalSalary = 0.0;

        return totalSalary = salary - valueInss - valueIr;
    }


    public Double getIr() {
        if (salary <= 2259.20) {
            return salary;
        } else if (salary <= 2826.65) {
            return (salary * 0.075) - 142.80;
        } else if (salary <= 3751.05) {
            return (salary * 0.15) - 354.80;
        } else if (salary <= 4664.68) {
            return (salary * 0.225) - 636.13;
        } else return (salary * 0.275) - 839.36;
    }

    public Double getInss() {
        return salary * 0.11;
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
