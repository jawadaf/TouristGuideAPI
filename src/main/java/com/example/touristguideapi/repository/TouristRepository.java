package com.example.touristguideapi.repository;

import com.example.touristguideapi.model.TouristAttraction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Repository
public class TouristRepository {

    public ResponseEntity<ArrayList<TouristAttraction>> data() {
        ArrayList<TouristAttraction> data = new ArrayList<>();
        data.add(new TouristAttraction("Java", "Programming"));
        data.add(new TouristAttraction("Restaurant", "Food"));
        data.add(new TouristAttraction("Jacket", "Warm"));
        return new ResponseEntity<>(data, HttpStatus.OK);

    }



}
