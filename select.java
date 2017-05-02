public class select{
	public static void main(String[] args){
		int[] list={3,2,0,4,1,5,9,6,7,8,10,24};
		selectsort(list,0,0);
		for(int n=0;n<=list.length-1;n++)
			System.out.println(list[n]);
	}
	public static void selectsort(int[] list, int x, int y){
		if(x<list.length){
			int temp;
			int min=x;
			if(y<list.length){
				if(list[y]<list[min])
					min=y;
				selectsort(list,x,y+1);
			}
			if(min!=x){
				temp=list[min];
				list[min]=list[x];
				list[x]=temp;
			}
			//selectsort(list,x+1,x+1);
		}
	}
}