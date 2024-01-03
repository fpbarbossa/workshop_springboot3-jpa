package com.fpbarbosa.course.entites;

import java.io.Serializable;

import com.fpbarbosa.course.entites.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")//criar tabela no banco de dados
public class OrdemItem implements Serializable{
    private static final long serialVersionUID = 1L;
    
    //Atributos basicos
    @EmbeddedId
    private OrderItemPK id;
    
    private Integer quantity;
    private Double price;

    //Constutores
    public OrdemItem(){
    }

    public OrdemItem(Order order, Product product, Integer quantity, Double price) {
        super();
        id.setOrder(order);//pedido do OrderItemPK
        id.setProduct(product);//produto do OrderItemPK
        this.quantity = quantity;
        this.price = price;
    }

    //Getters and Setters
    public Order getOrder(){
        return id.getOrder();
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //hashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrdemItem other = (OrdemItem) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
