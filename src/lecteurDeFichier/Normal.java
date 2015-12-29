package lecteurDeFichier;


public class Normal extends LecteurFichier {
	
	private String file;
	
	public Normal(String file) {
		super();
		this.file = file;
	}

	@Override
	public void initFile() {
		super.initFile(file);
	}

	@Override
	public void readFile() {
		super.readFile();	
	}

}
