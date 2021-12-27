package e11_2;

public class Employee extends Person {
    public String office;
    public double payment;
    public myDate date;

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public myDate getDate() {
        return date;
    }

    public void setDate(myDate date) {
        this.date = date;
    }

    public Employee() {
        office = "桃桃家";
        payment = 100000;
        date = new myDate();
    }

    public Employee(String office, double payment, myDate date) {
        setOffice(office);
        setPayment(payment);
        setDate(date);
    }

    public String toString() {
        return super.toString()+"Employee office = " + office + " Employee payment = " + payment + " Employee date = " + date.toString();
    }
}


