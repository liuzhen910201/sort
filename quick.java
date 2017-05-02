public class quick{
	public static void main(String[] args){
		int[] list={1,2,3,5,4};
		quickSort(list,0,list.length-1);
		for(int n=0;n<=list.length-1;n++)
			System.out.println(list[n]);
	}
	public static void quickSort(int[] list, int low, int high){
		int temp;//基准数
		int t;//交换变量
		int i,j;
		

		temp=list[low];//以最开头的数为基准数
		i=low;//头指针
		j=high;//尾指针
		
		while(i<j){
			while(list[j]>=temp&&i<j)//不比基准数小
				j--;//尾指针指向下一个
			if(i<j){//比基准数小且没有越界
				//交换两个变量
				t=list[j];
				list[j]=list[i];
				list[i]=t;
				//头指针指向下一个
				i++;
			}

			while(list[i]<=temp&&i<j)//不比基准数大
				i++;//头指针指向下一个
			if(i<j){//比基准数大且没有越界
				//交换两个变量
				t=list[i];
				list[i]=list[j];
				list[j]=t;
				//尾指针指向下一个
				j--;
			}
	
		}
		//一次比较结束后，i与j皆指向基准数的位置（指针碰头，基准数已经完成排序）
		//数组被分成两段，low到i-1 与j+1到high
		if(i>low)
			quickSort(list,low,i-1);
		if(j<high)
			quickSort(list,j+1,high);
	} 
}
