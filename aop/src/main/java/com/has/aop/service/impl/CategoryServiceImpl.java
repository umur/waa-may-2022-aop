package com.has.aop.service.impl;

import com.has.aop.dto.CategoryDto;
import com.has.aop.dto.UserDto;
import com.has.aop.entity.Category;
import com.has.aop.entity.User;
import com.has.aop.repository.CategoryRepo;
import com.has.aop.repository.UserRepo;
import com.has.aop.service.CategoryService;
import com.has.aop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    @Override
    public void save(Category p) {
        categoryRepo.save(p);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryDto getById(int id) {
        CategoryDto result = new CategoryDto();
        var item = categoryRepo.findById(id).get();
        result.setName(item.getName());
        result.setId(item.getId());

        return result;
    }

    @Override
    public List<CategoryDto> getAll() {
        var result= new ArrayList<CategoryDto>();
        categoryRepo.findAll().forEach(item -> {
            CategoryDto p = new CategoryDto();
            p.setId(item.getId());
            p.setName(p.getName());
            result.add(p);
        });

        return result;
    }
}
