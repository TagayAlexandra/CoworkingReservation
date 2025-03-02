package org.example.command.impl;

import org.example.command.Command;
import org.example.repository.impl.CollectionWorkSpaceRepository;
import org.example.service.WorkSpaceService;
import org.example.service.impl.WorkSpaceServiceImpl;
import org.example.view.ConsoleInputController;
import org.example.view.MessageConstant;

public class WorkSpaceCommandDelete implements Command {
    private final WorkSpaceService workSpaceService = new WorkSpaceServiceImpl(new CollectionWorkSpaceRepository());
    @Override
    public void execute() {
        System.out.println(MessageConstant.WORKSPACE_ID);
        String userInput = ConsoleInputController.readString().trim();
        Long id = Long.parseLong(userInput);
        workSpaceService.delete(id);
    }
}
