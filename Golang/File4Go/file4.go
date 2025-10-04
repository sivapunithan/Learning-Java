package main

import (
	"fmt"
	"strconv"
)

func main(){
	n:= 5
	for i:=0; i<n; i++{
		row:= ""
		for j:=0; j<=i; j++{
			row = row + strconv.Itoa(j)
		}
		fmt.Println(row)
	}
}