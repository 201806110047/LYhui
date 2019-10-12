/**
*Description:Arraycopy to my friend
*Author:     liyonghui
*Data:       2019-10-12
*/
public class Arraycopy{
/**
*Description:Arraycopy to my friend
*Param:      int a1[] ,int a2[]
*return:    int
*Date:      2019-10-12
*/
	public static void main(String[] args){
		int a1[]={1,2,3,4,5,6,7,8,9,10};
     	int a2[]={0,0,0,0,0,0,0,0,0,0};
	System.arraycopy(a1,0,a2,1,5);
     	System.out.print("a2:");
     	for(int i=0;i<a2.length;i++)
        	System.out.print(a2[i]+" ");
	}
}