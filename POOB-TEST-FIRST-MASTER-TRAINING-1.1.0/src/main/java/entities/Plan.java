package entities;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    public static final int MIN_BEATS = 90;
    public static final int MAX_BEATS = 160;

    private long number;
    private String type;
    private List<Week> weeks;

    public Plan(long number) {
        this.number = number;
        this.weeks = new ArrayList<>();
    }
    public Plan(String type, Cyclist cyclist) {

    }

    public void addWeek(Week week) {
        this.weeks.add(week);
    }

    public long getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public int averageBeats() {
        int result = 0;
        for (Week w:weeks) {
            result = result + w.averageBeats();
        }
        return result/ weeks.size();
    }
}
