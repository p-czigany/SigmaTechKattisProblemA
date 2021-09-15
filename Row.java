public class Row {

    private final int speed;
    private final int timeElapsed;

    public Row(int speed, int timeElapsed) {
        validateRow(speed, timeElapsed);
        this.speed = speed;
        this.timeElapsed = timeElapsed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTimeElapsed() {
        return timeElapsed;
    }

    private void validateRow(int speed, int timeElapsed) {
        boolean invalidSpeed = (speed < 1 || speed > 90);
        boolean invalidTimeElapsed = (timeElapsed < 1 || timeElapsed > 12);
        if (invalidSpeed || invalidTimeElapsed) {
            throw new IllegalArgumentException("Speed and/or Time Elapsed is not valid!");
        }
    }
}
