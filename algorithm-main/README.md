## 배열(Array)과 연결 리스트(Linked List)
### 1. 배열(Array)
* 배열은 같은 타입의 원소들을 효율적으로 관리할 수 있는 자료 구조이다.
* 배열은 하나의 변수 이름으로 동일한 타입의 데이터를 그룹화하여 관리할 수 있다.
* 배열의 요소를 일렬로 나열하고 각 요소에 인덱스를 사용하여 원하는 데이터에 접근할 수 있다.
![{1A9EDEAF-1DEF-4A33-A18A-B166F9AD62B0}](https://github.com/user-attachments/assets/8be5b200-f0e9-4e59-8745-d2b0273218b0)


### 2. 연결 리스트(Linked List)
* 배열의 약점인 삽입과 삭제 작업에 강한 자료 구조로 연결 리스트가 있다.
* 연결 리스트는 각 요소를 포인터라고 부르는 화살표에 의해 한 줄로 나열한 것이다.
![{3B26203E-225A-45FA-9E47-9DA2EA14D9E0}](https://github.com/user-attachments/assets/684635b7-c8ef-4d92-8e46-8df691892f81)

* 연결 리스트의 종류 
  * 단방향 연결 리스트는 각 노드를 연결하는 포인터가 어느 한쪽 방향이 되도록 한 것이다.
  * 양방향 연결 리스트는 각 노드를 연결하는 포인터가 양방향이 되도록 한 것이다.
 
## 스택(Stack)과 큐(Queue)
### 1. 스택(Stack)
* 스택은 자료 구조에 들어있는 요소 중에서 마지막에 삽입한 요소를 꺼낸다.
  * push는 요소를 스택에 삽입한다.
  * pop은 스택에서 마지막에 삽입한 요소를 꺼낸다.
* 마지막에 들어간 요소부터 순서대로 꺼내는 규칙을 LIFO(last-in first-out)라고 한다.
![{0C2FD96C-62CC-4BA7-AA37-5F178A185F8F}](https://github.com/user-attachments/assets/35c47878-2511-4cb0-86da-d6ff19279355)


### 2. 큐(Queue)
* 큐는 자료 구조에 들어있는 요소 중에서 가장 먼저 삽입한 요소를 꺼낸다.
  * enqueue는 요소를 큐에 삽입한다.
  * dequeue는 큐에서 가장 먼저 삽입한 요소를 꺼낸다.
* 먼저 삽입된 요소부터 순서대로 꺼내는 규칙을 FIFO(first-in first-out)라고 한다.
![{93B3F562-FDD9-401A-A3C6-ADE2346FE926}](https://github.com/user-attachments/assets/638fd85c-168e-4a3b-8009-deaa5491a193)


## 해시 테이블(Hash Table)
### 1. 해시 테이블(Hash Table)
* 해시 테이블(Hash Table)은 효율적인 데이터 저장과 검색을 위해 사용하는 자료 구조이다.
![{15DC6A42-3A1A-45B3-B7D0-70C1BCAC369E}](https://github.com/user-attachments/assets/656324f6-bda5-4f2d-8bfb-cec7c7fc44b5)
* 해시 테이블은 키-값 쌍을 저장하며, 해시 함수를 사용하여 키를 배열의 인덱스에 매핑합니다. 
  * 최종적으로 저장하고자 하는 정보는 값이다.
  * 값을 검색하기 위해 활용하는 정보가 키이다
  * 해시 함수는 키를 입력으로 받아 배열의 인덱스를 출력하는 함수이다.

## 정렬과 탐색
### 1. 정렬(Sort)
* 정렬(Sort)은 특정 순서에 따라 주어진 데이터를 나열한 것을 말한다.
#### 1.1. 삽입 정렬(Insertion Sort)
* 삽입 정렬은(Insertion Sort)은 데이터의 전체 영역에서 정렬된 영역과 정렬되지 않은 영역으로 나누고 정렬되지 않은 영역의 값을 정렬된 영역의 적절한 위치로 놓으며 정렬한다.
![{291F3D5E-3CBE-42B1-906A-3BDE2C5645FC}](https://github.com/user-attachments/assets/f3438b56-2b15-483e-848e-504f92ffc4d6)

#### 1.2. 버블 정렬(Bubble Sort)
* 버블 정렬(Bubble Sort)은 인접한 두 개의 원소를 검사하여 정렬하는 방법으로 뒤에서부터 정렬되는 것이 특징이다.
![{7CE985AE-414F-4D67-A289-8D2473DE05D4}](https://github.com/user-attachments/assets/52ac8a6b-3d37-462d-889d-cffbf6b89d1e)

#### 1.3. 병합 정렬(Merge Sort)
* 병합 정렬(Merge Sort)은 정렬되지 않은 영역을 쪼개서 각각의 영역을 정렬하고 이를 합치며 정렬한다.
![{ABE64C30-544A-4C42-B0D3-2B219C921990}](https://github.com/user-attachments/assets/c1d34091-9125-4783-ad6f-8c204de9da9d)

#### 1.4. 퀵 정렬(Quick Sort)
* 퀵 정렬도 병합 정렬과 마찬가지로 배열을 분할해서 각각 재귀적으로 풀어 합치는 분할 정복법을 따르는 알고리즘이다.
![{07DCA90E-3634-46EE-BA33-0D3F11838272}](https://github.com/user-attachments/assets/4fd2aeb3-434e-4170-9b9a-4d15e62899f9)

### 2. 탐색(Search)
* 탐색(Search)은 데이터 구조에서 원하는 데이터를 찾기 위한 방법을 말한다.
#### 2.1. 선형 탐색(Linear Search)
* 선형 탐색법은 요소를 하나하나 순서대로 비교하면서 탐색하는 방법이다.
![{17A2DE4D-13A7-4642-AB45-25595A8AF1D5}](https://github.com/user-attachments/assets/c1471b7f-ac10-40c2-897b-1522e37ad7cc)

#### 2.2. 이진 탐색(Binary Search)
* 이진 탐색은 정렬된 배열에서 배열을 반으로 나누어 중간값과 비교하고, 검색 범위를 절반으로 줄이면서 탐색하는 방법이다.
![{18483D0A-0CF2-4E15-AAD1-0670C9305149}](https://github.com/user-attachments/assets/cfc84647-c72c-451c-9b43-4c3f684404e7)

## 그래프(Graph)
### 1. 그래프(Graph)
* 그래프는 꼭짓점(Vertex)와 간선(Edge)을 이용한 비선형 데이터 구조이다.

![{9B32A0E1-3C27-4FC0-9AFF-4BDE81424FAF}](https://github.com/user-attachments/assets/c78fd1fe-7e03-4d60-aa74-8fb07285f776)

* 방향이 있는 간선을 포함하면 방향 그래프(Directed Graph)라고 한다.
* 방향이 없는 간선을 포함하면 무방향 그래프(Undirected Graph)라고 한다.
![{35EC845A-4D5E-4456-94E3-334AA5805A47}](https://github.com/user-attachments/assets/11e3ada8-a73f-4afb-bfb4-89f02569591a)

* 어떤 데이터는 흐름의 방향뿐 아니라 양도 중요할 수 있고 그런 정도를 간선에 표현할 때 이를 가중치라고 한다.
* 가중치가 있는 그래프를 가중치 그래프(Weighted Graph)라고 한다.
* 순환은 특정 꼭짓점에서 시작해 간선을 따라 다시 돌아오는 경로가 있는 것을 말한다.
* 순환이 존재하는 그래프를 순환 그래프(Cycle Graph)라고 한다.
* 순환이 존재하지 않는 그래프를 비순환 그래프(Acyclic Graph)라고 한다.
![{CFAC0993-79A3-44A7-9380-55E156DD60DF}](https://github.com/user-attachments/assets/6e9bbfda-4656-48aa-9def-954b0dfb07df)

### 2. 그래프 탐색
#### 2.1. 깊이 우선 탐색(Depth-First Search, DFS)
* 깊이 우선 탐색은 스택을 활용하여 구현한다.
* 시작 꼭짓점부터 탐색을 시작하여 간선을 따라 최대한 깊은 꼭짓점까지 이동하며 차례대로 방문하는 방식의 알고리즘이다.
#### 2.2. 너비 우선 탐색(Breadth-First Search, BFS)
* 너비 우선 탐색은 큐를 활용하여 구현한다.
* 시작 꼭짓점과 거리가 가장 가까운 꼭짓점을 우선하여 차례대로 방문하는 방식의 알고리즘이다.
![{3C96B55E-557A-48DD-8FBF-DC85C132ABD9}](https://github.com/user-attachments/assets/88e83d85-9c4f-4039-b71d-e0f01898ebf7)

## 트리(Tree)
### 1. 트리(Tree)
* 트리는 데이터를 저장하고 탐색하기에 유용한 구조를 갖고 있다.
* 트리는 나무 기둥에서 가지가 뻗어나가는 모습을 거꾸로 뒤집어 놓은 모양이다.
![{0BE086A8-0403-4697-859F-E2439C38F70C}](https://github.com/user-attachments/assets/ffea987b-1f95-429b-bf4d-31ca913bf3c4)

### 2. 이진 트리(Binary Tree)
* 이진 트리는 노드 하나가 최대 2개의 자식 노드를 갖는다.
  
![{2804ACB6-1B2E-4269-B1DF-52397539DB5F}](https://github.com/user-attachments/assets/c5c59b6e-2797-4439-8a39-3a86df13193b)
#### 2.1. 이진 트리 순회
* 순회란 어떤 데이터가 있을 때 그 데이터를 빠짐없이 방문하는 것을 의미한다.
* 전위 순회(Preorder)
  * 현재 노드를 부모 노드로 생각했을 때 부모 노드 -> 왼쪽 자식 노드 -> 오른쪽 자식 노드 순서로 방문한다.
* 중위 순회(Inorder)
  * 현재 노드를 부모 노드로 생각했을 때 왼쪽 자식 노드 -> 부모 노드 -> 오른쪽 자식 노드 순서로 방문한다.
* 후위 순회(Postorder)
  * 현재 노드를 부모 노드로 생각했을 때 왼쪽 자식 노드 -> 오른쪽 자식 노드 -> 부모 노드 순서로 방문한다.

![{1988B100-1162-45D4-89FA-0E18F38E02F5}](https://github.com/user-attachments/assets/ca982998-67ee-428a-a1cb-c3bda3375de6)

#### 2.2. 이진 탐색 트리(Binary Search Tree)
* 이진 탐색 트리는 데이터 크기를 따져 크기가 작으면 왼쪽 자식 위치에, 크거나 같으면 오른쪽 자식 위치에 배치하는 독특한 정렬 방식을 갖고 있다.

![{E4BB9354-4B0C-4E53-A982-B95C95A8E577}](https://github.com/user-attachments/assets/a599f2be-a388-4b11-acad-ca8d01480d98)

## 그리디(Greedy)
### 1. 그리디(Greedy)
* 그리디는 탐욕스러운 또는 욕심이 많은이라는 뜻이다.
* 그리디는 문제를 해결하는 데 있어 각 단계에서 가장 최적이라고 생각되는 선택을 하는 알고리즘이다.
* 그리디로 문제를 해결하는 접근 방식은 전체적으로 최적의 해결책을 보장하지는 않지만, 많은 경우에 매우 좋은 근사해를 제공하거나, 특정 문제에서는 최적의 해결책을 제공할 수 있다.
### 2. 그리디 알고리즘의 장단점
* 간단하고 구현이 용이하다.
* 특정 문제에서는 최적의 해결책을 보장한다.
* 일부 문제에서는 최적의 해결책을 보장하지 못한다.
## 동적 계획법
### 1. 동적 계획법(Dynamic Programming)
* 복잡한 문제를 작은 하위 문제로 나누어 해결하는 알고리즘 기법이다.
* 전체 문제를 한 번에 해결하는 것이 아니라 작은 부분 문제들을 해결하고, 이것들을 활용하여 전체 문제를 해결하는 방법이다.
### 2. 메모제이션(Memoization)
* 동적 계획법(Dynamic Programming)의 한 기법으로, 재귀 호출을 통해 계산되는 함수의 결과를 저장해 두고, 동일한 계산이 다시 필요할 때 저장된 값을 재사용하여 중복 계산을 피하는 방법이다.
* 메모이제이션의 장점과 단점
  * 중복된 계산을 피함으로써 시간 복잡도를 크게 줄일 수 있다.   
  * 기존의 재귀적 알고리즘에 약간의 코드만 추가하면 된다.
  * 저장 공간이 필요하므로, 메모리 사용량이 늘어난다.
  * 문제에 적용할 수 있는 것은 아니며, 부분 문제가 반복적으로 계산되는 경우에만 효과적이다.

#### 참고 문헌 : 박경록, [코딩 테스트 합격자 되기]
