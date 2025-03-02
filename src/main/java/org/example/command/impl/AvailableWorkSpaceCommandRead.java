package org.example.command.impl;

import org.example.command.Command;
import org.example.entity.WorkSpace;
import org.example.repository.impl.CollectionWorkSpaceRepository;
import org.example.service.WorkSpaceService;
import org.example.service.impl.WorkSpaceServiceImpl;

import java.util.List;

public class AvailableWorkSpaceCommandRead implements Command {
    private final WorkSpaceService workSpaceService = new WorkSpaceServiceImpl(new CollectionWorkSpaceRepository());
    @Override
    public void execute() {
      List<WorkSpace> availableWorkSpaces =  workSpaceService.readAllAvailableWorkSpaces();
      availableWorkSpaces.forEach(System.out::println);

    }
}
