package edu.miu.springdata.service.implementation;

import edu.miu.springdata.DTO.ReviewDto;
import edu.miu.springdata.entity.bidirectional.Review;
import edu.miu.springdata.entity.unidirectional.ReviewUni;
import edu.miu.springdata.repository.ReviewRepo;
import edu.miu.springdata.service.ReviewService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private  ReviewRepo reviewRepo;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public void save(ReviewDto p) {
        Review r = modelMapper.map(p, Review.class);
        reviewRepo.save(r);
    }

    @Override
    public void deleteById(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public ReviewDto getById(int id) {

        return modelMapper.map(reviewRepo.findById(id).get(), ReviewDto.class);
    }

    @Override
    public List<ReviewDto> getAll() {
        List<ReviewDto> result = new ArrayList<>();
        reviewRepo.findAll().forEach(
                r -> result.add(modelMapper.map(r, ReviewDto.class))
        );
        return result;
    }
}
