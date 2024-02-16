package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {
    private List<TouristAttraction> data = new ArrayList<>(); // ændret den fra arraylist til list


    public TouristRepository() {
        //List<TouristAttraction> data = new ArrayList<>();
        data.add(new TouristAttraction("Java", "Programming"));
        data.add(new TouristAttraction("Restaurant", "Food"));
        data.add(new TouristAttraction("Jacket", "Warm"));
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

    public TouristAttraction create(TouristAttraction touristAttraction) {
        data.add(touristAttraction);
        return touristAttraction;
    }


    public TouristAttraction update(TouristAttraction touristAttraction) {
       for (TouristAttraction attraction : data) {
           if (attraction.getName().equals(touristAttraction.getName())) {
               attraction.setDescription(touristAttraction.getDescription());
           }
       }
       return touristAttraction;
    }

    public TouristAttraction delete(TouristAttraction touristAttraction) {
        data.removeIf(attraction -> attraction.getName().equals(touristAttraction.getName()));
        return touristAttraction;
    }
}
