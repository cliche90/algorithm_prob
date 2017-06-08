# Algorithm Problem Solve

## # 동적 프로그래밍(Dynamic Programming, DP)

### 01. Assembly Line Scheduling

- [Problem Link](http://www.koitp.org/problem/ASSEMBLY_LINE_SCHEDULING/read/)
- [Source Link](https://github.com/cliche90/algorithm_prob/blob/master/AssemblyLineScheduling.java)

### 02. 막대기 자르기

- [Problem Link](http://www.koitp.org/problem/ROD_CUTTING/read/)
- [Source Link](https://github.com/cliche90/algorithm_prob/blob/master/RodCutting.java)
- 점화식

    D(i) = 길이가 i 인 막대기를 잘라 만들 수 있는 최대 가치

    D(i) = max (D(i-j) + P(j)) → P(j)는 길이 j를 가지는 막대의 가치

### 03. LCS(Longest Common Sequence, 최장 공통부분 수열)

