function add(a, b) {
  console.log(a + b);
}

function sub(a, b) {
  console.log(a - b);
}
function multiply(a, b) {
  console.log(a * b);
}
function div(a, b) {
  console.log(a / b);
}

// add(10, 20);
// sub(50, 10);
// multiply(10, 20);
// div(10, 2);

//Objects

let phone = {
  brand: "Samsung",
  price: null,
  color: "Pink",
  selfieCam: true,
  print: function data() {
    console.log(
      "my phone is " + this.brand + " and its price is " + this.price
    );
  },
};
// phone.print();

// {
//   var a = 20; // Global Scoped
//   console.log(a);
// }

// {
//   let b = 30; // Block Scoped
//   console.log(b);
// }

// {
//   const c = 40;
//   console.log(c); //Block Scope
// }

let arr = [1, 2, 3, 4];
let arr2 = [...arr];
arr2[2] = 100;
console.log(arr);
