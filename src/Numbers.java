import java.util.Objects;

public class Numbers implements Comparable {
    private int value;
    private int count;

    public Numbers(int value, int count) {
        this.value = value;
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        return this.value-((Numbers)o).getValue ();
    }
}
