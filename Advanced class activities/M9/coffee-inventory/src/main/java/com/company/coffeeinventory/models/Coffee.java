package com.company.coffeeinventory.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
//import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="coffee")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private Integer RoasterId;

    @NotNull
    private String Name;
//    @PositiveOrZero
    private int Count;
//    @PositiveOrZero
    private BigDecimal UnitPrice;
    private String Description;
    private String Type;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public int getRoasterId() {
        return RoasterId;
    }

    public void setRoasterId(int roasterId) {
        RoasterId = roasterId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    public BigDecimal getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        UnitPrice = unitPrice;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(Id, coffee.Id) &&
                Objects.equals(RoasterId, coffee.RoasterId)
                && Objects.equals(Name, coffee.Name)
                && Objects.equals(Count, coffee.Count)
                && Objects.equals(UnitPrice, coffee.UnitPrice)
                && Objects.equals(Description, coffee.Description)
                && Objects.equals(Type, coffee.Type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, RoasterId, Name, Count, UnitPrice, Description, Type);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "Id=" + Id +
                ", RoasterId=" + RoasterId +
                ", Name='" + Name + '\'' +
                ", Count=" + Count +
                ", UnitPrice=" + UnitPrice +
                ", Description='" + Description + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
