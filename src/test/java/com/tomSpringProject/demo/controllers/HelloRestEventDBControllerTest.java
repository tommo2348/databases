package com.tomSpringProject.demo.controllers;

import com.tomSpringProject.demo.entities.Item;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloRestEventDBControllerTest {
//
//
//    @LocalServerPort
//    private int port;
//
//    private URL base;
//
//    @Autowired
//    private TestRestTemplate template;
//
//    private
//
//    @Before
//    public void setUp() throws MalformedURLException {
//        this.base = new URL("http://localhost:" + port + "/rest");
//    }
//
//    @Test
//    public void getWithoutName(){
//        ResponseEntity<Item> entity = template.getForEntity("/rest",Item.class);
//        assertEquals(HttpStatus.OK,entity.getStatusCode());
//        assertEquals(MediaType.APPLICATION_JSON_UTF8, entity.getHeaders().getContentType());
//        Item reponse = entity.getBody();
//        assertEquals("Hello, World!", reponse.getGreeting());
//    }
//    @Test
//    public void getWithName(){
//        Item response = template.getForObject("/rest?name=Santino",Item.class);
//        assertEquals("Hello, Santino!",response.getGreeting());
//    }

}
