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

    public TouristAttraction create(TouristAttraction touristAttraction) {
        touristRepository.create(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction update(TouristAttraction touristAttraction) {
        touristRepository.update(touristAttraction);
        return touristAttraction;
    }

    public TouristAttraction delete(String name) {
        TouristAttraction touristAttraction = touristRepository.getByName(name);
        if (touristAttraction != null) {
            touristRepository.delete(touristAttraction);
        }
        return touristAttraction;
    }
}
