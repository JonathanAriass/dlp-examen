
	#source "MasIgual.xana"

' Invocation to the main function
call main
halt


#line 	1

main:
	' Parameters
	' Local variables
	' num :: int (offset -2)
	enter	2

#line 	4
	push	bp
	pushi	-2
	addi
	pushi	5
	storei

#line 	6
	' MasIgual
	push	bp
	pushi	-2
	addi
	pushi	4
	push	bp
	pushi	-2
	addi
	loadi
	addi
	storei

#line 	8
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	outi
	ret	0, 2, 0
