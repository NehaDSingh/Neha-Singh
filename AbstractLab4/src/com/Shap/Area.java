package com.Shap;

 class Area extends Shape {

		
	     double Area = 0;

         
		 void RectangleArea(float length, float breadth) {


		   Area = length * breadth;


		   System.out.println("Area of rectangle is: " + Area);


		 }


		 void SquareArea(float Side) {


		   Area = Side * Side;


		   System.out.println("Area of Square is: " + Area);


		 }


		 void CircleArea(float radius) {


		   Area = (radius * radius) * 3.14;


		   System.out.println("Area of Circle is: " + Area);


		 }


		@Override
		void RectangleArea(Float length, Float Breadth) {
			// TODO Auto-generated method stub
			
		}


		@Override
		void SquareArea(Float Radius) {
			// TODO Auto-generated method stub
			
		}


		@Override
		void CircleArea(Float Side) {
			// TODO Auto-generated method stub
			
		}


		}

