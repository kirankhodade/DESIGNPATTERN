package com.builder.cake;

public class Cake {
	private final double sugar;
	private final double butter;
	private final int eggs;
	private final int vanila;
	private final double flour;
	private final double bakingPowder;
	private final double milk;
	private final int cherry;
	
	public static class Builder{
		private double sugar;
		private double butter;
		private int eggs;
		private int vanila;
		private double flour;
		private double bakingPowder;
		private double milk;
		private int cherry;
		
		public Cake build() {
			return new Cake(this);
		}
		
		public Builder sugar(double sugar) {
			this.sugar = sugar;
			return this;
		}
		
		public Builder butter(double butter) {
			this.butter = butter;
			return this;
		}
		
		public Builder eggs(int eggs) {
			this.eggs = eggs;
			return this;
		}
		
		public Builder vanila(int vanila) {
			this.vanila = vanila;
			return this;
		}
		
		public Builder flour(double flour) {
			this.flour = flour;
			return this;
		}
		
		public Builder bakingPowder(double bakingPowder) {
			this.bakingPowder = bakingPowder;
			return this;
		}
		
		public Builder milk(double milk) {
			this.milk = milk;
			return this;
		}
		
		public Builder cherry(int cherry) {
			this.cherry = cherry;
			return this;
		}
	}

	private Cake(Builder builder) {
		this.sugar = builder.sugar;
		this.butter = builder.butter;
		this.eggs = builder.eggs;
		this.vanila = builder.vanila;
		this.flour = builder.flour;
		this.bakingPowder = builder.bakingPowder;
		this.milk = builder.milk;
		this.cherry = builder.cherry;
	}
	
	
public double getSugar() {
		return sugar;
	}




	public double getButter() {
		return butter;
	}




	public int getEggs() {
		return eggs;
	}




	public int getVanila() {
		return vanila;
	}




	public double getFlour() {
		return flour;
	}




	public double getBakingPowder() {
		return bakingPowder;
	}




	public double getMilk() {
		return milk;
	}




	public int getCherry() {
		return cherry;
	}
	




	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", eggs=" + eggs + ", vanila=" + vanila + ", flour="
				+ flour + ", bakingPowder=" + bakingPowder + ", milk=" + milk + ", cherry=" + cherry + "]";
	}

}
