import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.ArrayList;
import java.util.Calendar;

public class HowardsVolunteerDays {
    public static void main(String[] args) {
        System.out.println("Howard's Volunteer Days");
        Calendar start = Calendar.getInstance();
        start.set(2018, 1, 9);
        Calendar end = Calendar.getInstance();
        end.set(2018, 5, 1);

        SimpleDateFormat format = new SimpleDateFormat("EEEE MMMM d, yyyy");
        System.out.println("Start: " + format.format(start.getTime()));
        System.out.println("End: " + format.format(end.getTime()));

        List<Calendar> list = new ArrayList<Calendar>();

        Calendar dt = start;
        while( dt.getTime().compareTo(end.getTime()) <= 0)
        {
            list.add((Calendar)dt.clone());
            dt.add(Calendar.DAY_OF_YEAR, 14);
        }

        for(Calendar x : list) {
            System.out.println("\t" + format.format(x.getTime()));
        }
    }
}
