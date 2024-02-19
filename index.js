let inputValue1, inputValue2, op;


document.getElementById("myButton1").onclick = function () {
    
    inputValue1 = document.getElementById("myInput1").value;
   
    
}

document.getElementById("myButton2").onclick = function() {
    inputValue2 = document.getElementById("myInput2").value;
    

}

document.getElementById("operand").onclick = function(){
    op = document.getElementById("operation").value;
    
}

inputValue1 = parseInt(inputValue1);
inputValue2 = parseInt(inputValue2);
op = Number(op)

document.getElementById("equal").onclick = function(inputValue1, inputValue2){
    if(op == 3){
        console.log(inputValue1 + inputValue2);
    } else if(op == 4) {
        console.log(inputValue1-inputValue2);
    } else if(op == 1){
        console.log(inputValue1 * inputValue2);
    } else if (op == 2){
        console.log(inputValue1 / inputValue2);
    } else {
        console.log("Try again")
    }
}
