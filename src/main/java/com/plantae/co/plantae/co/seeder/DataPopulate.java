package com.plantae.co.plantae.co.seeder;

import com.plantae.co.plantae.co.entities.Category;
import com.plantae.co.plantae.co.entities.Product;
import com.plantae.co.plantae.co.repository.CategoryRepository;
import com.plantae.co.plantae.co.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataPopulate implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataPopulate(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
         System.out.println("Clearing existing data...");
    productRepository.deleteAll(); // Clear products first due to foreign key constraints
    categoryRepository.deleteAll(); // Clear categories
        // Categories
        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category books = new Category();
        books.setName("Books");

        categoryRepository.saveAll(Arrays.asList(electronics, clothing, books));

        // Products
        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("Latest model smartphone with advanced features.");
        phone.setImageUrl("https://via.placeholder.com/600x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for work and play.");
        laptop.setImageUrl("https://via.placeholder.com/600x400");
        laptop.setPrice(1299.99);
        laptop.setCategory(electronics);

        Product tshirt = new Product();
        tshirt.setName("T-shirt");
        tshirt.setDescription("Comfortable cotton T-shirt.");
        tshirt.setImageUrl("https://via.placeholder.com/600x400");
        tshirt.setPrice(19.99);
        tshirt.setCategory(clothing);

        Product novel = new Product();
        novel.setName("Novel");
        novel.setDescription("Fictional novel by famous author.");
        novel.setImageUrl("https://via.placeholder.com/600x400");
        novel.setPrice(14.99);
        novel.setCategory(books);

        productRepository.saveAll(Arrays.asList(phone, laptop, tshirt, novel));
    }
}
