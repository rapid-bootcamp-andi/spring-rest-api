package com.rapidtech.restapi.repository;

import com.rapidtech.restapi.entity.PurchaseOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOderRepo extends JpaRepository<PurchaseOrderEntity, Long> {
}
