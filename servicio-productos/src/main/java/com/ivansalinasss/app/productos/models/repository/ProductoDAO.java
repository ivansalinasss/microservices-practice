package com.ivansalinasss.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.ivansalinasss.app.productos.models.entity.Producto;

public interface ProductoDAO extends CrudRepository<Producto, Long>{

}
