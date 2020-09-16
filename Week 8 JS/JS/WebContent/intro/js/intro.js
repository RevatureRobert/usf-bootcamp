/*
	javascript != java
	javascript is:
		scripting
			it is interpreted, not compiled
		loosely typed
			in java: String s = "hey"; 
				but we cant do s = 5;
			in js: let s = "hey";
				but in js, we can: s=5;
		uses dynamic type checking
			types are checked at runtime not compile time
*/

// js data types
// boolean, string, null, number, undefined, symbol, object, function

// syntax for declaring a variable
//	var, let, and const
var a = 3; // do not use this
let b = 4; // this is the replacement for var
const c = 5; // makes the variable immutable

function hey(){  //js does not care if we return something or nothing
	console.log('hey');
}


// js has falsey values: false, 0, null, "", undefined, NaN
// and the truthy values are: anything that is not falsey


const val = NaN;

if(val){
	console.log("it is true");
}else{
	console.log("woah this is false?!?!?! this is crazy!!!")
}


/*operators
// all the operators in java work here
isNaN						returns a boolean if the argument is not a number
typeof						returns the type of the argument
!							"not" negation operator
!!							returns the boolean representation of the argument
+							gives the numeric representation of the argument





*/