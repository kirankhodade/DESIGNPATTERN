package com.abstractfactory;
/*
 * Abstract Factory pattern : provides an interface/contract for creating families of related or dependent objects, without specifying their concrete classes. 
 * 
 * Difference between Factory method and Abstract factory?
 * Factory method constructs  single object whereas abstract factory constructs multiple objects.
 * 
 * eg: java xml --> DocumentBuilder api.
 * 
 * Pitfalls of Abstract factory pattern : 
 * Adds complexity.
 * Problem Specific.
 * Starts as factory then its re-factored to abstract factory pattern.
 * 
 *  
 * Abstract Factory example : 
 * 	 Factory Method pattern : 1
*    framework for UIButtonComponent application which has Multiple Button implementation styles for user.
*    Abstract classes: ButtonComponent, Button 
*    Windows implementation has : WindowsButtonComponent and WindowsButton.
*    MacOS implementation has : MacButtonComponent and MacButton.
*    Linux implementation has : LinuxButtonComponent and LinuxButton.
*    
*    Factory Method pattern : 2
*    framework for UIScrollComponent application which has Multiple Button implementation styles for user.
*    Abstract classes: ScrollComponent, Scroll 
*    Windows implementation has : WindowsScrollComponent and WindowsScroll.
*    MacOS implementation has : MacScrollComponent and MacScroll.
*    Linux implementation has : LinuxScrollComponent and LinuxScroll
*    
*    Abstract Factory pattern : 
*    Family of UIComponent application which has Multiple platform specific implementation for user.
*    Abstract classes: AbstractUIFactory --> ButtonComponent and ScrollCOmponent 
*    Windows implementation has : ConcreteWindowsUIFactory -->  (WindowsButtonComponent, WindowsButton) and (WindowsScrollComponent, WindowsScroll).
*    MacOS implementation has : ConcreteMacUIFactory --> (MacButtonComponent, MacButton) and (MacScrollComponent, MacScroll)
*    Linux implementation has : ConcreteLinuxUIFactory --> (LinuxButtonComponent, LinuxButton) and (LinuxScrollComponent, LinuxScroll)
*    
*/    
public class AbstractFactory {

}
