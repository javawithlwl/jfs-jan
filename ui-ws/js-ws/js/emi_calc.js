
function calculateEmi() {
    let principal = document.querySelector('#idLoanAmount').value;
    let rate = document.querySelector('#idInterestRate').value;
    let time = document.querySelector('#idLoanTenure').value;
    rate = rate / 12 / 100;
    let emi = principal * rate * Math.pow(1 + rate, time) / (Math.pow(1 + rate, time) - 1);
    let totalAmount = emi * time;
    let totalInterest = totalAmount - principal;
    let str = `<h5>EMI Details</h5>
              <p>EMI: ${Math.round(emi)}</p>
              <p>Total Amount: ${Math.round(totalAmount)}</p>
              <p>Total Interest: ${Math.round(totalInterest)}</p>`;
    let idShowEmaiDetails = document.getElementById('idShowEmaiDetails');
    idShowEmaiDetails.innerHTML = str;
}
function add(num1, num2) {
    return num1 + num2;
}
function subtract(num1, num2) {
    return num1 - num2;
}
function multiply(num1, num2) {
    return num1 * num2;
}
function divide(num1, num2) {
    return num1 / num2;
}
function calculate(operator) {
    let num1 = parseInt(document.querySelector('#idNum1').value);
    let num2 = parseInt(document.querySelector('#idNum2').value);
    let result;
    if (operator === '+') {
        result = `${num1} + ${num2} = ${add(num1, num2)}`;
    } else if (operator === '-') {
        result = `${num1} - ${num2} = ${subtract(num1, num2)}`
    } else if (operator === '*') {
        result = `${num1} * ${num2} = ${multiply(num1, num2)}`
    } else if (operator === '/') {
        result = `${num1} / ${num2} = ${divide(num1, num2)}`
    }
    let idShowResult = document.getElementById('idResult');
    idShowResult.value = result;
}

factorial = (num) =>{
    if(num === 0){
        return 1;
    }
    return num * factorial(num - 1);
}
sumOfDigits = (num)=>{
    if(num === 0){
        return 0;
    }
    return num % 10 + sumOfDigits(parseInt(num / 10));
}
reverseOfNumber = (num)=>{
    if(num === 0){
        return 0;
    }
    return num % 10 * Math.pow(10, num.toString().length - 1) + reverseOfNumber(parseInt(num / 10));
}
function showResult(f,num){
    return f(num);
}

let res = showResult((num) => num % 2 === 0, 12344);
console.log(res);