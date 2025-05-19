package STB.F5_Facade.clase;

public class FacadeDeschidereUsi {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public FacadeDeschidereUsi(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void deschideFortatToateUsile() {
        System.out.println("ATENTIE! SE DESCHID USILE!");
        this.usaFata.deschideFortat();
        this.usaMijloc.deschideFortat();
        this.usaSpate.deschideFortat();
    }

    public void deschideLiberToateUsile() {
        System.out.println("ATENTIE! CALATORII SOLICITA DESCHIDEREA USILOR!");
        this.usaFata.deschideLiber();
        this.usaMijloc.deschideLiber();
        this.usaSpate.deschideLiber();
    }
}
