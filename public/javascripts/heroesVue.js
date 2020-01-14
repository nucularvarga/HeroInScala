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
        default: return   "images/gras.jpg";
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
        default: return   "images/gras.jpg";
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
            //   alert(x+ "= " + grid.cells[x])
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

    let globalJSON;


    function loadJson() {
        $.ajax({
            method: "GET",
            url: "/json",
            dataType: "json",

            success: function (result) {
                let grid = new Grid(result.field.x);
                grid.fill(result, result.field.x);
                //updateGrid(grid);
                initbutton(grid);
                console.log("json ajax" + grid.cells);
                globalJSON = grid;
            }
        });
    }


    function connectWebSocket() {
        let websocket = new WebSocket("ws://localhost:9000/websocket");
        websocket.setTimeout;

        websocket.onopen = function (event) {
            console.log("Connected to Websocket");
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
                console.log("json websiocket" + e.data);

                        let json = JSON.parse(e.data);
                            let grid = new Grid(json.field.x);
                            grid.fill(json, json.field.x);
                            //updateField(9,grid);
                            updateFieldButton(9, grid);
                            //initbutton(grid);
            }

        };
    }


    function cells() {
        let heroesCell = new Array(9);
        for (let row = 0; row < 9; row++) {
            heroesCell[row] = [];
            for (let col = 0; col < 9; col++) {
                heroesCell[row][col] = ({cell: (row, col)});
            }
        }
        console.log(heroesCell);
        return heroesCell;
    }

    $(document).ready(function () {
        loadJson();
        connectWebSocket();

        let app = new Vue({
            el: '#heroes-game'
        });
        app.testcounter = 2;
        //console.log("testcounter " + app.testcounter);
        app.handleClick(app.testcounter);
    });

    Vue.component('heroes-field', {
        template: `
        <div class = "b-container">
            <div class="b-col-sm-12 b-ol-md-auto b-col-lg-auto b-col-xl-8">
                     <div class="container-fluid" id = "gr">
                        <div v-for="n,col in grid">
                            <div class="row">
                                 <div v-for="cell in n">
                                     <img :src = "getCellType(col, cell.cell)">
                                  </div>
                             </div>
                          </div>    
                    </div>
            </div>
            <div class="col-sm-0 col-md-auto col-lg-auto col-xl-4 sidenav">
                            <div class="row flex">
                                <div class="col-sm-6 ">
                                    <hr>
                                    <ul class="flex-column">
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="buttonUp" >MoveUp</button>
                                        </li>
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="buttonDown">MoveDown</button>
                                        </li>
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="buttonLeft">MoveLeft</button>
                                        </li>
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="buttonRight">MoveRight</button>
                                        </li>
                                    </ul>
                                </div>
                                <div class="col-sm-6 ">
                                    <hr>
                                    <ul class="flex-column">
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="LookUp" >LookUp</button></a>
                                        </li>
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="LookDown" >LookDown</button></a>
                                        </li>
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="LookLeft" >LookLeft</button></a>
                                        </li>
                                        <li class ="classWithPad">
                                            <button class="btn btn-secondary btn-block responsive-width" type="button" id="LookRight" >LookRight</button></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                  </div>  
            </div>
      </div> 
    `,
        data:
            function() {
                return {
                    grid: cells(),
                    counter: 0
                }
            }
        ,

        methods: {
            toScalar: function(house) {
                return (house);
            },

            getCellType: function(col, row) {


                switch (row) {
                    case "X":
                        return "./assets/images/berg.jpg";
                    case "1":
                        return "./assets/images/hero.png";
                    case "2":
                        return "./assets/images/hero.png";
                    case " ":
                        return "./assets/images/grass.jpg";
                    case ")":
                        return "./assets/images/gold.jpg";
                    case "F":
                        return "./assets/images/drake.jpg";
                    default:
                        return "./assets/images/lich.jpg";
                }
            },

            handleClick: function(globalCounter){
                let grida = new Grid(9);
                initbutton(grida);
                alert();
                return globalCounter;
            },
        },
    });
}



