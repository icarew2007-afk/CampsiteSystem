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
}
