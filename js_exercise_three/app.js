var radius;
while (isNaN(radius) || radius < 0 || radius == null) {
  radius = prompt("Radius of circle");
}

function calcArea(radius) {
  let area = 3.14 * radius * radius;
  return area;
}

document.getElementById("circle-area").innerHTML = "Area of circle with radius " + radius + ": " + calcArea(radius);
