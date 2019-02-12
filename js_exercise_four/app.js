var myObject = {
  "country": "India",
  "capital": "New Delhi"
};

console.log("Original object: ")
console.log(myObject);
document.getElementById("original-object").innerHTML = myObject.country + ", " + myObject.capital;

var myObjectCopy = {};

for (var key in myObject) {
  myObjectCopy[key] = myObject[key];
}

console.log("Copied object: ");
console.log(myObjectCopy);
document.getElementById("copied-object").innerHTML = myObjectCopy.country + ", " + myObjectCopy.capital;
