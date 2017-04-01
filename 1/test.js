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
