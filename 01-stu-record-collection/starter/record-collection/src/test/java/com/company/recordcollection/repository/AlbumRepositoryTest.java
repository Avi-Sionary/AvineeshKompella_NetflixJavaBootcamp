package com.company.recordcollection.repository;

import com.company.recordcollection.model.Album;
import com.company.recordcollection.model.Artist;
import com.company.recordcollection.model.Label;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {

    @Autowired
    TrackRepository trackRepository;
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    LabelRepository labelRepository;
    @Autowired
    ArtistRepository artistRepository;

    @Before
    public void setUp() throws Exception {
        trackRepository.deleteAll();
        albumRepository.deleteAll();
        artistRepository.deleteAll();
        labelRepository.deleteAll();
    }

    @Test
    public void addGetDeleteAlbum() {
        Label label = new Label();
        // no need to set id b/c database does it for us
        label.setName("A&M");
        label.setWebsite("www.fake.com");
        label = labelRepository.save(label);

        Artist artist = new Artist();
        artist.setName("Rock Start");
        artist.setInstagram("@RockStart");
        artist.setTwitter("@TheRockStar");
        artist = artistRepository.save(artist);

        Album album = new Album();
        album.setTitle("Greatest Hits");
        album.setArtist_id(artist.getId());
        album.setLabel_id(label.getId());
        album.setRelease_date(LocalDate.of(2010, 1, 5));
        album.setList_price(new BigDecimal("21.95"));
        album = albumRepository.save(album);

        Optional<Album> album1 = albumRepository.findById(album.getId());

        assertEquals(album1.get(), album);

        albumRepository.deleteById(album.getId());

        album1 = albumRepository.findById(album.getId());

        assertFalse(album1.isPresent());

    }
}