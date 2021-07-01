package ru.gb.marketproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.marketproject.utils.NoProductException;
import ru.gb.marketproject.product.Product;
import ru.gb.marketproject.repositories.ProductRepo;

import java.util.List;

@Service
public class ProductService {
    private ProductRepo productRepo;

    @Autowired
    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getProductList() {
        return productRepo.getProductList();
    }

    public Product getProductById(Long id) throws NoProductException {
        return productRepo.getProductById(id);
    }

    public void addProduct(Product product) {
        productRepo.addProduct(product);
    }


}
