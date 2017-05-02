public class insertsort{
	public static void main(String[] args){
		int[] list={1,3,4,2,9,5,6,10,8};
		insert(list,1,1);
		for(int n=0;n<list.length;n++)
			System.out.println(list[n]);
	}
	public static void insert(int[] list, int x, int y){
		int temp;
		if(y>0){
			if (list[y]<list[y-1]){
				temp=list[y];
				list[y]=list[y-1];
				list[y-1]=temp;
			}
			else if(x<list.length){//放在这里更高效
				insert(list,x+1,x);
			}	
			insert(list,x,y-1);
			//放在这里低效
		}	
	}
}
