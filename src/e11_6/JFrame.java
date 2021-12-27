package e11_6;

public class JFrame {
    public String frameName="0";

    public String getFrameName() {
        return frameName;
    }

    public void setFrameName(String frameName) {
        this.frameName = frameName;
    }

    public JFrame(){

    }

    public JFrame(String frameName){
        setFrameName(frameName);
    }

    public String toString(){
        return "The frameName = " + frameName;
    }
}
