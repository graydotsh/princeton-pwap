public class RightTriangle {
	public static void main(String[] args){
        //takes in arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //checks if all arguments are positive
        boolean isPositive = (a > 0) && (b > 0) && (c > 0);
        //checks if arguments creates right triangle
        boolean isRightTriangle = ((a*a)+(b*b) == (c*c)) 
        || ((a*a)+(c*c) == (b*b))
        || ((c*c)+(b*b) == (a*a));
        //prints result
        System.out.println(isRightTriangle && isPositive);
	}
}
