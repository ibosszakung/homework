package th.ac.utcc.Panupong;

public class bubble {
	private double [] element;
	private int eSize;
	
	public bubble(int size) {
		if(size > 0)
			this.element = new double[size];
			else
				this.element = new double[10];
		eSize = 0;
		
	}
	
	public void insert( double s) {
		this.element[eSize] = s;
		eSize++;
		
	}
	
	public void show(){
		for(int i=0; i < eSize; i++) {
			System.out.print(this.element[i] + " ");			
		}
		
		System.out.println("");			
	}
	
	public void bubbleSort(){
		int out, in;
		
		for(out = eSize - 1; out > 0; out--) {
			for(in = 0; in<out;in++){
				if(this.element[in] < this.element[in + 1]) {
					this.swap(in, in+1);
			
				}
			}
		}
	}

	
	private void swap(int left, int right){
		 double temp = this.element[left];
		this.element[left] = this.element[right];
		this.element[right] = temp;
	}
	
	public static void main(String [] args){
		//
		int max = 20;
		bubble bubble = new bubble(max);
		
		bubble.insert(87) ;
		bubble.insert(43) ;
		bubble.insert(98) ;
		bubble.insert(32) ;
		bubble.insert(91) ;
		bubble.insert(78) ;
		bubble.insert(26) ;
		bubble.insert(12) ;
		
		// show original order
		System.out.print("Original Order : ");
		bubble.show();
		
		// sort and then show the result
		bubble.bubbleSort();
		System.out.print("Sorced Order : ");
		bubble.show();
	}
}
