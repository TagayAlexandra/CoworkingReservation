package org.example.command.impl;

import org.example.command.Command;
import org.example.entity.TypeSpace;
import org.example.entity.WorkSpace;
import org.example.repository.impl.CollectionWorkSpaceRepository;
import org.example.service.WorkSpaceService;
import org.example.service.impl.WorkSpaceServiceImpl;
import org.example.view.ConsoleInputController;
import org.example.view.MessageConstant;

import java.math.BigDecimal;
import java.util.Random;

public class WorkSpaceCommandCreate implements Command {

    private final WorkSpaceService workSpaceService = new WorkSpaceServiceImpl(new CollectionWorkSpaceRepository());

    @Override
    public void execute() {
        System.out.println(MessageConstant.ENTER_WORKSPACE_DETAILS);
        String userInputWorkSpaceDetails = ConsoleInputController.readString();
        WorkSpace workSpace = parsingStringToWorkSpace(userInputWorkSpaceDetails);
        workSpaceService.create(workSpace);

    }

    private WorkSpace parsingStringToWorkSpace(String data) {
        Random random = new Random();
        Long id = random.nextLong();

        String[] arrayOfData = data.trim().split(",");

        int INDEX_OF_TYPE_SPACE = 0;
        int INDEX_OF_PRICE = 1;

        String dataOfType = arrayOfData[INDEX_OF_TYPE_SPACE].trim().toUpperCase();
        TypeSpace typeSpace = TypeSpace.valueOf(dataOfType);

        String dataOfPrice = arrayOfData[INDEX_OF_PRICE].trim();
        BigDecimal price = BigDecimal.valueOf(Long.parseLong(dataOfPrice));

        boolean DEFAULT_IS_AVAILABLE_VALUE = true;

        return new WorkSpace(id, typeSpace, price, DEFAULT_IS_AVAILABLE_VALUE);

    }
}
