////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiHistoryTest.java
///	@brief			リバーシ履歴テストクラス実装ファイル
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
///	@class		ReversiHistoryTest
///	@brief		リバーシ履歴テストクラス
///
////////////////////////////////////////////////////////////////////////////////
class ReversiHistoryTest extends ReversiHistory
{

	@Test
	void testGetPoint() {
		ReversiPoint tgt = this.getPoint();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetPoint() {
		this.setPoint(new ReversiPoint());
		ReversiPoint tgt = this.getPoint();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetColor() {
		int tgt = this.getColor();
		boolean flag = false;
		if(tgt == -1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetColor() {
		this.setColor(0);
		int tgt = this.getColor();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiHistory() {
		ReversiHistory tgt = new ReversiHistory();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testReset() {
		this.reset();
		ReversiPoint tgt = this.getPoint();
		boolean flag = true;
		if(tgt == null)			flag = false;
		if(tgt.getX() != -1)		flag = false;
		if(tgt.getY() != -1)		flag = false;
		if(this.getColor() != -1)	flag = false;
		assertTrue(flag);
	}

}
