package com.mycompany.hashmapdsa;

public class Student {
    
    private String name;
    private String idNumber;
    private String major;
    
    public Student(String name, String idNumber, String major) {
        this.name = name;
        this.idNumber = idNumber;
        this.major = major;
    }
    
    //Getters
    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getMajor() {
        return major;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + "\n" + 
                "ID Number: " + idNumber + "\n" +
                "Major: " + major;
    }
}
