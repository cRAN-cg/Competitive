#!/usr/env/bin python3

import sys

n = int(input().strip())
a= []
sum_primary = 0
sum_secondary = 0
for a_i in range(n):
	ar_j = [int(a_temp) for a_temp in input().strip().split()]
	a.append(ar_j)
for i in a:
	sum_primary += a[i][i]
	sum_secondary += a[i][n -i -1]

print(abs(sum_secondary - sum_primary))