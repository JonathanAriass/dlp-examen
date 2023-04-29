
	#source "if.xana"

' Invocation to the main function
call main
halt


#line 	1

main:
	' Parameters
	' Local variables
	' value :: int (offset -2)
	enter	2

#line 	2
	' If statement
	pushi	1
	pushi	1
	eqi
	jz	label0
	' Body of the if branch

#line 	3
	' Write
	pushb	97
	outb

#line 	3
	' Write
	pushb	108
	outb

#line 	3
	' Write
	pushb	119
	outb

#line 	3
	' Write
	pushb	97
	outb

#line 	3
	' Write
	pushb	121
	outb

#line 	3
	' Write
	pushb	115
	outb

#line 	3
	' Write
	pushb	32
	outb

#line 	3
	' Write
	pushb	116
	outb

#line 	3
	' Write
	pushb	114
	outb

#line 	3
	' Write
	pushb	117
	outb

#line 	3
	' Write
	pushb	101
	outb

#line 	3
	' Write
	pushb	10
	outb
	jmp	label1
label0:
	' Body of the else branch
label1:

#line 	5
	' Write
	pushb	10
	outb

#line 	8
	' Read example
	push	bp
	pushi	-2
	addi
	ini
	storei

#line 	9
	' If statement
	pushi	1
	push	bp
	pushi	-2
	addi
	loadi
	eqi
	jz	label2
	' Body of the if branch

#line 	10
	' Write
	pushb	116
	outb

#line 	10
	' Write
	pushb	114
	outb

#line 	10
	' Write
	pushb	117
	outb

#line 	10
	' Write
	pushb	101
	outb

#line 	10
	' Write
	pushb	10
	outb
	jmp	label3
label2:
	' Body of the else branch

#line 	12
	' Write
	pushb	102
	outb

#line 	12
	' Write
	pushb	97
	outb

#line 	12
	' Write
	pushb	108
	outb

#line 	12
	' Write
	pushb	115
	outb

#line 	12
	' Write
	pushb	101
	outb

#line 	12
	' Write
	pushb	10
	outb
label3:
	ret	0, 2, 0
