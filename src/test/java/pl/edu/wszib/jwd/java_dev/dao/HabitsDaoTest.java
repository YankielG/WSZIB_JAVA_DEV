package pl.edu.wszib.jwd.java_dev.dao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.edu.wszib.jwd.java_dev.model.Habits;

import java.util.Collection;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HabitsDaoTest {

    public static final int items = 2;

    public static final String name1 = "dddd";
    public static final boolean implementation1 = false;
    public static final String repeat1 = "zdrowy";
    public static final String description1 = "zdrowy";

    public static final String name2 = "dddd";
    public static final boolean implementation2 = false;
    public static final String repeat2 = "zdrowy";
    public static final String description2 = "zdrowy";

;

    @Autowired
    HabitsDao habitsDao;

    @BeforeEach
    void setUp() {
        System.out.println(" ------- start ------- ");

    }

    @Test
    void single() {

    }

    @Test
    void all() {
        Collection habits = (Collection) habitsDao.findAll();
        assertEquals(items, habits.size());
        System.out.println(" ------ ilość obiektów: " + habits.size());
        System.out.println("");
    }

    @AfterEach
    void tearDown() {
        System.out.println(" ------ Stop ------ ");
        habitsDao.deleteAll();
    }

}
