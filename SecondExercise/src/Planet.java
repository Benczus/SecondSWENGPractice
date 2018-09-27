public enum Planet {

    MERCURY(0.24,4878,57.9),
    VENUS(0.62,12104,108.2);



    double circulationTime;
        double radius;
        double distanceFromSun;

    Planet(double circulationTime, double radius, double distanceFromSun) {
        this.circulationTime = circulationTime;
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
    }
}
