package com.company.recordcollection.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="track")
public class Track implements Serializable {

    @Id
    @Column(name = "track_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int album_id;
    private String title;
    private int runtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(getId(), track.getId()) &&
                Objects.equals(getAlbum_id(), track.getAlbum_id()) &&
                Objects.equals(getTitle(), track.getTitle()) &&
                Objects.equals(getRuntime(), track.getRuntime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAlbum_id(), getTitle(), getRuntime());
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", album_id=" + album_id +
                ", title='" + title + '\'' +
                ", runtime=" + runtime +
                '}';
    }
}
