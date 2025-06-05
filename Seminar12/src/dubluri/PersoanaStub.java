package dubluri;

import clase.IPersoana;

public class PersoanaStub implements IPersoana {
    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 65;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
