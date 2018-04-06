////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiAnzTest.java
///	@brief			リバーシ解析テストクラス実装ファイル
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

import jp.gr.java_conf.yuta_yoshinaga.reversi.model.ReversiAnz;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiAnzTest
///	@brief		リバーシ解析テストクラス
///
////////////////////////////////////////////////////////////////////////////////
class ReversiAnzTest extends ReversiAnz
{

	@Test
	void testGetMin() {
		int tgt = this.getMin();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetMin() {
		this.setMin(1);
		int tgt = this.getMin();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetMax() {
		int tgt = this.getMax();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetMax() {
		this.setMax(1);
		int tgt = this.getMax();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetAvg() {
		double tgt = this.getAvg();
		boolean flag = false;
		if(tgt == 0.0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetAvg() {
		this.setAvg(1.1);
		double tgt = this.getAvg();
		boolean flag = false;
		if(tgt == 1.1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetPointCnt() {
		int tgt = this.getPointCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetPointCnt() {
		this.setPointCnt(1);
		int tgt = this.getPointCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeCnt() {
		int tgt = this.getEdgeCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetEdgeCnt() {
		this.setEdgeCnt(1);
		int tgt = this.getEdgeCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideOneCnt() {
		int tgt = this.getEdgeSideOneCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetEdgeSideOneCnt() {
		this.setEdgeSideOneCnt(1);
		int tgt = this.getEdgeSideOneCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideTwoCnt() {
		int tgt = this.getEdgeSideTwoCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetEdgeSideTwoCnt() {
		this.setEdgeSideTwoCnt(1);
		int tgt = this.getEdgeSideTwoCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideThreeCnt() {
		int tgt = this.getEdgeSideThreeCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetEdgeSideThreeCnt() {
		this.setEdgeSideThreeCnt(1);
		int tgt = this.getEdgeSideThreeCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetEdgeSideOtherCnt() {
		int tgt = this.getEdgeSideOtherCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetEdgeSideOtherCnt() {
		this.setEdgeSideOtherCnt(1);
		int tgt = this.getEdgeSideOtherCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnMin() {
		int tgt = this.getOwnMin();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnMin() {
		this.setOwnMin(1);
		int tgt = this.getOwnMin();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnMax() {
		int tgt = this.getOwnMax();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnMax() {
		this.setOwnMax(1);
		int tgt = this.getOwnMax();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnAvg() {
		double tgt = this.getOwnAvg();
		boolean flag = false;
		if(tgt == 0.0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnAvg() {
		this.setOwnAvg(1.1);
		double tgt = this.getOwnAvg();
		boolean flag = false;
		if(tgt == 1.1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnPointCnt() {
		int tgt = this.getOwnPointCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnPointCnt() {
		this.setOwnPointCnt(1);
		int tgt = this.getOwnPointCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnEdgeCnt() {
		int tgt = this.getOwnEdgeCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnEdgeCnt() {
		this.setOwnEdgeCnt(1);
		int tgt = this.getOwnEdgeCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnEdgeSideOneCnt() {
		int tgt = this.getOwnEdgeSideOneCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnEdgeSideOneCnt() {
		this.setOwnEdgeSideOneCnt(1);
		int tgt = this.getOwnEdgeSideOneCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnEdgeSideTwoCnt() {
		int tgt = this.getOwnEdgeSideTwoCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnEdgeSideTwoCnt() {
		this.setOwnEdgeSideTwoCnt(1);
		int tgt = this.getOwnEdgeSideTwoCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnEdgeSideThreeCnt() {
		int tgt = this.getOwnEdgeSideThreeCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnEdgeSideThreeCnt() {
		this.setOwnEdgeSideThreeCnt(1);
		int tgt = this.getOwnEdgeSideThreeCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetOwnEdgeSideOtherCnt() {
		int tgt = this.getOwnEdgeSideOtherCnt();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetOwnEdgeSideOtherCnt() {
		this.setOwnEdgeSideOtherCnt(1);
		int tgt = this.getOwnEdgeSideOtherCnt();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetBadPoint() {
		int tgt = this.getBadPoint();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetBadPoint() {
		this.setBadPoint(1);
		int tgt = this.getBadPoint();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testGetGoodPoint() {
		int tgt = this.getGoodPoint();
		boolean flag = false;
		if(tgt == 0)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testSetGoodPoint() {
		this.setGoodPoint(1);
		int tgt = this.getGoodPoint();
		boolean flag = false;
		if(tgt == 1)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testReversiAnz() {
		ReversiAnz tgt = new ReversiAnz();
		boolean flag = false;
		if(tgt != null)	flag = true;
		assertTrue(flag);
	}

	@Test
	void testReset() {
		this.reset();
		boolean flag = true;
		if(this.getMin() != 0)						flag = false;
		if(this.getMax() != 0)						flag = false;
		if(this.getAvg() != 0.0)					flag = false;
		if(this.getPointCnt() != 0)					flag = false;
		if(this.getEdgeCnt() != 0)					flag = false;
		if(this.getEdgeSideOneCnt() != 0)			flag = false;
		if(this.getEdgeSideTwoCnt() != 0)			flag = false;
		if(this.getEdgeSideThreeCnt() != 0)			flag = false;
		if(this.getEdgeSideOtherCnt() != 0)			flag = false;
		if(this.getOwnMin() != 0)					flag = false;
		if(this.getOwnMax() != 0)					flag = false;
		if(this.getOwnAvg() != 0.0)					flag = false;
		if(this.getOwnPointCnt() != 0)				flag = false;
		if(this.getOwnEdgeCnt() != 0)				flag = false;
		if(this.getOwnEdgeSideOneCnt() != 0)		flag = false;
		if(this.getOwnEdgeSideTwoCnt() != 0)		flag = false;
		if(this.getOwnEdgeSideThreeCnt() != 0)		flag = false;
		if(this.getOwnEdgeSideOtherCnt() != 0)		flag = false;
		if(this.getBadPoint() != 0)					flag = false;
		if(this.getGoodPoint() != 0)				flag = false;
		assertTrue(flag);
	}

}
