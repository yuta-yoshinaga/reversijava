////////////////////////////////////////////////////////////////////////////////
///	@file			ResJsonTest.java
///	@brief			レスポンスJSONテストクラス実装ファイル
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
package jp.gr.java_conf.yuta_yoshinaga.reversi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.CallbacksJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ResJson;

////////////////////////////////////////////////////////////////////////////////
///	@class		ResJsonTest
///	@brief		レスポンスJSONテストクラス
///
////////////////////////////////////////////////////////////////////////////////
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
		CallbacksJson tgt = this.getCallbacks();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetCallbacks() {
		this.setCallbacks(new CallbacksJson());
		CallbacksJson tgt = this.getCallbacks();
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
