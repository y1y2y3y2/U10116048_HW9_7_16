//U10116048 楊明璋 HW9 7.16
//排序2維陣列
import java.util.*;
public class Sort2dimentionArray {
	//TestProgram	7.16

	public static void main(String[] args) {
		SortProg sp =new SortProg();
		int [][] a = new int [2][6];//
		/*新增元素*/
		a[0][0]=4;
		a[1][0]=2;
		a[0][1]=1;
		a[1][1]=7;
		a[0][2]=4;
		a[1][2]=5;
		a[0][3]=1;
		a[1][3]=2;
		a[0][4]=1;
		a[1][4]=1;
		a[0][5]=4;
		a[1][5]=1;		
		/**/
		System.out.println("TestProgram 7.16:");
		System.out.println("原始陣列:");
		sp.display(a);
		System.out.println("-----------------");
		System.out.println("排序後陣列:");
		sp.Sort(a);
	}

}
class SortProg{
	 public static void Sort(int m[][] ){
		//先拆開
		 int []temp1 =new int[6];
		 int []temp2 =new int[6];
		 
		 for(int i=0;i<6;i++){
			 temp1[i]=m[0][i];
			 temp2[i]=m[1][i];
		 }
		 
		//排序
		Arrays.sort(temp1);//使用library裡的Quicksort
		Arrays.sort(temp2);
		
		//再合併
		for(int i=0;i<6;i++){
			 m[0][i]=temp1[i];
			 m[1][i]=temp2[i];
		 }
		
		display(m);//印出結果
		 
	    }
	 public static void display(int m[][]){
		 
		 for(int y=0;y<6;y++){
			 int c=0;//排版用
			 System.out.print("{");
			 for(int x=0;x<2;x++){
				 System.out.print(m[x][y]);
				 /*排版用*/
				 c++;
				 if(c==2){
					 break;
				 }else{
				       System.out.print(",");
				       continue;
				 }
				 /*排版用*/
			 }
			 System.out.print("}");
			 System.out.println();
		 }
	 }
}


