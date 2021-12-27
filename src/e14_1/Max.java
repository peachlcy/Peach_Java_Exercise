package e14_1;

public class Max {
    public static Comparable max(Comparable g1,Comparable g2){
        if (g1.compareTo(g2)>0)
            return g1;
        else
            return g2;
    }
}
