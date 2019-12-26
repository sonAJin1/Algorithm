## K번째 수 

#### 01.문제 설명

배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
3. 2에서 나온 배열의 3번째 숫자는 5입니다.

배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

##### 제한사항

- array의 길이는 1 이상 100 이하입니다.
- array의 각 원소는 1 이상 100 이하입니다.
- commands의 길이는 1 이상 50 이하입니다.
- commands의 각 원소는 길이가 3입니다.

##### 입출력 예

| array                 | commands                          | return    |
| --------------------- | --------------------------------- | --------- |
| [1, 5, 2, 6, 3, 7, 4] | [[2, 5, 3], [4, 4, 1], [1, 7, 3]] | [5, 6, 3] |

##### 입출력 예 설명

[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.

[출처](https://neerc.ifmo.ru/subregions/northern.html)



----

#### 이해

1. 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬

2. [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3

   5 2 6 3 (i=2, j=5)

   2 3 5 6 (sort)

   k = 5

3. array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수

4. commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return

   

----

#### 02.계획

1. k값을 받을 배열 A를 생성한다
2. Commands 의 개수만큼 반복
3. (반복문 안에서 실행) 배열을 받아온 후 i와 j를 기준으로 잘라 sorting 후 k를 return한다
4. k값을 배열 A에 넣는다
---

#### 03.실행


----

#### 04.반성
- list.map 을 능숙하게 쓸 수 있을 정도로 연습
- 변수 형의 차이에 대해서 정리 해 볼 것 (Array< Int >와 IntArray의 차이) 
- subList가 list에서는 적용이 되는데 IntArray에서는 적용이 안됨 subList 특성 정리할 것
- array.sliceArray 정리할 것
- Destructuring 고려
[https://kotlinlang.org/docs/reference/multi-declarations.html](https://kotlinlang.org/docs/reference/multi-declarations.html)
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE4OTc3NDg0MTcsLTEwODEwMDk1MTksLT
E0MjkwNzQwOTFdfQ==
-->