public class Haversine {

    private static final double radius = 6371;

    private double latA;
    private double latD;

    private double lonA;
    private double lonD;

    public Haversine(CityPair cityPair) {
        latA = cityPair.getArrivalLat();
        latD = cityPair.getDepartureLat();
        lonA = cityPair.getArrivalLon();
        lonD = cityPair.getDepartureLon();
    }

    public double computeDistance() {

        double latDiff = Math.toRadians(latD - latA);
        double lonDiff = Math.toRadians(lonD - lonA);

        double a = (Math.sin(latDiff / 2) * Math.sin(latDiff / 2)) + (Math.cos(Math.toRadians(latA)) * Math.cos(Math.toRadians(latD)) * (Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2)));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = radius * c;

        return d;
    }
}
