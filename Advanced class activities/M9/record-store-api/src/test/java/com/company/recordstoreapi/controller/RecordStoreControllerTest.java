package com.company.recordstoreapi.controller;

import com.company.recordstoreapi.models.Record;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.util.List;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(RecordStoreController.class)
public class RecordStoreControllerTest { // Wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    // A list of records for testing purposes
    private List<Record> recordList;

    @Before
    public void setUp() {
        // Standard set up method for instantiating test objects
        // Don't have to do anything special for mockMvc since it's autowired
    }

    // Testing GET /records
    @Test
    public void shouldReturnAllRecordsInCollection() throws Exception {

        // ARRANGE
        // Convert Java object to JSON
        String outputJson = mapper.writeValueAsString(recordList);

        // ACT
        mockMvc.perform(get("/records"))                // Perform the GET request
                .andDo(print())                          // Print results to console
                .andExpect(status().isOk());              // ASSERT (status code is 200)
    }

    // Testing POST /records
    @Test
    public void shouldReturnNewRecordOnPostRequest() throws Exception {

        // ARRANGE
        Record inputRecord = new Record();
        inputRecord.setArtist("Bruce Springsteen");
        inputRecord.setAlbum("The River");
        inputRecord.setYear("1990");

        // Convert Java Object to JSON
        String inputJson = mapper.writeValueAsString(inputRecord);

        Record outputRecord = new Record();
        outputRecord.setArtist("Bruce Springsteen");
        outputRecord.setAlbum("The River");
        outputRecord.setYear("1990");
        outputRecord.setId(6);

        String outputJson = mapper.writeValueAsString(outputRecord);

        // ACT
        mockMvc.perform(
                        post("/records")                            // Perform the POST request
                                .content(inputJson)                       // Set the request body
                                .contentType(MediaType.APPLICATION_JSON)  // Tell the server it's in JSON format
                )
                .andDo(print())                                // Print results to console
                .andExpect(status().isCreated());              // ASSERT (status code is 201)
    }

    // Testing GET record/{id}
    @Test
    public void shouldReturnRecordById() throws Exception {
        Record outputRecord = new Record();
        outputRecord.setArtist("JOE STARS");
        outputRecord.setAlbum("END OF THE WORLD");
        outputRecord.setYear("2015");
        outputRecord.setId(2);

        String outputJson = mapper.writeValueAsString(outputRecord);

        // ACT
        mockMvc.perform(get("/records/2"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }

    // Testing PUT /records/{id}
    @Test
    public void shouldUpdateByIdAndReturn204StatusCode() throws Exception {
        // Method returns nothing, so we're checking for correct status code, code 204, which indicates no content

        Record inputRecord = new Record();
        inputRecord.setArtist("JOE STARS");
        inputRecord.setAlbum("END OF THE WORLD");
        inputRecord.setYear("2015");
        inputRecord.setId(2);

        String inputJson = mapper.writeValueAsString(inputRecord);

        // ACT
        mockMvc.perform(
                put("/records/2")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isNoContent());
    }

    // Testing DELETE /records/{id}
    @Test
    public void shouldDeleteByIdAndReturn204StatusCode() throws Exception {
        // Method returns nothing, so we're checking for correct status code, code 204, which indicates no content

        mockMvc.perform(delete("/records/5"))
                .andDo(print())
                .andExpect(status().isNoContent());
    }
}