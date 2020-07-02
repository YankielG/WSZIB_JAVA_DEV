package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Weight;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeightDaoTest {

    public static final int items = 2;

    public static final double weights1 = 50;
    public static final boolean type1 = false;
    public static final String description1 = "zdrowy";

    public static final double weights2 = 70;
    public static final boolean type2 = true;
    public static final String description2 = "chory";

    @Autowired
    WeightDao weightDao;

    @BeforeEach
    void setUp() {
        System.out.println(" ------- start ------- ");
        Weight weight1 = new Weight(new Date(), weights1, type1, description1);
        Weight weight2 = new Weight(new Date(), weights2, type2, description2);

        assertNull(weight1.getId());
        assertNull(weight2.getId());

        weightDao.save(weight1);
        weightDao.save(weight2);

        assertNotNull(weight1.getId());
        assertNotNull(weight2.getId());

    }

    @Test
    void single() {
        Weight weights11 = weightDao.findByWeights(weights1);
        System.out.println("");
        System.out.println("----------------");
//        System.out.println(" ---- id obiektu: " + weights11.getId());
        System.out.println(" ----- data obiektu: " + weights11.getDate());
        System.out.println(" ---- temp obiektu: " + weights11.getWeights());
        System.out.println(" ---- rodzaj obiektu: " + weights11.isType());
        System.out.println(" ---- uwagi obiektu: " + weights11.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(weights1);
        assertEquals(weights1, weights11.getWeights());

        Weight weights22 = weightDao.findByWeights(weights2);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + weights22.getId());
        System.out.println(" ----- data obiektu: " + weights22.getDate());
        System.out.println(" ---- temp obiektu: " + weights22.getWeights());
        System.out.println(" ---- rodzaj obiektu: " + weights22.isType());
        System.out.println(" ---- uwagi obiektu: " + weights22.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(weights1);
        assertEquals(weights11, weights11.getWeights());

    }

    @Test
    void all() {
        Collection weight = (Collection) weightDao.findAll();
        assertEquals(items, weight.size());
        System.out.println(" ------ ilość obiektów: " + weight.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        weightDao.deleteAll();
    }

}
