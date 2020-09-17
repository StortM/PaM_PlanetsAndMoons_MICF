package PaM;

public class Moon extends OrbitalObject {

    private Planet associatedPlanet;

    public Moon(double yearLength, double distanceFromSun, String name, Planet associatedPlanet) {
        this.yearLength = yearLength;
        this.distanceFromSun = distanceFromSun;
        this.name = name;
        this.associatedPlanet = associatedPlanet;
    }

    public double getYearLength() {
        return yearLength;
    }

    public void setYearLength(double yearLength) {
        this.yearLength = yearLength;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet getAssociatedPlanet() {
        return associatedPlanet;
    }

    public void setAssociatedPlanet(Planet associatedPlanet) {
        this.associatedPlanet = associatedPlanet;
    }
}
