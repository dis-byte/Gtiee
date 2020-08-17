
var timer;
var n = 1;
function startChange() {
	timer = window.setInterval(repeat, 1000);
}
function repeat() {
	change(n++ % 6, false);
}
function stopChange(x) {
	if (x < 6) {
		n = x + 1;
	}
	window.clearInterval(timer);
}
function change(x, isHandle) {
	if (isHandle) {
		stopChange(x);
	}
	var buttons = document.getElementById("buttons").getElementsByTagName("div");
	for (var i = 0; i < buttons.length; i++) {
		buttons[i].className = "style1";
	}
	buttons[x].className = "style2";
	document.getElementById("image").src = "img/" + (1 + x) + ".jpg";
}

