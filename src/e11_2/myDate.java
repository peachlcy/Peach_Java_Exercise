package e11_2;

public class myDate {
    public int year=0;
    public int month=0;
    public int day=0;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public myDate(){
    }

    public myDate(int year,int month,int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public String toString(){
        return "The date = "+year+"."+month+"."+day;
    }
}
