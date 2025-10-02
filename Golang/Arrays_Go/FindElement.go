package main

import "fmt"
func FindElement(arr[] int, target int) int{
	for i := 0; i<len(arr); i++{
		if arr[i] == target {
			return i
		}
	}
	return -1;
}

func main() {
	var target int;
	arr := []int{1,2,3,4,5,6,7,8,9};
	fmt.Println("Enter the element to be searched :")
	fmt.Scanln(&target)
	result := FindElement((arr),target)

	fmt.Println("The Index of the element is :", result)
}