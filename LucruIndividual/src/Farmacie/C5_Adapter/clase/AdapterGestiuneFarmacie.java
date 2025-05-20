package Farmacie.C5_Adapter.clase;

import java.util.Map;

public class AdapterGestiuneFarmacie implements IVanzare {
    private GestiuneStocuriMedicamente gestiune;
    private int idCurent;

    public AdapterGestiuneFarmacie(GestiuneStocuriMedicamente gestiune) {
        this.gestiune = gestiune;
    }

    @Override
    public void setareMedicament(int id) {
        this.idCurent = id;
    }

    @Override
    public boolean verificareDisponibilitate(int cantitateDorita) {
        return this.gestiune.verificaStocPentruMedicament(this.idCurent, cantitateDorita);
    }
}
