package com.shipwreck.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shipwreck.app.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
