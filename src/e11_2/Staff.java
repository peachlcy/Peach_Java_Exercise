package e11_2;

public class Staff extends Employee {
    public String officeLevel="cat";

    public String getOfficeLevel() {
        return officeLevel;
    }

    public void setOfficeLevel(String officeLevel) {
        this.officeLevel = officeLevel;
    }

    public Staff(){

    }

    public Staff(String officeLevel){
        setOfficeLevel(officeLevel);
    }
    public String toString() {
        return super.toString()+"Staff office level = " + officeLevel;
    }
}
