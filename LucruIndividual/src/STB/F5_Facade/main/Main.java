package STB.F5_Facade.main;

import STB.F5_Facade.clase.FacadeDeschidereUsi;
import STB.F5_Facade.clase.UsaFata;
import STB.F5_Facade.clase.UsaMijloc;
import STB.F5_Facade.clase.UsaSpate;

public class Main {
    public static void main(String[] args) {
        FacadeDeschidereUsi facade = new FacadeDeschidereUsi(new UsaFata(), new UsaMijloc(), new UsaSpate());
        facade.deschideFortatToateUsile();
        System.out.println();
        facade.deschideLiberToateUsile();
    }
}
