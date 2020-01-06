### 01.이해
    array와 divisor가 따로 주어진다
    divisor로 나누어떨어지는 값들을 오름차순하여 return
    5 9 7 10 %5 return 0 인 값인 5와 10
    나누어 떨어지지 않으면 -1

### 02.계획
    return값을 담을 배열을 생성
    for문으로 각 배열의 원소를 가져온 후에 divisor vale로 %했을 경우 값이 0 이면 return
    %값이 0이 없는 경우 -1