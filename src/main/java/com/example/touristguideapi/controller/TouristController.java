package com.example.touristguideapi.controller;

import com.example.touristguideapi.model.TouristAttraction;
import com.example.touristguideapi.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/attractions")
public class TouristController {
    private TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping("/getAllAttractions")
    public ResponseEntity<List<TouristAttraction>> getAll() {
        List<TouristAttraction> attractions = touristService.getAll();
        return new ResponseEntity<>(attractions, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getTouristAttractionsByName(@PathVariable String name) {
        TouristAttraction touristAttraction = touristService.getByName(name);
        if (touristAttraction != null) {
            return new ResponseEntity<>(touristAttraction, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody TouristAttraction touristAttraction) {
        touristService.create(touristAttraction);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<Void> update(@RequestBody TouristAttraction touristAttraction) {
        touristService.update(touristAttraction);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/delete/{name}")
    public ResponseEntity<Void> delete(@PathVariable String name) {
        touristService.delete(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
