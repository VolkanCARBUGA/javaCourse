public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setDescription("iyi laptop");
        product.setName("Laptop");
        product.setId(1);
        product.setPrice(5000.500);
        product.setStockAmount(100);
        System.out.println(product.getName());
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        Product product1=new Product(1,"Laptop","Asus Laptop",5500.90,100);
    }

}
