package org.example.entity;

import java.math.BigDecimal;
import java.util.Objects;

public class WorkSpace {
    private Long id;
    private TypeSpace typeSpace;
    private BigDecimal price;

    private boolean isAvailable;

    public WorkSpace(Long id, TypeSpace typeSpace, BigDecimal price, boolean isAvailable) {
        this.id = id;
        this.typeSpace = typeSpace;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeSpace getTypeSpace() {
        return typeSpace;
    }

    public void setTypeSpace(TypeSpace typeSpace) {
        this.typeSpace = typeSpace;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkSpace workSpace = (WorkSpace) o;
        return isAvailable == workSpace.isAvailable && Objects.equals(id, workSpace.id) && typeSpace == workSpace.typeSpace && Objects.equals(price, workSpace.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeSpace, price, isAvailable);
    }

    @Override
    public String toString() {
        return "WorkSpace{" +
                "id=" + id +
                ", typeSpace=" + typeSpace +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
