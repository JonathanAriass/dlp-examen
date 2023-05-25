
	#source "ternary.xana"

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
	pushi	1
	pushi	2
	lti
	jz	label0
	pushi	2
	jmp	label1
label0:
	pushi	3
label1:
	storei

#line 	6
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	outi
	ret	0, 2, 0
