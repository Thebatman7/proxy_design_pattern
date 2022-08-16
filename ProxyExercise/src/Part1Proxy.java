import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Part1Proxy implements Part1Interface {
    private Part1ConcreteClass concreteClass;
    //Creating an empty HashMap for days of the week
    private Map<String, Boolean> allowedDays = new HashMap<String, Boolean>();
    private int startTime = 8;
    private int endTime = 17;
    private String currentDay;
    private int currentTime;

    public Part1Proxy() {
        concreteClass = new Part1ConcreteClass();
        allowedDays.put("MONDAY", true);
        allowedDays.put("TUESDAY", false);
        allowedDays.put("WEDNESDAY", true);
        allowedDays.put("THURSDAY", false);
        allowedDays.put("FRIDAY", true);
        allowedDays.put("SATURDAY", true);
        allowedDays.put("SUNDAY", false);
    }

    public void getDayOfWeek() {
        LocalDate today = LocalDate.now();
        currentDay =  today.getDayOfWeek().toString();
    }

    public void getTime() {
        LocalTime time = LocalTime.now();
        currentTime = time.getHour();
    }

    public void setCurrentDay(String day) {
        currentDay = day;
    }

    public void setCurrentTime(int time) {
        currentTime = time;
    }

    @Override
    public int getRandomNum() {
        if (allowedDays.get(currentDay) && (currentTime >= startTime || currentTime <= endTime)) {
            return concreteClass.getRandomNum();
        }
        else {
            throw new RuntimeException();
        }
    }

    @Override
    public int getRandomEvenNum() {
        if (allowedDays.get(currentDay) && (currentTime >= startTime || currentTime <= endTime)) {
            return concreteClass.getRandomEvenNum();
        }
        else {
            throw new RuntimeException();
        }
    }

    @Override
    public int getRandomOddNum() {
        if (allowedDays.get(currentDay) && (currentTime >= startTime || currentTime <= endTime)) {
            return concreteClass.getRandomOddNum();
        }
        else {
            throw new RuntimeException();
        }
    }

}
