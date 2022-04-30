package edu.miu.springaop.service;

import edu.miu.springaop.DTO.ActivityLogDto;

import java.util.List;

public interface ActivityLogService {
    void save(ActivityLogDto a);
    void deleteById(int id);
    ActivityLogDto getById(int id);
    List<ActivityLogDto> getAll();
}
