////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiPlayTest.java
///	@brief			リバーシプレイテストクラス実装ファイル
///	@author			Yuta Yoshinaga
///	@date			2018.04.01
///	$Version:		$
///	$Revision:		$
///
/// Copyright (c) 2018 Yuta Yoshinaga. All Rights reserved.
///
/// - 本ソフトウェアの一部又は全てを無断で複写複製（コピー）することは、
///   著作権侵害にあたりますので、これを禁止します。
/// - 本製品の使用に起因する侵害または特許権その他権利の侵害に関しては
///   当社は一切その責任を負いません。
///
////////////////////////////////////////////////////////////////////////////////

package jp.gr.java_conf.yuta_yoshinaga.reversi.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.Reversi;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiConst;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlay;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPlayDelegate;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiPoint;
import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiSetting;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiPlayTest
///	@brief		リバーシプレイテストクラス
///
////////////////////////////////////////////////////////////////////////////////
class ReversiPlayTest extends ReversiPlay
{

	@Test
	void testGetmReversi() {
		Reversi tgt = this.getmReversi();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmReversi() {
		this.setmReversi(new Reversi());
		Reversi tgt = this.getmReversi();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmSetting() {
		ReversiSetting tgt = this.getmSetting();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmSetting() {
		this.setmSetting(new ReversiSetting());
		ReversiSetting tgt = this.getmSetting();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmCurColor() {
		int tgt = this.getmCurColor();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmCurColor() {
		this.setmCurColor(ReversiConst.REVERSI_STS_WHITE);
		int tgt = this.getmCurColor();
		boolean flag = false;
		if(tgt == ReversiConst.REVERSI_STS_WHITE)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmCpu() {
		ReversiPoint[] tgt = this.getmCpu();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmCpu() {
		this.setmCpu(new ReversiPoint[8*8]);
		ReversiPoint[] tgt = this.getmCpu();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmEdge() {
		ReversiPoint[] tgt = this.getmEdge();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmEdge() {
		this.setmEdge(new ReversiPoint[8*8]);
		ReversiPoint[] tgt = this.getmEdge();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPassEnaB() {
		int tgt = this.getmPassEnaB();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPassEnaB() {
		this.setmPassEnaB(1);
		int tgt = this.getmPassEnaB();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPassEnaW() {
		int tgt = this.getmPassEnaW();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPassEnaW() {
		this.setmPassEnaW(1);
		int tgt = this.getmPassEnaW();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmGameEndSts() {
		int tgt = this.getmGameEndSts();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmGameEndSts() {
		this.setmGameEndSts(1);
		int tgt = this.getmGameEndSts();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmPlayLock() {
		int tgt = this.getmPlayLock();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmPlayLock() {
		this.setmPlayLock(1);
		int tgt = this.getmPlayLock();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetR() {
		Random tgt = this.getR();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetR() {
		this.setR(new Random());
		Random tgt = this.getR();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetmDelegate() {
		ReversiPlayDelegate tgt = this.getmDelegate();
		boolean flag = false;
		if(tgt == null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetmDelegate() {
//		this.setmDelegate(new ReversiPlayDelegate());
		ReversiPlayDelegate tgt = this.getmDelegate();
		boolean flag = false;
		if(tgt == null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiPlay() {
		ReversiPlay tgt = new ReversiPlay();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiPlay1() {
		this.reversiPlay(0,0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiPlaySub() {
		this.reversiPlaySub(0,0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiPlayEnd() {
		this.reversiPlayEnd();
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiPlayPass() {
		this.reversiPlayPass(ReversiConst.REVERSI_STS_BLACK);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiPlayCpu() {
		this.reversiPlayCpu(ReversiConst.REVERSI_STS_BLACK,0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testDrawUpdate() {
		this.drawUpdate(ReversiConst.DEF_ASSIST_ON);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testDrawUpdateForcibly() {
		this.drawUpdateForcibly(ReversiConst.DEF_ASSIST_ON);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testReset() {
		this.reset();
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testGameEndAnimExec() {
		this.gameEndAnimExec();
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testSendDrawMsg() {
		this.sendDrawMsg(0,0);
		boolean flag = true;
		assertTrue(flag);
	}

	@Test
	void testSendDrawInfoMsg() {
		this.sendDrawInfoMsg(0,0);
		boolean flag = true;
		assertTrue(flag);
	}

}
