package ntn.productmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ntn.productmanager.domain.Product;
import ntn.productmanager.service.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductReactiveRestApi {

	private final ProductService productService;

	public ProductReactiveRestApi(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping(path = "/products/{productId}")
	public Mono<Product> getProduct(@PathVariable int productId) {
		return productService.getProduct(productId);
	}
	
	@GetMapping(path = "/products")
	public Flux<Product> getProduct() {
		return productService.getAllProducts();
	}

}
