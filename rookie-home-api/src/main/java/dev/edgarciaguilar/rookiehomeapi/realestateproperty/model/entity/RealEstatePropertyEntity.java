package dev.edgarciaguilar.rookiehomeapi.realestateproperty.model.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import dev.edgarciaguilar.rookiehomeapi.realestateproperty.model.dto.RealEstateProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("RealEstateProperty")
public class RealEstatePropertyEntity {
    private String id;
    private String slug;
    private Double price;
    private String address;
    private String state;
    private String neighborhood;
    private String city;
    private String mainImage;
    private List<String> images = new ArrayList<>();
    private String description;
    private RealEstateProperty.Type type;
    private RealEstateProperty.Status status;
    private Integer toilet;
    private Integer bedroom;
    private Integer parking;
    private Long landSquareMeters;
    private Long buildSquareMeters;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdate;
    private Boolean showOnMainBanner;
}
