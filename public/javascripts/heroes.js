
//test
function visitPage(){
    return window.location = 'http://localhost:9000/buttonDown';
}

var moveDown = document.getElementById("moveDownTest");
moveDown.addEventListener("click", visitPage, false);


function moveUpJs() {

    return "http://localhost:9000/buttonUp";
}
var moveUp = document.getElementById("moveUp");
moveUp.addEventListener("click", moveUpJs,true);

/**
 * @return {string}
 */
/*function moveDownJs() {
    return window.location = "http://localhost:9000/buttonDown";
}
var moveDown = document.getElementById("moveDown");
moveDown.addEventListener("click", moveDownJs,true);*/

/**
 * @return {string}
 */
function moveRightJs() {
    return "http://localhost:9000/buttonLeft";
}
var moveRight = document.getElementById("moveRight");
moveRight.addEventListener("click", moveRightJs,true);

/**
 * @return {string}
 */
function moveLeftJs() {
    return "http://localhost:9000/buttonRight";
}
var moveLeft = document.getElementById("moveLeft");
moveLeft.addEventListener("click", moveLeftJs, true);

/**
 * @return {string}
 */
function lookUpJs() {
    return "http://localhost:9000/lookUp";
}
var lookUp = document.getElementById("lookUp");
lookUp.addEventListener("click", lookUpJs, true);

/**
 * @return {string}
 */
function lookDownJs() {
    return "http://localhost:9000/lookDown";
}
var lookDown = document.getElementById("lookUp");
lookDown.addEventListener("click", lookUpJs, true);
/**
 * @return {string}
 */
function lookRightJs() {
    return "http://localhost:9000/lookLeft";
}
var lookRight = document.getElementById("lookUp");
lookRight.addEventListener("click", lookRightJs, true);
/**
 * @return {string}
 */
function lookLeftJs() {
    return "http://localhost:9000/lookRight";
}
var lookLeft = document.getElementById("lookUp");
lookLeft.addEventListener("click", lookLeftJs, true);