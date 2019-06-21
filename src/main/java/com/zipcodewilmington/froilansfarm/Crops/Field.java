package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

public class Field {

    private List<CropRow> cropRows;
    private Boolean hasBeenFertilized;


    public Field() {
        this.cropRows = new ArrayList<>();
        this.hasBeenFertilized = false;
    }






    public List<CropRow> getCropRows() {
        return this.cropRows;
    }

    public void setCropRows(List<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    public void addCropRow(CropRow<?> cropRow){
        cropRows.add(cropRow);
    }

}
