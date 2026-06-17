package com.mrp_engine.repository;

import com.mrp_engine.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
        List<PurchaseOrder> findBySupplierName(String supplierName);
}
