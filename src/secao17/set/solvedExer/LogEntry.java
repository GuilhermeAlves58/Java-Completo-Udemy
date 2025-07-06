package secao17.set.solvedExer;


import java.util.Date;
import java.util.Objects;

public class LogEntry implements Comparable<LogEntry> {
    private String name;
    private Date date;

    public LogEntry(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        LogEntry userSet = (LogEntry) o;
        return Objects.equals(name, userSet.name) && Objects.equals(date, userSet.date);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(date);
        return result;
    }

    @Override
    public int compareTo(LogEntry o) {
        return name.compareTo(o.name);
    }
}
