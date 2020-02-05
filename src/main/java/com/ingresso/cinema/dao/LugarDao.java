package com.ingresso.cinema.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ingresso.cinema.model.Lugar;

@Repository
public class LugarDao {

    @PersistenceContext
    private EntityManager manager;

    public void save(Lugar lugar) {
        manager.persist(lugar);
    }
}
