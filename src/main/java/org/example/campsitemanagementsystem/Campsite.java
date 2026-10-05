package org.example.campsitemanagementsystem;

public class Campsite {
    private String name;
    private String address;
    private int numStars;
    private String contactInfo;
    private LinkedList<String> facilities;
    private LinkedList<CampingArea> campingAreas;


    public Campsite(String name,String address,int numStars,String contactInfo){
        this.name=name;
        this.address=address;
        this.numStars=numStars;
        this.contactInfo=contactInfo;
        campingAreas= new LinkedList<>();
        facilities= new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumStars() {
        return numStars;
    }

    public void setNumStars(int numStars) {
        this.numStars = numStars;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public LinkedList<CampingArea> getCampingAreas() {
        return campingAreas;
    }

    public String getFacilitiesByIndex(int i) {
        return facilities.get(i);
    }

    public CampingArea getAreaByIndex(int i){
        return campingAreas.get(i);
    }

    public void addCampingArea(CampingArea area){
        campingAreas.add(area);
    }

    public void addFacilities(String facility){
        facilities.add(facility);
    }

    public String listFacilities(){
       return facilities.listElements();
    }

    public String listCampingAreas(){
        return campingAreas.listObjectElements();
    }
}
