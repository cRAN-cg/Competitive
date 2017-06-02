#!/usr/bin/env python3


def main() :
	f = open('test3.txt', 'rU')
	text = f.read()
	a0 , a1, a2, b0, b1, b2 = map(int, text.split())
	result = [ (1 if a0>b0 else 0) + (1 if a1>b1 else 0) + (1 if a2>b2 else 0), (1 if a0<b0 else 0) + (1 if a1<b1 else 0) + (1 if a2<b2 else 0 )]
	print(" ".join(map(str, result)))

#Standard boilerplate code to call the main() function.
if __name__ == '__main__':
	main()