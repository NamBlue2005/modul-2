package Collection_Framework;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct(new Product(1, "Laptop", 1000.0));
        manager.addProduct(new Product(2, "Phone", 500.0));
        manager.addProduct(new Product(3, "Tablet", 750.0));

        manager.displayProducts();

        manager.updateProduct(2, "Smartphone", 600.0);

        manager.searchProductByName("Smartphone");

        manager.sortProductsByPriceAscending();

        manager.sortProductsByPriceDescending();

        manager.deleteProduct(1);
        manager.displayProducts();
    }
}