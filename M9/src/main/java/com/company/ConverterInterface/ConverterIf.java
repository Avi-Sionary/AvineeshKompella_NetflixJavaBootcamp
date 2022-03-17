package com.company.ConverterInterface;

public class ConverterIf implements Converter {

    @Override
    public String convertMonth(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {

            if (monthNumber == 1) {
                return "Jan";
            }

            else if (monthNumber == 2) {
                return "Feb";
            }

            else if (monthNumber == 3) {
                return "Mar";
            }

            else if (monthNumber == 4) {
                return "Apr";
            }

            else if (monthNumber == 5) {
                return "May";
            }

            else if (monthNumber == 6) {
                return "Jun";
            }

            else if (monthNumber == 7) {
                return "Jul";
            }

            else if (monthNumber == 8) {
                return "Aug";
            }

            else if (monthNumber == 9) {
                return "Sep";
            }

            else if (monthNumber == 10) {
                return "Oct";
            }

            else if (monthNumber == 11) {
                return "Nov";
            }

            else {
                return "Dec";
            }
        }
        return "ERROR";
    }

    @Override
    public String convertDay(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {

            if (dayNumber == 1) {
                return "Sun";
            }

            else if (dayNumber == 2) {
                return "Mon";
            }

            else if (dayNumber == 3) {
                return "Tues";
            }

            else if (dayNumber == 4) {
                return "Wed";
            }

            else if (dayNumber == 5) {
                return "Thurs";
            }

            else if (dayNumber == 6) {
                return "Fri";
            }

            else {
                return "Sat";
            }
        }
        return "ERROR";
    }
}
