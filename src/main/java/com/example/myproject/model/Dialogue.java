package com.example.myproject.model;

public class Dialogue {
    private String building_name;
    private String json_file;

    public String getBuildingName() {
        return building_name;
    }

    public String getJsonFile() {
        return json_file;
    }

    public void setBuildingName(String buildingName) {
        this.building_name = buildingName;
    }

    public void setJsonFile(String jsonFile) {
        this.json_file = jsonFile;
    }
}