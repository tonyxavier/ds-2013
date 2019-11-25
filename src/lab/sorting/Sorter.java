package lab.sorting;

public class Sorter 
{

public int[] mergeSort(int[] arr,int start,int end)
{
	int mid=(start+end)/2;

	if(start<end)
	{
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
	}
	
	return arr;
}

//To merge two sorted portions of an array
public int[] merge(int[]arr,int low,int mid,int end)
{
	int[] temp=new int[end-low+1];
	
	int ptr1=low,ptr2=mid+1,ptr3=0;

//Copy the elements in sorted order to a third array - O(n)	
	while(ptr1<=mid && ptr2<=end )
	{
	  if(arr[ptr1]<arr[ptr2] && ptr1<=mid)
	  {
		  temp[ptr3]=arr[ptr1];
		  ptr1++;
		  ptr3++;
	  }
	  else if(arr[ptr2]<=arr[ptr1] && ptr2<=end )
	  {
		  temp[ptr3]=arr[ptr2];
		  ptr2++;
		  ptr3++;
	  }
	}
	
//Copy remaining elements from first half	
	  while(ptr1<=mid)
	  {	  temp[ptr3]=arr[ptr1];
		  ptr1++;
		  ptr3++;
	  }
	  
//Copy remaining elements from second half
	  while(ptr2<=end)
	  {	  temp[ptr3]=arr[ptr2];
		  ptr2++;
		  ptr3++;
	  }	  
	  

//Copy the sorted temp array back to the main array -O(n)	
for(int i=low,j=0;i<=end;i++)
          arr[i]=temp[j++];
	

	return arr;
}

public int[] quickSort(int[]arr)
{	
	return arr;
}



public static void main(String params[])
{
	Sorter sorter=new Sorter();
	
	//int mid=0;
	int [] arr={87,12,29,23,34,39,9,18,3,98};
	
	//mid=(arr.length-1)/2;
	//sorter.merge(arr, 0, mid, arr.length-1);
	sorter.mergeSort(arr, 0, arr.length-1);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
}

	
}
