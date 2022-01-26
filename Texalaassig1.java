package Pooja.runner;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * This is a runner class/main class 
 * @author Pooja
 *
 */
public class Texalaassig1 {

	public static void main(String[] args) {
		List<Class> tests = new ArrayList<Class>();
		tests.add(Pooja.junitclass.Junit.class);
		Result result = JUnitCore.runClasses(tests.get(0));
	}
}