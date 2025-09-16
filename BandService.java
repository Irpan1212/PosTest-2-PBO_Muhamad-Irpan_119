/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bandmetal.service;
import com.mycompany.bandmetal.model.Band;
import java.util.ArrayList;
/**
 *
 * @author muham
 */

public class BandService {
    private ArrayList<Band> bands = new ArrayList<>();

    public void addBand(Band band) {
        bands.add(band);
    }

    public ArrayList<Band> getAllBands() {
        return bands;
    }
    
    public ArrayList<Band> searchBands(String keyword) {
        ArrayList<Band> hasilPencarian = new ArrayList<>();
        for (Band band : bands) {
            if (band.getNama().toLowerCase().contains(keyword.toLowerCase()) ||
                band.getGenre().toLowerCase().contains(keyword.toLowerCase())) {
                hasilPencarian.add(band);
            }
        }
        return hasilPencarian;
    }

    public boolean updateBand(int index, Band updatedBand) {
        if (index >= 0 && index < bands.size()) {
            bands.set(index, updatedBand);
            return true;
        }
        return false;
    }

    public boolean deleteBand(int index) {
        if (index >= 0 && index < bands.size()) {
            bands.remove(index);
            return true;
        }
        return false;
    }
    
    public Band getBand(int index) {
        if (index >= 0 && index < bands.size()) {
            return bands.get(index);
        }
        return null;
    }
}