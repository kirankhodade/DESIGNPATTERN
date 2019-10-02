package com.factory;

/*NOTES :
 * 
 * Factory Method design pattern : (Virtual constructor)
 * 
 * Define an interface/contract for creating an Object, but let sub-classes decide which class to instantiate.
 * Factory method lets a class defer instantiation to sub-class.
 *  
 * frameworks use abstract classes to define and maintain relationship between objects.
 * framework is also responsible for creating objects as well.
 * 
 * eg: framework for Application that can present multiple Documents to user.
 * 	   Abstract classes : Application and Document
 * 	   Drawing Application implementation has : DrawingApplication and DrawingDocument concrete classes.
 *     Word Application implementation has : WordApplication and WordDocument concrete classes.
 *     PDF Application implementation has : PDFApplication and PDFDocument concrete classes.
 *     createDocument is factory method declared in Application class and defined in Drawing, Word, PDF application implementation classes and returns new concrete document object.
 *     
 *     framework for BatchProcessor application has multiple Parsers to parse data.
 *     Abstract classes : BatchProcessor and Parser
 *     TextBatchProcessor implementation has : TextBatchProcessor and TextParser concrete classes.
 *     CSVBatchProcessor implementation has : CSVBatchProcessor and CSVParser concrete classes.
 *     XMLBatchProcessor implementation has : XMLBatchProcessor and XMLParser concrete classes.
 *     createParser is factory method declared in BatchProcessor class and defined in TextBatchProcessor, CSVBatchProcessor, XMLBatchProcessor implementation classes and returns new concrete Parser object.
 *     
 *     framework for Website application. Based on website type, framework presents multiple types of pages to user.
 *     Abstract classes : Website and Page
 *     Blog Website implementation has : BlogWebsite and BlogPage concrete classes.
 *     Shop Website implementation has : ShopWesite and ShopPage concrete classes.
 *     createPages is factory method declared in Website class and defined in Blog and Shop implementation classes and returns new concrete Page object.
 *     
 *     Generalized example :
 *     framework has Creator that can create multiple Products for user.
 *      Abstract classes : Creator and Product
 *    	implementation has : ConcreteCreator and ConcreteProduct sub-classes.
 *      factoryMethod is declared and in Creator, and overidden in ConreteCreator's class to return new ConcreteProduct().
 *    .
 * 
 * When to use Factory method design pattern?
 * If there is an inheritance hierarchy where a polymorphic creation is needed.
 * When you are modifying a class to accommodate changing requirements(i.e If we are violating open-closed principle). 
 * Design principle : Depend on abstractions, Do not depend on concrete class.(i.e. Dependency inversion principle)
 * 
 * Factory returns various instances and allows multiple constructors.
 * It is interface driven and is adaptable to each environment easily.
 * 
 * 
*/

