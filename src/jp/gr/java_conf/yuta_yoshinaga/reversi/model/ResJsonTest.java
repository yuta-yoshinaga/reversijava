package jp.gr.java_conf.yuta_yoshinaga.reversi.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ResJsonTest extends ResJson {

	@Test
	void testGetAuth() {
		String tgt = this.getAuth();
		boolean flag = false;
		if(tgt.isEmpty())	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetAuth() {
		this.setAuth("test");
		String tgt = this.getAuth();
		boolean flag = false;
		if(tgt.equals("test"))	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetCallbacks() {
		ArrayList<String> tgt = this.getCallbacks();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetCallbacks() {
		this.setCallbacks(new ArrayList<String>());
		ArrayList<String> tgt = this.getCallbacks();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testResJson() {
		ResJson tgt = new ResJson();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

}
