package com.lab.springdata.service;

import com.lab.springdata.entity.Activitylog;
import com.lab.springdata.repo.ActivitylogRepo;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivitylogService {
    //@NonNull
    private final ActivitylogRepo activitylogRepo;

    public void save(Activitylog activitylog){
        activitylogRepo.save(activitylog);
    }
    public List<Activitylog> getAll(){
        return activitylogRepo.findAll();
    }

}
