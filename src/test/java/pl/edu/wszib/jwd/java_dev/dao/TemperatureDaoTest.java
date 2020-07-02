package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Temperature;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TemperatureDaoTest {

    public static final int items = 2;

    public static final double temperatures1 = 36;
    public static final boolean type1 = false;
    public static final String description1 = "zdrowy";

    public static final double temperatures2 = 39;
    public static final boolean type2 = true;
    public static final String description2 = "chory";

    @Autowired
    TemperatureDao temperatureDao;

    @BeforeEach
    void setUp() {
        System.out.println(" ------- start ------- ");
        Temperature temperature1 = new Temperature(new Date(), temperatures1, type1, description1);
        Temperature temperature2 = new Temperature(new Date(), temperatures2, type2, description2);

        assertNull(temperature1.getId());
        assertNull(temperature2.getId());

        temperatureDao.save(temperature1);
        temperatureDao.save(temperature2);

        assertNotNull(temperature1.getId());
        assertNotNull(temperature2.getId());

    }

    @Test
    void single() {
        Temperature temperatures11 = temperatureDao.findByTemperatures(temperatures1);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + temperatures11.getId());
        System.out.println(" ----- data obiektu: " + temperatures11.getDate());
        System.out.println(" ---- temp obiektu: " + temperatures11.getTemperatures());
        System.out.println(" ---- rodzaj obiektu: " + temperatures11.isType());
        System.out.println(" ---- uwagi obiektu: " + temperatures11.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(temperatures1);
        assertEquals(temperatures1, temperatures11.getTemperatures());

        Temperature temperatures22 = temperatureDao.findByTemperatures(temperatures2);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + temperatures22.getId());
        System.out.println(" ----- data obiektu: " + temperatures22.getDate());
        System.out.println(" ---- temp obiektu: " + temperatures22.getTemperatures());
        System.out.println(" ---- rodzaj obiektu: " + temperatures22.isType());
        System.out.println(" ---- uwagi obiektu: " + temperatures22.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(temperatures1);
        assertEquals(temperatures11, temperatures11.getTemperatures());

    }

    @Test
    void all() {
        Collection temperature = (Collection) temperatureDao.findAll();
        assertEquals(items, temperature.size());
        System.out.println(" ------ ilość obiektów: " + temperature.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        temperatureDao.deleteAll();
    }

}
