package ntn.productmanager.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record Product(
	
	@Id
	Long id,
	
	@NotNull(message = "Name is requied")
	String name,
	
	@NotNull
	String code,
	
	@NotNull(message = "Price is required")
	@Positive(message = "Price must be greater than 0")
	Double price,
	
	@Version
	int version

) {

}
