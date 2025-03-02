package org.example.command.impl;

import org.example.command.Command;
import org.example.repository.impl.CollectionWorkSpaceRepository;
import org.example.service.WorkSpaceService;
import org.example.service.impl.WorkSpaceServiceImpl;

public class WorkSpaceCommandDelete implements Command {
    private final WorkSpaceService workSpaceService = new WorkSpaceServiceImpl(new CollectionWorkSpaceRepository());
    @Override
    public void execute() {
        Long id = 1L;
        workSpaceService.delete(id);
    }
}
