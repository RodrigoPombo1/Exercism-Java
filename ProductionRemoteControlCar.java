class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distanceTravelled = 0;
    int speed = 10;
    int victories = 0;
    public void drive() {
        distanceTravelled += speed;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other){    
        return Integer.compare(this.victories, other.victories);      
    }
}
