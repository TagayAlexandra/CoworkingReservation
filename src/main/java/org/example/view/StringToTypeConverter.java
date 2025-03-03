package org.example.view;

import org.example.entity.BookingDetail;
import org.example.entity.TypeSpace;
import org.example.entity.WorkSpace;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class StringToTypeConverter {

    public WorkSpace parsingStringToWorkSpace(String data) {
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

    public BookingDetail parsingStringToBookingDetail(String userInputBookingDetail, String workSpaceId) {

        Random random = new Random();
        Long id = random.nextLong();

        int INDEX_OF_DATA = 0;
        int INDEX_OF_TIME = 1;

        String[] dataArray = userInputBookingDetail.trim().split(",");
        String[] arrayOfDate = dataArray[INDEX_OF_DATA].trim().split("\\.");
        String[] arrayOfTime = dataArray[INDEX_OF_TIME].trim().split("-");

        int DATE_INDEX = 0;
        int MONTH_INDEX = 1;

        int date = Integer.parseInt(arrayOfDate[DATE_INDEX]);
        int month = Integer.parseInt(arrayOfDate[MONTH_INDEX]);

        LocalDate localDate = LocalDate.of(LocalDate.now().getYear(), month, date);

        int START_TIME_INDEX = 0;
        int END_TIME_INDEX = 1;

        String[] startTimeArray = arrayOfTime[START_TIME_INDEX].trim().split(":");
        int HOUR_INDEX = 0;
        int MINUET_INDEX = 1;

        int startHour = Integer.parseInt(startTimeArray[HOUR_INDEX]);
        int startMinuet = Integer.parseInt(startTimeArray[MINUET_INDEX]);

        LocalTime startTime = LocalTime.of(startHour, startMinuet);

        String[] endTimeArray = arrayOfTime[END_TIME_INDEX].trim().split(":");

        int endHour = Integer.parseInt(endTimeArray[HOUR_INDEX]);
        int endMinuet = Integer.parseInt(endTimeArray[MINUET_INDEX]);

        LocalTime endTime = LocalTime.of(endHour, endMinuet);
        String DEFAULT_OWNER_VALUE = "User";

        Long spaceId = Long.parseLong(workSpaceId);


        return new BookingDetail(id, localDate, startTime, endTime, spaceId, DEFAULT_OWNER_VALUE);


    }


    public Long convertStringToLong(String data ){
        return Long.parseLong(data.trim());
    }
}
