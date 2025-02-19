package com.beyond.graph.practice;

public class MatrixGraph {
    // 꼭짓점의 개수
    private int numOfVertices;

    // 인접 행렬로 사용될 2차원 배열
    private int[][] matrix;

    public MatrixGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.matrix = new int[this.numOfVertices][this.numOfVertices];
    }

    public void addEdge(int src, int dest, int weight) {
        // 행이 시작 꼭짓점
        // 열이 도착 꼭짓점
        this.matrix[src][dest] = weight;

        // 그래프가 방향이 없는 경우
        // this.matrix[dest][src] = weight;
    }

    public void removeEdge(int src, int dest) {
        // 연결이 안 된 꼭짓점들은 0으로 표현
        this.matrix[src][dest] = 0; 
        
        // 그래프가 방향이 없는 경우
        // this.matrix[dest][src] = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                if (this.matrix[i][j] <= 0) {
                    continue;
                }

                sb.append(String.format("Vertex %d -> Vertex %d (weight: %d)\n",
                        i, j, this.matrix[i][j]));
            }
        }

        return sb.toString();
    }
}
