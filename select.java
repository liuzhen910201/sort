public class select{
	public static void main(String[] args){
		int[] list={3,12,30,4,11};
		selectsort(list,0,1);
		for(int n=0;n<=list.length-1;n++)
			System.out.println(list[n]);
	}
	/*
		选择排序：
			每次遍历选出最小的元素 和当前头元素交换
			递归方法即是完成以上功能
			先选出最小的放在第一位 再选出剩下最小的放在之后的第一位
	*/
	public static void selectsort(int[] list, int x, int y){
	//x 当前头元素下标 y 与头元素比较元素的下标
		if(x<list.length){
			int temp;//临时变量 用于交换
			int min=x;//min 当前最小元素的下标 初始下标默认为x
			if(y<list.length){//选出最小的
				if(list[y]<list[min])
					min=y;
				selectsort(list,min,y+1);
			}
			if(min!=x){//交换
				temp=list[min];
				list[min]=list[x];
				list[x]=temp;
			}
			y=x+1;
			selectsort(list,x+1,y+1);
		}
	}
}
