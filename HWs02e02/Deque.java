public class Deque {

	int[] deque;

	Deque() {
		this.deque = new int[0];
	}

	public void showDeque() {
		int dlina = this.deque.length;
		for (int i = 0; i < dlina; i++) {
			System.out.print(deque[i]);
			System.out.print(" ");

		}
		System.out.println();
	}

	void pushBack(int x) {
		int dlina = this.deque.length;
		int[] rezervMassive = new int[dlina];
		for (int i = 0; i < dlina; i++) {
			rezervMassive[i] = this.deque[i];
		}
		this.deque = new int[dlina + 1];
		deque[0] = x;

		for (int i = 0; i < dlina; i++) {
			deque[i + 1] = rezervMassive[i];
		}
		dlina = deque.length;
	
	}

	void pushFront(int x) {
		int dlina = deque.length;
		int[] rezervMassive = new int[dlina];
		for (int i = 0; i < dlina; i++) {
			rezervMassive[i] = deque[i];
		}

		this.deque = new int[dlina + 1];
		deque[dlina] = x;
		for (int i = 0; i < dlina; i++) {
			deque[i] = rezervMassive[i];
		}
	}

	void popBack() throws DequeOutOfBoundsExeption {
		int dlina = deque.length;
		if (dlina == 0) {
			throw new DequeOutOfBoundsExeption();

		}
		int[] rezervMassive = new int[dlina];
		for (int i = 0; i < dlina; i++) {
			rezervMassive[i] = deque[i];
		}

		this.deque = new int[dlina - 1];
		for (int i = 0; i < dlina - 1; i++) {
			deque[i] = rezervMassive[i + 1];
		}
	}

	void popFront() throws DequeOutOfBoundsExeption {

		int dlina = deque.length;
		if (dlina == 0) {
			throw new DequeOutOfBoundsExeption();

		}

		int[] rezervMassive = new int[dlina];

		for (int i = 0; i < dlina; i++) {
			rezervMassive[i] = deque[i];
		}

		this.deque = new int[dlina - 1];
		for (int i = 0; i < dlina - 1; i++) {
			deque[i] = rezervMassive[i];
		}

	}

	}
