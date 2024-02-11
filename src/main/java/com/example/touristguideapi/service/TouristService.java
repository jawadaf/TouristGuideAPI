package com.example.touristguideapi.service;

import com.example.touristguideapi.model.TouristAttraction;
import com.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {
    private TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public List<TouristAttraction> getAll() {
        return touristRepository.getAll();
    }

    public TouristAttraction getByName(String name) {
        return touristRepository.getByName(name);
    }

    public void create(TouristAttraction touristAttraction) {
        touristRepository.create(touristAttraction);
    }

    public void update(TouristAttraction touristAttraction) {
        touristRepository.update(touristAttraction);
    }

    public void delete(String name) {
        TouristAttraction attraction = touristRepository.getByName(name);
        if (attraction != null) {
            touristRepository.delete(attraction);
        }
    }
}
