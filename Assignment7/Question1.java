package Assignment7;
class Calc{
        public int add(int x,int y){
            int result = x + y;
            return result;
        }
        public int add(int x,int y,int z){
            int result = x + y + z;
            return result;
        }
        public double add(double x,double y){
            double result = x + y;
            return result;
        }
    }
public class Question1 {
    
    
    public static void main(String[] args){

        Calc obj = new Calc();
        System.out.println(obj.add(2,6));
        System.out.println(obj.add(3,7,8));
        System.out.println(obj.add(2.0,6.9));


    }
}
