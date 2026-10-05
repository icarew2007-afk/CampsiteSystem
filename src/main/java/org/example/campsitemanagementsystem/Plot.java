package org.example.campsitemanagementsystem;

public class Plot {
    private String identifier;
    private String type;
    private boolean hasPower;
    private int bedRooms;
    private int beds;
    private double plotSize;
    private LinkedList<String> facilities;
    private double costPerNight;
    //Photo of plot

    public Plot(String identifier, String type, boolean hasPower, int bedRooms, int beds, double plotSize, double costPerNight){

        this.identifier=identifier;
        this.type=type;
        this.hasPower=hasPower;
        this.bedRooms=bedRooms;
        this.beds=beds;
        this.plotSize=plotSize;
        this.costPerNight=costPerNight;
        facilities = new LinkedList<>();

    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHasPower() {
        return hasPower;
    }

    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
    }

    public int getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public double getPlotSize() {
        return plotSize;
    }

    public void setPlotSize(double plotSize) {
        this.plotSize = plotSize;
    }

    public LinkedList<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(LinkedList<String> facilities) {
        this.facilities = facilities;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }

    public void addFacility(String facility){
        facilities.add(facility);
    }

    public void getFacilityByIndex(int i){
        facilities.get(i);
    }

    public String toString(){
        return "Identifier: "+identifier+", Type: "+type+", Has Power: "+hasPower+", Bedrooms: "+bedRooms+", Beds: "+beds+", Plot Size: "+plotSize+", Cost Per Night: "+costPerNight;
    }

}
