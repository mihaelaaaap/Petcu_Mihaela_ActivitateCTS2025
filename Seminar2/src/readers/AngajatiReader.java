package readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {

    public AngajatiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicant() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat aplicant = new Angajat();
            super.readAplicantData(input2, aplicant);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            aplicant.setOcupatie(ocupatie);
            aplicant.setSalariu(salariu);
            angajati.add(aplicant);
        }
        input2.close();
        return angajati;
    }
}
