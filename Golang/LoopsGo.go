package main 

import "fmt"

func Greeting () string {
	return "Hello Punithan"
}

func main() {
	for i:=1; i>5; i++ {
		fmt.Println("The value of i is :", i)
		greet := Greeting()
		fmt.Println("Invoking Greeting function :", greet)
	}
}