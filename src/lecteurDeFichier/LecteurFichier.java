package lecteurDeFichier;

import java.io.*;
import java.util.*;


abstract class LecteurFichier implements TraiteurFichier {

	private FileInputStream in;
	private BufferedReader br;
	protected ArrayList<String> lignes;
	
	public LecteurFichier() {
		in = null;
		br = null;
		lignes = new ArrayList<String>();
	}
	
	public void initFile(String fileName) {
		try {
			in = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		InputStreamReader isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		
		try {
			String line;
            while ( ( line = br.readLine() ) != null )
            	lignes.add(line);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if ( in != null ) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void readFile() {
		for ( int i = 0; i < lignes.size(); i++ ) 
			System.out.println( lignes.get(i) );
	};
}

