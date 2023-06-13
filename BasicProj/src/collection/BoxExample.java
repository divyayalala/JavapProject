package collection;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box("water");
//		box.container=123;
//		box.container="this is String";
		
//		System.out.println(box.getValue());
		//this is not type safe
		Box<String> box = new Box<>("This is amazing");
		System.out.println(box.getValue());
		System.out.println(box.container.getClass().getName());
		Box<Integer> box1 = new Box<>(10);
		System.out.println(box1.getValue());
		System.out.println(box1.container.getClass().getName());
		Box<Boolean> box2 = new Box<>(true);
		System.out.println(box2.getValue());
		System.out.println(box2.container.getClass().getName());
		box.performSomeTask();
		box1.performSomeTask();
	}

}
