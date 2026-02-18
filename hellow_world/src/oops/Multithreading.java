package oops;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Multithreading {

	public static void main(String[] args) {
		
		

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
 
		/*
		 * Multithreading in Java means running two or more threads at the same time inside a single program.
		 * 
		 * real time example:

            Think about a kitchen:

              One person makes tea ☕

              Another person washes dishes 🍽️

             Another cooks food 🍳

             All at the same time → this is multithreading.
		 */
		
		/*
		 * Why Use Multithreading?

✔️ Faster performance

✔️ Better use of CPU

✔️ Multiple tasks can run independently

✔️ Smooth user experience (e.g., apps don't freeze)
		 */
		
		/*
		 * | Term               | Simple Meaning             |
| ------------------ | -------------------------- |
| **Thread**         | one small task             |
| **Multithreading** | running many tasks at once |

		 */

		

	}

}
