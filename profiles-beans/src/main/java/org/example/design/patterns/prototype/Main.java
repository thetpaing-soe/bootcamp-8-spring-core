package org.example.design.patterns.prototype;

public class Main {
    public static void main(String[] args) {

        Product originalProduct = new Product("Apple", 5, 4000);
        System.out.println(originalProduct);

        Product cloneProduct = (Product) originalProduct.clone();
        cloneProduct.setName("Orange");
        System.out.println(cloneProduct);

        boolean test = cloneProduct.equals(originalProduct);
        System.out.println(test);
    }
}
