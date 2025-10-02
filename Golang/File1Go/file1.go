package main
import "fmt"

func getNegatives(arr []int) []int{

	var negatives []int

	for i:= 0; i<len(arr); i++{
		if arr[i] < 0{
			negatives = append(negatives, arr[i])
		}
	}
	return negatives
}

func main(){
	arr := []int{1,2,3,4,5,-1,-2,-3,-4,-5};
	result := getNegatives(arr)
	fmt.Println("The negative numbers in the array are :", result)
	
}