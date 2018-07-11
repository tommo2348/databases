package com.tomSpringProject.demo.entities;

import java.util.List;

public class Person {
    private String firstname;
    private String surname;
    private String email;
    private long phoneNumber;
    private List<String> interests;

    public Person(String firstname,
                  String surname,
                  String email,
                  long phoneNumber,
                  List<String> interests) {
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.interests = interests;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getInterests() {
        return interests;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", interests=" + interests +
                '}';
    }
}
