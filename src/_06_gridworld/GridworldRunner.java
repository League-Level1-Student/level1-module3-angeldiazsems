package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
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
		Location loc = new Location(x, y);
		Location loc2 = new Location(5, 5);
		
		Bug bug = new Bug();
		Bug bug2 = new Bug();
		
		world.add(loc, bug);
		world.add(loc2, bug2);
		
	bug2.setColor(Color.blue);
		
		
	}
}
