import clase.Aplicant;
import readers.AngajatiReader;
import readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		AplicantReader aplicantiReader = new AngajatiReader("angajati.txt");
		// AplicantReader aplicantiReader = new EleviReader("elevi.txt");
		// AplicantReader aplicantiReader = new StudentiReader("studenti.txt");
		try {
			listaAplicanti = aplicantiReader.readAplicant();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());

//			for(Aplicant aplicant:listaAplicanti)
//				aplicant.statutAcceptareFinantare(80);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
