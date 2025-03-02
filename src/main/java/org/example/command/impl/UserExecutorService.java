package org.example.command.impl;

import org.example.command.Command;
import org.example.command.CommandExecutorService;

import java.util.HashMap;
import java.util.Map;

public class UserExecutorService implements CommandExecutorService {
    private final Map<Integer,Command>  userCommand = new HashMap<>();

    public UserExecutorService() {
        userCommand.put(1,new AvailableWorkSpaceCommandRead());
        userCommand.put(2,new ReserveWorkSpaceCommand());
        userCommand.put(3,new CancelReservationCommand());
        userCommand.put(4,new BookedWorkSpaceCommandRead());

    }

    @Override
    public Command getCommand(int commandValue) {
        return userCommand.get(commandValue);
    }
}
