package edu.miu.springaop.DTO;
import edu.miu.springaop.entity.Address;
import edu.miu.springaop.entity.Review;
import lombok.Data;
import java.util.List;

@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<Review> reviewUnis;
    private Address addressUni;
}
