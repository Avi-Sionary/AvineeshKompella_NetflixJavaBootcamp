package com.company.coffeeinventory.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="roaster")
public class Roaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @NotNull
    private String Name;
    @NotNull
    private String Street;
    @NotNull
    private String City;
    @NotNull
    private String State;
    @NotNull
    private String Email;
    @NotNull
    private String Note;

    @OneToMany(mappedBy = "RoasterId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Coffee> coffees;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public Set<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(Set<Coffee> coffees) {
        this.coffees = coffees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roaster roaster = (Roaster) o;
        return Objects.equals(getId(), roaster.getId()) &&
                Objects.equals(getName(), roaster.getName()) &&
                Objects.equals(getStreet(), roaster.getStreet()) &&
                Objects.equals(getCity(), roaster.getCity()) &&
                Objects.equals(getState(), roaster.getState()) &&
                Objects.equals(getEmail(), roaster.getEmail()) &&
                Objects.equals(getNote(), roaster.getNote()) &&
                Objects.equals(getCoffees(), roaster.getCoffees());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getStreet(), getCity(), getState(), getEmail(), getNote(), getCoffees());
    }
}
