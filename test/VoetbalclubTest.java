package test;

import org.junit.jupiter.api.Test;
import practicum2b.Voetbalclub;

import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {
    @Test
    void checkLegeStringClubnaam() {
        Voetbalclub club = new Voetbalclub("");
        assertEquals("FC", club.getClubnaam());
    }

    @Test
    void checkNullClubnaam() {
        Voetbalclub club = new Voetbalclub(null);
        assertEquals("FC", club.getClubnaam());
    }

    @Test
    void verwerkResultaat() {
        Voetbalclub voetbalclub = new Voetbalclub("test");
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('w');

        assertEquals(2, voetbalclub.aantalGespeeld());
    }
    @Test
    void verwerkPunten() {
        Voetbalclub voetbalclub = new Voetbalclub("test");
        voetbalclub.verwerkResultaat('v');
        voetbalclub.verwerkResultaat('w');
        voetbalclub.verwerkResultaat('g');

        assertEquals(4, voetbalclub.aantalPunten());
    }
    @Test
    public void testToString() {
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        String expected = "Feijenoord    5 3 1 1 10";
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');
        feij.verwerkResultaat('v');

        assertEquals(expected, feij.toString());
    }

    @Test
    public void correcteOptellingPunten() {
        Voetbalclub test = new Voetbalclub("test");
        test.verwerkResultaat('w');
        test.verwerkResultaat('v');
        test.verwerkResultaat('g');
        assertEquals(4,test.aantalPunten());
    }
    @Test
    public void correcteOptellingAantalWedstrijden() {
        Voetbalclub test = new Voetbalclub("test");
        test.verwerkResultaat('w');
        test.verwerkResultaat('v');
        test.verwerkResultaat('g');
        assertEquals(3,test.aantalGespeeld());
    }
}
//    Eis: als de clubnaam null of leeg ("") is, moet de naam "FC" gebruikt worden.
//    Eis: het verwerken van de resultaten ???w???, ???g??? en ???v??? levert respectievelijk 3, 1 en 0 punten op. Foutieve invoer mag het puntensaldo en totaalaantal gespeelde wedstrijden niet be??nvloeden!
//    Eis: het verwerken van de resultaten ???w???, ???g??? en ???v??? levert respectievelijk 3, 1 en 0 punten op, en is zichtbaar in de stringrepresentatie van de toString-methode.
//    Eis: herhaaldelijk verwerken van deze resultaten moet zorgen voor een correcte optelling van wedstrijdaantallen en punten.
