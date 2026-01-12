package dev.edgarciaguilar.rookiehomeapi.shared.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListPage<T> {
	
	private List<T> items;
	private Long totalItems;
	private Long totalPages;
	private Integer perPage;
	private Integer page;

}
