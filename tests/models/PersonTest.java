package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setup(){
        person = new Person("Akshit", "Deswal", "539 Grove Street East, Barrie, ON", LocalDate.of(2001,8,13));
    }

    @Test
    void setFirstName() {
        person.setFirstName("Akshit");
        assertEquals("Akshit",person.getFirstName());
    }

    @Test
    void setFirstNameInvalidEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName(""));
    }

    @Test
    void setFirstNameInvalidInput() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setFirstName("AkM47"));
    }

    @Test
    void setLastName() {
        person.setLastName("Deswal");
        assertEquals("Deswal",person.getLastName());
    }


    @Test
    void setLastNameInvalidEmpty() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setLastName(""));
    }

    @Test
    void setLastNameInvalidNumbers() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setLastName("54Yeah"));
    }


    @Test
    void setAddress() {
        person.setAddress("539 Grove Street, Barrie, ON");
        assertEquals("539 Grove Street, Barrie, ON", person.getAddress());
    }
    @Test
    void setInvalidAddressEmpty() {
        assertThrows(IllegalArgumentException.class, () ->
                person.setAddress("    "));
    }

    @Test
    void setBirthday() {
        person.setBirthday(LocalDate.of(2001,9,13));
        assertEquals(LocalDate.of(2001,9,13), person.getBirthday());
    }

    @Test
    void setInvalidBirthdayFuture() {
        assertThrows(IllegalArgumentException.class, ()->
                person.setBirthday(LocalDate.of(2025,01,01)));
    }


    @Test
    void getAge() {
        assertEquals(19,person.getBirthday());
    }
}