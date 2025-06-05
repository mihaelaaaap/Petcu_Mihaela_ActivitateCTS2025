package teste;

import clase.Persoana;
import exceptii.ExceptieCNPInvalid;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSexTest {

    @Test
    public void getSexRIGHTMasculin() {
        Persoana persoana = new Persoana("Ion", "5040301211210");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexRIGHTFeminin() {
        Persoana persoana = new Persoana("Elena", "6040301211210");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexBoundaryInferior() {
        Persoana persoana = new Persoana("Mihai", "1740301211210");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexBoundarySuperior() {
        Persoana persoana = new Persoana("Irina", "8040301211210");
        assertEquals("F", persoana.getSex());
    }

    private String primulCaracterCNP(String cnp) {
        return cnp.charAt(0) % 2 == 0 ? "F" : "M";
    }

    @Test
    public void getSexCrossCheck() {
        String cnp = "6030406123456";
        Persoana persoana = new Persoana("Andreea", cnp);
        assertEquals(primulCaracterCNP(cnp), persoana.getSex());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getSexCNPInvalid() {
        Persoana persoana = new Persoana("Andreea", "0990102234567");
        persoana.getSex();
    }

}