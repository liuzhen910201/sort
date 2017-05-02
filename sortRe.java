public class sortRe{
	public static void main(String[] args){
		int[] list={22,37,41,12,9,53,64,1110,8};
		sort(list,0,1);
		for(int n=0;n<list.length;n++)
			System.out.println(list[n]);
	}
	public static void sort(int[] list, int x, int y){
		int temp;
		if(x<list.length-1&&y<=list.length-1){
			if(y<list.length-1){
				if(list[x]>=list[y]&&list[x]<=list[y+1]){
						temp=list[y];
						list[y]=list[x];
						list[x]=temp;
						sort(list,x,x+1);
						
				}
				else{
					sort(list,x,y+1);
				}
			}
			else if(y==list.length-1){
				if(list[x]>=list[y]){
					temp=list[y];								list[y]=list[x];
					list[x]=temp;
					sort(list,x,x+1);
				}
				else{
					sort(list,x+1,y);
				}
			}
		}
	}
} 