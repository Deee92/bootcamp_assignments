var myString;
while (myString == null || !isNaN(myString)) {
  myString = prompt("Your string");
}

function palindrome(myString) {
  var re = /[\W_]/g;
  var lowRegStr = myString.toLowerCase().replace(re, '');
  var reverseStr = lowRegStr.split('').reverse().join('');
  return reverseStr === lowRegStr;
}

var answer = document.getElementById("is-palindrome");
if (palindrome(myString) == true) {
  answer.innerHTML = myString + " is a palindrome";
} else {
  answer.innerHTML = myString + " is not a palindrome";
}
