// arrays
//	to declare an array

// it doesn't matter what type of elements you put into an array, js will accept it
const arr = [44, 33, 'kangaroo', true, false, undefined, null, new Date()];

// traditional for loop
/*for(let i = 0; i<arr.length; i++){
	console.log(arr[i]);
}*/

// for of loop will grab the elements
/*for(let item of arr){
	console.log(item);
}*/

// for in loop will grab the indexes
/*for(let item in arr){
	console.log(item);
}*/

// array methods

// forEach method
//arr.forEach(element => console.log(element));
/*function print(element){
	console.log(element);
}
*/

//arr.forEach(print);
//arr.forEach(console.log);

const newArr = arr.filter(element => +element);
const karrArr = arr.filter(element => element === 'kangaroo');

//array sizes are mutable, you will never get an array index out of bounds exception in this playground

// objects

// object literal
const boat = {
	name: 'sscoding???',
	length: '20',
	color: 'green',
	holes: 0,
	drillHoles: function() {
		this.holes++;
	},
	patchHoles: function() {
		this.holes > 0 ?  this.holes-- : thisholes  = 0;
	},
	sinking: function() {
		return this.holes !== 0;
	}
}

// dot operator
boat.color;
// subscript notation
boat['color'];

// classes

// pre-2015
//  classes used to be functions
function Person(name, age) {
	this.name = name;
	this.age = age;
	this.sayHello = function() {
		console.log(`hello I am ${this.name} and my age is ${this.age}`);
	};
	this.toString = function() {
		return 'this is me!!!';
	}
};

const littlePerson = new Person('billy', 1);
littlePerson.sayHello();

// post-2015
class Person2 {
	constructor(name, age) {
		this._name = name;
		this._age = age;
	}
	toString() {
		return 'this is me, hooray!!!';
	}
	get name() {
		return this._name;
	}
	set name(name) {
		this._name = name;
	}
	get age() {
		return this._age;
	}
	set age(age) {
		this._age = age <= 0 ? this._age : age;
	}
}

const p = new Person2('p', 88);

// closures
//		closure is a function in js that allows a function to have the scope of its parent

// anonymous functions
const anon = function() {
	console.log('anonymous');
}

anon(); // -> logs anononymous

// IIFE
//	Immediately Invokable Function Expression
const iife = (function() {
	return 5;
})();

iife // -> 5

// closure function
const close = (function() {
	return function() {
		return 7;
	}
})();

close() //-> 7

const driveCar = (function() {
	console.log('car has been purchased');
	let miles = 0;
	return function(m) {
		console.log(`attempting to drive the car ${m} miles`);
		miles += m >= 0 ? m : 0;
		return miles;
	}

})();



// rest parameters is just like var args
function operate(...args){
	// spread operator
	return [...arr2, ...args];
}

// spread operator unpackages arrays and objects into each other
const arr2 = [...arr, 4];
console.log(arr2.length);


// can unpack an array inside an object
const boat2={
	...boat,
	fly:false,
	...arr2
}
// cannot unpack an object inside an array
const arr3 = [...arr2, ...boat2]






