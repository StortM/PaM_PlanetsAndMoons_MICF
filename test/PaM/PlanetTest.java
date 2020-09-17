package PaM;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

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

    @org.junit.jupiter.api.Test
    void findDistance() {
        //arrange
        double actual = earth.findDistance(testPlanet);

        assertEquals(9,actual);
    }

    @org.junit.jupiter.api.Test
    void getYearLength() {

        assertEquals(1,earth.getYearLength());
    }

    @org.junit.jupiter.api.Test
    void setYearLength() {
        earth.setYearLength(5);
        assertEquals(5,earth.getYearLength());
    }

    @org.junit.jupiter.api.Test
    void getDistanceFromSun() {
        assertEquals(1,earth.getDistanceFromSun());
    }

    @org.junit.jupiter.api.Test
    void setDistanceFromSun() {
        earth.setDistanceFromSun(500);
        assertEquals(500,earth.getDistanceFromSun());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Earth",earth.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        earth.setName("testet");
        assertEquals("testet",earth.getName());
    }

    @org.junit.jupiter.api.Test
    void setMoons() {
        List<Moon> list = new ArrayList<>();
        list.add(moon);
        earth.addMoon(moon);
        assertEquals(list.get(0),earth.getMoons().get(0));
    }

    @org.junit.jupiter.api.Test
    void getAmountMoons(){
        assertEquals(1,earth.getAmountMoons());
    }
}