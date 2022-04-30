package com.example.springdata.service.impl;

import com.example.springdata.dto.AddUserDto;
import com.example.springdata.dto.UserDto;
import com.example.springdata.entity.Review;
import com.example.springdata.entity.User;
import com.example.springdata.repository.UserRepository;
import com.example.springdata.service.UserService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserDto save(AddUserDto userDto) throws ParseException {
        User u = convertToEntity(userDto);

        User result = userRepository.save(u);
        return convertToDto(result);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public User getById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<UserDto> getAll() {
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false)
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private UserDto convertToDto(User user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

    private User convertToEntity(AddUserDto userDto) throws ParseException {
        User user = modelMapper.map(userDto, User.class);
        user.getAddress().setUser(user);

//        List<Review> reviews = user.getReviews();
//        for (Review review:
//             reviews) {
//            review.setUser(user);
//        }
        return user;
    }
}
