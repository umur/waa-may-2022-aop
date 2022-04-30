package edu.miu.springaop.DTO;

import edu.miu.springaop.entity.unidirectional.ProductUni;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private int id;
    private String name;
    private List<ProductUni> productUnis;
}
