package com.company.ConverterInterface;

public class ConverterSwitch implements Converter {

    @Override
    public String convertDay(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Sun";

            case 2: return "Mon";

            case 3: return "Tues";

            case 4: return "Wed";

            case 5: return "Thurs";

            case 6: return "Fri";

            case 7: return "Sat";

            default: return "ERROR";
        }
    }

    @Override
    public String convertMonth(int monthNumber) {
        switch(monthNumber) {
            case 1: return "Jan";

            case 2: return "Feb";

            case 3: return "Mar";

            case 4: return "Apr";

            case 5: return "May";

            case 6: return "Jun";

            case 7: return "Jul";

            case 8: return "Aug";

            case 9: return "Sep";

            case 10: return "Oct";

            case 11: return "Nov";

            case 12: return "Dec";

            default: return "ERROR";
        }
    }
}
