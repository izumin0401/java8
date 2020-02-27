import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierSample {

    public static void main(String[] args) {

		Runnable r1 = () -> System.out.println("Let's go");
		final CyclicBarrier barrier = new CyclicBarrier(3, r1);

		Runnable r2 = () -> {
			System.out.println("Awaiting...");
			try {
				barrier.await();
			} catch (Exception e) { }
		};

		new Thread(r2).start();
		new Thread(r2).start();
		new Thread(r2).start();
	}
}
