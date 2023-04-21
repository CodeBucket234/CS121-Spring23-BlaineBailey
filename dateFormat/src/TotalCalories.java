import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
//**********************************************************************************************************************
// Activity 34: Simple Date Format
// Name: Blaine Bailey
// Date of Submission: 4/19/2023
//**********************************************************************************************************************
// This is the TotalCalories class. This class has one private instance variable: a SimpleDateFormat object called
// dateFormat. This object will be used to convert user-given strings and convert them to dates. The one method in the
// class, calculateCalories, takes in the dates the user gives and the number of calories per day as arguments, and
// converts the user-given strings into dates. Then it calculates the difference between the dates, and returns the
// difference between the dates multiplied by the number of days, which represents the total number of calories consumed
// across the time period.
//**********************************************************************************************************************
public class TotalCalories {
    //Creating SimpleDateFormat object to convert strings to dates
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    public int calculateCalories(int calories, String startDate, String endDate) {
        int days = 0;
        try {
            //Convert user-given strings to dates
            Date start = dateFormat.parse(startDate);
            System.out.println(start);
            Date end = dateFormat.parse(endDate);

            //Calculate difference between dates
            long difference = end.getTime() - start.getTime();

            //Convert milliseconds from difference to days
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            //Print where ParseException occurred
            e.printStackTrace();
        }
        return calories * days;
    }
}