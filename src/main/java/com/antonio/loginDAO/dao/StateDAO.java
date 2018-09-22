package com.antonio.loginDAO.dao;

import java.util.List;

import com.antonio.loginDAO.model.State;

public interface StateDAO {
	public List<State> getAllStates();

	public State findById(int id);

}
