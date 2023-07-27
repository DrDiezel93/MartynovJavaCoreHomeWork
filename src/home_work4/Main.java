package home_work4;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tom", 30, "8569");
        Customer customer2 = new Customer("Elena", 45, "9585");
        Customer customer = new Customer();

        Product product1 = new Product("Milk", 100);
        Product product2 = new Product("Bread", 50);
        Product product3 = new Product("Cheese", 150);
        Product product4 = new Product("Dumplings", 400);
        Product product5 = new Product("Butter", 120);
        Product product = new Product();

        Customer[] custList = new Customer[]{customer1, customer2};
        Product[] prodList = new Product[]{product1, product2, product3, product4, product5};
        Order[] orders = new Order[5];

        Object[][] info = {
                {custList[0], prodList[0], 1}, //good
                {custList[1], prodList[1], -1}, //bad amount -1
                {custList[0], prodList[2], 150}, //bad amount >100
                {custList[1], new Product("Flower", 10), 1}, //no item
                {new Customer("Fedor", 40, "+3-444-555-66-77"), prodList[3], 1}, //no customer
                };
        int capacity = 0;
        int i = 0;
        while (capacity != orders.length - 1 || i != info.length) {
            try {
                orders[capacity] = Order.makeProducts(custList, prodList, (Customer) info[i][0], (Product) info[i][1], (int) info[i][2]);
                capacity++;
            } catch (ProductException e) {
                e.printStackTrace();
            } catch (AmountException e) {
                orders[capacity++] = Order.makeProducts(custList, prodList, (Customer) info[i][0], (Product) info[i][1], 1);
            } catch (CustomerException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Orders made: " + capacity);
            }
            ++i;
        }
    }
}
