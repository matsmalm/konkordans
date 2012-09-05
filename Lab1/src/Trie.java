/**
 * Trieeeeeee!
 * @author shaz
 *
 */
public class Trie {

	long address;
	Trie[] children = new Trie[29];

	public Trie(int next){
		next--;
		for (int i = 0; i < 29; i++){

			if (next >= 0) {
				children[i] = new Trie(next);
			}
			else {
				children[i] = null;
			}
		}
	}
	/**
	 * endast f�r test
	 * @param args
	 */
	public static void main(String[] args){		
	Trie test = new Trie(3);
	test.children[2].children[2].children[2].address = 4266;
	System.out.println(test.children[2].children[2].children[2].address);
	
	
	}
	/**
	 * setAddress s�tter adressen p� plats [first second third] till "address" parametern :))))))))
	 * 
	 * @param trie Trie'n som man vill �ndra adressen p�
	 * @param first f�rsta bokstaven
	 * @param second andra 
	 * @param third tr��dje
	 * @param address �djeszen som man vill kjamaz med
	 */
	public void setAddress(Trie trie, int first, int second, int third, int address){
		trie.children[first].children[second].children[third].address = address;
	}
	public void setAddress(Trie trie, int first, int second, int address){
		trie.children[first].children[second].address = address;
	}
	public void setAddress(Trie trie, int first, int address){
		trie.children[first].address = address;
	}

	/**
	 * getAddress metoderna returnerar en address, den f�rsta returnerar 3 niv�er ner,
	 * den andra tv�, den tredje en..
	 * @param trie Trie'n som man vill f� addressen ur
	 * @param first f�rsta bokstaven
	 * @param second andra bokstaven
	 * @param third tredje bokstaven
	 * @return address
	 */
	public long getAddress(Trie trie, int first, int second, int third){
		return trie.children[first].children[second].children[third].address;
	}
	public long getAddress(Trie trie, int first, int second){
		return trie.children[first].children[second].address;
	}
	public long getAddress(Trie trie, int first){
		return trie.children[first].address;
	}
	
}
