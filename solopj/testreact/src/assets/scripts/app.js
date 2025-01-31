// import { apiKey } from "./util.js";
// import apiKey from "./util.js"
// import util from "./util.js";

// import { apiKey, abc } from "./util.js";
// import { apiKey, abc as content} from "./util.js"; //별칭 사용하는 방법
// import * as util from "./util.js"; //여러가지를 한 번에 묶어서 하는 방법

// console.log(apiKey);
// console.log(util.apiKey);
// console.log(content);

// const userMessage = "Hello World!" //let은 밑에 이런식으로 입력하면 값이 바뀜, const는 딱 고정
// userMessage = "New value"

// console.log(userMessage);
// console.log(userMessage);

/*
function createGreetUser(userName, message = "Hello!") { //매개변수에 message="hello"이런식으로 거정해버려도 오버라이드가 가능하다
    // console.log(userName);
    // console.log(message);
    return "Hi, I am " + userName + "." + message;
}

const greeting1 = createGreetUser("Max");
console.log(greeting1);
const greeting2 = createGreetUser("Manuel", "Hello, what's up");
console.log(greeting2);*/

/*
export default (userName, message) => {
    console.log('Hello');
    return userName + message;
}*/

/*const user = {
    name: 'Max',
    age : 34,
    greet(){
        console.log("Hello!");
        console.log(this.age);
    }
};

console.log(user.name);
user.greet();*/

/*
class User {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }

    greet() {
        console.log("Hi!");
    }
}

const user1 = new User("Manuel", 35);
console.log(user1);
user1.greet();*/

/*
const hobbies = ["가", "나", "다"];
console.log(hobbies[0]);

hobbies.push("라"); //배열 추가하는 방법
console.log(hobbies);

const index = hobbies.findIndex((item) => {
    return item === "가";
});
// const index = hobbies.findIndex((item) => item === "가"); //위 코드를 이렇게 단순화 할 수 있다

console.log(index);

const editedHobbies = hobbies.map((item) => item + "!");
console.log(editedHobbies);

const editedHobbies2 = hobbies.map((item) => ({text: item}));
console.log(editedHobbies2);*/

/*
const [firstName, lastName] = ["감", "이무개"];

// const firstNmae = userNameDate[0];
// const lastName = userNameDate[1];
console.log(firstName);
console.log(lastName);*/

/*
const { name: userName, age } = {
    name: "Max",
    age: 34
};

console.log(userName);
console.log(age);*/

/*
const hobbies = ["Sports", "Cooking"];

for(const hobby of hobbies){
    console.log(hobby);
} //for문 쓰는 방법*/

/*
function handleTimeout1() {
    console.log("시간종료!");
}
const handleTimeout2 = () => {
    console.log("또 시간종료!");
}

setTimeout(handleTimeout1, 2000);
setTimeout(handleTimeout2, 3000);
setTimeout(() => {
    console.log("또또 시간종료!");
}, 4000);*/

