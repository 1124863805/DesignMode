package cn.java52.Strategy.practice.example2;

class ByTrain implements TripMode {

    public void getOut() {
        System.out.println("坐火车");
    }
}
