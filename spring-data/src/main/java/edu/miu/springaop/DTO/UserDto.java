package edu.miu.springaop.DTO;

import edu.miu.springaop.entity.unidirectional.AddressUni;
import edu.miu.springaop.entity.unidirectional.ReviewUni;
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
