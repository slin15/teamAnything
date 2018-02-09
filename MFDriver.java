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
	
	
	while(size <= 5000){
	    long total = 0;
	    int counter = 0;
	    a = new int[size][size];
	    populate(a);
	    int target = (int) Math.random() * size;

	    while (counter < 10000) {
		long startTime = System.nanoTime();
		//long startTime = System.currentTimeMillis();
		MatrixFinder.finder(a, target);
		long endTime = System.nanoTime() - startTime;
		//long endTime = System.currentTimeMillis() - startTime;
		total += endTime;
		counter ++; 
	    }
	    System.out.println(size + " ," + total);
	    total = 0; 
	    size++; 
	} 
    }
}
