console.log("Step 1");

var name = ['o','r','i','o','l'];

for (i = 0; i < name.length; i++) {
	console.log(name[i]);
}

console.log("Step 2");

var arrName1 =['o','r','i','o','l'];
var vowels=['a','e','i','o','u'];
var numbers=['1','2','3','4','5','6','7','8','9','0'];

for (i=0; i<arrName1.length; i++) {
	for (j=0; j<vowels.length; j++){
		if (name[i].equals(vowel[j])) {
			console.log("Vowel");
		}
		else {
			console.log("Consonant");
		}
	}
	for (k=0; k<numbers.length; k++){
		if (name[i].equals(numbers[k])) {
			console.log("Names of person don't have numbers");
		}
		
	}
}
		
console.log("Step 3");

var myName = ['o','r','i','o','l'];

var map  = new Map();
map.set('o',1);
map.set('r',1);
map.set('i',1);
map.set('o',1);
map.set('l',1);

for(i=0; map.size; i++){
	if(i===map[i]) {
		map.set(i, map.get(i) + 1);
    } 
    else {
		map.set(i, 1);
	}
}

console.log(map);

		
console.log("Step 4");

var myName2 = ["o","r","i","o","l"];
var mySurname =["c","a","n","a","d","e","s"];

var fullName = myName2.concat(" ",mySurname);

console.log(fullName);