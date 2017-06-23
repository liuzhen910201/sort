public class insertsort{
	public static void main(String[] args){
		int[] list={11,3,4,7,2,9,5,6,10,8,1};
		insert(list,1,1);
		for(int n=0;n<list.length;n++)
			System.out.println(list[n]);
	}
	public static void insert(int[] list, int x, int y){
		int temp;
		if((y>=0)&&(x<=list.length)){
			if (y>0&&(list[y]<list[y-1])){
				temp=list[y];
				list[y]=list[y-1];
				list[y-1]=temp;
                insert(list,x,y-1);
			}
			else{
				insert(list,x+1,x);
			}
		}	
	}
}
