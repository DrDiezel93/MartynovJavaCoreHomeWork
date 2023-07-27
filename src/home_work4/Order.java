package home_work4;

public class Order {
    Customer customer;
    Product product;
    int amount;

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }
    public static boolean isInArray(Object[] arr, Object o) {
        for (Object value : arr)
            if (value.equals(o))
                return false;
        return true;
    }
    public static Order makeProducts(Customer[] customers, Product[] products, Customer customer, Product product, int amount){
        if(isInArray(customers, customer)) throw new CustomerException("Unknown customer: " + customer);
        if(isInArray(products, product)) throw new ProductException("Unknown product: " + customer);
        if (amount < 0 || amount > 100) throw new AmountException("Incorrect amount: " + amount);
        return new Order(customer, product, amount);
    }
}
