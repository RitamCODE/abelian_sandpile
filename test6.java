package Internship;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class test6 extends Frame
{
	int[] eventSize=new int[10000];
	static int getEventSize1[];
	  static int getEventFreq[];
	 static int no;
	int k=0,c3;
	
	
	public int[][] add(int n1,int arr1[][])
	{
		
		Random r=new Random();
		int y=r.nextInt(n1);
		int x=r.nextInt(n1);
		arr1[x][y]=arr1[x][y]+1;
		return(arr1);
	}
	
	public int[][] distribute(int arr1[][],int n1)
	{
		int flag,i,j,c=0,flag1=0,n=0;
		while(n<=(n1*n1))//resolving avalanches if any has to occur
		{ 
			flag=0;
			for (i=0;i<n1;i++)//loop to check whether there is any 5 remaining in the matrix
			{
				for (j=0;j<n1;j++)
				{
					if(arr1[i][j]>=4)
						flag++;
				}
			}
		if(flag>0)	
		{  
			
		    for (i=0;i<n1;i++)
		    {
			for (j=0;j<n1;j++)
			{
			 if(arr1[i][j]>=4)
			 {
	                  if((i==0)&&(j==0))//checking the upper left corner elements
	                  {
	                     {arr1[i][j]=arr1[i][j]-2;
	                       arr1[i][j+1]=arr1[i][j+1]+1;
	                       arr1[i+1][j]=arr1[i+1][j]+1;
	                       //if(eventSize[k]<=(n1*n1))
	                       eventSize[k]=eventSize[k]+1;
	                       //else
	                       //{ flag1=1;
	                       //break;}
	                    	   
	                       //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                    		   } 
	                  }//end of 0,0 if loop
	                  
	                  if((i==0)&&(j!=0)&&(j!=(n1-1)))//checking the upper boundary elements between the upper corner elements
	                  {
	                   	  
	                	      {arr1[i][j]=arr1[i][j]-3;
	                          arr1[i][j+1]=arr1[i][j+1]+1;
	                          arr1[i][j-1]=arr1[i][j-1]+1;
	                          arr1[i+1][j]=arr1[i+1][j]+1;
	                          eventSize[k]=eventSize[k]+1;
	                          //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                          /*if(eventSize[k]<=(n1*n1))
	   	                       eventSize[k]=eventSize[k]+1;
	   	                       else
	   	                       { flag1=1;
	   	                       break;}*/
	   	                    	
	                	      } 
	                  }//end of upper middle boundary elements if loop
	                  
	                  if((i==0)&&(j==(n1-1)))//checking the upper right corner elements
	                  {
	                      {arr1[i][j]=arr1[i][j]-2;
	                       arr1[i][j-1]=arr1[i][j-1]+1;
	                       arr1[i+1][j]=arr1[i+1][j]+1;
	                       eventSize[k]=eventSize[k]+1;
	                       //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                       /*if(eventSize[k]<=(n1*n1))
		                       eventSize[k]=eventSize[k]+1;
		                       else
		                       { flag1=1;
		                       break;}*/
		                    	
	                      } 
	                  }//end of 0,3 if loop
	                  
	                  if((i!=0)&&(j==0)&&(i!=(n1-1)))//checking the left boundary elements excluding the left corner elements
	                  {
	                      {arr1[i][j]=arr1[i][j]-3;
	                       arr1[i][j+1]=arr1[i][j+1]+1;
	                       arr1[i+1][j]=arr1[i+1][j]+1;
	                       arr1[i-1][j]=arr1[i-1][j]+1;
	                       eventSize[k]=eventSize[k]+1;
	                       //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                       /*if(eventSize[k]<=(n1*n1))
		                       eventSize[k]=eventSize[k]+1;
		                       else
		                       { flag1=1;
		                       break;}*/
		                    	 
	                      } 
	                 //end of checking 3 element != 4
	                      
	                  }//end of left middle boundary elements if loop
	                  
	                  if((i!=0)&&(j!=0)&&(j!=(n1-1))&&(i!=(n1-1)))//checking the middle elements excluding all the boundary elements
	                  {
	                   
	                   {
	                	   arr1[i][j]=arr1[i][j]-4;
	                       arr1[i][j+1]=arr1[i][j+1]+1; 
	                       arr1[i][j-1]=arr1[i][j-1]+1;
	                       arr1[i-1][j]=arr1[i-1][j]+1;
	                       arr1[i+1][j]=arr1[i+1][j]+1; 
	                       eventSize[k]=eventSize[k]+1;
	                       //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                       /*if(eventSize[k]<=(n1*n1))
		                       eventSize[k]=eventSize[k]+1;
		                       else
		                       { flag1=1;
		                       break;}*/
		                    	
	                   }//end of checking all element !=4
	                                     }//end of middle elements if loop
	                  
	                  if((i!=0)&&(j==(n1-1))&&(i!=(n1-1)))//checking the right boundary elements excluding the left corner elements
	                  {
	                      
	                	   {arr1[i][j]=arr1[i][j]-3;
	                       arr1[i][j-1]=arr1[i][j-1]+1;
	                       arr1[i+1][j]=arr1[i+1][j]+1;
	                       arr1[i-1][j]=arr1[i-1][j]+1;
	                       eventSize[k]=eventSize[k]+1;
	                       //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                       /*if(eventSize[k]<=(n1*n1))
		                       eventSize[k]=eventSize[k]+1;
		                       else
		                       { flag1=1;
		                       break;}*/
		                    	
	                	   } 
	                  }//end of right middle boundary elements if loop
	                  
	                  if((i==(n1-1))&&(j==0))//checking the lower left corner elements
	                  {
	                      {arr1[i][j]=arr1[i][j]-2;
	                       arr1[i][j+1]=arr1[i][j+1]+1;
	                       arr1[i-1][j]=arr1[i-1][j]+1;
	                       eventSize[k]=eventSize[k]+1;
	                       //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                       /*if(eventSize[k]<=(n1*n1))
		                       eventSize[k]=eventSize[k]+1;
		                       else
		                       { flag1=1;
		                       break;}*/
		                    	 
	                      } 
	                  }//end of 3,0 if loop
	                  
	                  if((i==(n1-1))&&(j!=0)&&(j!=(n1-1)))//checking the lower boundary elements between the lower corner elements
	                  {
	                         {arr1[i][j]=arr1[i][j]-3;
	                          arr1[i][j+1]=arr1[i][j+1]+1;
	                          arr1[i][j-1]=arr1[i][j-1]+1;
	                          arr1[i-1][j]=arr1[i-1][j]+1;
	                          eventSize[k]=eventSize[k]+1;
	                          //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                          /*if(eventSize[k]<=(n1*n1))
	   	                       eventSize[k]=eventSize[k]+1;
	   	                       else
	   	                       { flag1=1;
	   	                       break;}*/
	   	                    	 
	                         } 
	                  }//end of lower middle boundary elements if loop
	                  
	                  if((i==(n1-1))&&(j==(n1-1)))//checking the lower right corner elements
	                  {
	                      {arr1[i][j]=arr1[i][j]-2;
	                       arr1[i][j-1]=arr1[i][j-1]+1;
	                       arr1[i-1][j]=arr1[i-1][j]+1;
	                       eventSize[k]=eventSize[k]+1;
	                       //Test2applet.eventSize[k]=Test2applet.eventSize[k]+1;
	                       /*if(eventSize[k]<=(n1*n1))
		                       eventSize[k]=eventSize[k]+1;
		                       else
		                       { flag1=1;
		                       break;}*/
		                    	 
	                      } 
	                  }//end of 3,3 if loop
	                  
	                  }//end of arr1[i][j]>=4
			
			}//end of the j loop
			
		}//end of i loop
		    k++;       
			
		}//end of if flag>0
		
		else
			break;
		n++;
		
		}//end of while loop
		return(arr1);
	}//end of function
	
	public int[] es(int arr[]) 
    {
    	int i;
    	for(i=0;i<10000;i++)
    	{arr[i]=eventSize[i];
        }
    	return(arr);
    }
	public void ges(int arr[],int n) 
    {
    	int i;
    	test6.no=n;
    	test6.getEventSize1=new int[test6.no];
    	for(i=0;i<n;i++)
    	{test6.getEventSize1[i]=arr[i];
        }
    	//return(getEventSize1);
    }
  
    public void gef(int arr[],int n) 
    {
    	int i;
    	test6.no=n;
    	test6.getEventFreq=new int[test6.no];
    	for(i=0;i<n;i++)
    	{test6.getEventFreq[i]=arr[i];
        }
       	//return(getEventFreq);
    }
    
    public void setlimit(int n)
    {
    	test6.no=n;
    	//return(c3);
    }
    public void check()
    {int i;
    for(i=0;i<test6.no;i++)
    	System.out.print(test6.getEventSize1[i]);
    System.out.println();
    for(i=0;i<test6.no;i++)
    	System.out.print(test6.getEventFreq[i]);
    System.out.println();
    }
	public test6()
	 {
		 addWindowListener(new WindowAdapter()
		 {
			 public void windowClosing(WindowEvent we)
			 {System.exit(0);
			 
			 }
		 });
	 }//end of constructor
	
	public void paint(Graphics g)
	  {
	    g.drawLine(0,200,0,0);
	    g.drawLine(0,200,200,200);
	    int i;
	    i=0;
	    //System.out.println(test6.no);
	    for(i=0;i<test6.no;i++)
	    {int x=(int)(Math.log10(test6.getEventSize1[i])*10);
         int y=(int)(Math.log10(test6.getEventFreq[i])*10);
	    	g.drawOval(x,y, 40, 40);
	    g.fillOval(x,y, 40, 40);
	    //g.fillOval(100,200, 10, 10);
	    }
	  }

	
	public static void main(String args[])//main function
	{
    test6 ob=new test6();
	int i1,j1,n,flag=0,c1=0,c2=0,x,y,k1=0,cn3=0,count=0,fl=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the limit of the matrix");
	n=sc.nextInt();
	int arr[][]= new int[n][n];
	for (i1=0;i1<n;i1++)//assigning all values to 0
	{
		for (j1=0;j1<n;j1++)
		{arr[i1][j1]=0;
		}
	}
	for (i1=0;i1<n;i1++)//printing the initial matrix
	{
		for (j1=0;j1<n;j1++)
		{System.out.print(arr[i1][j1]);
		}System.out.println();
	}
	int[][] f,f1;
	while(c1<=(n*n*3))//creating the matrix
	{
		System.out.println("addition");
		f=ob.add(n,arr);//
		for (i1=0;i1<n;i1++)//printing them
		{
			for (j1=0;j1<n;j1++)
			{System.out.print(f[i1][j1]);
			arr[i1][j1]=f[i1][j1];
			}System.out.println();
		}
	c1++;
	f1=ob.distribute(f,n);//
	for (i1=0;i1<n;i1++)//printing them
	{
		for (j1=0;j1<n;j1++)
		{
		arr[i1][j1]=f1[i1][j1];
		if(arr[i1][j1]==4)
		{
			fl=1;
			break;
		}
		}
	}
	if(fl==1)
	{
	for (i1=0;i1<n;i1++)//printing them
	{
		for (j1=0;j1<n;j1++)
		{
			arr[i1][j1]=0;
		}
	}
	}
	if(fl==1)
	{System.out.println("Reseting the array");
	for (i1=0;i1<n;i1++)//printing them
	{
		for (j1=0;j1<n;j1++)
		{		
			System.out.print(arr[i1][j1]);
		}System.out.println();
	}
	fl=0;
	f1=ob.distribute(f,n);
	}
	System.out.println("distribution");
	System.out.println("c="+c1);
	for (i1=0;i1<n;i1++)//printing them
	{
		for (j1=0;j1<n;j1++)
		{System.out.print(f1[i1][j1]);
		arr[i1][j1]=f1[i1][j1];
		}System.out.println();
	}
	
	}//end of while
	
	int cEventSize[]=new int[10000];
	cEventSize=ob.es(cEventSize);
	for(i1=0;i1<10000;i1++)
	{
		System.out.println(cEventSize[i1]);
	}
	System.out.println("printing the real event sizes");
	for(i1=0;i1<10000;i1++)
	{
		//if(Test2applet.eventSize[i1]!=-1)
		if(cEventSize[i1]==0)
		{
			break;
			//Test2applet.eventSize[i1]=Test2applet.eventSize[i1]+1;	
		}
		else
			c2++;
	}
	int getEventSize[] = new int[c2];
	for(i1=0;i1<c2;i1++)
	{
		//getEventSize[i1]=Test2applet.eventSize[i1];
		getEventSize[i1]=cEventSize[i1];
	}
	for(i1=0;i1<c2;i1++)
	{
		System.out.println(getEventSize[i1]);
	}
	int eventFreq[]=new int[c2];
	
	for(i1=0;i1<c2;i1++)
	{
		eventFreq[i1]=0;
	}
	for(i1=0;i1<c2;i1++)
	{
		count=1;
		if(i1!=c2-1)
		{for(j1=i1+1;j1<c2;j1++)
		{
		if(getEventSize[i1]==getEventSize[j1])
		{
			count++;
			getEventSize[j1]=0;
		}
		}
			eventFreq[i1]=count;
	     }
	}
	for(i1=0;i1<c2;i1++)
	{
		if(getEventSize[i1]!=0)
		{
			cn3++;
		}
	}
	System.out.println("printing the changed event sizes");
	for(i1=0;i1<c2;i1++)
	{
		if(getEventSize[i1]!=0)
			
		{
		System.out.println(getEventSize[i1]+" "+eventFreq[i1]);
		}
		
	}
	
	//Test2applet.getEventSize1=new int[c3];
	//Test2applet.getEventFreq=new int[c3];
	int cGetEventSize1[]=new int[cn3];
	int cGetEventFreq[]=new int[cn3];
	//

	for(i1=0;i1<c2;i1++)
	{
		if(getEventSize[i1]!=0)
		{
			//Test2applet.getEventSize1[k1]=getEventSize[i1];
			cGetEventSize1[k1]=getEventSize[i1];
			//Test2applet.getEventFreq[k1]=eventFreq[i1];
			cGetEventFreq[k1]=eventFreq[i1];
			k1++;
		}
		
	}
	
	System.out.println("Size    Freq");
	
	for(i1=0;i1<cn3;i1++)
	{
		System.out.println(cGetEventSize1[i1]+"     "+cGetEventFreq[i1]);
	}
	
    ob.ges(cGetEventSize1, cn3);
	ob.gef(cGetEventFreq, cn3);
	ob.setlimit(cn3);
	ob.check();
	
	test6 ob1=new test6();
	
	ob1.setSize(new Dimension(1000,1000));
	ob1.setVisible(true);
	//ob1.paint(null);
	
	}//end of main


}//end of class