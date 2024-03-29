package mission.cs.cs05;

public class Main {

	public static void main(String[] args) {
		Memory memory = new Memory();
		int stackMemoryAddress = memory.init(10000, 10000);
		memory.setSize("int", 4);
		memory.setSize("mouse", 32);
		memory.setSize("cat", 8);
		memory.setSize("cat", 1);

		int arrayInt = memory.malloc("int", 20);
		printstatus(arrayInt, stackMemoryAddress, memory);

		int arrayMouse = memory.malloc("mouse", 5);
		printstatus(arrayMouse, stackMemoryAddress, memory);

		int arrayCat = memory.malloc("cat", 10);
		printstatus(arrayCat, stackMemoryAddress, memory);

		Print.print(memory.usage());

		memory.call("method1", 10);

		System.out.println("메소드 콜 이후");
		Print.print(memory.usage());
		System.out.println();

		for (String s : memory.heapdump()) {
			System.out.print(s + " ");
		}
		System.out.println();

		memory.free(arrayInt);

		for (String s : memory.heapdump()) {
			System.out.print(s + " ");
		}
		System.out.println();

		memory.free(arrayMouse);
		for (String s : memory.heapdump()) {
			System.out.print(s + " ");
		}
		System.out.println();
		memory.free(arrayCat);

		Print.print(memory.usage());

	}

	private static void printstatus(int arrayInt, int stackMemoryAddress, Memory memory) {
		System.out.print("stack 주소 값 : ");
		System.out.println(arrayInt);
		System.out.print("stack 상대주소 값 : ");
		System.out.println(stackMemoryAddress - arrayInt);
		System.out.print("heap 주소 값 : ");
		StackPoint tmp = (StackPoint) memory.getStackArea().getStack().peek();
		System.out.println(tmp.getHeapPointer());
		System.out.println("");
	}

}
