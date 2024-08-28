package jason.speedwords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dictionary {
	private static final String FILE_NAME = "/enable1_2-7.txt";
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	@SuppressWarnings("unchecked")
	private ArrayList<String>[] wordLists = (ArrayList<String>[]) new ArrayList[26];
	
	public Dictionary() {
		for (int i = 0; i < ALPHABET.length(); i++) {
			// Initialize each of the 26 elements of wordlist as an ArrayList
			wordLists[i] = new ArrayList<String>();
		}
		
		try {
			InputStream input = this.getClass().getResourceAsStream(FILE_NAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(input));
			String word = in.readLine();
			
			while (word != null) {
				// Loop to find the first letter of a word and add the word to the corresponding word list array
				char letter = word.charAt(0);
				int list = ALPHABET.indexOf(letter);
				wordLists[list].add(word);
				word = in.readLine();
			}
			
			in.close();
		}
		catch (FileNotFoundException e) {
			String message = "File: " + FILE_NAME + " cannot be found";
			JOptionPane.showMessageDialog(null, message);
		}
		catch (IOException e) {
			String message = "File: " + FILE_NAME + " cannot be opened";
			JOptionPane.showMessageDialog(null, message);
		}
	}
	
	public boolean isAWord(String word) {
		boolean found = false;
		word = word.toUpperCase();
		char letter = word.charAt(0);
		int list = ALPHABET.indexOf(letter);
		int index = 0;
		String word2 = " ";
		
		while (index<wordLists[list].size() && word2.compareTo(word)<0 && !found) {
			ArrayList<String> wordList = wordLists[list];
			word2 = wordList.get(index);
			if (word2.equals(word)) {
				found = true;
			}
			index++;
		}
		
		return found;
	}

	public static void main(String[] args) {
		
	}

}
