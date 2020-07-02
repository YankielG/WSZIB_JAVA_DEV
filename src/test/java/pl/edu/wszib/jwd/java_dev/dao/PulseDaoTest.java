package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Pulse;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PulseDaoTest {

    public static final int items = 2;

    public static final double pulses1 = 77;
    public static final boolean type1 = false;
    public static final String description1 = "zdrowy";

    public static final double pulses2 = 88;
    public static final boolean type2 = true;
    public static final String description2 = "chory";

    @Autowired
    PulseDao pulseDao;

    @BeforeEach
    void setUp() {
        System.out.println(" ------- start ------- ");
        Pulse Pulse1 = new Pulse(new Date(), pulses1, type1, description1);
        Pulse Pulse2 = new Pulse(new Date(), pulses2, type2, description2);

        assertNull(Pulse1.getId());
        assertNull(Pulse2.getId());

        pulseDao.save(Pulse1);
        pulseDao.save(Pulse2);

        assertNotNull(Pulse1.getId());
        assertNotNull(Pulse2.getId());

    }

    @Test
    void single() {
        Pulse pulses11 = pulseDao.findByPulses(pulses1);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + pulses11.getId());
        System.out.println(" ----- data obiektu: " + pulses11.getDate());
        System.out.println(" ---- puls obiektu: " + pulses11.getPulses());
        System.out.println(" ---- rodzaj obiektu: " + pulses11.isType());
        System.out.println(" ---- uwagi obiektu: " + pulses11.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(pulses1);
        assertEquals(pulses1, pulses11.getPulses());

        Pulse pulses22 = pulseDao.findByPulses(pulses2);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + pulses22.getId());
        System.out.println(" ----- data obiektu: " + pulses22.getDate());
        System.out.println(" ---- puls obiektu: " + pulses22.getPulses());
        System.out.println(" ---- rodzaj obiektu: " + pulses22.isType());
        System.out.println(" ---- uwagi obiektu: " + pulses22.getDescription());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(pulses1);
        assertEquals(pulses11, pulses11.getPulses());

    }

    @Test
    void all() {
        Collection Pulse = (Collection) pulseDao.findAll();
        assertEquals(items, Pulse.size());
        System.out.println(" ------ ilość obiektów: " + Pulse.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        pulseDao.deleteAll();
    }

}
