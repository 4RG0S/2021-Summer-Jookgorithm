짝지어 제거하기.js
function solution(s)
{
    let arr = [];
    
    for(var i = 0; i < s.length; i++) {
        arr.push(s[i]);
        //stack top = length-1
        if(arr[arr.length-1] === arr[arr.length-2]) {
            //연속된 두 개가 같으면
            arr.pop()
            arr.pop()
        }
    }

    //join은 문자열을 모두 합치는 것이다.
    return arr.join("")==='' ? 1 : 0;
}