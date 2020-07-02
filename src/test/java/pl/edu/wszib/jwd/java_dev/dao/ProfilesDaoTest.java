package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Profiles;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProfilesDaoTest {

    public static final int items = 2;

    public static final String users1 = "adam1";
    public static final String name1 = "adam11";
    public static final String suname1 = "adam111";
    public static final String email1 = "adam1@adam.pl";
    public static final String password1 = "test1";

    public static final String description1 = "admin1";


    public static final String users2 = "adam2";
    public static final String name2 = "adam22";
    public static final String suname2 = "adam222";
    public static final String email2 = "adam2@adam.pl";
    public static final String password2 = "test2";
    public static final String gender2 = "facet2";
    public static final boolean enable2 = false;
    public static final String description2 = "admin2";
    @Autowired
    ProfilesDao profilesDao;

    @BeforeEach
    void setUp() {

    }

    @Test
    void single() {

    }

    @Test
    void all() {
        Collection Profiles = (Collection) profilesDao.findAll();
        assertEquals(items, Profiles.size());
        System.out.println(" ------ ilość obiektów: " + Profiles.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        profilesDao.deleteAll();
    }

}
