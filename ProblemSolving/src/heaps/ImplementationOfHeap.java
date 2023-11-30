package heaps;
import java.util.PriorityQueue;

public class ImplementationOfHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
		
		
		Integer ar[] = {1,2,3,4,5,6,7};
		
		for(Integer val : ar) {
			minHeap.add(val);
			maxHeap.add(val);
		}
		System.out.println("Min Heap");
		while(minHeap.peek() != null) {
			System.out.print( minHeap.poll()+ " ");
			
			
		}
		
		System.out.println();
		System.out.println("Max Heap");
		while(maxHeap.peek() != null) {
			System.out.print(maxHeap.poll() + " ");
			
			
		}
		
	}

}
