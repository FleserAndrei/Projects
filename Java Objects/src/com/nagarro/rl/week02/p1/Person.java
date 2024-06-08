package com.nagarro.rl.week02.p1;

public class Person {

    private String firstName;
    private String sureName;

    public Person(String firstName, String sureName) {
        this.firstName = firstName;
        this.sureName = sureName;
    }

    public Person(String fullName) {

        String strippedFullName = fullName.strip();

        String[] splitter;

        splitter = strippedFullName.split(" ");

        int numberOfNames = splitter.length;

        StringBuilder firstNameBuilder = new StringBuilder();

        int i = 0;

        if (numberOfNames < 2) {
            this.firstName = null;
            this.sureName = null;
        } else {
            for (; i < numberOfNames - 1; i++) {

                firstNameBuilder.append(splitter[i]);
            }

            this.firstName = firstNameBuilder.toString();
            this.sureName = splitter[i];

        }
    }

    public String toString() {
        return "firstName " + this.firstName + " " + "sureName " + this.sureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
