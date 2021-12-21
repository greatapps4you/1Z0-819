package us.greatapps4you.ocp.mostmissed.loops;

public class OCPLoops {

	void crazyLoop() {
		var c = 0;
		JACK: while (c < 8) {
			JILL: System.out.println(c);
			if (c > 3)
				break JACK;
			else
				c++;
		}
	}

}
