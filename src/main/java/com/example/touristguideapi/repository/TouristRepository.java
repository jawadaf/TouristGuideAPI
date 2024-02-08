package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    public ResponseEntity<List<TouristAttraction>> data() {
        List<TouristAttraction> data = new ArrayList<>();
        data.add(new TouristAttraction("Java", "Programming"));
        data.add(new TouristAttraction("Restaurant", "Food"));
        data.add(new TouristAttraction("Jacket", "Warm"));
        return new ResponseEntity<>(data, HttpStatus.OK);
    }





}
