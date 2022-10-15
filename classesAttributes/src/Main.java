public class Main {
    public static void main(String[] args) {
        Product product = new Product(3,"laptop","asus",2555);



        /* product.setId(3);
        product.setName("laptotp");*/


        ProductManager productManager= new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());




    }
}