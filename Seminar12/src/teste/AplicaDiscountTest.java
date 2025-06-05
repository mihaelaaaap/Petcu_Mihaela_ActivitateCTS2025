package teste;


import categorii.CategorieCORRECT;
import categorii.CategorieRightBICEP;
import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.PersoanaFake;
import dubluri.PersoanaStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class AplicaDiscountTest {


    @Test
    @Category(CategorieRightBICEP.class)
    public void aplicaDiscountVarstniciBoundaryStub() {
        IPersoana persoanaStub = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub, "Tenerife", 1000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900.00, pachetTuristic.getPret(), 0.00001);
    }

    @Test
    @Category({CategorieRightBICEP.class, CategorieCORRECT.class})
    public void getVarstaDiscountVarstniciFakeRight() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(70);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Madeira", 1000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(900.00, pachetTuristic.getPret(), 0.00001);
    }


    @Test
    @Category(CategorieCORRECT.class)
    public void getVarstaDiscountVarstniciFakeRange() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(30);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Madeira", 1000.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(1000.00, pachetTuristic.getPret(), 0.00001);
    }


}