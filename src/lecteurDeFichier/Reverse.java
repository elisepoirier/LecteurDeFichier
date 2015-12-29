package lecteurDeFichier;

public class Reverse extends LecteurFichier {

	private String file;
	
	public Reverse(String file) {
		super();
		this.file = file;
	}
	
	private void reverse() {
		String temp;
		String ligne;
		
		for ( int i = 0; i < lignes.size(); i++ ) {
			ligne = lignes.get(i);
			temp = "";
			
			for( int j = ligne.length()-1; j >= 0; j-- ) {
				temp += ligne.charAt(j);
			}
			
			lignes.set(i, temp);
		}
	}

	@Override
	public void initFile() {
		super.initFile(file);	
	}

	@Override
	public void readFile() {
		reverse();
		super.readFile();
	}
}
