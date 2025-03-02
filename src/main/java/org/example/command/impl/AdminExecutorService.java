package org.example.command.impl;

import org.example.command.Command;
import org.example.command.CommandExecutorService;

import java.util.HashMap;
import java.util.Map;

public class AdminExecutorService implements CommandExecutorService {

    private final Map<Integer,Command> adminCommand = new HashMap<>();

    public AdminExecutorService() {
        adminCommand.put(1,new WorkSpaceCommandCreate());
        adminCommand.put(2,new WorkSpaceCommandDelete());
    }

    @Override
    public Command getCommand(int commandValue) {
        return adminCommand.get(commandValue);
    }
}
