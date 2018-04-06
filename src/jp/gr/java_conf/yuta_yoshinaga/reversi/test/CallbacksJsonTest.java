////////////////////////////////////////////////////////////////////////////////
///	@file			CallbacksJsonTest.java
///	@brief			コールバックJSONテストクラス実装ファイル
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

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.CallbacksJson;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.FuncsJson;

////////////////////////////////////////////////////////////////////////////////
///	@class		CallbacksJsonTest
///	@brief		コールバックJSONテストクラス
///
////////////////////////////////////////////////////////////////////////////////
class CallbacksJsonTest extends CallbacksJson {

	@Test
	void testGetFuncs() {
		ArrayList<FuncsJson> tgt = this.getFuncs();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetFuncs() {
		this.setFuncs(new ArrayList<FuncsJson>());
		ArrayList<FuncsJson> tgt = this.getFuncs();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testCallbacksJson() {
		CallbacksJson tgt = new CallbacksJson();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

}
