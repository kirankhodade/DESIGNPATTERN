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
 *   
 * Pitfall : 
 * A loose definition of a framework versus a pattern is that if a pattern contains other patterns it is a framework.
 * This isn't always true, but it makes you sometimes question the use of a prototype because we typically have to implement that with some sort of registry. 
 * Lastly, a lot of times you want a deep copy, and the clone interface only does a shallow copy. 
 * You can, of course, implement the functionality of a deep copy yourself, but that requires more coding yourself, 
 * and people start to second guess the validity of the pattern and whether it's solving anything for them.
 * 
 * Summary : 
 * 
 * we are using this pattern to guarantee a unique instance every time we ask for it. 
 * A drawback or a side note on it is that it's often something that gets re-factored in later, 
 * and that's because we're usually looking for it to help us with some performance issues inside of our application. 
 * So if we have an application that's creating a lot of objects, we want to go ahead and implement this pattern 
 * so that it can help us obtain these objects faster without the heavy-weight or over-bearing nature of using the 
 * keyword new every time we want an object. And lastly, I would note don't always just jump to a factory. 
 * Look at a prototype to see if it will solve your problem with your current situation because a factory 
 * can often lead to other things that a prototype is nicely suited for.
 * */
public class PrototypePattern {

}
