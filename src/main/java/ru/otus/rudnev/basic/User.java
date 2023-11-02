package ru.otus.rudnev.basic;

public class User {
    private String surname;
    private String name;
    private String middlename;
    private int birthDate;
    private String email;

    public User(String surname, String name, String middlename, int birthDate, String email) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.birthDate = birthDate;
        this.email = email;
    }

    public int getAge(){
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthDate;
    }

    public void userInfo(){
        System.out.println("ФИО: " + this.surname + " " + this.name + " " + this.middlename);
        System.out.println("Год рождения: " + this.birthDate);
        System.out.println("e-mail: " + this.email);
    }
}

