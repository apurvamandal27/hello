import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Hello {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        String inputString1 = sc.nextLine();//"15 3 1994"
        String inputString2 = sc.nextLine();//"9 10 2017"

        try {
            Date date1 = myFormat.parse(inputString1);
            Date date2 = myFormat.parse(inputString2);
            long diff = date2.getTime() - date1.getTime();
            System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}