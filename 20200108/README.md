## 01. 이해
    2016년 1월 1일은 금요일
    2016년 a월 b일은 무슨 요일?
    1 금
    2 토
    3 일
    4 월
    5 화
    6 수
    7 목
    8 금
    
    1월 31
    2월 29
    3월 31
    4월 30
    5월 31
    6월 30
    7월 31
    8월 31
    9월 30
    10월 31
    11월 30
    12월 31
    
    5월 24일 -> 31+28+31+30 +24 % 7 = 4 화요일
    나머지가 0일 때 금요일

## 02. 계획
    월에 해당하는 일 수 배열을 만든다
    filter로 index에 해당하는 값 만큼 가져온 후 fold 로 각 값을 다 더해준다
    거기에 일 수를 더해주고 %7을 했을 때 나머지 0~6일 때 각각 금요일부터 목요일까지 순서대로 적용시켜준다
    

## 03. 실행

## 04. 회고
    7의 배수인 날들은 나머지가 0이 되기 때문에 따로 처리해야한다. 
    > 이번에는 index-1 이런식으로 처리했는데 배열의 순서를 조절하는 것도 방법이었을 듯
    
    월 일수를 넣어둔 배열의 가독성이 아쉬움 when이나 switch로 월 별로 정리하면 더 보기 편할 듯