if (76675) {
  console.log("True");
} else {
  console.log("False");
}

let arr = [1, "Hello", true];
arr[4] = "Hii";
console.log(arr);

// setTimeout(function abc() {
//   console.log("Boom");
// }, 5000);

// setInterval(function xyz() {
//   document.write("Hello");
//   document.write("<br>");
// }, 2000);

async function products(number) {
  let rawData = await fetch("https://dummyjson.com/products/" + number);
  let finalData = await rawData.json();
  console.log(finalData);
}

// products(20);

function red() {
  let text = document.getElementById("myelement");
  text.style.color = "red";
}
function yellow() {
  let text = document.getElementById("myelement");
  text.style.color = "yellow";
}
function blue() {
  let text = document.getElementById("myelement");
  text.style.color = "blue";
}
function green() {
  let text = document.getElementById("myelement");
  text.style.color = "green";
}
