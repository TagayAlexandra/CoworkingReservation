package org.example.service.impl;

import org.example.entity.WorkSpace;
import org.example.exeption.DataNotFoundException;
import org.example.repository.Repository;
import org.example.service.WorkSpaceService;
import org.example.view.MessageConstant;

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
    public WorkSpace readById(Long id) throws DataNotFoundException {
        return repository.readAll().stream()
                .filter(el -> el.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new DataNotFoundException(MessageConstant.DATA_NOT_FOUND));

    }

    @Override
    public void update(WorkSpace workSpace) throws DataNotFoundException {
        repository.update(workSpace);

    }

    @Override
    public void delete(Long id) throws DataNotFoundException {
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
