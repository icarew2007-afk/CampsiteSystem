package org.example.campsitemanagementsystem;

public class CampingArea {
    private String identifier;
    private String description;
    private LinkedList<Plot> plots;

    public CampingArea(String identifier, String description){
        plots = new LinkedList<>();
        this.identifier = identifier;
        this.description = description;

    }
    //for each to add facilities upwarsds

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedList<Plot> getPlots() {
        return plots;
    }

    public void setPlots(LinkedList<Plot> plots) {
        this.plots = plots;
    }

    public void addPlots(Plot plot){
        plots.add(plot);
    }

    public Plot getPlotByIndex(int index){
        return plots.get(index);
    }

    public String listPlots(){
        return plots.listObjectElements();
    }

    public int countPlots(){
        return plots.getSize()-1;
    }



    public String toString() {
        return "Area identifier: "+identifier+" Description: "+description+", Plots: "+countPlots();
    }
}
