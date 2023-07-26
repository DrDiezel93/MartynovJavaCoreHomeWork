package home_work3;

import java.util.List;

public class Emloyee {
    private String surname;
    private String name;
    private String post;
    private String phoneNumber;
    private double salary;
    private int age;

    public Emloyee(String surname, String name, String post, String phoneNumber, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void salaryIncrease(Emloyee[] lst, int age, double salary){
        for (Emloyee eml : lst) {
            if (eml.getAge() > age){
                eml.setSalary(eml.getSalary() + salary);
            }
        }
    }

    public static void averageAge(Emloyee[] lst){
        double result = 0;
        for (int i = 0; i < lst.length; i++) {
            result = result + lst[i].getAge();
        }
        System.out.println("Средний возраст сотрудников: " + (result / lst.length));
    }

    public static void averageSalary(Emloyee[] lst){
        double resultSalary = 0;
        for (int i = 0; i < lst.length; i++) {
            resultSalary = resultSalary + lst[i].getSalary();
        }
        System.out.println("Среднияя зарплата сотрудников: " + (resultSalary / lst.length));
    }



    @Override
    public String toString() {
        return '{' +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
