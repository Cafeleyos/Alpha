package entities;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private List<Record> records;

    public Activity() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        this.records.add(record);
    }

    public double averageBeats() {
        double result = 0;
        for(Record r : records) {
            result += r.getBeats();
        }
        return records.size() == 0 ? 0 : result / records.size();
    }
}
