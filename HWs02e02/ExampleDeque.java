public class ExampleDeque {
	public static void main(String[] args) {
		Deque deque = new Deque();
			try {
				
		
				deque.pushBack(1);
				deque.showDeque();
				deque.pushBack(2);
				deque.showDeque();

				deque.pushBack(11);
				deque.showDeque();

				deque.pushBack(22);

				deque.showDeque();
				
				deque.pushBack(111);
				deque.showDeque();

				deque.pushBack(222);

				deque.showDeque();

				deque.popBack();
				deque.popFront();

								deque.showDeque();
				}
			catch (DequeOutOfBoundsExeption e){
				e.foundError();
			}
}
}