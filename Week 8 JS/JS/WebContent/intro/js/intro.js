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

function hey() {  //js does not care if we return something or nothing
	console.log('hey');
}


// js has falsey values: false, 0, null, "", undefined, NaN
// and the truthy values are: anything that is not falsey


const val = NaN;

if (val) {
	console.log("it is true");
} else {
	console.log("woah this is false?!?!?! this is crazy!!!")
}


/*operators
// all the operators in java work here
isNaN						returns a boolean if the argument is not a number
typeof						returns the type of the argument
!							"not" negation operator
!!							returns the boolean representation of the argument
+, Number(x)				gives the numeric representation of the argument
==							checks equality with type coercion
!=							negation of the one above
===							checks equality without type coercion
!==							negation of above

*/




/*
	functions
	
function funName(paramsWithoutTypes){
	body // return whatever you want	
}

	difference between methods and functions
		methods are attached to objects
		functions are not

*/
// basic function declaration
function fun() {
	console.log('hey') // semi colons are not required
}

// js does not allow function/method overloading
function funWithArgs(a, b, c) {
	console.log(a);
}

// this is a callback function.
//		it is used to call another function (passed in as arguments)
function callback(func) {
	setTimeout(func, 5000);
}

// declaring a function inside the arguments for the callback
/*callback(function bob() {
	console.log("bob");
});*/

//	same as above, but with arrow function
/*callback(() => {
	console.log("arrow function as arguments");
})*/

// the following two are equivalent
const hay = () => 'is for horses';

function hay2() {
	return 'is for horses';
}


//	scopes

// pr-2015
//  function and global

// post-2015
//  function, local, and global

//var test = true;				// global
//const test = true;			// global
let test = true;				// global
function doesItWork() {

	//let inner = 'speak';		// function
	//const inner = 'speak';		// function
	// var inner = 'speak';		// function
	if (test) {
		//const yell = 'panic'; 	// local
		//let yell = 'panic';		// local
		var yell = 'panic';			// function
	}
	console.log(yell);
}

//doesItWork();

const stringy = 'these are normal quotes. we can use single or double interchangeably. if we want to '+
	'go to the next line, we need to use string concatenation. if we want to add quotes inside the '+
	"string, we can use the other that we are not using ' or we can use the escape character \". If "+
	"you wanted to add in a variable, you can use concatenation to bring them in such as test = "+test+
	'. sometimes concatenation can get old, but what are we already used to anyway???';
	
	
// but...since es6, we can backticks and template literals
const backticks = `these backticks will allow you to go to new lines, and add in variables without
	having to concatenate. we can use other quotes such as ' " and we can use template literal syntax
	to bring in a variable. we can do this with \${}. such as with test = ${test}.`;


