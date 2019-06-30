package cn.java52.Strategy.practice.example2;

public class WyTourPattern  {

    public static void main(String[] args) {
        TripMode mode = new ByTrain();
        WyTour wy = new WyTour();
        wy.setTm(mode);
        wy.getOut();
    }
}
