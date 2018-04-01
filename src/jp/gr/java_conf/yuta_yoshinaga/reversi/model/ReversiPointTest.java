////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiPointTest.java
///	@brief			リバーシポイントテストクラス実装ファイル
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
///	@class		ReversiPointTest
///	@brief		リバーシポイントテストクラス
///
////////////////////////////////////////////////////////////////////////////////
class ReversiPointTest extends ReversiPoint
{

	@Test
	void testGetX() {
		int x = this.getX();
		boolean flag = false;
		if(x == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetX() {
		this.setX(1);
		int x = this.getX();
		boolean flag = false;
		if(x == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetY() {
		int y = this.getY();
		boolean flag = false;
		if(y == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetY() {
		this.setY(1);
		int y = this.getY();
		boolean flag = false;
		if(y == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiPoint() {
		ReversiPoint tgt = new ReversiPoint();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

}
