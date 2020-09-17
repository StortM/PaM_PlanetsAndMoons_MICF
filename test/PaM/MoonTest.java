package PaM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    Planet earth;
    Moon moon;
    Planet testPlanet;

    @BeforeEach
    void init() {
        ArrayList<Moon> list = new ArrayList<>();
        earth = new Planet(1,1,"Earth",list);
        moon = new Moon(4.6,2.8,"Ceres",earth);
        testPlanet = new Planet(5,10,"test",list);
        earth.addMoon(moon);
    }

    @AfterEach
    void after(){
        ArrayList<Moon> list = new ArrayList<>();
        earth = new Planet(1,1,"Earth",list);
        moon = new Moon(4.6,2.8,"Ceres",earth);
        testPlanet = new Planet(5,10,"test",list);
        earth.addMoon(moon);
    }

    @Test
    void getYearLength() {
        assertEquals(4.6,moon.getYearLength());
    }

    @Test
    void setYearLength() {
        assertEquals(4.6,moon.getYearLength());
        moon.setYearLength(5);
        assertEquals(5,moon.getYearLength());
    }

    @Test
    void getDistanceFromSun() {
    }

    @org.junit.jupiter.api.Test
    void setDistanceFromSun() {
        assertEquals(2.8,moon.getDistanceFromSun());
        moon.setDistanceFromSun(500);
        assertEquals(500,moon.getDistanceFromSun());
    }
    @Test
    void getName() {
        assertEquals("Ceres",moon.getName());
    }

    @Test
    void setName() {
        moon.setName("testet");
        assertEquals("testet",moon.getName());
    }

    @Test
    void getAssociatedPlanet() {
        assertEquals(earth,moon.getAssociatedPlanet());
    }

    @Test
    void setAssociatedPlanet() {
        moon.setAssociatedPlanet(testPlanet);
        assertEquals(testPlanet,moon.getAssociatedPlanet());
    }
}