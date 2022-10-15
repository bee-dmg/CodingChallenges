let input = 'Banana Boat.';
input = input.replace(/[^a-zA-Z0-9 ]/g, '');
input = input.replace(/ /g, '');
let map = new Map();

for (let i = 0; i < input.length; i++) {
  for (let j = i; j < input.length; j++) {
    const char = input.slice(i, j);
    if (map.has(char)) {
      let x = map.get(char);
      map.set(char, x + 1);
    } else {
      map.set(char, 1);
    }
  }
}
var mapAsc = new Map([...map.entries()].sort());
for (let [key, value] of mapAsc) {
  console.log(key + ':' + value);
}
