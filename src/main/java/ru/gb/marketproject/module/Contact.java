package ru.gb.marketproject.module;

public class Contact {
    private String surname;
    private String name;
    private String middleName;
    private Long phoneNumber;

    public Contact(String surname, String name, String middleName, Long phoneNumber) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        return (Integer.parseInt(surname + name + middleName)) * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Contact)) return false;
        return obj.equals(this);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

