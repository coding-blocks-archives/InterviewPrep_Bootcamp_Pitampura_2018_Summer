class Singleton {

	private Singleton() {

	}

	private static Singleton s = null;

	public static getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

}


// Singleton s = new Singleton() becomes impossible

// Singleton.getInstance(); is the only way to get it
