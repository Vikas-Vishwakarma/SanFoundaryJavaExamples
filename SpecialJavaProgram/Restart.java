package sanfoundary.special;

public class Restart {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			System.out.println("Your Computer will be restarted in 5 seconds");
			runtime.exec("Shutdown -r -t 5");
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
