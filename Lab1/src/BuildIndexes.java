import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

public class BuildIndexes {
	
	BuildIndexes() {
		
	}
	
	public void Tokenize(BufferedReader fin) {
		
		Map<String, WordData> wordmap = new HashMap<String, WordData>();
		long korpusWordPtr = 0;
		
		String token = null; /* aktuellt ord fr�n korpus */
		
		/* F�r varje ord i korpus */
		
		/* Om ordet finns */
		wordmap.containsKey(token);
		WordData tempwd = (WordData) wordmap.get(token);
		tempwd.addOccurence();
		AddPtrIndex(tempwd.getIndexRowPtr(), korpusWordPtr);
		
		/* Om ordet inte finns */
		WordData wd = new WordData(AddPtrIndexRow(korpusWordPtr));
		wordmap.put(token, wd);
		
		/* N�r hela korpus g�tts igenom */
		writeWordIndex(wordmap);
		
		/* G�rs sist. */
		populateAndWriteTrie(wordmap);
	}
	
	/* L�gg till en ny rad i PtrIndex f�r en ny tokens korprpuspekare 
	 * skriv f�rsta pekaren och returnera radnumret! */
	private long AddPtrIndexRow(long korpusWordPointer) {
		
		long ptrIndexRow = 0;
		
		/* Implementera */
		
		return ptrIndexRow;
	}
	
	/* Skriv ytterligare en korpuspekare p� r�tt rad i PtrIndex */
	private void AddPtrIndex(long indexRowPtr, long korpusWordPtr) {
		
		/* Implementera */
		
	}
	
	/* Skriver ut ordindexet fr�n Hashmapen med tokens. 
	 * Varje rad best�r av "token nrOcOccurences ptrIndexRowPtr*/
	private void writeWordIndex(Map<String, WordData> wordmap) {
		
	}

	/* G� igenom Hashmapen och bygg trien fr�n denna med pekare in i WordIndex */
	private void populateAndWriteTrie(Map<String, WordData> wordmap) {
		
		Trie trie = new Trie(3);
		
		/* Implementera */
		
	}
}
