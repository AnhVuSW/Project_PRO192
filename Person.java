/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Quoc Bao
 */
public class Person {
    private String name;
    private int age;
    private String nationality;
    private double height;
    private double weight;
    private double salary;
    public Person( String name, int age, String nationality, double height, double weight, double salary) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
        this.salary = salary;
    }

    public Person(){}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 15 && age <=60){
            this.age = age;
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }    
}
