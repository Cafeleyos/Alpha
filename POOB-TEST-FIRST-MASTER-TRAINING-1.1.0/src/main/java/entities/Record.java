package entities;

/**
 * Esta clase representa un registro del atleta.
 *
 * El numero de beats no puede ser menor a 20
 */
public class Record {

    private int beats;

    public Record(int beats) {
        this.beats = beats;
    }
    public int getBeats() {
        return beats;
    }
}
