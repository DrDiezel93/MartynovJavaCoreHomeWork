package home_work3;

public class Supervisor extends Emloyee {

    public Supervisor(String surname, String name, String post, String phoneNumber, double salary, int age) {
        super(surname, name, post, phoneNumber, salary, age);
    }

    public static void salaryIncrease(Emloyee[] lst, int age, double salary){
        for (Emloyee eml : lst) {
            if(!(eml instanceof Supervisor)){
                if (eml.getAge() > age){
                    eml.setSalary(eml.getSalary() + salary);
                }
            }
        }
    }
}
