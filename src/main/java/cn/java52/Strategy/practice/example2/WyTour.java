package cn.java52.Strategy.practice.example2;

public class WyTour implements TripMode {
    private TripMode tm;

    public void setTm(TripMode tm) {
        this.tm = tm;
    }

    public TripMode getTm() {
        return tm;
    }

    public void getOut() {
        tm.getOut();
    }
}
