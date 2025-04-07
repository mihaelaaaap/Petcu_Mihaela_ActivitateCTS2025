package Singleton_StudentiExamen.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistryExamen {
    private String disciplina;
    private String data;
    private static RegistryExamen instance = null;
    static Map<String, Student> studenti = new HashMap<>();

    private RegistryExamen(String disciplina, String data) {
        this.disciplina = disciplina;
        this.data = data;
    }

    public static RegistryExamen getInstance(String disciplina, String data) {
        if (instance == null) {
            instance = new RegistryExamen(disciplina, data);
        }
        return instance;
    }

    public void inregistreazaStudent(Student student) throws Exception {
        if(!studenti.containsKey(student.getNumarMatricol())) {
            studenti.put(student.getNumarMatricol(), student);
        } else {
            throw new Exception("Studentul cu numarul matricol " + student.getNumarMatricol()
                    + " a fost deja inregistrat la examenul de la aceasta disciplina!");
        }
    }

    public static Student getStudent(String numarMatricol) {
        return studenti.get(numarMatricol);
    }

    public void rezumatExamen() {
        if(studenti.isEmpty()) {
            System.out.println("Momentan nu participa niciun student la examenul de la disciplina "
            + disciplina + " din data de " + data);
        } else {
            System.out.println("----- Lista studentilor care participa la examenul de la disciplina " + disciplina
            + " din data de " + data + " -----\n");
            int contor = 1;
            for(Map.Entry<String, Student> student : studenti.entrySet()) {
                System.out.println(contor + ") " + student.getKey() + ":");
                student.getValue().profilStudent();
                contor++;
            }
            System.out.println("TOTAL: " + studenti.size() + " studenti");
        }
    }
}
