import java.util.InputMismatchException;
import java.util.List;

public class Log {
    private final List<Row> rows;

    public Log(List<Row> rows) {
        for (int i = 1; i < rows.size(); i++) {
            if (rows.get(i).getTimeElapsed() <= rows.get(i - 1).getTimeElapsed())
                throw new IllegalArgumentException("Time Elapsed cannot decrease!");
        }
        this.rows = rows;
    }

    public Row getRow(int i) {
        return rows.get(i);
    }

    public int getDistance() {
        if (rows.isEmpty()) throw new InputMismatchException();
        int milesTotal = 0;
        for (int i = this.rows.size() - 1; i >= 0; i--) {
            int lapTime = (i > 0) ? (rows.get(i).getTimeElapsed() - rows.get(i - 1).getTimeElapsed()) : rows.get(0).getTimeElapsed();
            milesTotal += rows.get(i).getSpeed() * lapTime;
        }
        return milesTotal;
    }
}
