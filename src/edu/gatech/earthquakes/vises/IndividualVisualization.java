package edu.gatech.earthquakes.vises;

import edu.gatech.earthquakes.model.DataRow;

public abstract class IndividualVisualization extends AbstractVisualization {
	
	// the current quake that is displayed by this particular individual vis
	private DataRow displayData;
	
	public IndividualVisualization(int x, int y, int w, int h) {
		super(x, y, w, h);
	}
}