package e11_6;

public class Loan {
    public double loan = 0;

    public double getLona() {
        return loan;
    }

    public void setLona(double lona) {
        this.loan = lona;
    }

    public Loan() {

    }


    public Loan(double loan) {
        setLona(loan);
    }

    public String toString() {
        return "The loan = " + loan;
    }
}

