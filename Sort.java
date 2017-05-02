public class Sort{
	public static void main(String[] args){
		int[] list={22,37,41,12,9,53,64,1110,8};
		sort(list);
		for(int n=0;n<list.length;n++)
			System.out.println(list[n]);
	}
	public static void sort(int[] list){
		int temp;
		
		for(int x=0;x<list.length-1;){
			for(int y=x+1;y<list.length;y++){
				if(y<list.length-1){
					if(list[x]>=list[y]&&list[x]<=list[y+1]){
						temp=list[y];
						list[y]=list[x];
						list[x]=temp;
						break;
					}
				}
				else if(y==list.length-1){
					if(list[x]>=list[y]){
						temp=list[y];
						list[y]=list[x];
						list[x]=temp;
						break;
					}
					else{
						x++;
						break;
					}
				}
			}
		}
	}
}
