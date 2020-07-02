package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Pressure;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PressureDaoTest {

    public static final int items = 2;

    public static final double shrink1 = 36;
    public static final double diastole1 = 46;
    public static final double pulses1 = 56;
    public static final boolean type1 = false;
    public static final String description1 = "zdrowy";

    public static final double shrink2 = 36;
    public static final double diastole2 = 46;
    public static final double pulses2 = 56;
    public static final boolean type2 = false;
    public static final String description2 = "zdrowy";


    @Autowired
    PressureDao pressureDao;

    @BeforeEach
    void setUp() {
        System.out.println(" ------- start ------- ");
        Pressure pressure1 = new Pressure(new Date(), shrink1, diastole1, pulses1, type1, description1);
        Pressure pressure2 = new Pressure(new Date(), shrink2, diastole2, pulses2, type2, description2);

        assertNull(pressure1.getId());
        assertNull(pressure2.getId());

        pressureDao.save(pressure1);
        pressureDao.save(pressure2);

        assertNotNull(pressure1.getId());
        assertNotNull(pressure2.getId());

    }

    @Test
    void single() {
        Pressure pressure11 = pressureDao.findByPressure(pulses1);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + pressure11.getId());
        System.out.println(" ----- data obiektu: " + pressure11.getDate());
        System.out.println(" ---- puls obiektu: " + pressure11.getPulses());
        System.out.println(" ---- rodzaj obiektu: " + pressure11.isType());
        System.out.println(" ---- uwagi obiektu: " + pressure11.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(pulses1);
        assertEquals(pulses1, pressure11.getPulses());

        Pressure pressures22 = pressureDao.findByPressure(pulses2);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + pressures22.getId());
        System.out.println(" ----- data obiektu: " + pressures22.getDate());
        System.out.println(" ---- puls obiektu: " + pressures22.getPulses());
        System.out.println(" ---- rodzaj obiektu: " + pressures22.isType());
        System.out.println(" ---- uwagi obiektu: " + pressures22.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(pulses1);
        assertEquals(pressure11, pressure11.getPulses());

    }

    @Test
    void all() {
        Collection pressure = (Collection) pressureDao.findAll();
        assertEquals(items, pressure.size());
        System.out.println(" ------ ilość obiektów: " + pressure.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        pressureDao.deleteAll();
    }

}
