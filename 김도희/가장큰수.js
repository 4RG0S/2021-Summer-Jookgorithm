function solution(numbers) {
    var answer = '';
    /*
    * solution
    * 1. first num > big
    * 2. first num == then next num compare
    */
    //console.log(String(numbers[1]).charAt(0))
    
    for(var i = 0; i < numbers.length; i++) {
            for(var j = i+1; j < numbers.length; j++) {
                var c1 = Number(String(numbers[i]).charAt(0));
                var c2 = Number(String(numbers[j]).charAt(0));
                if(c1 < c2) {
                    //if big... then swap
                    var temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
                if(c1 == c2) {
                    //if same...then next compare
                    var n1_len = String(numbers[i]).length;
                    var n2_len = String(numbers[j]).length;
                    //하나라도 길이가 1이면 검사 
                    if(n2_len == 1 && n1_len != n2_len) {
                        var c1 = Number(String(numbers[i]).charAt(1)); //두 번째 자리 비교
                        if(c1 === 0) {
                             //두 번째 뒷자리 수가 0일 경우 > 길이가 1인 것이 먼저 배치
                            var temp = numbers[j];
                            numbers[j] = numbers[i];
                            numbers[i] = temp;
                        }
                    } else if(n1_len == 1 && n1_len != n2_len) {
                        var c2 = Number(String(numbers[j]).charAt(1)); //두 번째 자리 비교
                        if(c2 != 0) {
                             //두 번째 뒷자리 수가 0일 경우 > 길이가 1인 것이 먼저 배치
                            var temp = numbers[j];
                            numbers[j] = numbers[i];
                            numbers[i] = temp;
                        }
                    } else {
                        var index = 0;
                        //범위를 구하기 위해서 더 작은 수를 index에 mapping
                        if (n1_len > n2_len){
                            index = n2_len;
                        } else {
                            index = n1_len;
                        }
                        for(var i = 0; i < index; i++) {
                            var c1 = Number(String(numbers[i]).charAt(i));
                            var c2 = Number(String(numbers[j]).charAt(i));
                            //돌면서 더 큰 수를 찾을 때까지
                            //큰 수를 찾으면 자리 바꿔주기
                            if(c1 < c2) {
                                var temp = numbers[j];
                                numbers[j] = numbers[i];
                                numbers[i] = temp;
                            }
                        }
                    }
                }
            }
    }
    for (var i = 0; i < numbers.length; i++) {
        answer += numbers[i];
    }
    
    return answer;
}

/* 다른 답안 1 (참고)*/

function solution(numbers) {
    //숫자를 문자로 변환
    var answer = numbers.map(c => c + '').sort((a,b) => (b+a) - (a*b)).join('');
    //너무 크니까 문자로 변환해서 출력
    //모두 0일 경우에는 그냥 0만 출력
    return answer[0] === '0'? '0' : answer;
}