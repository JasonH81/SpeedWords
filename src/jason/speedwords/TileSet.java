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
	
	public void changeXY(int changeX, int changeY) {
		x += changeX;
		y += changeY;
	}
	
	private int getWidth() {
		int width = tiles.size() * LetterTile.SIZE;
		return width;
	}
	
	public boolean contains(int pointX, int pointY) {
		boolean contains = false;
		int width = getWidth();
		int height = LetterTile.SIZE;
		if (pointX>=x && pointX<x+width && pointY>=y && pointY<y+height) {
			contains = true;
		}
		return contains;
	}
	
	public String toString() {
		String s = "";
		for (int i=0; i<tiles.size(); i++) {
			LetterTile tile = tiles.get(i);
			String s2 = tile.getLetter();
			s += s2;
		}
		return s;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getNumberOfTiles() {
		return tiles.size();
	}
	
	public LetterTile getTile(int i) {
		return tiles.get(i);
	}

}
