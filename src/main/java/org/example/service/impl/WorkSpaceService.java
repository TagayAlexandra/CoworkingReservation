package org.example.service.impl;

import org.example.entity.WorkSpace;
import org.example.repository.Repository;
import org.example.service.Service;

public class WorkSpaceService implements Service<WorkSpace> {

    private final Repository<WorkSpace> repository;

    public WorkSpaceService(Repository<WorkSpace> repository) {
        this.repository = repository;
    }

    @Override
    public void create(WorkSpace workSpace) {
        repository.create(workSpace);


    }

    @Override
    public WorkSpace read(Long id) {
        return repository.read(id);
    }

    @Override
    public void update(WorkSpace workSpace) {
        repository.update(workSpace);


    }

    @Override
    public void delete(Long id) {
        repository.delete(id);

    }
}
