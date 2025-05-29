package teste;

import clase.Persoana;
import static org.junit.Assert.*;

import exceptii.ExceptieCNPInexistent;
import exceptii.ExceptieCNPInvalid;
import org.junit.Before;
import org.junit.Test;


public class GetVarstaTest {
    Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @Test
    public void getVarstaRIGHT() {
        persoana = new Persoana("Irina", "6030406209019");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    public void getVarstaRIGHT2() {
        persoana = new Persoana("Georgeta", "2600406209019");
        assertEquals(65, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundarySuperior() {
        persoana = new Persoana("Ana", "2991231209019");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInferior() {
        persoana = new Persoana("Ovidiu", "5000101209019");
        assertEquals(25, persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareCaractere() {
        persoana = new Persoana("Adrian", "12h01901023");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareLuna() {
        persoana = new Persoana("Marius", "1991410101232");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("Paul", "1990203456789");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaCNPInexistent() {
        persoana = new Persoana("Maria", null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality0() {
        persoana = new Persoana("Ion", "5241201211210");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality1() {
        persoana = new Persoana("Ion", "5240301211210");
        assertEquals(1, persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinalityN() {
        persoana = new Persoana("Ion", "5040301211210");
        assertEquals(21, persoana.getVarsta());
    }


}