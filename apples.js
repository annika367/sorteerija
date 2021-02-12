let apples = [ 29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65];

let sm = [];
let med = [];
let bg = [];

function lisaKasti(apples) {
    for (let i=0; i < apples.length; i++) {
        apple = apples[i];
        if (apple <= 50) {
            sm.push(apple);
        } else if (apple >= 71) {
            bg.push(apple);
        } else {
            med.push(apple);
        }
}
}

lisaKasti(apples);

console.log(sm);
console.log(med);
console.log(bg);