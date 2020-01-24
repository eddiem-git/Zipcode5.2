package com.github.eddiem_git;

public class Person {
    private String myName;
    private Integer myAge;
    private Double myAccountBalance;

    Person(String name, Integer age, Double accountBalance) {
        this.myName = name;
        this.myAge = age;
        this.myAccountBalance = accountBalance;

    }

    public String getMyName() {
        return this.myName;
    }

    public Integer getMyAge() {
        return this.myAge;
    }

    public Double getMyAccountBalance() {
        return myAccountBalance;
    }

    public void setMyName(String name) {
        this.myName = name;
    }

    public void setMyAge(Integer age) {
        this.myAge = age;
    }

    public void setMyAccountBalance(Double accountBalance) {
        this.myAccountBalance = accountBalance;
    }

    public String toString() {
        return "Person{" +
                "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", myAccountBalance=" + myAccountBalance +
                '}';
    }
}
