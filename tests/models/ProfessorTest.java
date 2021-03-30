package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    Professor professor;

    @BeforeEach
    void setUp() {
        professor = new Professor("Akshit", "Deswal", "2 Unkown Lane", LocalDate.of(1976,3,2), 10005);
    }

    @Test
    void addTeachable() {
        professor.addTeachable("COMP 1007");
        ArrayList<String> expectResult = new ArrayList<>();
        expectResult.add("COMP 1007");
        assertEquals(expectResult, professor.getTeachables());
    }

    @Test
    void addTeachableInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                professor.addTeachable("cool course"));
    }

    @Test
    void addTeachableInvalid2() {
        assertThrows(IllegalArgumentException.class, ()->
                professor.addTeachable("COMP 123D"));
    }

}