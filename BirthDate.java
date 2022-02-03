public class BirthDate {
    private final long year;
    private final int month;
    private final int day;

    public BirthDate(long year, int month, int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }


    public long getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // return String representation of Employee object
    @Override
    public String toString() {
        return String.format("%d.%d.%d", getDay(),getMonth(),getYear());
    }


}

