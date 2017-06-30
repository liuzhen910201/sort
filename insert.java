public class insert{
	public static void main(String[] args){
		int[] list={22,37,41,12,9,53,64,1110,8};
		insertSort(list);
		for(int n=0;n<list.length;n++)
			System.out.println(list[n]);
	}
	public static void insertSort(int[] list){
		int temp;
		for(int x=1;x<list.length;x++){
			for(int y=x;y>0;y--){
				if(list[y]<list[y-1]){
					temp=list[y];
					list[y]=list[y-1];
					list[y-1]=temp;
				}
				else
					break;	
			}	
		}
	}
}
