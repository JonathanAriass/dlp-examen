
	#source "switch.xana"

' Invocation to the main function
call main
halt


#line 	1

main:
	' Parameters
	' Local variables
	' num :: int (offset -2)
	enter	2

#line 	3
	push	bp
	pushi	-2
	addi
	pushi	5
	storei

#line 	5
	' Switch
label1:
	pushi	2
	pushi	1
	eqi
	jz	label2

#line 	7
	' Write
	pushb	108
	outb
	jmp	label0
label2:
	pushi	2
	pushi	5
	eqi
	jz	label3

#line 	10
	' Write
	pushb	111
	outb
	jmp	label0
label3:

#line 	13
	' Write
	pushi	100
	outi
label0:
	ret	0, 2, 0
