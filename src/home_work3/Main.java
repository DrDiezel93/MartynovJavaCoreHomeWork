package home_work3;


public class Main {
    public static void main(String[] args) {
        Emloyee emloyee1 = new Emloyee("Martynov", "Evgeny", "Engineer", "89508901015", 50000, 30);
        Emloyee emloyee2 = new Emloyee("Nikolaev", "Denis", "SysAdmin", "89608991515", 30000, 35);
        Emloyee emloyee3 = new Emloyee("Fuks", "Elena", "Admin", "8960901818", 25000, 25);
        Emloyee emloyee4 = new Emloyee("Romanov", "Roman", "Engineer", "8900901820", 55000, 40);
        Emloyee emloyee5 = new Emloyee("Sergeev", "Igor", "Master", "8985901820", 40000, 28);
        Supervisor supervisor1 = new Supervisor("Gusman", "Ivan", "Manager", "88005553535", 100000, 38);
        Emloyee[] lstEmloyee = new Emloyee[]{emloyee1, emloyee2, emloyee3, emloyee4, emloyee5, supervisor1};

        printListsEmloyees(lstEmloyee);

      Supervisor.salaryIncrease(lstEmloyee, 30, 2299);
//
        System.out.println();
//
        printListsEmloyees(lstEmloyee);

//        System.out.println();
//
//        Emloyee.averageAge(lstEmloyee);
//
//        System.out.println();
//
//        Emloyee.averageSalary(lstEmloyee);
    }

    private static void salaryIncrease (Emloyee[] lst, int age, double salary){
        for (Emloyee eml : lst) {
            if (eml.getAge() > age){
                eml.setSalary(eml.getSalary() + salary);
            }
        }
    }

    private static void printListsEmloyees(Emloyee[] lst){
        for(Emloyee eml : lst){
            System.out.println(eml.toString());
        }
    }

}
