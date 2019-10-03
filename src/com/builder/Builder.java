package com.builder;

/*
 * Telescoping constructors : creation of multiple/overloaded constructors with each parameter variation is called telescoping constructor.
 * 
 * Builder Pattern : 
 * 
 * What problem builder pattern solves?
 * 
 * problem 1 : Telescoping constructors
 * 	a. Constructors accept parameters and are used to create objects in java.
 *  b. Problem arises When object has lots of parameters and some of them being mandatory and others optional.
 *  c. This results in to-many constructors to maintain and telescoping constructor's are error prone because they accept many fields same type(eg: refer e). 
 *	d. eg: Consider Cake class which has ingredients like sugar,milk, flour, egg etc. which are mandatory and cherry, fruits etc. which are optional.
 * 	e. Sugar and butter are in Strings. so instead of 2 cup sugar if you pass 2 cup butter, your compiler will not complain but will get a buttery cake with almost no sugar with high cost of wasting butter.	
 * 
 * Problem 2 : Setter based injections/Immutability.
 *  a. We can solve above problem partially by creating setters, and injecting parameters on need basis.
 *  b. But this creates new problem of having objects in in-consistent/half-baked state during building.
 *  c. eg: Ideally cake object should not be available until its created.
 *  d. Object with setters is immutable and there is no contract of what constitutes object creation is complete. 
 *  
 *  
 *  Builder design pattern solves both the problems.
 *  eg: LunchOrderBuilder, CakeBuilder
 * */
public class Builder {
	
}
