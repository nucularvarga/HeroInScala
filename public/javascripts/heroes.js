
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

function updateField(size, grid) {
    let html ="";
    for (let row=0; row < size; row++) {
        html = html + "<div class=\"row\">";
        for (let col=0; col < size; col++) {
            html = html + "<img  class=img2 src=/assets/" + getCellType(col, row, grid) + ">"
        }
        html = html + "</div>"
    }
    $("#gr").html(html);
}

function getCellType(col, row, grid) {
    let type = grid.cells[row*9 + col];
    switch (type) {
        case "X": return "images/berg.jpg";
        case "1": return "images/hero.png";
        case "2": return "images/hero.png";
        case " ": return "images/grass.jpg";
        case ")": return "images/gold.jpg";
        case "F": return "images/drake.jpg";
        default: return   "images/lich.jpg";
    }
}

function getCellTypeB(col, row, grid) {
    let type = grid.cells[row*20 + col];
    switch (type) {
        case "X": return "images/berg.jpg";
        case "1": return "images/hero.png";
        case "2": return "images/hero.png";
        case " ": return "images/grass.jpg";
        case ")": return "images/gold.jpg";
        case "F": return "images/drake.jpg";
        default: return   "images/lich.jpg";
    }
}

function updateFieldButton(size, grid) {
    let html ="";
    for (let row=0; row < size; row++) {
        html = html + "<div class=\"row\">";
        for (let col=0; col < size; col++) {
            html = html + "<img  class=img2 src=/assets/" + getCellTypeB(col, row, grid) + ">"
        }
        html = html + "</div>"
    }
    $("#gr").html(html);
}


function initbutton(grid) {
    $("#buttonUp").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonUp",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
            updateFieldButton(9, grid)
        }
    })});
    $("#buttonDown").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonDown",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
            updateFieldButton(9, grid)
        }
    })});
    $("#buttonLeft").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonLeft",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
            updateFieldButton(9, grid)
        }
    })});
    $("#buttonRight").click(function() {$.ajax( {
        method: "GET",
        url: "/buttonRight",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
            updateFieldButton(9, grid)
        }
    })});
    $("#LookUp").click(function() {$.ajax( {
        method: "GET",
        url: "/lookUp",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
            updateField(9, grid)
          //  for(let x=0; x<81; ++x)
            //    alert(x+ "= " + grid.cells[x])
        }
    })});
    $("#LookDown").click(function() {$.ajax( {
        method: "GET",
        url: "/lookDown",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
            updateField(9, grid)
        }
    })});
    $("#LookRight").click(function() {$.ajax( {
        method: "GET",
        url: "/lookRight",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
            updateField(9, grid)
        }
    })});
    $("#LookLeft").click(function() {$.ajax( {
        method: "GET",
        url: "/lookLeft",
        dataType: "json",
        success: function (result) {
            grid.fill(result, result.field.x);
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

    fill(json, size) {
        for (let scalar=0; scalar <size*size;scalar++) {
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
            grid.fill(result, result.field.x);
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


