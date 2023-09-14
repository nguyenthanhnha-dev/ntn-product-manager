package ntn.productmanager.service;

import org.springframework.stereotype.Service;

import ntn.productmanager.domain.Product;
import ntn.productmanager.mapper.ProductMapper;
import ntn.productmanager.repository.ProductRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Mono<Product> getProduct(long productId) {
		return productRepository.findById(productId)
				.map(entity -> ProductMapper.INSTANCE.entityToDomain(entity));
		
	}
	
	public Flux<Product> getAllProducts() {
		return productRepository.findAll()
				.map(entity -> ProductMapper.INSTANCE.entityToDomain(entity) );
	}

}
