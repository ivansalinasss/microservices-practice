package com.ivansalinasss.app.item.models.service;

import java.util.List;

import com.ivansalinasss.app.item.models.entity.Item;

public interface IItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
