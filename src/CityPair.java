public class CityPair {

    private String name;
    private String departureCode;
    private String arrivalCode;
    private double departureLat;
    private double departureLon;
    private double arrivalLat;
    private double arrivalLon;
    private double distance;

    public CityPair(String[] str) {
        setName(str[1]);
        String[] strDetails = str[2].split(",");
        setDepartureCode(strDetails[1]);
        setArrivalCode(strDetails[2]);
        setDepartureLat(Double.parseDouble(strDetails[3]));
        setDepartureLon(Double.parseDouble(strDetails[4]));
        setArrivalLat(Double.parseDouble(strDetails[5]));
        setArrivalLon(Double.parseDouble(strDetails[6]));
    }


    public String getArrivalCode() {
        return arrivalCode;
    }

    public String getName() {
        return name;
    }

    public double getArrivalLat() {
        return arrivalLat;
    }

    public double getArrivalLon() {
        return arrivalLon;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public double getDepartureLat() {
        return departureLat;
    }

    public double getDepartureLon() {
        return departureLon;
    }

    public double getDistance() {
        return distance;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }

    public void setArrivalLat(double arrivalLat) {
        this.arrivalLat = arrivalLat;
    }

    public void setArrivalLon(double arrivalLon) {
        this.arrivalLon = arrivalLon;
    }

    public void setDepartureCode(String departureCode) {
        this.departureCode = departureCode;
    }

    public void setDepartureLat(double departureLat) {
        this.departureLat = departureLat;
    }

    public void setDepartureLon(double departureLon) {
        this.departureLon = departureLon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public void print() {
        System.out.printf("Distance between %s and %s is %f km\n", getArrivalCode(), getDepartureCode(), getDistance());
    }

}
