package com.example.service.model.dto;

public class StudentDto {
    private long id;
    private String name;
    private String passport;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(final String passport) {
        this.passport = passport;
    }

}
