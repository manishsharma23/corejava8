public final class MyImmutableClass {
	private final int id;

	private final String name;

	public static void main(String[] args) {
		MyImmutableClass obj=new MyImmutableClass(1, "manish");
		System.out.println("obj...."+obj.getId()+"...."+obj.getName());
	}

	public MyImmutableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
