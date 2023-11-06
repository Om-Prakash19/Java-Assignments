/*
 * Q. Create a class that keeps track of the number of instances created . Implement a static variable and method to accomplish this.
 * 
 * Ans-->
 */

package PracticalAssignment;

class InstanceCounter{

    private static int instanceCount = 0;

    public InstanceCounter(){
        instanceCount ++;
    }

    public static int getInstanceCount(){
        return instanceCount;
    }

}

    public class Question1{
    public static void main(String[] args) {
        
        InstanceCounter instance1 = new InstanceCounter();
        InstanceCounter instance2 = new InstanceCounter();
        InstanceCounter instance3 = new InstanceCounter();

        System.out.println("Number of instances created : " + InstanceCounter.getInstanceCount());



    }
}