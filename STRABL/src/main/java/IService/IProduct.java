package IService;

import java.util.List;
import java.util.Optional;

import model.Product;

public interface IProduct {
	List<Product> getAllProducts();
    Optional<Product> getProductById(long id);
    Optional<Product> findByBrand(String brand);
    Product save(Product product);
    void deleteById(long id);
}
