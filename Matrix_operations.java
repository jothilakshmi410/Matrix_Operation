public class Matrix_operations
{
static int GetUserInputInt(String x)
{
	String a=" ";
	int b;
    System.out.println(x);
    String n = System.console().readLine(a);
    if (n.chars().allMatch(Character::isDigit))
    	{
          b = Integer.parseInt(n);
    	}
    else
        {

    	   System.out.println("Invalid input.Enter another number!");
    	   return 0;
 	    }

    return b;
}
static Double GetUserInputDouble(String x)
{
	String a = " ";
	double p;
	String n;
    System.out.println(x);
    n= System.console().readLine(a);
    if(n.matches("-?\\d+(\\.\\d+)?"))
    	{
           p = Double.parseDouble(n);
    	}
    else
        {

    	   System.out.println("Invalid input.Enter another number!");
    	   return (double)0;
 	 	}

    return p;
}


static  void PrintResult(double X1[][], double X2[][], double X3[][])
{
	int R1 = X1.length,C1 = X1[0].length;
	double Temp[][] = new double [R1][C1];
	System.out.println("First matrix \n");
	for(int n = 1; n<=3 ;n++)
	{
      if( n == 1)
      {
		  Temp = X1;
		  R1 = X1.length;
		  C1 = X1[0].length;
      }
      else if ( n == 2)
       {
		   System.out.println("Second matrix \n");
		   R1 = X2.length;
		   C1 = X2[0].length;
		   Temp =  X2;

	   }
      else if ( n == 3)
       {
		   System.out.println("\nResultant matrix \n");
		   R1 = X3.length;
		   C1 = X3[0].length;
		   Temp = X3;

	   }

	 for(int i=0;i<R1;i++)
	 {
		for(int j=0;j<C1;j++)
		{
			System.out.print(Temp[i][j]+"\t");
		}
			System.out.print("\n");
     }

    }
 }

 public static void main(String[] args)
 {
	int R1 = 0 , R2 = 0 ,C1 = 0 ,C2 = 0;
	String choice;
	double M1[][];
	double M2[][];
	double M3[][];
	System.out.println("Choose an operation to Add , Subtract or Multiply the matrix:\n1)ADD \n2)Subract \n3)Multiply \n4)Transpose \n");
	choice = System.console().readLine();
	switch(choice)
	{
		case "1":
			{
				R1= GetUserInputInt("Enter the Number of rows for Matrix A:");
				C1= GetUserInputInt("Enter the Number of column for Matrix A:");
				R2= GetUserInputInt("Enter the Number of rows for Matrix B:");
				C2= GetUserInputInt("Enter the Number of column for Matrix B:");
				M1= new double[R1][C1];
				M2= new double[R2][C2];
				M3= new double[R1][C1];
				if ((R1==R2)&&(C1==C2))
				{
					for(int i=0;i<R1;i++)
					{
						for(int j=0;j<C1;j++)
						{
							M1[i][j]= GetUserInputDouble("Enter the elements of the First Matrix M1["+i+"]"+"["+j+"] :" );
						}
					}
					for(int i=0;i<R2;i++)
					{
						for(int j=0;j<C2;j++)
						{
							M2[i][j]= GetUserInputDouble("Enter the elements of the Second Matrix M2["+i+"]"+"["+j+"] :" );
							M3[i][j]= M1[i][j]+M2[i][j];
						}
					}
                 System.out.println("Addition of Matrix \n");
                 PrintResult(M1,M2,M3);
				 return;
				}
				else
				{
					System.out.println("\nError in Input \n");
					return;
				}

			}
		case "2":
			{
				R1= GetUserInputInt("Enter the Number of rows for Matrix A:");
				C1= GetUserInputInt("Enter the Number of column for Matrix A:");
				R2= GetUserInputInt("Enter the Number of rows for Matrix B:");
				C2= GetUserInputInt("Enter the Number of column for Matrix B:");
				M1= new double[R1][C1];
				M2= new double[R2][C2];
				M3= new double[R1][C1];
				if ((R1==R2)&&(C1==C2))
				{
					for(int i=0;i<R1;i++)
					{
						for(int j=0;j<C1;j++)
						{
							M1[i][j]= GetUserInputDouble("Enter the elements of the First Matrix M1["+i+"]"+"["+j+"] :" );
						}
					}
					for(int i=0;i<R2;i++)
					{
						for(int j=0;j<C2;j++)
						{
							M2[i][j]= GetUserInputDouble("Enter the elements of the Second Matrix M2["+i+"]"+"["+j+"] :" );
							M3[i][j]= M1[i][j]-M2[i][j];
						}
					}
                 System.out.println("Subtraction of Matrix \n");
                 PrintResult(M1,M2,M3);
				 return;
        		}
 				else
				{
					System.out.println("\nError in Input \n");
					return;
				}

		     }

		  case "3":
			{
				R1= GetUserInputInt("Enter the Number of rows for Matrix A:");
				C1= GetUserInputInt("Enter the Number of column for Matrix A:");
				R2= GetUserInputInt("Enter the Number of rows for Matrix B:");
				C2= GetUserInputInt("Enter the Number of column for Matrix B:");
				M1= new double[R1][C1];
				M2= new double[R2][C2];
				M3= new double[R1][C2];

				if (R2 == C1)
				{
					for(int i=0;i<R1;i++)
					{
						for(int j=0;j<C1;j++)
						{
							M1[i][j]= GetUserInputDouble("Enter the elements of the First Matrix M1["+i+"]"+"["+j+"] :" );
						}
					}
					for(int i=0;i<R2;i++)
					{
						for(int j=0;j<C2;j++)
						{
							M2[i][j]= GetUserInputDouble("Enter the elements of the Second Matrix M2["+i+"]"+"["+j+"] :" );
						}
					}

				    for (int i = 0; i < R1; i++)
				    {
				       for (int j = 0; j < C2; j++)
				       {
				          for (int k = 0; k < R2; k++)
				          {
				           M3[i][j] += ((M1[i][k])* (M2[k][j]));
					      }
				       }
                   }
                 System.out.println("Multiplication of Matrix \n");
                 PrintResult(M1,M2,M3);
				 return;
        		}
 				else
				{
					System.out.println("\nError in Input \n");
					return;
				}
			}
		  case "4":
			{
				R1= GetUserInputInt("Enter the Number of rows for Matrix A:");
				C1= GetUserInputInt("Enter the Number of column for Matrix A:");
				M1= new double[R1][C1];
				M3= new double[R1][C1];

					for(int i=0;i<R1;i++)
					{
						for(int j=0;j<C1;j++)
						{
							M1[i][j]= GetUserInputDouble("Enter the elements of the First Matrix M1["+i+"]"+"["+j+"] :" );
						}
					}
					for(int i=0;i<R1;i++)
					{
						for(int j=0;j<C1;j++)
						{
							M3[i][j]=M1[j][i];
						}
					}
                 System.out.println("Given Matrix \n");
 				 for(int i=0;i<R1;i++)
					{
						for(int j=0;j<C1;j++)
						{
							System.out.print(M1[i][j]+"\t");
						}
						System.out.print("\n");
					}
                 System.out.println("Transpose of Matrix the Given Matrix is \n");
 				 for(int i=0;i<R1;i++)
					{
						for(int j=0;j<C1;j++)
						{
							System.out.print(M3[i][j]+"\t");
						}
						System.out.print("\n");
					}

				 return;
        		}

			default:
			System.out.println("select an valid option!");
	}


  }


}