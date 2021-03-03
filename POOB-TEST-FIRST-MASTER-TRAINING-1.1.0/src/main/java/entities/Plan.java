package entities;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    public static final int MIN_BEATS = 90;
    public static final int MAX_BEATS = 160;

    private long number;
    private String type;
    private List<Week> weeks;
    private Cyclist cyclist;

    public Plan(long number) {
        this.number = number;
        this.weeks = new ArrayList<>();
    }

    /**
     *
     * @param type "Heart care plan"
     * @param cyclist
     */
    public Plan(String type, Cyclist cyclist) {
        this.type = type;
        this.cyclist = cyclist;
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

    public double averageBeats() {
        double result = 0;
        for (Week w:weeks) {
            result += w.averageBeats();
        }
        return weeks.size() == 0 ? 0 : result / weeks.size();
    }

    public Cyclist getCyclist() {
        return this.cyclist;
    }
}
