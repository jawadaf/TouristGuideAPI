package com.example.touristguideapi.service;

import com.example.touristguideapi.repository.TouristRepository;
import org.springframework.stereotype.Service;

@Service
public class TouristService {
    private TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = new TouristRepository();
    }
}
