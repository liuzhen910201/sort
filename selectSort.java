public class selectSort{
	public static void main(String[] args){
		int[] list={22,37,41,12,9,53,64,1110,8};
		select(list);
		for(int n=0;n<=list.length-1;n++)
			System.out.println(list[n]);
	}
	public static void select(int[] list){
		int min=0;//最小数的下标
		int temp;
		for(int x=0;x<list.length;x++){
			min=x;
			for(int y=x;y<list.length;y++){//找到最小数的下标
				if(list[y]<list[min])
					min=y;	
			}
			if(min!=x){//交换
				temp=list[min];
				list[min]=list[x];
				list[x]=temp;		
			}
		}				
	}
}