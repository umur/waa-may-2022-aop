package edu.miu.springaop.service.implementation;

import edu.miu.springaop.DTO.UserDto;
import edu.miu.springaop.entity.User;
import edu.miu.springaop.entity.unidirectional.UserUni;
import edu.miu.springaop.repository.UserRepo;
import edu.miu.springaop.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired private UserRepo userRepo;
    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public void save(UserDto u) {
        User user = modelMapper.map(u, User.class);
        userRepo.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto getById(int id) {
        return modelMapper.map(userRepo.findById(id).get(),UserDto.class);
    }

    @Override
    public List<UserDto> getAll() {
        List<UserDto> result = new ArrayList<>();
        userRepo.findAll().forEach(
                u -> result.add(modelMapper.map(u, UserDto.class))
        );
        return result;
    }
}
