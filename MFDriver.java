public class MFDriver{

    public static int[][] populate(int[][] a){
	int num = 0;
	for(int x = 0; x< size; x++){
	    for(int y = 0; y<size; y++)
		a[x][y] = num;
	    num++;
	}	
	return rtr; 
    }

    public static void main(String[] args){
	int size = 0; 
	int[][] a;
	int target;
	
	while(size < 10000){
	    a = new int[size][size];
	    populate(a); 
	    target = Math.random * size;
	    
	    counter--;
	} 
    }
}
