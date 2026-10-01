package org.example.campsitemanagementsystem;

public class Booking {
    private int identifier;
    private String startDate;
    private String endDate;
    private String campSite;
    private String campingArea;
    private String bookedGuest;
    private int numGuests;
    private LinkedList<Plot> plot;
    private LinkedList<String> preferences;

    public Booking(int identifier,String startDate,String endDate,String campSite,String campingArea,String bookedGuest,int numGuests){
        this.identifier=identifier;
        this.startDate=startDate;
        this.endDate=endDate;
        this.campSite=campSite;
        this.campingArea=campingArea;
        this.bookedGuest=bookedGuest;
        this.numGuests=numGuests;
        plot = new LinkedList<>();
        preferences= new LinkedList<>();
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCampSite() {
        return campSite;
    }

    public void setCampSite(String campSite) {
        this.campSite = campSite;
    }

    public String getCampingArea() {
        return campingArea;
    }

    public void setCampingArea(String campingArea) {
        this.campingArea = campingArea;
    }

    public String getBookedGuest() {
        return bookedGuest;
    }

    public void setBookedGuest(String bookedGuest) {
        this.bookedGuest = bookedGuest;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public LinkedList<Plot> getPlot() {
        return plot;
    }

    public void setPlot(LinkedList<Plot> plot) {
        this.plot = plot;
    }

    public LinkedList<String> getPreferences() {
        return preferences;
    }

    public void setPreferences(LinkedList<String> preferences) {
        this.preferences = preferences;
    }
}
