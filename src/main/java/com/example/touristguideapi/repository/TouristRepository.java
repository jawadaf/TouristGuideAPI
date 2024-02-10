package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private ArrayList<TouristAttraction> data = new ArrayList<>();


    public ResponseEntity<List<TouristAttraction>> data() {
        List<TouristAttraction> data = new ArrayList<>();
        data.add(new TouristAttraction("Java", "Programming"));
        data.add(new TouristAttraction("Restaurant", "Food"));
        data.add(new TouristAttraction("Jacket", "Warm"));
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    public List<TouristAttraction> getAll() {
        return data;
    }

    public TouristAttraction getByName(String name) {
        for (TouristAttraction touristAttraction : data) {
            if (touristAttraction.getName().equals(name)) {
                return touristAttraction;
            }
        }
        return null;
    }

    public void create(TouristAttraction touristAttraction) {
        data.add(touristAttraction);
    }


    public void update(TouristAttraction touristAttraction) {
       for (TouristAttraction attraction : data) {
           if (attraction.getName().equals(touristAttraction.getName())) {
               attraction.setDescription(touristAttraction.getDescription());
           }
       }
    }

    public void delete(TouristAttraction touristAttraction) {
        data.removeIf(attraction -> attraction.getName().equals(touristAttraction.getName()));
    }






}
