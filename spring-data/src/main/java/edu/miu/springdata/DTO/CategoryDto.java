package edu.miu.springdata.DTO;

import edu.miu.springdata.entity.unidirectional.ProductUni;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private int id;
    private String name;
    private List<ProductUni> productUnis;
}
