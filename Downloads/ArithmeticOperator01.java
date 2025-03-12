  /*
Arithmetic Operators
-------------------
	1)What is the AO?
	2)How many AO and what are they?
	3)What type of operators?
	4)What type of opernds are allowed?
	5)What type of opernds are not allowed?
	6)What are the different things we can use as operand?
	7)What type of result return?
	8)What is the type promotion?
	9)When a value variable type is promotion?
	10)What is an automatic type promotion in an expression?
	11)Type of expression?
	12)What is a variable and constant expression?
	13)What is the compiler algorithm for evaluating var and const expression?
	14)Special case of final variable ?
	15)+ operator special points .
	16)/ and % operator special point.

	how many --> we have 5 AO's --> + - * / %
	Used     --> for performing calculation addition,substration, multiplecation
				 and division(finding quotient and reminder).
	Type	 --> binary operators --> takes two operands
        any rules--> allows only numeric datatypes--> byte,short,int,long,float,double,char.
			 --> we can't use boolean datatype as operand
	operand  --> literals variable nv ,method call, expressions
    result type  --> numeric --> based on the data types we used in calculation
                 --> always we will get higest range data type as result.
*/
//Sample_Program
//==============

class ArithmeticOperator01{

	public static void main(String[] args){

		int a=20;
		int b=10;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println();

		boolean bo1=true;
		boolean bo2=false;
       //	System.out.println(bo1+bo2);
       //	System.out.println(bo1+10);

		int i1=30+40;
        //      boolean bo3=30+40;
	//	boolean bo4=30.0+40;
	//	boolean bo5='a'+'b';     // char + char --> int
		
		byte b1=50;
		byte b2=60;
	//	boolean bo6=b1+b2;       // byte + byte -->int

		short s1=10;
		short s2=20;
	//	boolean bo7=s1+s2;       // short + short --> int 
	/*	
		byte+byte   -->int
		short+short -->int
		char+char   -->int

		int+int       -->int
		long+long     -->long
		float+float   -->float
		double+double -->double
	
   		Experission result type always high range data type used in the experission
		byte + short + char ===> int
		int + short + byte + char ===>int
		int + long ===> long
		float + long ===> float
		double +long ===> double
		float + int + long + char ===> float
		float + int + double + long + char ===> double

	Compiler algorithm in an experission evaluation W.r.t literals and Variables
	We have Two types of experission.

	1) Constant experission-->if we use only literals or only final variables or both is called constant experission
	
	2) Variables experission->if we use atleast one variable or non void method call we call this expreission as variable expression.

 a)     =>if we use only literals or only final variables or both,
	  compiler directly uses value and generates final results 
	  and verifies is this value in0 the range of destination 
	  variable.   
				  -if Yes,compiled fine.
				  -if No, it throws possible lossy conversion.

  b)    => 
	  compiler uses variable type and generates type as result 
	  and verifies is this type range of destination variable .
	            
				  -if Yes,compiled fine.
				  -if No, it throws possible lossy conversion.

	*/
	          byte b3=10;
		  byte b4=20;
	//	  byte b5=b3+b4;
	//               byte +byte
	//		     int
	 
	//	  
	//	 byte b7=(byte)b3+(byte)b4;
		 byte b8=(byte)(b3+b4);

    /*
        =>if we use only literals or only final variables or both,
	  compiler directly uses value and generates final results 
	  and verifies is this value i the range of destination 
	  variable.   
				  -if Yes,compiled fine.
				  -if No, it throws possible lossy conversion.
    */
				byte b9=10+20;
	//		        30

	//			byte b10=110+20;
	//			         130       --> out of byte range 

	
	//			byte b11=10L;
				byte b12=(byte)10L;
	//			byte b13=(int)10L;

				long l1=10L;
				byte b14=(byte)l1;
	//			byte b15=(int)l1;

	/*
	=> if we use variable,
	   compiler uses variable type and generates type as result 
	   and verifies is this type range of destination variable .
	            
				  -if Yes,compiled fine.
				  -if No, it throws possible lossy conversion. 
	*/
				byte b16=10;
			//	byte b17=b16+20;
			//               int

			final byte b18=10;
				  byte b19=b18+20;
		//			   10+20
		//			    30
			final byte b20=10;
			final byte b21=20;
				  byte b22=b20+b21;
		//			    10+20
		//			      30
			final byte b23;
			final byte b24;
			b23=10;
			b24=20;
		//	byte b25=b23+b24;
		//			byte+byte
		//			 int+int
		//			  int
/*
  + operator special case
  ========================
  => + operator is a overloaded operator.

     1)Addition operation --> if both operand are numeric or char,  it add and join value

     2)Concatenation operation -->atleast one operand is String , then it act as concatenation  operation.
					(it will join/append both operand values and generates  new value)
				
*/  
            int i2=10;
            int i3=20;
            int i4=i2+i3;
            System.out.println(i4);

			char ch1='a';
			char ch2='b';
		//	char ch3=ch1+ch2;
			char ch4=(char)(ch1+ch2);
		//	System.out.println(ch3);
			System.out.println((int)ch4);
			System.out.println();

			String s11="H";
			String s22="K";
			String s33=s11+s22;
			String s44=s33+"#"+1;
			 
			
		//	String s55=s44-2;
		//	String s66=s44*2;
		//	String s77=s44/2;
		//	String s88=s44-2;


			System.out.println();
			System.out.println(10+20);
			System.out.println("@"+10+20);
			System.out.println(10+"@"+20);
			System.out.println(10+20+"@");
			System.out.println();
			
			int p=10;
			int q=20;
			System.out.println(p+q);
			System.out.println("p"+"q");
			System.out.println("p+q");
			System.out.println("p+q"+p+q);
			System.out.println("p+q"+(p+q));

		//	System.out.println("p-q"+p-q);
			System.out.println("p-q"+(p-q));
			System.out.println("p*q"+p*q);
			System.out.println();

/*
		Division operator special point

		> int/int ==>int
		   22/7 -->3   

		>  integer/0 ==>AE
		>  floating point    num/0 ==>infinity
		> -floating point -num/0 ==>-infinity
		>  0/0 -->AE
		>  0.0/0 -->NaN+  (not a Number) 
		> -0.0/0 -->NaN
*/	
		System.out.println();
		System.out.println(22/7*10*10);
		System.out.println(22.0F/7*10*10);
		System.out.println();

		System.out.println(0/2);
		System.out.println(2/1);

		System.out.println(2/2);

		System.out.println(0.0/2);
		System.out.println(2.0/0);
		System.out.println(2.0/1);

	//	System.out.println(2/0);
		
		System.out.println(2.0/0);
		System.out.println(2.0F/0);
		System.out.println(-2.0/0);

	//	System.out.println(0/0);
		System.out.println(0.0/0);
		System.out.println(-0.0/0);
		System.out.println();

		int m=10-20/5*4+3-2*10%5;
		System.out.println(m);

	/*
		int m= 10 - 20 / 5 * 4 + 3 - 2 * 10 % 5 ;
		int m= 10 - 4 * 4 + 3 - 2 * 10 % 5 ;
		int m= 10 - 16 + 3 - 2 * 10 % 5 ;
		int m= 10 - 16 + 3 - 20 % 5 ;
		int m= 10 - 16 + 3 - 0 ;
		int m= -6 + 3 - 0 ;
		int m= -3 - 0 ;
		int m= -3 ;
		
		
		
	*/


	}
}












