package br.cesul.ex02;

import java.time.LocalDate;

public abstract class Person {


    private final String name;
    private final String rg;
    private final String cpf;
    private final LocalDate birthDate;
    private final Sex gender;

    public Person(String name, String rg, String cpf, LocalDate birthDate, Sex gender) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public abstract Double calculateIncome();

    public String getName() {
        return name;
    }


    public String getRg() {
        return rg;
    }


    public String getCpf() {
        return cpf;
    }



    public LocalDate getBirthDate() {
        return birthDate;
    }



    public Sex getGender() {
        return gender;
    }






}
