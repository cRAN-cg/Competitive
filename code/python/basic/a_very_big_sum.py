#!/usr/bin/python3 env

import sys

n = int(input().strip())
arr = [int(arr_vals) for arr_vals in input().strip().split(" ")]
print(sum(arr))