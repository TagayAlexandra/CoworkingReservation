package org.example.service.impl;

import org.example.entity.WorkSpace;
import org.example.repository.Repository;
import org.example.service.WorkSpaceService;

import java.util.List;
import java.util.stream.Collectors;

public class WorkSpaceServiceImpl implements WorkSpaceService {

    private final Repository<WorkSpace> repository;

    public WorkSpaceServiceImpl(Repository<WorkSpace> repository) {
        this.repository = repository;
    }

    @Override
    public void create(WorkSpace workSpace) {
        repository.create(workSpace);

    }

    @Override
    public WorkSpace readById(Long id) {
        return repository.readAll().stream().filter(el -> el.getId().equals(id)).findFirst().orElseThrow();

    }

    @Override
    public void update(WorkSpace workSpace) {
        repository.update(workSpace);

    }

    @Override
    public void delete(Long id) {
        repository.delete(id);

    }


    @Override
    public List<WorkSpace> readAllBookingWorkSpaces() {
        return repository.readAll().stream().filter(el -> !el.isAvailable()).collect(Collectors.toList());
    }

    @Override
    public List<WorkSpace> readAllAvailableWorkSpaces() {
        return repository.readAll().stream().filter(WorkSpace::isAvailable).collect(Collectors.toList());
    }
}
