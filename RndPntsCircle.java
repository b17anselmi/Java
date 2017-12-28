/* exercise 4.6
*program generates three random points on a circle with a radius of 40 and displays angles formed by the three points
*/
public class RndPntsCircle {

	public static void main(String[] args) {
		double [] point1 = new double[3];
		double [] point2 = new double [3];
		double [] point3 = new double [3];
		//it would be nice to have the flexibility of a user specified radius, but whatever
		double radius = 40;
		//array[0] will be our random angles for each of the three points
		point1[0] = Math.toRadians(Math.random() * 360);
		point2[0]= Math.toRadians(Math.random() * 360);
		point3[0]= Math.toRadians(Math.random() * 360);
		
		//now we need to calculate the coordinates for each of the points, array[1] will be the x point, array[2] will be the y coordinate
		point1[1]= radius*Math.cos(point1[0]);
		point1[2]= radius*Math.sin(point1[0]);
		point2[1]= radius*Math.cos(point2[0]);
		point2[2]= radius*Math.sin(point2[0]);
		point3[1]= radius*Math.cos(point3[0]);
		point3[2]= radius*Math.sin(point3[0]);
		
		//to find side lengths, wee need to use the distance formula for all the points
		double a, b, c;
		a = Math.pow(Math.pow((point2[1]-point1[1]), 2) + Math.pow(point2[2] - point1[2], 2),0.5); //distance between point2 and point1
		b= Math.pow( Math.pow((point3[1]-point2[1]), 2) + Math.pow(point3[2] - point2[2], 2),0.5); //distance between point3 and point2
		c= Math.pow( Math.pow((point1[1]-point3[1]), 2) + Math.pow(point1[2] - point3[2], 2),0.5); //distance between point1 and point3
		
		//because we have an SSS triangle, we need to use the law of cosines twice to get the first two angles, then we can subtract from 180 for the last angle
		//it doesn't matter what order the angles are found in, so I'm going to start with a cos(a) = (b2 + c2 − a2) / 2bc and then b cos(b)=(c2 + a2 − b2)/2ca
		double A, B, C;
		A =  Math.toDegrees(Math.acos(((Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c)))); //watch parenthesis 
		B = Math.toDegrees(Math.acos(((Math.pow(c, 2)+Math.pow(a, 2)-Math.pow(b, 2))/(2*b*c))));
		C = 180 - A -B;
		
		System.out.println("(" + point1[1] + ", " + point1[2] + ") Angle = " + B);//because b is between point3 and point2, it is projected out of point1
		System.out.println("(" + point2[1] + ", " + point2[2] + ") Angle = " + C);//because c is between point1 and point3, it is projected out of point2		
		System.out.println("(" + point3[1] + ", " + point3[2] + ") Angle = " + A); //because a is the distance between point2 and point1, the corresponding angle is at point3
		
		

	}

}
