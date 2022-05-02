package edu.miu.springdata.service.impl;

import edu.miu.springdata.dto.UserDto;
import edu.miu.springdata.entity.bidirectional.joincolumn.User;
import edu.miu.springdata.repository.UserRepository;
import edu.miu.springdata.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper){
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserDto> findAll() {
        var users = userRepository.findAll();
        Type listType = new TypeToken<List<UserDto>>(){}.getType();
        return modelMapper.map(users,listType);
    }

    @Override
    public UserDto findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return modelMapper.map(userRepository.save(user.get()),UserDto.class);
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return modelMapper.map(userRepository.save(user),UserDto.class);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
