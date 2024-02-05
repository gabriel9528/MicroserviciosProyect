package com.microservicios.shoppingService.entity;

import com.microservicios.shoppingService.model.Product;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Data
@Table(name = "tbl_invoce_items")
public class InvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Positive(message = "El stock debe ser mayor que cero")
    private Double quantity;

    private Double  price;

    @Column(name = "product_id")
    private Long productId;

    //Indica que se va a poder trabajar con este parametro, pero no se va a insertar en la base de datos
    @Transient
    private Double subTotal;

    @Transient
    private Product product;

    public Double getSubTotal(){
        if (this.price >0  && this.quantity >0 ){
            return this.quantity * this.price;
        }else {
            return (double) 0;
        }
    }
    public InvoiceItem(){
        this.quantity=(double) 0;
        this.price=(double) 0;
    }
}
