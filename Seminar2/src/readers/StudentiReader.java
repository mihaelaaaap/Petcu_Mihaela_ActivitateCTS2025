package readers;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {
    public StudentiReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicant() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student aplicant = new Student();
            super.readAplicantData(input, aplicant);
            int anStudii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setAnStudii(anStudii);
            aplicant.setFacultate(facultate);
            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }

}

