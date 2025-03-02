package org.example.command.impl;

import org.example.command.Command;
import org.example.command.CommandExecutorService;

import java.util.HashMap;
import java.util.Map;

public class UserExecutorService implements CommandExecutorService {
    private final Map<Integer,Command>  userCommand = new HashMap<>();

    public UserExecutorService() {
        userCommand.put(1,new AvailableWorkSpaceCommandRead());

    }

    @Override
    public Command getCommand(int commandValue) {
        return userCommand.get(commandValue);
    }
}
