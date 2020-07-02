package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Info;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InfoDaoTest {

    public static final int items = 2;

    public static final String version1 = "3a6";
    public static final String algoritm1 = "zdd";

    public static final String version2 = "3dfa6";
    public static final String algoritm2 = "zdfffd";

 

    @Autowired
    InfoDao infoDao;

    @BeforeEach
    void setUp() {
        System.out.println(" ------- start ------- ");
        Info info1 = new Info(new Date(), version1, algoritm1);
        Info info2 = new Info(new Date(), version2, algoritm2);

        assertNull(info1.getId());
        assertNull(info2.getId());

        infoDao.save(info1);
        infoDao.save(info2);

        assertNotNull(info1.getId());
        assertNotNull(info2.getId());

    }

    @Test
    void single() {
        Info infos11 = infoDao.findByVersion(version1);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + infos11.getId());
        System.out.println(" ----- data obiektu: " + infos11.getDate());
        System.out.println(" ---- ver obiektu: " + infos11.getVersion());
        System.out.println(" ---- alg obiektu: " + infos11.getAlgorithm());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(version1);
        assertEquals(version1, infos11.getVersion());

        Info infos22 = infoDao.findByVersion(version2);
        System.out.println("");
        System.out.println("----------------");
        System.out.println(" ---- id obiektu: " + infos22.getId());
        System.out.println(" ----- data obiektu: " + infos22.getDate());
        System.out.println(" ---- ver obiektu: " + infos22.getVersion());
        System.out.println(" ---- alg obiektu: " + infos22.getAlgorithm());
        System.out.println("----------------");
        System.out.println("");

        assertNotNull(version1);
        assertEquals(infos11, infos11.getVersion());

    }

    @Test
    void all() {
        Collection info = (Collection) infoDao.findAll();
        assertEquals(items, info.size());
        System.out.println(" ------ ilość obiektów: " + info.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        infoDao.deleteAll();
    }

}
