package entities;

public class Session {

    private Activity activity;

    public void assignActivity(Activity activity) {
        this.activity = activity;
    }

    public int averageBeats() {
        if (activity!= null) {
            return activity.averageBeats();
        }
        return 0;
    }
}
