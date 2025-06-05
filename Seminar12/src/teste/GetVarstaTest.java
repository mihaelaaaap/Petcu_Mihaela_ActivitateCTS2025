package teste;

import categorii.CategorieCORRECT;
import categorii.CategorieRightBICEP;
import clase.IPersoana;
import clase.Persoana;
import dubluri.PersoanaFake;
import exceptii.ExceptieCNPInexistent;
import exceptii.ExceptieCNPInvalid;
import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;


public class GetVarstaTest {
    Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @Test
    @Category(CategorieRightBICEP.class)
    public void getVarstaRIGHT() {
        persoana = new Persoana("Irina", "6030406209019");
        assertEquals(22, persoana.getVarsta());
    }

    @Test
    @Category(CategorieRightBICEP.class)
    public void getVarstaRIGHT2() {
        persoana = new Persoana("Georgeta", "2600406209019");
        assertEquals(65, persoana.getVarsta());
    }

    @Test
    @Category(CategorieRightBICEP.class)
    public void getVarstaBoundarySuperior() {
        persoana = new Persoana("Ana", "2991231209019");
        assertEquals(25, persoana.getVarsta());
    }

    @Test
    @Category(CategorieRightBICEP.class)
    public void getVarstaBoundaryInferior() {
        persoana = new Persoana("Ovidiu", "5000101209019");
        assertEquals(25, persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    @Category(CategorieRightBICEP.class)
    public void getVarstaEroareCaractere() {
        persoana = new Persoana("Adrian", "12h01901023");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    @Category(CategorieRightBICEP.class)
    public void getVarstaEroareLuna() {
        persoana = new Persoana("Marius", "1991410101232");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    @Category(CategorieRightBICEP.class)
    public void getVarstaPerformance() {
        persoana = new Persoana("Paul", "1990203456789");
        persoana.getVarsta();
    }

    @Test
    @Category(CategorieCORRECT.class)
    public void getVarstaCardinality0() {
        persoana = new Persoana("Ion", "5241201211210");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    @Category(CategorieCORRECT.class)
    public void getVarstaCardinality1() {
        persoana = new Persoana("Ion", "5240301211210");
        assertEquals(1, persoana.getVarsta());
    }

    @Test
    @Category(CategorieCORRECT.class)
    public void getVarstaOrderTest() {
        IPersoana persoana1 = new Persoana("Ionut", "5000104211045");
        IPersoana persoana2 = new Persoana("Elena", "2990204211045");

        assertTrue(persoana1.getVarsta() <= persoana2.getVarsta());
    }

}