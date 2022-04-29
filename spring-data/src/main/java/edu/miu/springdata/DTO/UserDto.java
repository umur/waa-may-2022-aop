package edu.miu.springdata.DTO;

import edu.miu.springdata.entity.unidirectional.AddressUni;
import edu.miu.springdata.entity.unidirectional.ReviewUni;
import lombok.Data;
import java.util.List;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<ReviewUni> reviewUnis;
    private AddressUni addressUni;
}
