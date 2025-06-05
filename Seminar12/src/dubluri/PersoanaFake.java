package dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private int varsta;

    @Override
    public String getSex() {
        return "";
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
