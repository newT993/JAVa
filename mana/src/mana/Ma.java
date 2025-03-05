package mana;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Ma {
	public static void main(String[] args) {
		TestFieldFrame testFieldFrame = new TestFieldFrame();
		testFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFieldFrame.setSize(350, 100);
		testFieldFrame.setVisible(true);
	}
}
