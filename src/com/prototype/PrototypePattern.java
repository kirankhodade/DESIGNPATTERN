package com.prototype;

/*Notes : 
 * 
 * In java Prototype : Is a template of an object, before an actual object is constructed.
 * 
 * Prototype design pattern is used in scenarios where application needs to create number
 * of instances of a class, which has almost same state or differs very little.
 * 
 * In this design pattern an instance of actual object(i,e prototype) is created on starting 
 * and thereafter whenever a new instance is required, this prototype is cloned to have another instance.
 * 
 * Prototype pattern is used to get UNIQUE instance of the same object. 
 * 
 * The main advantage of this pattern is to have MINIMUM newing up(i.e creating instance using new operator),
 * which is much costly than cloning process.
 * 
 * While cloning we need to decide whether we want shallow copy or deep copy of the object.
 * 
 * Prototype pattern – Participants
 * Prototype : This is the prototype of actual object as discussed above.
 * Prototype registry : This is used as registry service to have all prototypes accessible using simple string parameters.
 * Client : Client will be responsible for using registry service to access prototype instances.
 *
 * 
 * eg 1 : create an entertainment application that will require instances of Movie, Album and Show classes very frequently. 
 *        I do not want to create their instances every-time as it is costly. So, I will create their prototype instances, 
 *        and every-time when i will need a new instance, I will just clone the prototype.
 *        
 *    1 : create an e-commerce site application that will require instances of Movie and Book classes very frequently. 
 *        I do not want to create their instances every-time as it is costly. So, I will create their prototype instances, 
 *        and every-time when i will need a new instance, I will just clone the prototype. 
 * */
public class PrototypePattern {

}
