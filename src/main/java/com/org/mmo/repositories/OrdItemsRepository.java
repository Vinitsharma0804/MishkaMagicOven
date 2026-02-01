package com.org.mmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.mmo.entities.OrdItemsEntity;
import com.org.mmo.entities.OrdItemsId;

@Repository
public interface OrdItemsRepository extends JpaRepository<OrdItemsEntity, OrdItemsId> {

}
