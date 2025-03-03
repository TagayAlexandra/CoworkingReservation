package org.example.view;

public class MessageConstant {

    public static final String HELLO_MESSAGE = "Hello";

    public static final String ROLE_OF_USER = """
            Select the action :
             1 - Log in as Admin\s
             2 - Log in as User.\s
             0 - Exit.\s
             Please enter the corresponding number.""";


    public static final String SELECTED_VALUE = "Enter the selected number:";


    public static final String ADMIN_ACTION_PROMPT = """
            Select the action :
             1 - Create new workSpace\s
             2 - Delete workSpace\s
             3 - View reserved spaces\s
             0 - Back to Main menu
             Please enter the corresponding number.""";


    public static final String ENTER_WORKSPACE_DETAILS = "Enter workspace details: Type of space and price." + "Type of space can be private,space or room." + "Example (room,11)";


    public static final String WORKSPACE_ID = "Enter the workspace ID:";

    public static final String WRONG_INPUT = "Wrong input, try it one more time";


    public static final String ENTER_BOOKING_DETAIL = "Enter booking details : Date and booking time. Example (13.08,15:00-16:00) ";


    public static final String USER_ACTION_PROMPT = """
            Select the action :
             1 - View available workSpaces\s
             2 - Book a  workSpace\s
             3 - Browse your own reservation \s
             4 - Cansel reservation \s
             0 - Back to Main menu
             Please enter the corresponding number.""";
}


