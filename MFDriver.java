public class MFDriver{

    public static int[][] populate(int[][] a){
	int num = 0;
	for(int x = 0; x < a.length; x++){
	    for(int y = 0; y < a.length; y++)
		a[x][y] = num;
	    num++;
	}	
	return a; 
    }

    public static void main(String[] args){
	int[][] a;
	int size = 1; 
	int target = 0;
	int total = 0; 
	int counter = 0; 
	
	while(size <= 10000){
	    a = new int[size][size];
	    populate(a);
	    target = (int) Math.random() * size;

	    while (counter < 10000) {
		long startTime = System.nanoTime();
		MatrixFinder.finder(a, target);
		long endTime = System.nanoTime() - startTime;
		total += endTime;
		counter ++; 
	    }
	    System.out.println(size + " ," + total/10000.0);
	    total = 0; 
	    size++; 
	} 
    }
}
