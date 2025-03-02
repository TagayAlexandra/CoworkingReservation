package org.example.repository.impl;

import org.example.entity.WorkSpace;
import org.example.exeption.DataNotFoundException;
import org.example.repository.WorkSpaceRepository;
import org.example.view.MessageConstant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class CollectionWorkSpaceRepository implements WorkSpaceRepository {


    private final List<WorkSpace> workSpaceList = new ArrayList<>();


    @Override
    public void create(WorkSpace workSpace) {
        workSpaceList.add(workSpace);

    }


    @Override
    public void update(WorkSpace workSpace) throws DataNotFoundException {
        int index = getIndexById(workSpace.getId()).orElseThrow(() -> new DataNotFoundException(MessageConstant.DATA_NOT_FOUND));
        workSpaceList.set(index, workSpace);

    }

    @Override
    public List<WorkSpace> readAll() {
        return workSpaceList;
    }

    @Override
    public void delete(Long id) throws DataNotFoundException {
        int index = getIndexById(id).orElseThrow(() -> new DataNotFoundException(MessageConstant.DATA_NOT_FOUND));
        workSpaceList.remove(index);

    }

    private Optional<Integer> getIndexById(Long id) {
        for (int i = 0; i < workSpaceList.size(); i++) {
            if (workSpaceList.get(i).getId().equals(id)) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}
