package com.antonio.loginDAO.dao;

import java.util.List;

import com.antonio.loginDAO.model.City;


//DAO (Data Access Object) Patron de diseño
public interface CityDAO {
	public List<City> findAllByStateId(int stateId);
}
