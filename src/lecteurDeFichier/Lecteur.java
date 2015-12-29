package lecteurDeFichier;

import java.io.IOException;

public class Lecteur {
	public static void main(String[] args) throws IOException {

		String file = "C:/Users/Poirier/Documents/Projets Eclipse/data.txt";
		
		Normal fichier = new Normal(file);
		fichier.initFile();
		fichier.readFile();
		
		Reverse fichier2 = new Reverse(file);
		fichier2.initFile();
		fichier2.readFile();
		

	}
}
