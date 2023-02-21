//on click menu toggle

const menuToggle = document.querySelector(".menu-toggle input");
const nav = document.querySelector("nav ul");

menuToggle.addEventListener("click", function () {
  nav.classList.toggle("slide");
});
//remove click menu toggle

const burger = document.querySelector(".menu-toggle input");

document.addEventListener("click", function (e) {
  if (!burger.contains(e.target)) {
    nav.classList.remove("slide");
  }
});
