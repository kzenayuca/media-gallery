package com.media_gallery.controller;

import com.media_gallery.model.Flower;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FlowerController {
    
    @GetMapping("/")
    public String showFlowers(Model model) {
        List<Flower> flowers = Arrays.asList(
            new Flower("Rosa", "/images/rose.jpg", "La rosa es una flor hermosa y elegante"),
            new Flower("Girasol", "/images/sunflower.jpg", "El girasol sigue la luz del sol"),
            new Flower("Tulipán", "/images/tulip.jpg", "Los tulipanes son flores primaverales"),
            new Flower("Margarita", "/images/daisy.jpg", "La margarita simboliza la inocencia"),
            new Flower("Orquídea", "/images/orchid.jpg", "Las orquídeas son exóticas y sofisticadas"),
            new Flower("Lirio", "/images/lily.jpg", "El lirio es una flor de gran elegancia")
        );
        
        model.addAttribute("flowers", flowers);
        return "index";
    }
}