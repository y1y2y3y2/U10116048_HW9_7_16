//U10116048 ������ HW9 7.16
//�Ƨ�2���}�C
import java.util.*;
public class Sort2dimentionArray {
	//TestProgram1.16

	public static void main(String[] args) {
		SortProg sp =new SortProg();
		int [][] a = new int [6][2];
		/*�s�W����*/
		a[0][0]=4;
		a[0][1]=2;
		a[1][0]=1;
		a[1][1]=7;
		a[2][0]=4;
		a[2][1]=5;
		a[3][0]=1;
		a[3][1]=2;
		a[4][0]=1;
		a[4][1]=1;
		a[5][0]=4;
		a[5][1]=4;
		/**/
		System.out.println("��l�}�C:");
		sp.display(a);
		System.out.println("-----------------");
		System.out.println("�Ƨǫ�}�C:");
		sp.Sort(a);
	}

}
class SortProg{
	 public static void Sort(int m[][] ){
		
		
		display(m);
		 
	    }
	 public static void display(int m[][]){
		 
		 for(int x=0;x<6;x++){
			 int c=0;//�ƪ���
			 System.out.print("{");
			 for(int y=0;y<2;y++){
				 System.out.print(m[x][y]);
				 /*�ƪ���*/
				 c++;
				 if(c==2){
					 break;
				 }else{
				       System.out.print(",");
				       continue;
				 }
				 /*�ƪ���*/
			 }
			 System.out.print("}");
			 System.out.println();
		 }
	 }
}


