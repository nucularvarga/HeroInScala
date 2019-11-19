
//test

$(document).ready(function() {
  //  alert('working');
    loadJson();
});

function toScalar(house, cell) {
    return (house*cell).toString();
}

function cell(houseIndex, cellIndex) {
    return toScalar(houseIndex,cellIndex), toScalar(houseIndex,cellIndex)
}

/*
function initbutton() {
    $("#buttonUp").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonUp"
    })});
    $("#buttonDown").click(function() {window.location ="http://localhost:9000/buttonDown"});
    $("#buttonLeft").click(function() {window.location ="http://localhost:9000/buttonLeft"});
    $("#buttonRight").click(function() {window.location ="http://localhost:9000/buttonRight"});
    $("#LookUp").click(function() {window.location ="http://localhost:9000/lookUp"});
    $("#LookDown").click(function() {window.location ="http://localhost:9000/lookDown"});
    $("#LookRight").click(function() {window.location ="http://localhost:9000/lookRight"});
    $("#LookLeft").click(function() {window.location ="http://localhost:9000/lookLeft"});
}
*/

function updateField(size, grid) {
    let html ="";
    for (let col=0; col < size; col++) {
        html = html + "<div class=\"row\">";
        for (let row=0; row < size; row++) {
            html = html + "<img  class=img2 src=/assets/" + getCellType(col, row, grid) + ">"
        }
        html = html + "</div>"
    }
    $("#gr").html(html);
}

function getCellType(col, row, grid) {
    let type = grid.cells[col*row];
    switch (type) {
        case "X": return "images/grass.jpg";
        case "H": return "images/hero.png";
        case " ": return "images/grass.jpg";
        default: return   "images/drake.jpg";
    }
}


function initbutton(grid) {
    $("#buttonUp").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonUp"
    })});
    $("#buttonDown").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonDown"
    })});
    $("#buttonLeft").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonLeft"
    })});
    $("#buttonRight").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonRight"
    })});
    $("#LookUp").click(function() {$.ajax( {
        method: "GET",
        url: "/lookUp",
        dataType: "json",
        success: function (result) {
            grid.fill(result);
            updateField(9, grid)
        }
    })});
    $("#LookDown").click(function() {$.ajax( {
        method: "GET",
        url: "/lookDown",
        dataType: "json",
        success: function (result) {
            grid.fill(result);
            updateField(9, grid)
        }
    })});
    $("#LookRight").click(function() {$.ajax( {
        method: "GET",
        url: "/lookRight",
        dataType: "json",
        success: function (result) {
            grid.fill(result);
            updateField(9, grid)
        }
    })});
    $("#LookLeft").click(function() {$.ajax( {
        method: "GET",
        url: "/lookLeft",
        dataType: "json",
        success: function (result) {
            grid.fill(result);
            updateField(9, grid)
        }
    })});
}

class Cell{

    constructor(){
        this.col = 0;
        this.row = 0;
        this.cell = "";
    }

    set(json){
        this.col = json.col;
        this.row = json.row;
        this.cell = json.cell;
    }
}

class Grid {
    constructor(size){
        this.size = size;
        this.cells = [];
    }

    fill(json) {
        for (let scalar=0; scalar <9*9;scalar++) {
            this.cells[scalar]=json.field.cells[scalar].cell;
        }

    }
}

function loadJson() {
    $.ajax({
        method: "GET",
        url: "/json",
        dataType: "json",

        success: function (result) {
            let grid = new Grid(result.field.x);
            grid.fill(result);
           // updateGrid(grid);
            initbutton(grid);
        }
    });
}

/*function moveUpJs() {
    return
}*/
/* let moveUp = document.getElementById("MoveUp");
moveUp.addEventListener("click", moveUpJs,true);*/

/*$("#buttonUp").click(
    function() {
        window.location = "http://localhost:9000/buttonUp";
    }
);*/

/*

/!**
 * @return {string}
 *!/
function moveDownJs() {
    alert("tolle knolle");
    return window.location = "http://localhost:9000/buttonDown";
}
let moveDown = document.getElementById("MoveDown");
moveDown.addEventListener("click", moveDownJs,true);

/!**
 * @return {string}
 *!/
function moveRightJs() {
    return window.location ="http://localhost:9000/buttonLeft";
}
let moveRight = document.getElementById("MoveLeft");
moveRight.addEventListener("click", moveRightJs,true);

/!**
 * @return {string}
 *!/
function moveLeftJs() {
    return window.location ="http://localhost:9000/buttonRight";
}
let moveLeft = document.getElementById("MoveRight");
moveLeft.addEventListener("click", moveLeftJs, true);

/!**
 * @return {string}
 *!/
function lookUpJs() {
    return window.location ="http://localhost:9000/lookUp";
}
let lookUp = document.getElementById("lookUp");
lookUp.addEventListener("click", lookUpJs, true);

/!**
 * @return {string}
 *!/
function lookDownJs() {
    return window.location ="http://localhost:9000/lookDown";
}
let lookDown = document.getElementById("lookDown");
lookDown.addEventListener("click", lookUpJs, true);
/!**
 * @return {string}
 *!/
function lookRightJs() {
    return window.location ="http://localhost:9000/lookRight";
}
let lookRight = document.getElementById("lookRight");
lookRight.addEventListener("click", lookRightJs, true);
/!**
 * @return {string}
 *!/
function lookLeftJs() {
    return window.location ="http://localhost:9000/lookLeft";
}
let lookLeft = document.getElementById("lookLeft");
lookLeft.addEventListener("click", lookLeftJs, true);
*/


/*
let size = 9;

function toScalar(house, cell) {
    return (house*cell).toString();
}

function cell(houseIndex, cellIndex) {
    return toScalar(houseIndex,cellIndex), toScalar(houseIndex,cellIndex)
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
*/


