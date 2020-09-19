//////////////////////notes for review///////////////////////

////types in js
// number, string, null, undefined, boolean, symbol, object, function

////truthy and falsey values
// falsey: 0, "", null, undefined, NaN, false

//// strings
//you can use '' or ""
//	as of es6, you can use backticks: ``

//// functions
// repeatable blocks of code, logic
//		like a method, but not attached to an object
// we have standard functions, anonymous functions, arrow functions, IIFE's, and closure functions

//// objects
//js uses prototype inheritance. We can use an objects prototype for building
//  other objects. In es6, they introduced the class syntax. Behind the scenes
//  though, it is still prototype inheritance.

////arrays
//arrays are objects, they have states and behaviors. length is a state that
//  we can change at any time. it also has behaviors like forEach, filter
//  and others that need a callback function for its operation.

//////////es6
//stands for EcmaScript version 6
//EcmaScript is the standard for scripting languages and version 6 was a 
//  major update for js. Since then, they launch a minor update every year
//  instead of huge version changes.
// notable updates include: class syntax, template literals, backtick strings, 
//	let and const, arrow functions, and much more.


////some basic things to remember
//js is loosely types
//  variables can hold any data type at any time
//it is interpreted, never compiled
//it utilizes dynamic type checking
//  this means it checks for the type during runtime

////variable declaration
//we can use var, let, and const to declare variables
//  var is not to used unless you have a really good reason (there arent any)
//  const is prefferable over let, use it unless you want to be able to change it
//examples:
//  let x =7;
//  const y = 9;
//  var z = 10;
//let and const support block scope while var does not


////scopes in js
//global, function, block (local, loop)