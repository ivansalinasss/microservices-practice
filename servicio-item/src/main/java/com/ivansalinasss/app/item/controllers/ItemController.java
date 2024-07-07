package com.ivansalinasss.app.item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ivansalinasss.app.item.models.entity.Item;
import com.ivansalinasss.app.item.models.service.IItemService;

@RestController
public class ItemController {

	@Autowired
	@Qualifier("serviceFeign")
	private IItemService itemService;

	@GetMapping("/listar")
	public List<Item> listar() {

		return itemService.findAll();
	}

	@GetMapping("/ver/{id}/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.findById(id, cantidad);
	}
}
