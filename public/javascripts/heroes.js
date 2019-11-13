
//test
function visitPage(){
    return window.location = 'http://localhost:9000/buttonDown';
}

let moveDown1 = document.getElementById("moveDownTest");
moveDown.addEventListener("click", visitPage, false);


function moveUpJs() {
    return window.location ="http://localhost:9000/buttonUp";
}
let moveUp = document.getElementById("MoveUp");
moveUp.addEventListener("click", moveUpJs,true);

/**
 * @return {string}
 */
function moveDownJs() {
    alert("tolle knolle");
    return window.location = "http://localhost:9000/buttonDown";
}
let moveDown = document.getElementById("MoveDown");
moveDown.addEventListener("click", moveDownJs,true);

/**
 * @return {string}
 */
function moveRightJs() {
    return window.location ="http://localhost:9000/buttonLeft";
}
let moveRight = document.getElementById("MoveLeft");
moveRight.addEventListener("click", moveRightJs,true);

/**
 * @return {string}
 */
function moveLeftJs() {
    return window.location ="http://localhost:9000/buttonRight";
}
let moveLeft = document.getElementById("MoveRight");
moveLeft.addEventListener("click", moveLeftJs, true);

/**
 * @return {string}
 */
function lookUpJs() {
    return window.location ="http://localhost:9000/lookUp";
}
let lookUp = document.getElementById("lookUp");
lookUp.addEventListener("click", lookUpJs, true);

/**
 * @return {string}
 */
function lookDownJs() {
    return window.location ="http://localhost:9000/lookDown";
}
let lookDown = document.getElementById("lookDown");
lookDown.addEventListener("click", lookUpJs, true);
/**
 * @return {string}
 */
function lookRightJs() {
    return window.location ="http://localhost:9000/lookRight";
}
let lookRight = document.getElementById("lookRight");
lookRight.addEventListener("click", lookRightJs, true);
/**
 * @return {string}
 */
function lookLeftJs() {
    return window.location ="http://localhost:9000/lookLeft";
}
let lookLeft = document.getElementById("lookLeft");
lookLeft.addEventListener("click", lookLeftJs, true);


function changeTile(i) {
    if($('#'+i).hidden)
        $('#'+i).show();
    else
        $('#'+i).hide();
}

let gameJson = {
    size:9,
    0: {0:0,1:0,2:0,3:0,4:0,5:0,6:0,7:0,8:0},
    1: {0:0,1:0,2:0,3:0,4:5,5:6,6:7,7:8,8:0},
    2: {0:0,1:2,2:0,3:4,4:5,5:6,6:7,7:8,8:0},
    3: {0:0,1:2,2:0,3:4,4:5,5:6,6:7,7:8,8:0},
    4: {0:0,1:2,2:0,3:4,4:5,5:6,6:7,7:8,8:0},
    5: {0:0,1:2,2:3,3:4,4:5,5:6,6:7,7:8,8:0},
    6: {0:0,1:2,2:3,3:4,4:5,5:6,6:7,7:8,8:0},
    7: {0:0,1:2,2:3,3:4,4:5,5:6,6:7,7:8,8:0},
    8: {0:0,1:0,2:0,3:0,4:0,5:0,6:0,7:0,8:0},
};
let size = 9;

function toScalar(house, cell) {
    return (house*cell).toString();
}

function cell(houseIndex, cellIndex) {
    return toScalar(houseIndex,cellIndex), toScalar(houseIndex,cellIndex)
}

class Grid {
    constructor(size){
        this.size = size;
        this.cells = [];
    }

    fill(json) {
        for (let scalar=0; scalar <this.size*this.size;scalar++) {
            this.cells[scalar]=(json[scalar][scalar]);
        }
    }
}

let grid = new Grid(gameJson.size)
grid.fill(gameJson)


function fillGrid(grid) {
    for (let scalar=0; scalar <grid.size*grid.size;scalar++) {
        $("#scalar"+scalar).html(grid.cells[scalar]);
    }
}

function setCell(scalar, value) {
    console.log("Setting cell " + scalar + " to " + value);
    grid.cells[scalar] = value;
    $("#scalar"+scalar).html(" "+grid.cells[scalar]);
    $("#scalar"+scalar).off("click");

}


$( document ).ready(function() {
    console.log( "Document is ready, filling grid" );
    fillGrid(grid);
});