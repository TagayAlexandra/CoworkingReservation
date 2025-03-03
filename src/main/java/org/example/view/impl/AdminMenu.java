package org.example.view.impl;

import org.example.entity.WorkSpace;
import org.example.repository.WorkSpaceRepository;
import org.example.repository.impl.CollectionWorkSpaceRepository;
import org.example.service.WorkSpaceService;
import org.example.service.impl.WorkSpaceServiceImpl;
import org.example.view.ConsoleInputController;
import org.example.view.Menu;
import org.example.view.MessageConstant;
import org.example.view.StringToTypeConverter;


public class AdminMenu implements Menu {

    private final WorkSpaceRepository workSpaceRepository = CollectionWorkSpaceRepository.getInstance();
    private final WorkSpaceService workSpaceService = new WorkSpaceServiceImpl(workSpaceRepository);

    private final StringToTypeConverter stringToTypeConverter = new StringToTypeConverter();


    @Override
    public void view() {
        int VALUE_FOR_WORK_SPACE_CREATE = 1;
        int VALUE_WORK_SPACE_DELETE = 2;
        int VALUE_WORK_SPACE_IS_AVAILABLE = 3;
        int VALUE_FOR_MAIN_MENU = 0;

        int userInput = Integer.MAX_VALUE;

        while (userInput != VALUE_FOR_MAIN_MENU) {

            System.out.println(MessageConstant.ADMIN_ACTION_PROMPT);
            System.out.println(MessageConstant.SELECTED_VALUE);
            userInput = ConsoleInputController.readInt();

            if (userInput == VALUE_FOR_WORK_SPACE_CREATE) {
                System.out.println(MessageConstant.ENTER_WORKSPACE_DETAILS);
                String userValue = ConsoleInputController.readString();
                WorkSpace workSpace = stringToTypeConverter.parsingStringToWorkSpace(userValue);
                workSpaceService.create(workSpace);

            } else if (userInput == VALUE_WORK_SPACE_DELETE) {
                System.out.println(MessageConstant.WORKSPACE_ID);
                String userValue = ConsoleInputController.readString();
                Long workSpaceId = stringToTypeConverter.convertStringToLong(userValue);
                workSpaceService.delete(workSpaceId);

            } else if (userInput == VALUE_WORK_SPACE_IS_AVAILABLE) {
                workSpaceService.readAllAvailableWorkSpaces().forEach(System.out::println);

            } else {
                System.out.println(MessageConstant.WRONG_INPUT);
            }
        }


    }

}
