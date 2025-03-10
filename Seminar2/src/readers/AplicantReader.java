package readers;


import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    protected String file;

    public AplicantReader(String file) {
        this.file = file;
    }

    public abstract List<Aplicant> readAplicant() throws FileNotFoundException;

    public void readAplicantData(Scanner scanner, Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNrProiecte(nr, vect);
    }
}

