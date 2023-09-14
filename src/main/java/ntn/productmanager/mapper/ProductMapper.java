package ntn.productmanager.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ntn.productmanager.entity.Product;

@Mapper
public interface ProductMapper {
	
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class );
	
	ntn.productmanager.domain.Product entityToDomain(Product entity);

}
