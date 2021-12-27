package e11_2;

public class Faculty extends Employee {
    public int time = 0;
    public String level = "boss";

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Faculty() {

    }

    public Faculty(int time, String level) {
        setTime(time);
        setLevel(level);
    }

    public String toString() {
        return super.toString()+"Faculty time = " + time + " Faculty level = " + level ;
    }
}