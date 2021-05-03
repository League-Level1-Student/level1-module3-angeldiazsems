package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		Random ran = new Random();
		x = ran.nextInt(10);
		y = ran.nextInt(10);
		World world = new World();
		world.show();
		Location ranloc = new Location(x, y);
		Location loc2 = new Location(5, 5);
		Location loc3 = new Location(5,4);
		Location loc4 = new Location(5,6);
		Location loc = new Location(0,0);
		
		
		for(int i = 0; i<world.getGrid().getNumCols(); i++ ) {
			for(int j = 0; j<world.getGrid().getNumRows(); j++ ) {
			Flower flower = new Flower();
			world.add(new Location(i,j), flower);
			
			}
		}
		
		
		
		
		
		
		Bug bug = new Bug();
		Bug ranbug = new Bug();
		
		world.add(ranloc, ranbug);
		world.add(loc2, bug);
		
		
	ranbug.setColor(Color.blue);
		bug.turn();
		bug.turn();
		
	}
}
