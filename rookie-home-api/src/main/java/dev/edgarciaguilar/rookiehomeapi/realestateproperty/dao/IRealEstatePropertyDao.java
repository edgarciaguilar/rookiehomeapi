package dev.edgarciaguilar.rookiehomeapi.realestateproperty.dao;

import java.util.List;

import dev.edgarciaguilar.rookiehomeapi.realestateproperty.model.dto.RealEstateProperty;
import dev.edgarciaguilar.rookiehomeapi.shared.model.ListPage;

public interface IRealEstatePropertyDao {
	
	void create(RealEstateProperty realEstateProperty);
	void update(RealEstateProperty realEstateProperty);
	void delete(String id);
	RealEstateProperty getById(String id);
	List<RealEstateProperty> listAll();
	List<RealEstateProperty> listPropertiesToMainBanner();
	ListPage<RealEstateProperty> serch(String searchText, Integer page, Integer perPage);
}