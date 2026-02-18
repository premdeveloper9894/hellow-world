package oops;

public class String_StringBuilder_StringBuffer {

	public static void main(String[] args) {
		// STRING:
		      /*
		       * > A sequence of chaaracter ,A String is IMMUTABLE, 
		       *   meaning you cannot change it after it is created.
		       * 
		       * Use String when:
		       *   >  The text will not change.
                   >  You want fast access and security.
		       */
		
		//STRINGBUILDER:
		    /*
		     * > A StringBuilder is mutable, meaning you can change the value without creating a new object.
               > Not thread-safe (not synchronized), but faster than StringBuffer.
               
               StringBuilder sb = new StringBuilder("Hello");
               sb.append(" World");  // modifies the same object

		     */
      //STRING BUFFER:
		  /*
		   * > Also mutable like StringBuilder.
		   * > Thread-safe (synchronized), meaning safe in multithreading, but slower.
		   */
		
		
		
		/*
		 *Quick Comparison Table
		 * | Feature          | String                  | StringBuilder                 | StringBuffer                  |
| ---------------- | ----------------------- | ----------------------------- | ----------------------------- |
| **Mutable?**     | ❌ No                    | ✔ Yes                         | ✔ Yes                         |
| **Thread-safe?** | ✔ Yes                   | ❌ No                          | ✔ Yes                         |
| **Speed**        | Slowest on modification | Fastest                       | Slower (because synchronized) |
| **When to use?** | Text doesn't change     | Fast changes in single thread | Safe changes in multithread   |

		 */
	}

}
