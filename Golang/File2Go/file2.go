package main

import "fmt"

func FindLargest(anyArray []int) int{

	largest:= anyArray[0];
	for i:= 0; i < len(anyArray); i++ {
		if anyArray[i] > largest{
			largest = anyArray[i]
		}
	}
	return largest
}

func main() {
	arr := []int {2,4,6,8,90,45,-25};
	result := FindLargest(arr)
	fmt.Println("The largest NUmber in an array :", result)
}