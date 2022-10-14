package com.company.recordcollection.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="album")
public class Album implements Serializable {

    @Id
    @Column(name = "album_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "albumId")
    private Set<Track> tracks = new HashSet<>();

    private String title;
    private int artist_id;
    private LocalDate release_date;
    private int label_id;
    private BigDecimal list_price;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public LocalDate getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDate release_date) {
        this.release_date = release_date;
    }

    public Integer getLabel_id() {
        return label_id;
    }

    public void setLabel_id(Integer label_id) {
        this.label_id = label_id;
    }

    public BigDecimal getList_price() {
        return list_price;
    }

    public void setList_price(BigDecimal list_price) {
        this.list_price = list_price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(getId(), album.getId()) &&
                Objects.equals(getTitle(), album.getTitle()) &&
                Objects.equals(getArtist_id(), album.getArtist_id()) &&
                Objects.equals(getRelease_date(), album.getRelease_date()) &&
                Objects.equals(getLabel_id(), album.getLabel_id()) &&
                Objects.equals(getList_price(), album.getList_price());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getArtist_id(), getRelease_date(), getLabel_id(), getList_price());
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", tracks=" + tracks +
                ", title='" + title + '\'' +
                ", artist_id=" + artist_id +
                ", release_date=" + release_date +
                ", label_id=" + label_id +
                ", list_price=" + list_price +
                '}';
    }
}
