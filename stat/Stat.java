package stat;

public class Stat {
    private String name;
    private double base, EV, EVG, IV, num;

    public Stat(String n){
        name = n;
    }

    public void setAll(double base, double EV, double EVG, double IV, double num){
        setBase(base);
        setEV(EV);
        setEVG(EVG);
        setIV(IV);
        setNum(num);
    }

    public double getBase() {
        return base;
    }

    public double getEV() {
        return EV;
    }

    public double getEVG() {
        return EVG;
    }

    public double getIV() {
        return IV;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setEV(double EV) {
        this.EV = EV;
    }

    public void setEVG(double EVG) {
        this.EVG = EVG;
    }

    public void setIV(double IV) {
        this.IV = IV;
    }
}