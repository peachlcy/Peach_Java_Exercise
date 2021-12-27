package e11_2;

public class Person {
    public String name="peach";
    public String address="西南大学";
    public long telNumber=13308049702L;
    public String emailAddress="289854656@qq.com";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Person() {
    }

    public Person(String name, String address, long telNumber, String emailAddress) {
        setName(name);
        setAddress(address);
        setTelNumber(telNumber);
        setEmailAddress(emailAddress);
    }

    public String toString() {
        return "Person name = " + name + " Person address = " + address + " Person phone number = "
                + telNumber + " Person email address = " + emailAddress+"\n";

    }
}
