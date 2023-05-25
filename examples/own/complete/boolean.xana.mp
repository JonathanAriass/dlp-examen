
	#source "boolean.xana"

' Invocation to the main function
call main
halt


#line 	1

main:
	' Parameters
	' Local variables
	' num :: es.uniovi.dlp.ast.types.BooleanType@1e61f17d (offset -2)
	enter	2

#line 	4
	push	bp
	pushi	-2
	addi
	pushi	1
	storei

#line 	6
	' If statement
	push	bp
	pushi	-2
	addi
	loadi
	pushi	0
	eqi
	jz	label0
	' Body of the if branch

#line 	7
	' Write
	pushb	102
	outb
	jmp	label1
label0:
	' Body of the else branch

#line 	9
	' Write
	pushb	116
	outb
label1:
	ret	0, 2, 0
