package ntn.productmanager.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import ntn.productmanager.entity.Product;

public interface ProductRepository extends ReactiveCrudRepository<Product, Long>{

}
