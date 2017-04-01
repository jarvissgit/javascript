// to use strict mode
use strict;

// defining function
function hello(){
	var company="enki";
}

// defining object
var per = {
	firstName:"john",
	lastName:"smith"
};

// printing first name
console.log(per.firstName);

var propName="firstName";
console.log(per[propName]);

// attributes can be added anytime
per.age="40";
per["homeTown"]="London";

// object's properties can also be functions
var per = {
	firstName: "alex",
	lastName: "smith",

	sayHi: function(){
		console.log("hello");
	}
};

// invoking the function
per.sayHi();

// constructor functions
function Person(firstName, lastName){
	this.firstName = firstName;
	this.lastName = lastName;
}

var p1= new Person("john", "smith");
var p2= new Person("joe", "smith");
