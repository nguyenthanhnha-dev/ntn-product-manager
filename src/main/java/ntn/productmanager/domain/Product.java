package ntn.productmanager.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record Product(
	
	@NotNull 
	Long id,
	
	@NotNull 
	String name,

	@NotNull(message="Price is required")
	@Positive(message="Price must be greater than 0")
	Double price

)
{

}