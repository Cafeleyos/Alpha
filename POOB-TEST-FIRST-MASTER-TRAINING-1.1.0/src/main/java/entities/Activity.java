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

    public int averageBeats() {
        int result = 0;
        for(Record r : records) {
            result = result + r.getBeats();
        }
        return result/records.size();
    }
}
