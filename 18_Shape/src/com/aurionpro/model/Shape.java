package com.aurionpro.model;

public abstract class Shape {
	
		private colourtype colour ;
		private bordertype border ;
		
		public Shape(colourtype colour, bordertype border) {
			super();
			this.colour = colour;
			this.border = border;
		}
		
		public colourtype getColour() {
			return colour;
		}
		public void setColour(colourtype colour) {
			this.colour = colour;
		}
		public bordertype getBorder() {
			return border;
		}
		public void setBorder(bordertype border) {
			this.border = border;
		}
		public abstract double calculatearea();
		
}