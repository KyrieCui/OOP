package test;

public class test {
	public static void main(String agrs[]) {
	int [][] a={{1,1,0,0,0},{1,1,1,0,0},{1,1,1,1,0},{1,1,1,1,1},{1,1,1,1,1}};
	int sum = 0;
    int i = 0;
    int j = 0;
    while (i<5)
    {
        if ((a[i][j] == 1)&&(j<5))
        {
            j++;
            sum++;
        }
        else
        {
            i++;
            j=0;
        }
        
}
	System.out.println(sum);
}
}

