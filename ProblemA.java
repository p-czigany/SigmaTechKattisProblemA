import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int numberOfRows = sc.nextInt();
            if (numberOfRows == -1) return;
            List<Row> rows = new ArrayList<>();
            for (int i = 0; i < numberOfRows; i++) {
                int speed = sc.nextInt();
                if (speed < 1 || speed > 90) throw new IllegalArgumentException("Speed is not valid!");
                int timeElapsed = sc.nextInt();
                if (timeElapsed < 1 || timeElapsed > 12)
                    throw new IllegalArgumentException("Time Elapsed is not valid!");
                Row row = new Row(speed, timeElapsed);
                rows.add(row);
            }
            Log log = new Log(rows);
            System.out.println(log.getDistance() + " miles");
        }
    }
}
