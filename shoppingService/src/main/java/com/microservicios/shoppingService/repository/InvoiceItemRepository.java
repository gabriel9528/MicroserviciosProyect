package com.microservicios.shoppingService.repository;

import com.microservicios.shoppingService.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
}
