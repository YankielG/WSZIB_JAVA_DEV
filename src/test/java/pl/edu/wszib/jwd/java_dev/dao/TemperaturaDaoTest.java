package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Temperatura;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TemperaturaDaoTest {

    public static final int elementy = 2;

    public static final double Temp1 = 36;
    public static final boolean Rodzaj1 = false;
    public static final String Uwaga1 = "zdrowy";

    public static final double Temp2 = 39;
    public static final boolean Rodzaj2 = true;
    public static final String Uwaga2 = "chory";

    @Autowired
    TemperaturaDao temperaturaDao;

    @BeforeEach
    void setUp() {
        System.out.println(" ------- start ------- ");
//        Temperatura temperatura1 = new Temperatura(new Date(), Temp1, new String(),new String());
        Temperatura temperatura1 = new Temperatura(new Date(), Temp1, Rodzaj1, Uwaga1);
//        Temperatura temperatura2 = new Temperatura(new Date(), Temp2, new String(),new String());
        Temperatura temperatura2 = new Temperatura(new Date(), Temp2, Rodzaj2, Uwaga2);

        assertNull(temperatura1.getId());
        assertNull(temperatura2.getId());

        temperaturaDao.save(temperatura1);
        temperaturaDao.save(temperatura2);

        assertNotNull(temperatura1.getId());
        assertNotNull(temperatura2.getId());

    }

    @Test
    void pojedynczy() {
        Temperatura temperatura1 = temperaturaDao.findByTemperatura(Temp1);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + temperatura1.getId());
        System.out.println(" ----- data obiektu: " + temperatura1.getData());
        System.out.println(" ---- temp obiektu: " + temperatura1.getTemperatura());
        System.out.println(" ---- rodzaj obiektu: " + temperatura1.isRodzaj());
        System.out.println(" ---- uwagi obiektu: " + temperatura1.getUwagi());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(temperatura1);
        assertEquals(Temp1, temperatura1.getTemperatura());

        Temperatura temperatura2 = temperaturaDao.findByTemperatura(Temp2);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + temperatura2.getId());
        System.out.println(" ----- data obiektu: " + temperatura2.getData());
        System.out.println(" ---- temp obiektu: " + temperatura2.getTemperatura());
        System.out.println(" ---- rodzaj obiektu: " + temperatura2.isRodzaj());
        System.out.println(" ---- uwagi obiektu: " + temperatura2.getUwagi());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(temperatura1);
        assertEquals(Temp1, temperatura1.getTemperatura());

    }

    @Test
    void calkowity() {
        Collection temperatura = (Collection) temperaturaDao.findAll();
        assertEquals(elementy, temperatura.size());
        System.out.println(" ------ ilość obiektów: " + temperatura.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        temperaturaDao.deleteAll();
    }

}
