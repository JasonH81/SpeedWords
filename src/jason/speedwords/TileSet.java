package jason.speedwords;

import java.awt.Graphics;
import java.util.ArrayList;

public class TileSet {
	
	private static final int HIGHLIGHT_WIDTH = 2;
	
	
	private ArrayList<LetterTile> tiles = new ArrayList<LetterTile>();
	private int x = 0;
	private int y = 0;
	
	public TileSet(String word, int x, int y) {
		for (int i=0; i<word.length(); i++) {
			String letter = word.substring(i,i+1);
			LetterTile tile = new LetterTile(letter);
			tiles.add(tile);
			this.x = x;
			this.y = y;
		}
	}
	
	public void draw(Graphics g) {
		for (int i=0; i<tiles.size(); i++) {
			LetterTile tile = tiles.get(i);
			int xPos = x + LetterTile.SIZE * i;
			tile.draw(g, xPos, y);
		}
	}

}
