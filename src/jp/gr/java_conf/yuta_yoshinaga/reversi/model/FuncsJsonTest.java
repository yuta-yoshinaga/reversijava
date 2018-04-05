////////////////////////////////////////////////////////////////////////////////
///	@file			FuncsJsonTest.java
///	@brief			ファンクションJSONテストクラス実装ファイル
///	@author			Yuta Yoshinaga
///	@date			2018.04.01
///	$Version:		$
///	$Revision:		$
///
/// (c) 2018 Yuta Yoshinaga.
///
/// - 本ソフトウェアの一部又は全てを無断で複写複製（コピー）することは、
///   著作権侵害にあたりますので、これを禁止します。
/// - 本製品の使用に起因する侵害または特許権その他権利の侵害に関しては
///   当方は一切その責任を負いません。
///
////////////////////////////////////////////////////////////////////////////////
package jp.gr.java_conf.yuta_yoshinaga.reversi.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

////////////////////////////////////////////////////////////////////////////////
///	@class		FuncsJsonTest
///	@brief		ファンクションJSONテストクラス
///
////////////////////////////////////////////////////////////////////////////////
class FuncsJsonTest extends FuncsJson {

	@Test
	void testGetFunc() {
		String tgt = this.getFunc();
		boolean flag = false;
		if(tgt.isEmpty())	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetFunc() {
		this.setFunc("test");
		String tgt = this.getFunc();
		boolean flag = false;
		if(tgt.equals("test"))	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetParam1() {
		String tgt = this.getParam1();
		boolean flag = false;
		if(tgt.isEmpty())	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetParam1() {
		this.setParam1("test");
		String tgt = this.getParam1();
		boolean flag = false;
		if(tgt.equals("test"))	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetParam2() {
		String tgt = this.getParam2();
		boolean flag = false;
		if(tgt.isEmpty())	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetParam2() {
		this.setParam2("test");
		String tgt = this.getParam2();
		boolean flag = false;
		if(tgt.equals("test"))	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetParam3() {
		String tgt = this.getParam3();
		boolean flag = false;
		if(tgt.isEmpty())	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetParam3() {
		this.setParam3("test");
		String tgt = this.getParam3();
		boolean flag = false;
		if(tgt.equals("test"))	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetParam4() {
		String tgt = this.getParam4();
		boolean flag = false;
		if(tgt.isEmpty())	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetParam4() {
		this.setParam4("test");
		String tgt = this.getParam4();
		boolean flag = false;
		if(tgt.equals("test"))	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetParam5() {
		String tgt = this.getParam5();
		boolean flag = false;
		if(tgt.isEmpty())	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetParam5() {
		this.setParam5("test");
		String tgt = this.getParam5();
		boolean flag = false;
		if(tgt.equals("test"))	flag = true;
		assertTrue(flag);
	}

	@Test
	void testFuncsJson() {
		FuncsJson tgt = new FuncsJson();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

}
