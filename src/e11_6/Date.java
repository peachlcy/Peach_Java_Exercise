package e11_6;

public class Date {
    public String time="0-0-0";

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date(){

    }

    public Date(String time){
        setTime(time);
    }

    public String toString(){
        return "The time = " + time;
    }
}
