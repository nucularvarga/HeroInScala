/*
//test
$(document).ready(function() {
    //  alert('working');
        loadJson();
    connectWebSocket();
});
*/

//import Vue from 'vue';

{
    const sudokuHighlightButtons = [{text: "None", link: "/highlight/0"}];

    sudokuHighlightButtons.push({text: "moveUp", link: "/buttonUp"});
    sudokuHighlightButtons.push({text: "moveDown", link: "/buttonDown"});
    sudokuHighlightButtons.push({text: "moveLeft", link: "/buttonLeft"});
    sudokuHighlightButtons.push({text: "moveRight", link: "/buttonLeft"});
    sudokuHighlightButtons.push({text: "LookUp", link: "/highlight/"});
    sudokuHighlightButtons.push({text: "LookDown", link: "/highlight/"});
    sudokuHighlightButtons.push({text: "LookLeft", link: "/highlight/"});
    sudokuHighlightButtons.push({text: "LookRight", link: "/highlight/"});
}

function toScalar(house, cell) {
    return (house*cell).toString();
}

function cell(houseIndex, cellIndex) {
    return toScalar(houseIndex,cellIndex), toScalar(houseIndex,cellIndex)
}
/*
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
*/

{
    class Cell {

        constructor() {
            this.col = 0;
            this.row = 0;
            this.cell = "";
        }

        set(json) {
            this.col = json.col;
            this.row = json.row;
            this.cell = json.cell;
        }
    }
}

{
    class Grid {
        constructor(size) {
            this.size = size;
            this.cells = [];
        }

        fill(json, size) {
            for (let scalar = 0; scalar < size * size; scalar++) {
                this.cells[scalar] = json.field.cells[scalar].cell;
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
                // initbutton(grid);
                console.log(grid);
            }
        });
    }
}






function connectWebSocket() {
    let websocket = new WebSocket("ws://localhost:9000/websocket");
    websocket.setTimeout;

    websocket.onopen = function(event) {
        console.log("Connected to Websocket");

        const heroesGame = new Vue({
            el:'#heroes-game'
        });
    };

    websocket.onclose = function () {
        console.log('Connection with Websocket Closed!');
    };

    websocket.onerror = function (error) {
        console.log('Error in Websocket Occured: ' + error);
    };

    websocket.onmessage = function (e) {
        if (typeof e.data === "string") {

            console.log("JSON RECIEVED!");
            console.log(e.data);
/*            let json = JSON.parse(e.data);
            let grid = new Grid(json.field.x);
            grid.fill(json, json.field.x);
            updateFieldButton(9, grid);
            //initbutton(grid);*/


        }

    };
}



function cells(){
    let heroesCell = [];
    for(let row = 0; row < 9; row ++){
        for(let col = 0; col < 9; col ++){
            heroesCell.push({cell:cell(row,col)});
        }
    }

    return heroesCell;
}

$(document).ready(function ()
{

    loadJson();
    connectWebSocket();



});

/*Vue.component('heroes-button-bar', {
    template:`
        <div class="buttonbarcontainer">
            <label>
                Highlight
            </label>
            <div  class=" btn-group" >
                <a v-for="item in menuItems" v-bind:href="item.link" class="btn btn-primary"> {{item.text}} </a>
            </div>
        </div>
    `,
    data: function () {
        return {
            menuItems: sudokuHighlightButtons
        }
    }

});*/

Vue.component('heroes-field', {
    template:`
     <div class = "playField">
        <div class="container-fluid" id = "gr">
                <div v-for="col in grid">
                    <div class="row">
                         <div v-for="cell in col" v-bind:id= toScalar(cell)>
                             {{cell}},{{col.cell}}
                             <img src= "./assets/images/berg.jpg">
                             </div>
                         </div>
                     </div>    
                </div>
        </div>
      </div> 
    `,
    data: function () {
        return {
            grid: cells()
        }
    },

    methods: {
        toScalar(house) {
            return (house);
        },

        getCellType(col, row, grid) {
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
        },
    },

});



