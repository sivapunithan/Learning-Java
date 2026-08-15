public class ContainerWithMostWater {

    public static int maxArea(int[] height){
        int maxWater = 0;
        for (int i=0; i<height.length; i++){
            for (int j=height.length-1; j>=0; j--){
                int minHeight = Math.min(height[j], height[i]);
                int currentWater = (j-i) * minHeight;
                if (currentWater > maxWater){
                    maxWater  = currentWater;
                }
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int result = ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println("The max Area is: "+result );
    }
}
