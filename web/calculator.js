
window.onload = hide();
var square = document.getElementById('square');

function hide() {
    square.style.visibility = 'hidden';
}

function clickSquare() {
    square.style.visibility = 'visible';
}
