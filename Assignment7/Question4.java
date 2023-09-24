package Assignment7;

public class Question4 {
    
    public static int findIndexApproach(int[] array,int element){
        for(int i = 0; i< array.length ; i++){
            if(array[i] == 6){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int array[] = {3,6,9,12};
        int element = 6;
        int index = findIndexApproach(array, element);
        System.out.println("Index of element " + element + " : " + index);
    }
}
