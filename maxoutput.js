// creating a function that split the sentence input then outputs the longest word in the sentence
let sentence1 = prompt("Say your thoughts: ")
let greaterThan;
let list1=[];
let result;
let lenght;
let concatenate;
let access;
let longertString;

function wordSplit(){//splits the word input
    let divide = sentence1.split(" ");
    return divide;
}


function measureString(){//not yet done but what i did is access the characters inside the splitted arrays of words then push all of it inside list1 then return for processing
    for(let i = 0; i < wordSplit().length ; i++){
     greaterThan = wordSplit()[i]
     result = greaterThan.length
     list1.push(result) 

    }
    return list1;
}

function lastResort(maximum){
     maximum = Math.max(...measureString());
     return maximum
}

function findLongestString(arr) {
  return arr.reduce((longest, current) => (current.length > longest.length ? current : longest), '');
}
//measureString();


console.log("The longest word have a number of, " + lastResort() + " "  + "and it is "+  findLongestString(wordSplit()) );
