var nums = [1, 2, 3, 4, 5, 6];

let sum = 0;

var arraySumado = [];
function suma(nums) {
  alert("el array es: " + nums);

  for (let i = 0; i < nums.length; i++) {
    sum += nums[i];
    arraySumado.push(sum);
  }
  alert("el array sumado es: " + arraySumado[1]);
  return arraySumado;
}
