package main

import (
	"fmt"
	"math"
)

func findSecondLargest(anyArr []int) int{
	largest:= math.MinInt
	secondLargest:= math.MinInt

	for i:=0; i < len(anyArr); i++ {
		if anyArr[i] > largest {
			secondLargest = largest
			largest = anyArr[i]
		} else if anyArr[i] > secondLargest && anyArr[i] != largest{
			secondLargest = anyArr[i]
		}
	}
	return secondLargest
}

func main (){
	arr:= []int {3556,3556,-9473,486,463,0,34,8563,8563}
	result:= findSecondLargest(arr)
	fmt.Println("The Second Largest element in the array ", result)
}