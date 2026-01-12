package dev.edgarciaguilar.rookiehomeapi.realestateproperty.model.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealEstateProperty {
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
	private Type type;
	private Status status;
	private Integer toilet;
	private Integer bedroom;
	private Integer parking;
	private Long landSquareMeters;
	private Long buildSquareMeters;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdate;
	private Boolean showOnMainBanner;

	public enum Type {
		APARTMENT, HOUSE, LAND, COMMERCIAL;
	}

	public enum Status {
		RENT, SALE, INVESTMENT
	}

}
