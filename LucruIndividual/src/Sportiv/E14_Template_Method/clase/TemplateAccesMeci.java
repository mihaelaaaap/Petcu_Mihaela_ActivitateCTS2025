package Sportiv.E14_Template_Method.clase;

public abstract class TemplateAccesMeci {
    protected Suporter suporter;

    public final void accesMeci(Suporter suporter) {
        this.suporter = suporter;
        asezareInRand();
        prezentareBilet();
        controlCorporal();
        intrareInStadion();
        ocupareLoc();
    }

    protected abstract void asezareInRand();
    protected abstract void prezentareBilet();
    protected abstract void controlCorporal();
    protected abstract void intrareInStadion();
    protected abstract void ocupareLoc();
}
