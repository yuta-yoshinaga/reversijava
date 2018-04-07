////////////////////////////////////////////////////////////////////////////////
///	@file			Reversi.java
///	@brief			リバーシクラス実装ファイル
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

import java.io.Serializable;

////////////////////////////////////////////////////////////////////////////////
///	@class		Reversi
///	@brief		リバーシクラス
///
////////////////////////////////////////////////////////////////////////////////
public class Reversi implements Serializable
{
	private int mMasuSts[][];											//!< マスの状態
	private int mMasuStsOld[][];										//!< 以前のマスの状態
	private int mMasuStsEnaB[][];										//!< 黒の置ける場所
	private int mMasuStsCntB[][];										//!< 黒の獲得コマ数
	private int mMasuStsPassB[][];										//!< 黒が相手をパスさせる場所
	private ReversiAnz mMasuStsAnzB[][];								//!< 黒がその場所に置いた場合の解析結果
	private ReversiPoint mMasuPointB[];									//!< 黒の置ける場所座標一覧
	private int mMasuPointCntB;											//!< 黒の置ける場所座標一覧数
	private int mMasuBetCntB;											//!< 黒コマ数
	private int mMasuStsEnaW[][];										//!< 白の置ける場所
	private int mMasuStsCntW[][];										//!< 白の獲得コマ数
	private int mMasuStsPassW[][];										//!< 白が相手をパスさせる場所
	private ReversiAnz mMasuStsAnzW[][];								//!< 白がその場所に置いた場合の解析結果
	private ReversiPoint mMasuPointW[];									//!< 白の置ける場所座標一覧
	private int mMasuPointCntW;											//!< 白の置ける場所座標一覧数
	private int mMasuBetCntW;											//!< 白コマ数
	private int mMasuCnt;												//!< 縦横マス数
	private int mMasuCntMax;											//!< 縦横マス最大数
	private ReversiHistory mMasuHist[];									//!< 履歴
	private int mMasuHistCur;											//!< 履歴現在位置

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuSts()
	///	@return			int mMasuSts[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuSts() {
		return mMasuSts;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuSts(int[][] mMasuSts)
	///	@param[in]		int[][] mMasuSts
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuSts(int[][] mMasuSts) {
		this.mMasuSts = mMasuSts;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuStsOld()
	///	@return			int mMasuStsOld[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuStsOld() {
		return mMasuStsOld;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsOld(int[][] mMasuStsOld)
	///	@param[in]		int[][] mMasuStsOld
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsOld(int[][] mMasuStsOld) {
		this.mMasuStsOld = mMasuStsOld;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuStsEnaB()
	///	@return			int mMasuStsEnaB[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuStsEnaB() {
		return mMasuStsEnaB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsEnaB(int[][] mMasuStsEnaB)
	///	@param[in]		int[][] mMasuStsEnaB
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsEnaB(int[][] mMasuStsEnaB) {
		this.mMasuStsEnaB = mMasuStsEnaB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuStsCntB()
	///	@return			int mMasuStsCntB[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuStsCntB() {
		return mMasuStsCntB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsCntB(int[][] mMasuStsCntB)
	///	@param[in]		int[][] mMasuStsCntB
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsCntB(int[][] mMasuStsCntB) {
		this.mMasuStsCntB = mMasuStsCntB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuStsPassB()
	///	@return			int mMasuStsPassB[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuStsPassB() {
		return mMasuStsPassB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsPassB(int[][] mMasuStsPassB)
	///	@param[in]		int[][] mMasuStsPassB
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsPassB(int[][] mMasuStsPassB) {
		this.mMasuStsPassB = mMasuStsPassB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				ReversiAnz[][] getmMasuStsAnzB()
	///	@return			ReversiAnz mMasuStsAnzB[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiAnz[][] getmMasuStsAnzB() {
		return mMasuStsAnzB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsAnzB(ReversiAnz[][] mMasuStsAnzB)
	///	@param[in]		ReversiAnz[][] mMasuStsAnzB
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsAnzB(ReversiAnz[][] mMasuStsAnzB) {
		this.mMasuStsAnzB = mMasuStsAnzB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				ReversiPoint[] getmMasuPointB()
	///	@return			ReversiPoint mMasuPointB[]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiPoint[] getmMasuPointB() {
		return mMasuPointB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuPointB(ReversiPoint[] mMasuPointB)
	///	@param[in]		ReversiPoint[] mMasuPointB
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuPointB(ReversiPoint[] mMasuPointB) {
		this.mMasuPointB = mMasuPointB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuPointCntB()
	///	@return			int mMasuPointCntB
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuPointCntB() {
		return mMasuPointCntB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuPointCntB(int mMasuPointCntB)
	///	@param[in]		int mMasuPointCntB
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuPointCntB(int mMasuPointCntB) {
		this.mMasuPointCntB = mMasuPointCntB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuBetCntB()
	///	@return			int mMasuBetCntB
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuBetCntB() {
		return mMasuBetCntB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuBetCntB(int mMasuBetCntB)
	///	@param[in]		int mMasuBetCntB
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuBetCntB(int mMasuBetCntB) {
		this.mMasuBetCntB = mMasuBetCntB;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuStsEnaW()
	///	@return			int mMasuStsEnaW[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuStsEnaW() {
		return mMasuStsEnaW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsEnaW(int[][] mMasuStsEnaW)
	///	@param[in]		int[][] mMasuStsEnaW
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsEnaW(int[][] mMasuStsEnaW) {
		this.mMasuStsEnaW = mMasuStsEnaW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuStsCntW()
	///	@return			int mMasuStsCntW[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuStsCntW() {
		return mMasuStsCntW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsCntW(int[][] mMasuStsCntW)
	///	@param[in]		int[][] mMasuStsCntW
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsCntW(int[][] mMasuStsCntW) {
		this.mMasuStsCntW = mMasuStsCntW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int[][] getmMasuStsPassW()
	///	@return			int mMasuStsPassW[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int[][] getmMasuStsPassW() {
		return mMasuStsPassW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsPassW(int[][] mMasuStsPassW)
	///	@param[in]		int[][] mMasuStsPassW
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsPassW(int[][] mMasuStsPassW) {
		this.mMasuStsPassW = mMasuStsPassW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				ReversiAnz[][] getmMasuStsAnzW()
	///	@return			ReversiAnz mMasuStsAnzW[][]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiAnz[][] getmMasuStsAnzW() {
		return mMasuStsAnzW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuStsAnzW(ReversiAnz[][] mMasuStsAnzW)
	///	@param[in]		ReversiAnz[][] mMasuStsAnzW
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuStsAnzW(ReversiAnz[][] mMasuStsAnzW) {
		this.mMasuStsAnzW = mMasuStsAnzW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				ReversiPoint[] getmMasuPointW()
	///	@return			ReversiPoint mMasuPointW[]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiPoint[] getmMasuPointW() {
		return mMasuPointW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuPointW(ReversiPoint[] mMasuPointW)
	///	@param[in]		ReversiPoint[] mMasuPointW
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuPointW(ReversiPoint[] mMasuPointW) {
		this.mMasuPointW = mMasuPointW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuPointCntW()
	///	@return			int mMasuPointCntW
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuPointCntW() {
		return mMasuPointCntW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuPointCntW(int mMasuPointCntW)
	///	@param[in]		int mMasuPointCntW
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuPointCntW(int mMasuPointCntW) {
		this.mMasuPointCntW = mMasuPointCntW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuBetCntW()
	///	@return			int mMasuBetCntW
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuBetCntW() {
		return mMasuBetCntW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuBetCntW(int mMasuBetCntW)
	///	@param[in]		int mMasuBetCntW
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuBetCntW(int mMasuBetCntW) {
		this.mMasuBetCntW = mMasuBetCntW;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuCnt()
	///	@return			int mMasuCnt
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuCnt() {
		return mMasuCnt;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuCnt(int mMasuCnt)
	///	@param[in]		int mMasuCnt
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuCnt(int mMasuCnt) {
		this.mMasuCnt = mMasuCnt;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuCntMax()
	///	@return			int mMasuCntMax
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuCntMax() {
		return mMasuCntMax;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuCntMax(int mMasuCntMax)
	///	@param[in]		int mMasuCntMax
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuCntMax(int mMasuCntMax) {
		this.mMasuCntMax = mMasuCntMax;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				ReversiHistory[] getmMasuHist()
	///	@return			ReversiHistory mMasuHist[]
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiHistory[] getmMasuHist() {
		return mMasuHist;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuHist(ReversiHistory[] mMasuHist)
	///	@param[in]		ReversiHistory[] mMasuHist
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuHist(ReversiHistory[] mMasuHist) {
		this.mMasuHist = mMasuHist;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuHistCur()
	///	@return			int mMasuHistCur
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuHistCur() {
		return mMasuHistCur;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuHistCur(int mMasuHistCur)
	///	@param[in]		int mMasuHistCur
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuHistCur(int mMasuHistCur) {
		this.mMasuHistCur = mMasuHistCur;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public Reversi(int masuCnt,int masuMax)
	///	@param[in]		int masuCnt		縦横マス数
	///	@param[in]		int masuMax		縦横マス最大数
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public Reversi(int masuCnt,int masuMax)
	{
		this.mMasuCnt		= masuCnt;
		this.mMasuCntMax		= masuMax;
		this.mMasuSts		= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsOld	= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsEnaB	= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsCntB	= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsPassB	= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsAnzB	= new ReversiAnz [this.mMasuCntMax][this.mMasuCntMax];
		for(int i=0;i<this.mMasuCntMax;i++){
			for(int j=0;j<this.mMasuCntMax;j++){
				this.mMasuStsAnzB[i][j] = new ReversiAnz();
			}
		}
		this.mMasuPointB	= new ReversiPoint [this.mMasuCntMax * this.mMasuCntMax];
		for(int i=0;i<(this.mMasuCntMax * this.mMasuCntMax);i++){
			this.mMasuPointB[i] = new ReversiPoint();
		}
		this.mMasuPointCntB	= 0;
		this.mMasuStsEnaW	= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsCntW	= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsPassW	= new int [this.mMasuCntMax][this.mMasuCntMax];
		this.mMasuStsAnzW	= new ReversiAnz [this.mMasuCntMax][this.mMasuCntMax];
		for(int i=0;i<this.mMasuCntMax;i++){
			for(int j=0;j<this.mMasuCntMax;j++){
				this.mMasuStsAnzW[i][j] = new ReversiAnz();
			}
		}
		this.mMasuPointW		= new ReversiPoint [this.mMasuCntMax * this.mMasuCntMax];
		for(int i=0;i<(this.mMasuCntMax * this.mMasuCntMax);i++){
			this.mMasuPointW[i] = new ReversiPoint();
		}
		this.mMasuPointCntW	= 0;
		this.mMasuBetCntB = 0;
		this.mMasuBetCntW = 0;
		this.mMasuHist		= new ReversiHistory [this.mMasuCntMax * this.mMasuCntMax];
		for(int i=0;i<(this.mMasuCntMax * this.mMasuCntMax);i++){
			this.mMasuHist[i] = new ReversiHistory();
		}
		this.mMasuHistCur = 0;
		for (int i = 0; i < mMasuCntMax; i++){
			System.arraycopy(this.mMasuSts[i], 0, this.mMasuStsOld[i], 0, this.mMasuSts[i].length);
		}
		this.reset();
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public Reversi()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public Reversi()
	{
		this(ReversiConst.REVERSI_MASU_CNT,ReversiConst.REVERSI_MASU_CNT);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リセット
	///	@fn				public void reset()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void reset()
	{
		for(int i=0;i<this.mMasuCnt;i++){
			for(int j=0;j<this.mMasuCnt;j++){
				this.mMasuSts[i][j] = ReversiConst.REVERSI_STS_NONE;
				this.mMasuStsPassB[i][j] = 0;
				this.mMasuStsAnzB[i][j].reset();
				this.mMasuStsPassW[i][j] = 0;
				this.mMasuStsAnzW[i][j].reset();
			}
		}
		this.mMasuSts[(this.mMasuCnt >> 1) - 1][(this.mMasuCnt >> 1) - 1]	= ReversiConst.REVERSI_STS_BLACK;
		this.mMasuSts[(this.mMasuCnt >> 1) - 1][(this.mMasuCnt >> 1)]		= ReversiConst.REVERSI_STS_WHITE;
		this.mMasuSts[(this.mMasuCnt >> 1)][(this.mMasuCnt >> 1) - 1]		= ReversiConst.REVERSI_STS_WHITE;
		this.mMasuSts[(this.mMasuCnt >> 1)][(this.mMasuCnt >> 1)]			= ReversiConst.REVERSI_STS_BLACK;
		this.makeMasuSts(ReversiConst.REVERSI_STS_BLACK);
		this.makeMasuSts(ReversiConst.REVERSI_STS_WHITE);
		this.mMasuHistCur = 0;
		for (int i = 0; i < mMasuCntMax; i++){
			System.arraycopy(this.mMasuSts[i], 0, this.mMasuStsOld[i], 0, this.mMasuSts[i].length);
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			各コマの置ける場所等のステータス作成
	///	@fn				private int makeMasuSts(int color)
	///	@param[in]		int color		ステータスを作成するコマ
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	private int makeMasuSts(int color)
	{
		int flg,okflg = 0,cnt1,cnt2,count1,count2 = 0,ret = -1,countMax = 0,loop;
		for(int i = 0;i < this.mMasuCnt;i++){								// 初期化
			for(int j = 0;j < this.mMasuCnt;j++){
				if(color == ReversiConst.REVERSI_STS_BLACK){
					this.mMasuStsEnaB[i][j] = 0;
					this.mMasuStsCntB[i][j] = 0;
				}else{
					this.mMasuStsEnaW[i][j] = 0;
					this.mMasuStsCntW[i][j] = 0;
				}
			}
		}

		loop = this.mMasuCnt * this.mMasuCnt;
		for(int i = 0;i < loop;i++){										// 初期化
			if(color == ReversiConst.REVERSI_STS_BLACK){
				this.mMasuPointB[i].setX(0);
				this.mMasuPointB[i].setY(0);
			}else{
				this.mMasuPointW[i].setX(0);
				this.mMasuPointW[i].setY(0);
			}
		}
		if(color == ReversiConst.REVERSI_STS_BLACK){
			this.mMasuPointCntB	= 0;
		}else{
			this.mMasuPointCntW	= 0;
		}
		this.mMasuBetCntB	= 0;
		this.mMasuBetCntW	= 0;

		for(int i = 0;i < this.mMasuCnt;i++){
			for(int j = 0;j < this.mMasuCnt;j++){
				okflg = 0;
				count2 = 0;
				if(this.mMasuSts[i][j] == ReversiConst.REVERSI_STS_NONE){	// 何も置かれていないマスなら
					cnt1 = i;
					count1 = flg =0;
					// *** 上方向を調べる *** //
					while((cnt1 > 0) && (this.mMasuSts[cnt1-1][j] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt1-1][j] != color)){
						flg = 1;
						cnt1--;
						count1++;
					}
					if((cnt1 > 0) && (flg == 1) && (this.mMasuSts[cnt1-1][j] == color)){
						okflg = 1;
						count2 += count1;
					}
					cnt1 = i;
					count1 = flg = 0;
					// *** 下方向を調べる *** //
					while((cnt1 < (this.mMasuCnt-1)) && (this.mMasuSts[cnt1+1][j] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt1+1][j] != color)){
						flg = 1;
						cnt1++;
						count1++;
					}
					if((cnt1 < (this.mMasuCnt-1)) && (flg == 1) && (this.mMasuSts[cnt1+1][j] == color)){
						okflg = 1;
						count2 += count1;
					}
					cnt2 = j;
					count1 = flg = 0;
					// *** 右方向を調べる *** //
					while((cnt2 < (this.mMasuCnt-1)) && (this.mMasuSts[i][cnt2+1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[i][cnt2+1] != color)){
						flg = 1;
						cnt2++;
						count1++;
					}
					if((cnt2 < (this.mMasuCnt-1)) && (flg == 1) && (this.mMasuSts[i][cnt2+1] == color)){
						okflg = 1;
						count2 += count1;
					}
					cnt2 = j;
					count1 = flg = 0;
					// *** 左方向を調べる *** //
					while((cnt2 > 0) && (this.mMasuSts[i][cnt2-1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[i][cnt2-1] != color)){
						flg = 1;
						cnt2--;
						count1++;
					}
					if((cnt2 > 0) && (flg == 1) && (this.mMasuSts[i][cnt2-1] == color)){
						okflg = 1;
						count2 += count1;
					}
					cnt2 = j;
					cnt1 = i;
					count1 = flg = 0;
					// *** 右上方向を調べる *** //
					while(((cnt2 < (this.mMasuCnt-1)) && (cnt1 > 0)) && (this.mMasuSts[cnt1-1][cnt2+1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt1-1][cnt2+1] != color)){
						flg = 1;
						cnt1--;
						cnt2++;
						count1++;
					}
					if(((cnt2 < (this.mMasuCnt-1)) && (cnt1 > 0)) && (flg == 1) && (this.mMasuSts[cnt1-1][cnt2+1] == color)){
						okflg = 1;
						count2 += count1;
					}
					cnt2 = j;
					cnt1 = i;
					count1 = flg = 0;
					// *** 左上方向を調べる *** //
					while(((cnt2 > 0) && (cnt1 > 0)) && (this.mMasuSts[cnt1-1][cnt2-1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt1-1][cnt2-1] != color)){
						flg = 1;
						cnt1--;
						cnt2--;
						count1++;
					}
					if(((cnt2 > 0) && (cnt1 > 0)) && (flg == 1) && (this.mMasuSts[cnt1-1][cnt2-1] == color)){
						okflg = 1;
						count2 += count1;
					}
					cnt2 = j;
					cnt1 = i;
					count1 = flg = 0;
					// *** 右下方向を調べる *** //
					while(((cnt2 < (this.mMasuCnt-1)) && (cnt1 < (this.mMasuCnt-1))) && (this.mMasuSts[cnt1+1][cnt2+1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt1+1][cnt2+1] != color)){
						flg = 1;
						cnt1++;
						cnt2++;
						count1++;
					}
					if(((cnt2 < (this.mMasuCnt-1)) && (cnt1 < (this.mMasuCnt-1))) && (flg == 1) && (this.mMasuSts[cnt1+1][cnt2+1] == color)){
						okflg = 1;
						count2 += count1;
					}
					cnt2 = j;
					cnt1 = i;
					count1 = flg = 0;
					// *** 左下方向を調べる *** //
					while(((cnt2 > 0) && (cnt1 < (this.mMasuCnt-1))) && (this.mMasuSts[cnt1+1][cnt2-1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt1+1][cnt2-1] != color)){
						flg = 1;
						cnt1++;
						cnt2--;
						count1++;
					}
					if(((cnt2 > 0) && (cnt1 < (this.mMasuCnt-1))) && (flg == 1) && (this.mMasuSts[cnt1+1][cnt2-1] == color)){
						okflg = 1;
						count2 += count1;
					}
					if(okflg == 1){
						if(color == ReversiConst.REVERSI_STS_BLACK){
							this.mMasuStsEnaB[i][j] = 1;
							this.mMasuStsCntB[i][j] = count2;
							// *** 置ける場所をリニアに保存、置けるポイント数も保存 *** //
							this.mMasuPointB[this.mMasuPointCntB].setY(i);
							this.mMasuPointB[this.mMasuPointCntB].setX(j);
							this.mMasuPointCntB++;
						}else{
							this.mMasuStsEnaW[i][j] = 1;
							this.mMasuStsCntW[i][j] = count2;
							// *** 置ける場所をリニアに保存、置けるポイント数も保存 *** //
							this.mMasuPointW[this.mMasuPointCntW].setY(i);
							this.mMasuPointW[this.mMasuPointCntW].setX(j);
							this.mMasuPointCntW++;
						}
						ret = 0;
						if(countMax < count2) countMax = count2;
					}
				}else if(this.mMasuSts[i][j] == ReversiConst.REVERSI_STS_BLACK){
					this.mMasuBetCntB++;
				}else if(this.mMasuSts[i][j] == ReversiConst.REVERSI_STS_WHITE){
					this.mMasuBetCntW++;
				}
			}
		}

		// *** 一番枚数を獲得できるマスを設定 *** //
		for(int i = 0;i < this.mMasuCnt;i++){
			for(int j = 0;j < this.mMasuCnt;j++){
				if(color == ReversiConst.REVERSI_STS_BLACK){
					if(this.mMasuStsEnaB[i][j] != 0 && this.mMasuStsCntB[i][j] == countMax){
						this.mMasuStsEnaB[i][j] = 2;
					}
				}else{
					if(this.mMasuStsEnaW[i][j] != 0 && this.mMasuStsCntW[i][j] == countMax){
						this.mMasuStsEnaW[i][j] = 2;
					}
				}
			}
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コマをひっくり返す
	///	@fn				private void revMasuSts(int color,int y,int x)
	///	@param[in]		int color		ひっくり返す元コマ
	///	@param[in]		int y			ひっくり返す元コマのY座標
	///	@param[in]		int x			ひっくり返す元コマのX座標
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	private void revMasuSts(int color,int y,int x)
	{
		int cnt1,cnt2,rcnt1,rcnt2,flg=0;

		// *** 左方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt1 > 0;){
			if(this.mMasuSts[cnt2][cnt1-1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2][cnt1-1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt1--;
			}else if(this.mMasuSts[cnt2][cnt1-1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2][cnt1-1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt1;rcnt1 < x;rcnt1++){
				this.mMasuSts[cnt2][rcnt1] = color;
			}
		}

		// *** 右方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt1 < (this.mMasuCnt-1);){
			if(this.mMasuSts[cnt2][cnt1+1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2][cnt1+1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt1++;
			}else if(this.mMasuSts[cnt2][cnt1+1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2][cnt1+1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt1;rcnt1 > x;rcnt1--){
				this.mMasuSts[cnt2][rcnt1] = color;
			}
		}

		// *** 上方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt2 > 0;){
			if(this.mMasuSts[cnt2-1][cnt1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2-1][cnt1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt2--;
			}else if(this.mMasuSts[cnt2-1][cnt1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2-1][cnt1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt2;rcnt1 < y;rcnt1++){
				this.mMasuSts[rcnt1][cnt1] = color;
			}
		}

		// *** 下方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt2 < (this.mMasuCnt-1);){
			if(this.mMasuSts[cnt2+1][cnt1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2+1][cnt1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt2++;
			}else if(this.mMasuSts[cnt2+1][cnt1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2+1][cnt1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt2;rcnt1 > y;rcnt1--){
				this.mMasuSts[rcnt1][cnt1] = color;
			}
		}

		// *** 左上方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt2 > 0 && cnt1 > 0;){
			if(this.mMasuSts[cnt2-1][cnt1-1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2-1][cnt1-1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt2--;
				cnt1--;
			}else if(this.mMasuSts[cnt2-1][cnt1-1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2-1][cnt1-1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt2,rcnt2 = cnt1;(rcnt1 < y) && (rcnt2 < x);rcnt1++,rcnt2++){
				this.mMasuSts[rcnt1][rcnt2] = color;
			}
		}

		// *** 左下方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt2 < (this.mMasuCnt-1) && cnt1 > 0;){
			if(this.mMasuSts[cnt2+1][cnt1-1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2+1][cnt1-1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt2++;
				cnt1--;
			}else if(this.mMasuSts[cnt2+1][cnt1-1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2+1][cnt1-1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt2,rcnt2 = cnt1;(rcnt1 > y) && (rcnt2 < x);rcnt1--,rcnt2++){
				this.mMasuSts[rcnt1][rcnt2] = color;
			}
		}

		// *** 右上方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt2 > 0 && cnt1 < (this.mMasuCnt-1);){
			if(this.mMasuSts[cnt2-1][cnt1+1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2-1][cnt1+1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt2--;
				cnt1++;
			}else if(this.mMasuSts[cnt2-1][cnt1+1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2-1][cnt1+1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt2,rcnt2 = cnt1;(rcnt1 < y) && (rcnt2 > x);rcnt1++,rcnt2--){
				this.mMasuSts[rcnt1][rcnt2] = color;
			}
		}

		// *** 右下方向にある駒を調べる *** //
		for(flg = 0,cnt1 = x,cnt2 = y;cnt2 < (this.mMasuCnt-1) && cnt1 < (this.mMasuCnt-1);){
			if(this.mMasuSts[cnt2+1][cnt1+1] != ReversiConst.REVERSI_STS_NONE && this.mMasuSts[cnt2+1][cnt1+1] != color){
				// *** プレイヤー以外の色の駒があるなら *** //
				cnt2++;
				cnt1++;
			}else if(this.mMasuSts[cnt2+1][cnt1+1] == color){
				flg = 1;
				break;
			}else if(this.mMasuSts[cnt2+1][cnt1+1] == ReversiConst.REVERSI_STS_NONE){
				break;
			}
		}
		if(flg == 1){
			// *** 駒をひっくり返す *** //
			for(rcnt1 = cnt2,rcnt2 = cnt1;(rcnt1 > y) && (rcnt2 > x);rcnt1--,rcnt2--){
				this.mMasuSts[rcnt1][rcnt2] = color;
			}
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			パラメーター範囲チェック
	///	@fn				private int checkPara(int para,int min,int max)
	///	@param[in]		int para		チェックパラメーター
	///	@param[in]		int min			パラメーター最小値
	///	@param[in]		int max			パラメーター最大値
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	private int checkPara(int para,int min,int max)
	{
		int ret = -1;
		if(min <= para && para <= max) ret = 0;
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			解析を行う(黒)
	///	@fn				private void AnalysisReversiBlack()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	private void AnalysisReversiBlack()
	{
		int tmpX,tmpY,sum,sumOwn,tmpGoodPoint,tmpBadPoint;
		double tmpD1,tmpD2;
		for(int cnt = 0;cnt < this.mMasuPointCntB;cnt++){
			// *** 現在ステータスを一旦コピー *** //
			int[][] tmpMasu = new int[this.mMasuCntMax][];
			int[][] tmpMasuEnaB = new int[this.mMasuCntMax][];
			int[][] tmpMasuEnaW = new int[this.mMasuCntMax][];
			for (int i = 0; i < this.mMasuCntMax; i++){
				tmpMasu[i] = new int[this.mMasuSts[i].length];
				System.arraycopy(this.mMasuSts[i], 0, tmpMasu[i], 0, this.mMasuSts[i].length);

				tmpMasuEnaB[i] = new int[this.mMasuStsEnaB[i].length];
				System.arraycopy(this.mMasuStsEnaB[i], 0, tmpMasuEnaB[i], 0, this.mMasuStsEnaB[i].length);

				tmpMasuEnaW[i] = new int[this.mMasuStsEnaW[i].length];
				System.arraycopy(this.mMasuStsEnaW[i], 0, tmpMasuEnaW[i], 0, this.mMasuStsEnaW[i].length);
			}
			tmpY = this.mMasuPointB[cnt].getY();
			tmpX = this.mMasuPointB[cnt].getX();
			this.mMasuSts[tmpY][tmpX] = ReversiConst.REVERSI_STS_BLACK;			// 仮に置く
			this.revMasuSts(ReversiConst.REVERSI_STS_BLACK,tmpY,tmpX);			// 仮にひっくり返す
			this.makeMasuSts(ReversiConst.REVERSI_STS_BLACK);
			this.makeMasuSts(ReversiConst.REVERSI_STS_WHITE);
			// *** このマスに置いた場合の解析を行う *** //
			if(getColorEna(ReversiConst.REVERSI_STS_WHITE) != 0){				// 相手がパス
				this.mMasuStsPassB[tmpY][tmpX] = 1;
			}
			if(this.getEdgeSideZero(tmpY,tmpX) == 0){							// 置いた場所が角
				this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeCnt() + 1);
				this.mMasuStsAnzB[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzB[tmpY][tmpX].getGoodPoint() + 10000 * this.mMasuStsCntB[tmpY][tmpX]);
			}else if(this.getEdgeSideOne(tmpY,tmpX) == 0){						// 置いた場所が角の一つ手前
				this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideOneCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideOneCnt() + 1);
				if(checkEdge(ReversiConst.REVERSI_STS_BLACK,tmpY,tmpX) != 0){	// 角を取られない
					this.mMasuStsAnzB[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzB[tmpY][tmpX].getGoodPoint() + 10 * this.mMasuStsCntB[tmpY][tmpX]);
				}else{															// 角を取られる
					this.mMasuStsAnzB[tmpY][tmpX].setBadPoint(this.mMasuStsAnzB[tmpY][tmpX].getBadPoint() + 100000);
				}
			}else if(this.getEdgeSideTwo(tmpY,tmpX) == 0){						// 置いた場所が角の二つ手前
				this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideTwoCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideTwoCnt() + 1);
				this.mMasuStsAnzB[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzB[tmpY][tmpX].getGoodPoint() + 1000 * this.mMasuStsCntB[tmpY][tmpX]);
			}else if(this.getEdgeSideThree(tmpY,tmpX) == 0){					// 置いた場所が角の三つ手前
				this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideThreeCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideThreeCnt() + 1);
				this.mMasuStsAnzB[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzB[tmpY][tmpX].getGoodPoint() + 100 * this.mMasuStsCntB[tmpY][tmpX]);
			}else{																// 置いた場所がその他
				this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideOtherCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideOtherCnt() + 1);
				this.mMasuStsAnzB[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzB[tmpY][tmpX].getGoodPoint() + 10 * this.mMasuStsCntB[tmpY][tmpX]);
			}
			sum = 0;
			sumOwn = 0;
			for(int i = 0;i < this.mMasuCnt;i++){
				for(int j = 0;j < this.mMasuCnt;j++){
					tmpBadPoint = 0;
					tmpGoodPoint = 0;
					if(this.getMasuStsEna(ReversiConst.REVERSI_STS_WHITE,i,j) != 0){
						sum += this.mMasuStsCntW[i][j];							// 相手の獲得予定枚数
						// *** 相手の獲得予定の最大数保持 *** //
						if(this.mMasuStsAnzB[tmpY][tmpX].getMax() < this.mMasuStsCntW[i][j]) this.mMasuStsAnzB[tmpY][tmpX].setMax(this.mMasuStsCntW[i][j]);
						// *** 相手の獲得予定の最小数保持 *** //
						if(this.mMasuStsCntW[i][j] < this.mMasuStsAnzB[tmpY][tmpX].getMin()) this.mMasuStsAnzB[tmpY][tmpX].setMin(this.mMasuStsCntW[i][j]);
						this.mMasuStsAnzB[tmpY][tmpX].setPointCnt(this.mMasuStsAnzB[tmpY][tmpX].getPointCnt() + 1);			// 相手の置ける場所の数
						if(this.getEdgeSideZero(i,j) == 0){						// 置く場所が角
							this.mMasuStsAnzB[tmpY][tmpX].setEdgeCnt(this.mMasuStsAnzB[tmpY][tmpX].getEdgeCnt() + 1);
							tmpBadPoint = 100000 * this.mMasuStsCntW[i][j];
						}else if(this.getEdgeSideOne(i,j) == 0){				// 置く場所が角の一つ手前
							this.mMasuStsAnzB[tmpY][tmpX].setEdgeSideOneCnt(this.mMasuStsAnzB[tmpY][tmpX].getEdgeSideOneCnt() + 1);
							tmpBadPoint = 0;
						}else if(this.getEdgeSideTwo(i,j) == 0){				// 置く場所が角の二つ手前
							this.mMasuStsAnzB[tmpY][tmpX].setEdgeSideTwoCnt(this.mMasuStsAnzB[tmpY][tmpX].getEdgeSideTwoCnt() + 1);
							tmpBadPoint = 1 * this.mMasuStsCntW[i][j];
						}else if(this.getEdgeSideThree(i,j) == 0){				// 置く場所が角の三つ手前
							this.mMasuStsAnzB[tmpY][tmpX].setEdgeSideThreeCnt(this.mMasuStsAnzB[tmpY][tmpX].getEdgeSideThreeCnt() + 1);
							tmpBadPoint = 1 * this.mMasuStsCntW[i][j];
						}else{													// 置く場所がその他
							this.mMasuStsAnzB[tmpY][tmpX].setEdgeSideOtherCnt(this.mMasuStsAnzB[tmpY][tmpX].getEdgeSideOtherCnt() + 1);
							tmpBadPoint = 1 * this.mMasuStsCntW[i][j];
						}
						if(tmpMasuEnaW[i][j] != 0) tmpBadPoint = 0;				// ステータス変化していないなら
					}
					if(this.getMasuStsEna(ReversiConst.REVERSI_STS_BLACK,i,j) != 0){
						sumOwn += this.mMasuStsCntB[i][j];						// 自分の獲得予定枚数
						// *** 自分の獲得予定の最大数保持 *** //
						if(this.mMasuStsAnzB[tmpY][tmpX].getOwnMax() < this.mMasuStsCntB[i][j]) this.mMasuStsAnzB[tmpY][tmpX].setOwnMax(this.mMasuStsCntB[i][j]);
						// *** 自分の獲得予定の最小数保持 *** //
						if(this.mMasuStsCntB[i][j] < this.mMasuStsAnzB[tmpY][tmpX].getOwnMin()) this.mMasuStsAnzB[tmpY][tmpX].setOwnMin(this.mMasuStsCntB[i][j]);
						this.mMasuStsAnzB[tmpY][tmpX].setOwnPointCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnPointCnt() + 1);	// 自分の置ける場所の数
						if(this.getEdgeSideZero(i,j) == 0){						// 置く場所が角
							this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeCnt() + 1);
							tmpGoodPoint = 100 * this.mMasuStsCntB[i][j];
						}else if(this.getEdgeSideOne(i,j) == 0){				// 置く場所が角の一つ手前
							this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideOneCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideOneCnt() + 1);
							tmpGoodPoint = 0;
						}else if(this.getEdgeSideTwo(i,j) == 0){				// 置く場所が角の二つ手前
							this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideTwoCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideTwoCnt() + 1);
							tmpGoodPoint = 3 * this.mMasuStsCntB[i][j];
						}else if(this.getEdgeSideThree(i,j) == 0){				// 置く場所が角の三つ手前
							this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideThreeCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideThreeCnt() + 1);
							tmpGoodPoint = 2 * this.mMasuStsCntB[i][j];
						}else{													// 置く場所がその他
							this.mMasuStsAnzB[tmpY][tmpX].setOwnEdgeSideOtherCnt(this.mMasuStsAnzB[tmpY][tmpX].getOwnEdgeSideOtherCnt() + 1);
							tmpGoodPoint = 1 * this.mMasuStsCntB[i][j];
						}
						if(tmpMasuEnaB[i][j] != 0) tmpGoodPoint = 0;			// ステータス変化していないなら
					}
					if(tmpBadPoint != 0)	this.mMasuStsAnzB[tmpY][tmpX].setBadPoint(this.mMasuStsAnzB[tmpY][tmpX].getBadPoint()	+ tmpBadPoint);
					if(tmpGoodPoint != 0)	this.mMasuStsAnzB[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzB[tmpY][tmpX].getGoodPoint() + tmpGoodPoint);
				}
			}
			// *** 相手に取られる平均コマ数 *** //
			if(getPointCnt(ReversiConst.REVERSI_STS_WHITE) != 0){
				tmpD1 = (double)sum;
				tmpD2 = (double)getPointCnt(ReversiConst.REVERSI_STS_WHITE);
				this.mMasuStsAnzB[tmpY][tmpX].setAvg(tmpD1 / tmpD2);
			}

			// *** 自分が取れる平均コマ数 *** //
			if(getPointCnt(ReversiConst.REVERSI_STS_BLACK) != 0){
				tmpD1 = (double)sumOwn;
				tmpD2 = (double)getPointCnt(ReversiConst.REVERSI_STS_BLACK);
				this.mMasuStsAnzB[tmpY][tmpX].setOwnAvg(tmpD1 / tmpD2);
			}

			// *** 元に戻す *** //
			for (int i = 0; i < this.mMasuCntMax; i++){
				System.arraycopy(tmpMasu[i], 0, this.mMasuSts[i], 0, this.mMasuSts[i].length);
			}
			this.makeMasuSts(ReversiConst.REVERSI_STS_BLACK);
			this.makeMasuSts(ReversiConst.REVERSI_STS_WHITE);
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			解析を行う(白)
	///	@fn				private void AnalysisReversiWhite()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	private void AnalysisReversiWhite()
	{
		int tmpX,tmpY,sum,sumOwn,tmpGoodPoint,tmpBadPoint;
		double tmpD1,tmpD2;
		for(int cnt = 0;cnt < this.mMasuPointCntW;cnt++){
			// *** 現在ステータスを一旦コピー *** //
			int[][] tmpMasu = new int[this.mMasuCntMax][];
			int[][] tmpMasuEnaB = new int[this.mMasuCntMax][];
			int[][] tmpMasuEnaW = new int[this.mMasuCntMax][];
			for (int i = 0; i < this.mMasuCntMax; i++){
				tmpMasu[i] = new int[this.mMasuSts[i].length];
				System.arraycopy(this.mMasuSts[i], 0, tmpMasu[i], 0, this.mMasuSts[i].length);

				tmpMasuEnaB[i] = new int[this.mMasuStsEnaB[i].length];
				System.arraycopy(this.mMasuStsEnaB[i], 0, tmpMasuEnaB[i], 0, this.mMasuStsEnaB[i].length);

				tmpMasuEnaW[i] = new int[this.mMasuStsEnaW[i].length];
				System.arraycopy(this.mMasuStsEnaW[i], 0, tmpMasuEnaW[i], 0, this.mMasuStsEnaW[i].length);
			}
			tmpY = this.mMasuPointW[cnt].getY();
			tmpX = this.mMasuPointW[cnt].getX();
			this.mMasuSts[tmpY][tmpX] = ReversiConst.REVERSI_STS_WHITE;				// 仮に置く
			this.revMasuSts(ReversiConst.REVERSI_STS_WHITE,tmpY,tmpX);				// 仮にひっくり返す
			this.makeMasuSts(ReversiConst.REVERSI_STS_BLACK);
			this.makeMasuSts(ReversiConst.REVERSI_STS_WHITE);
			// *** このマスに置いた場合の解析を行う *** //
			if(getColorEna(ReversiConst.REVERSI_STS_BLACK) != 0){					// 相手がパス
				this.mMasuStsPassW[tmpY][tmpX] = 1;
			}
			if(this.getEdgeSideZero(tmpY,tmpX) == 0){								// 置いた場所が角
				this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeCnt() + 1);
				this.mMasuStsAnzW[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzW[tmpY][tmpX].getGoodPoint() + 10000 * this.mMasuStsCntW[tmpY][tmpX]);
			}else if(this.getEdgeSideOne(tmpY,tmpX) == 0){							// 置いた場所が角の一つ手前
				this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideOneCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideOneCnt() + 1);
				if(checkEdge(ReversiConst.REVERSI_STS_WHITE,tmpY,tmpX) != 0){		// 角を取られない
					this.mMasuStsAnzW[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzW[tmpY][tmpX].getGoodPoint() + 10 * this.mMasuStsCntW[tmpY][tmpX]);
				}else{																// 角を取られる
					this.mMasuStsAnzW[tmpY][tmpX].setBadPoint(this.mMasuStsAnzW[tmpY][tmpX].getBadPoint() + 100000);
				}
			}else if(this.getEdgeSideTwo(tmpY,tmpX) == 0){							// 置いた場所が角の二つ手前
				this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideTwoCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideTwoCnt() + 1);
				this.mMasuStsAnzW[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzW[tmpY][tmpX].getGoodPoint() + 1000 * this.mMasuStsCntW[tmpY][tmpX]);
			}else if(this.getEdgeSideThree(tmpY,tmpX) == 0){						// 置いた場所が角の三つ手前
				this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideThreeCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideThreeCnt() + 1);
				this.mMasuStsAnzW[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzW[tmpY][tmpX].getGoodPoint() + 100 * this.mMasuStsCntW[tmpY][tmpX]);
			}else{																	// 置いた場所がその他
				this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideOtherCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideOtherCnt() + 1);
				this.mMasuStsAnzW[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzW[tmpY][tmpX].getGoodPoint() + 10 * this.mMasuStsCntW[tmpY][tmpX]);
			}
			sum = 0;
			sumOwn = 0;
			for(int i = 0;i < this.mMasuCnt;i++){
				for(int j = 0;j < this.mMasuCnt;j++){
					tmpBadPoint = 0;
					tmpGoodPoint = 0;
					if(this.getMasuStsEna(ReversiConst.REVERSI_STS_BLACK,i,j) != 0){
						sum += this.mMasuStsCntB[i][j];								// 相手の獲得予定枚数
						// *** 相手の獲得予定の最大数保持 *** //
						if(this.mMasuStsAnzW[tmpY][tmpX].getMax() < this.mMasuStsCntB[i][j]) this.mMasuStsAnzW[tmpY][tmpX].setMax(this.mMasuStsCntB[i][j]);
						// *** 相手の獲得予定の最小数保持 *** //
						if(this.mMasuStsCntB[i][j] < this.mMasuStsAnzW[tmpY][tmpX].getMin()) this.mMasuStsAnzW[tmpY][tmpX].setMin(this.mMasuStsCntB[i][j]);
						this.mMasuStsAnzW[tmpY][tmpX].setPointCnt(this.mMasuStsAnzW[tmpY][tmpX].getPointCnt() + 1);			// 相手の置ける場所の数
						if(this.getEdgeSideZero(i,j) == 0){							// 置く場所が角
							this.mMasuStsAnzW[tmpY][tmpX].setEdgeCnt(this.mMasuStsAnzW[tmpY][tmpX].getEdgeCnt() + 1);
							tmpBadPoint = 100000 * this.mMasuStsCntB[i][j];
						}else if(this.getEdgeSideOne(i,j) == 0){					// 置く場所が角の一つ手前
							this.mMasuStsAnzW[tmpY][tmpX].setEdgeSideOneCnt(this.mMasuStsAnzW[tmpY][tmpX].getEdgeSideOneCnt() + 1);
							tmpBadPoint = 0;
						}else if(this.getEdgeSideTwo(i,j) == 0){					// 置く場所が角の二つ手前
							this.mMasuStsAnzW[tmpY][tmpX].setEdgeSideTwoCnt(this.mMasuStsAnzW[tmpY][tmpX].getEdgeSideTwoCnt() + 1);
							tmpBadPoint = 1 * this.mMasuStsCntB[i][j];
						}else if(this.getEdgeSideThree(i,j) == 0){					// 置く場所が角の三つ手前
							this.mMasuStsAnzW[tmpY][tmpX].setEdgeSideThreeCnt(this.mMasuStsAnzW[tmpY][tmpX].getEdgeSideThreeCnt() + 1);
							tmpBadPoint = 1 * this.mMasuStsCntB[i][j];
						}else{														// 置く場所がその他
							this.mMasuStsAnzW[tmpY][tmpX].setEdgeSideOtherCnt(this.mMasuStsAnzW[tmpY][tmpX].getEdgeSideOtherCnt() + 1);
							tmpBadPoint = 1 * this.mMasuStsCntB[i][j];
						}
						if(tmpMasuEnaB[i][j] != 0) tmpBadPoint = 0;					// ステータス変化していないなら
					}
					if(this.getMasuStsEna(ReversiConst.REVERSI_STS_WHITE,i,j) != 0){
						sumOwn += this.mMasuStsCntW[i][j];							// 自分の獲得予定枚数
						// *** 自分の獲得予定の最大数保持 *** //
						if(this.mMasuStsAnzW[tmpY][tmpX].getOwnMax() < this.mMasuStsCntW[i][j]) this.mMasuStsAnzW[tmpY][tmpX].setOwnMax(this.mMasuStsCntW[i][j]);
						// *** 自分の獲得予定の最小数保持 *** //
						if(this.mMasuStsCntW[i][j] < this.mMasuStsAnzW[tmpY][tmpX].getOwnMin()) this.mMasuStsAnzW[tmpY][tmpX].setOwnMin(this.mMasuStsCntW[i][j]);
						this.mMasuStsAnzW[tmpY][tmpX].setOwnPointCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnPointCnt() + 1);	// 自分の置ける場所の数
						if(this.getEdgeSideZero(i,j) == 0){							// 置く場所が角
							this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeCnt() + 1);
							tmpGoodPoint = 100 * this.mMasuStsCntW[i][j];
						}else if(this.getEdgeSideOne(i,j) == 0){					// 置く場所が角の一つ手前
							this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideOneCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideOneCnt() + 1);
							tmpGoodPoint = 0;
						}else if(this.getEdgeSideTwo(i,j) == 0){					// 置く場所が角の二つ手前
							this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideTwoCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideTwoCnt() + 1);
							tmpGoodPoint = 3 * this.mMasuStsCntW[i][j];
						}else if(this.getEdgeSideThree(i,j) == 0){					// 置く場所が角の三つ手前
							this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideThreeCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideThreeCnt() + 1);
							tmpGoodPoint = 2 * this.mMasuStsCntW[i][j];
						}else{														// 置く場所がその他
							this.mMasuStsAnzW[tmpY][tmpX].setOwnEdgeSideOtherCnt(this.mMasuStsAnzW[tmpY][tmpX].getOwnEdgeSideOtherCnt() + 1);
							tmpGoodPoint = 1 * this.mMasuStsCntW[i][j];
						}
						if(tmpMasuEnaW[i][j] != 0) tmpGoodPoint = 0;				// ステータス変化していないなら
					}
					if(tmpBadPoint != 0)	this.mMasuStsAnzW[tmpY][tmpX].setBadPoint(this.mMasuStsAnzW[tmpY][tmpX].getBadPoint() + tmpBadPoint);
					if(tmpGoodPoint != 0)	this.mMasuStsAnzW[tmpY][tmpX].setGoodPoint(this.mMasuStsAnzW[tmpY][tmpX].getGoodPoint() + tmpGoodPoint);
				}
			}
			// *** 相手に取られる平均コマ数 *** //
			if(getPointCnt(ReversiConst.REVERSI_STS_BLACK) != 0){
				tmpD1 = (double)sum;
				tmpD2 = (double)getPointCnt(ReversiConst.REVERSI_STS_BLACK);
				this.mMasuStsAnzW[tmpY][tmpX].setAvg(tmpD1 / tmpD2);
			}

			// *** 自分が取れる平均コマ数 *** //
			if(getPointCnt(ReversiConst.REVERSI_STS_WHITE) != 0){
				tmpD1 = (double)sumOwn;
				tmpD2 = (double)getPointCnt(ReversiConst.REVERSI_STS_WHITE);
				this.mMasuStsAnzW[tmpY][tmpX].setOwnAvg(tmpD1 / tmpD2);
			}

			// *** 元に戻す *** //
			for (int i = 0; i < this.mMasuCntMax; i++){
				System.arraycopy(tmpMasu[i], 0, this.mMasuSts[i], 0, this.mMasuSts[i].length);
			}
			this.makeMasuSts(ReversiConst.REVERSI_STS_BLACK);
			this.makeMasuSts(ReversiConst.REVERSI_STS_WHITE);
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			解析を行う
	///	@fn				public void AnalysisReversi(int bPassEna,int wPassEna)
	///	@param[in]		int bPassEna		1=黒パス有効
	///	@param[in]		int wPassEna		1=白パス有効
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void AnalysisReversi(int bPassEna,int wPassEna)
	{
		// *** 相手をパスさせることができるマス検索 *** //
		for(int i = 0;i < this.mMasuCnt;i++){						// 初期化
			for(int j = 0;j < this.mMasuCnt;j++){
				this.mMasuStsPassB[i][j] = 0;
				this.mMasuStsAnzB[i][j].reset();
				this.mMasuStsPassW[i][j] = 0;
				this.mMasuStsAnzW[i][j].reset();
			}
		}
		AnalysisReversiBlack();										// 黒解析
		AnalysisReversiWhite();										// 白解析

		this.makeMasuSts(ReversiConst.REVERSI_STS_BLACK);
		this.makeMasuSts(ReversiConst.REVERSI_STS_WHITE);

		// *** パスマスを取得 *** //
		for(int i = 0;i < this.mMasuCnt;i++){
			for(int j = 0;j < this.mMasuCnt;j++){
				if(this.mMasuStsPassB[i][j] != 0){
					if(bPassEna != 0) this.mMasuStsEnaB[i][j] = 3;
				}
				if(this.mMasuStsPassW[i][j] != 0){
					if(wPassEna != 0) this.mMasuStsEnaW[i][j] = 3;
				}
			}
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			マスステータスを取得
	///	@fn				public int getMasuSts(int y,int x)
	///	@param[in]		int y			取得するマスのY座標
	///	@param[in]		int x			取得するマスのX座標
	///	@return			-1 : 失敗 それ以外 : マスステータス
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getMasuSts(int y,int x)
	{
		int ret = -1;
		if(this.checkPara(y,0,this.mMasuCnt) == 0 && this.checkPara(x,0,this.mMasuCnt) == 0) ret = this.mMasuSts[y][x];
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			以前のマスステータスを取得
	///	@fn				int getMasuStsOld(int y, int x)
	///	@param[in]		int y			取得するマスのY座標
	///	@param[in]		int x			取得するマスのX座標
	///	@return			-1 : 失敗 それ以外 : マスステータス
	///	@author			Yuta Yoshinaga
	///	@date			2017.10.20
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getMasuStsOld(int y, int x)
	{
		int ret = -1;
		if (this.checkPara(y, 0, this.mMasuCnt) == 0 && this.checkPara(x, 0, this.mMasuCnt) == 0) ret = this.mMasuStsOld[y][x];
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標に指定色を置けるかチェック
	///	@fn				public int getMasuStsEna(int color,int y,int x)
	///	@param[in]		int color		コマ色
	///	@param[in]		int y			マスのY座標
	///	@param[in]		int x			マスのX座標
	///	@return			1 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getMasuStsEna(int color,int y,int x)
	{
		int ret = 0;
		if(this.checkPara(y,0,this.mMasuCnt) == 0 && this.checkPara(x,0,this.mMasuCnt) == 0){
			if(color == ReversiConst.REVERSI_STS_BLACK)	ret = this.mMasuStsEnaB[y][x];
			else										ret = this.mMasuStsEnaW[y][x];
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標の獲得コマ数取得
	///	@fn				public int getMasuStsCnt(int color,int y,int x)
	///	@param[in]		int color		コマ色
	///	@param[in]		int y			マスのY座標
	///	@param[in]		int x			マスのX座標
	///	@return			-1 : 失敗 それ以外 : 獲得コマ数
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getMasuStsCnt(int color,int y,int x)
	{
		int ret = -1;
		if(this.checkPara(y,0,this.mMasuCnt) == 0 && this.checkPara(x,0,this.mMasuCnt) == 0){
			if(color == ReversiConst.REVERSI_STS_BLACK)	ret = this.mMasuStsCntB[y][x];
			else										ret = this.mMasuStsCntW[y][x];
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定色が現在置ける場所があるかチェック
	///	@fn				public int getColorEna(int color)
	///	@param[in]		int color		コマ色
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getColorEna(int color)
	{
		int ret = -1;
		for(int i=0;i<this.mMasuCnt;i++){
			for(int j=0;j<this.mMasuCnt;j++){
				if(this.getMasuStsEna(color,i,j) != 0){
					ret = 0;
					break;
				}
			}
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲーム終了かチェック
	///	@fn				public int getGameEndSts()
	///	@return			0 : 続行 それ以外 : ゲーム終了
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getGameEndSts()
	{
		int ret = 1;
		if(getColorEna(ReversiConst.REVERSI_STS_BLACK) == 0) ret = 0;
		if(getColorEna(ReversiConst.REVERSI_STS_WHITE) == 0) ret = 0;
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標にコマを置く
	///	@fn				public int setMasuSts(int color,int y,int x)
	///	@param[in]		int color		コマ色
	///	@param[in]		int y			マスのY座標
	///	@param[in]		int x			マスのX座標
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int setMasuSts(int color,int y,int x)
	{
		int ret = -1;
		if(this.getMasuStsEna(color,y,x) != 0){
			ret = 0;
			for (int i = 0; i < mMasuCntMax; i++){
				System.arraycopy(this.mMasuSts[i], 0, this.mMasuStsOld[i], 0, this.mMasuSts[i].length);
			}
			this.mMasuSts[y][x] = color;
			this.revMasuSts(color,y,x);
			this.makeMasuSts(ReversiConst.REVERSI_STS_BLACK);
			this.makeMasuSts(ReversiConst.REVERSI_STS_WHITE);
			// *** 履歴保存 *** //
			if(this.mMasuHistCur < (this.mMasuCntMax * this.mMasuCntMax)){
				this.mMasuHist[this.mMasuHistCur].setColor(color);
				this.mMasuHist[this.mMasuHistCur].getPoint().setY(y);
				this.mMasuHist[this.mMasuHistCur].getPoint().setX(x);
				this.mMasuHistCur++;
			}
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標にコマを強制的に置く
	///	@fn				public int setMasuStsForcibly(int color,int y,int x)
	///	@param[in]		int color		コマ色
	///	@param[in]		int y			マスのY座標
	///	@param[in]		int x			マスのX座標
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int setMasuStsForcibly(int color,int y,int x)
	{
		int ret = -1;
		ret = 0;
		for (int i = 0; i < mMasuCntMax; i++){
			System.arraycopy(this.mMasuSts[i], 0, this.mMasuStsOld[i], 0, this.mMasuSts[i].length);
		}
		this.mMasuSts[y][x] = color;
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			マスの数変更
	///	@fn				public int setMasuCnt(int cnt)
	///	@param[in]		int cnt		マスの数
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int setMasuCnt(int cnt)
	{
		int ret = -1,chg = 0;

		if(checkPara(cnt,0,this.mMasuCntMax) == 0){
			if(this.mMasuCnt != cnt) chg = 1;
			this.mMasuCnt = cnt;
			ret = 0;
			if(chg == 1) this.reset();
		}

		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ポイント座標取得
	///	@fn				public ReversiPoint getPoint(int color,int num)
	///	@param[in]		int color		コマ色
	///	@param[in]		int num			ポイント
	///	@return			ポイント座標 null : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiPoint getPoint(int color,int num)
	{
		ReversiPoint ret = null;
		if(this.checkPara(num,0,(this.mMasuCnt * this.mMasuCnt)) == 0){
			if(color == ReversiConst.REVERSI_STS_BLACK)	ret = this.mMasuPointB[num];
			else										ret = this.mMasuPointW[num];
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ポイント座標数取得
	///	@fn				public int getPointCnt(int color)
	///	@param[in]		int color		コマ色
	///	@return			ポイント座標数取得
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getPointCnt(int color)
	{
		int ret = 0;
		if(color == ReversiConst.REVERSI_STS_BLACK)	ret = this.mMasuPointCntB;
		else										ret = this.mMasuPointCntW;
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コマ数取得
	///	@fn				public int getBetCnt(int color)
	///	@param[in]		int color		コマ色
	///	@return			コマ数取得
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getBetCnt(int color)
	{
		int ret = 0;
		if(color == ReversiConst.REVERSI_STS_BLACK)	ret = this.mMasuBetCntB;
		else										ret = this.mMasuBetCntW;
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			パス判定
	///	@fn				public int getPassEna(int color,int y,int x)
	///	@param[in]		int color		コマ色
	///	@param[in]		int y			マスのY座標
	///	@param[in]		int x			マスのX座標
	///	@return			パス判定
	///					- 0 : NOT PASS
	///					- 1 : PASS
	///
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getPassEna(int color,int y,int x)
	{
		int ret = 0;
		if(this.checkPara(y,0,this.mMasuCnt) == 0 && this.checkPara(x,0,this.mMasuCnt) == 0){
			if(color == ReversiConst.REVERSI_STS_BLACK)	ret = this.mMasuStsPassB[y][x];
			else										ret = this.mMasuStsPassW[y][x];
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			履歴取得
	///	@fn				public ReversiHistory getHistory(int num)
	///	@param[in]		int num			ポイント
	///	@return			履歴 null : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiHistory getHistory(int num)
	{
		ReversiHistory ret = null;
		if(this.checkPara(num,0,(this.mMasuCnt * this.mMasuCnt)) == 0){
			ret = this.mMasuHist[num];
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			履歴数取得
	///	@fn				public int getHistoryCnt(int color)
	///	@return			履歴数
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getHistoryCnt()
	{
		int ret = 0;
		ret = this.mMasuHistCur;
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ポイント座標解析取得
	///	@fn				public ReversiAnz getPointAnz(int color,int y,int x)
	///	@param[in]		int color		コマ色
	///	@param[in]		int y			マスのY座標
	///	@param[in]		int x			マスのX座標
	///	@return			ポイント座標解析 null : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiAnz getPointAnz(int color,int y,int x)
	{
		ReversiAnz ret = null;
		if(this.checkPara(y,0,this.mMasuCnt) == 0 && this.checkPara(x,0,this.mMasuCnt) == 0){
			if(color == ReversiConst.REVERSI_STS_BLACK)	ret = this.mMasuStsAnzB[y][x];
			else										ret = this.mMasuStsAnzW[y][x];
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			角の隣に置いても角を取られないマス検索
	///	@fn				public int checkEdge(int y,int x)
	///	@param[in]		int color		色
	///	@param[in]		int y			Y座標
	///	@param[in]		int x			X座標
	///	@return			0 : 取られる それ以外 : 取られない
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int checkEdge(int color,int y,int x)
	{
		int style = 0,flg1 = 0,flg2 = 0;
		int loop,loop2;
		if(y == 0 && x == 1){
			for(loop = x,flg1 = 0,flg2 = 0;loop < this.mMasuCnt;loop++){
				if(this.getMasuSts(y,loop) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(y,loop) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(y,loop) != color) && (this.getMasuSts(y,loop) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == 1 && x == 0){
			for(loop = y,flg1 = 0,flg2 = 0;loop < this.mMasuCnt;loop++){
				if(this.getMasuSts(loop,x) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(loop,x) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,x) != color) && (this.getMasuSts(loop,x) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == 1 && x == 1){
			for(loop = y,flg1 = 0,flg2 = 0;loop < this.mMasuCnt;loop++){
				if(this.getMasuSts(loop,loop) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(loop,loop) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,loop) != color) && (this.getMasuSts(loop,loop) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == 0 && x == (this.mMasuCnt-2)){
			for(loop = x,flg1 = 0,flg2 = 0;loop > 0;loop--){
				if(this.getMasuSts(y,loop) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(y,loop) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(y,loop) != color) && (this.getMasuSts(y,loop) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == 1 && x == (this.mMasuCnt-1)){
			for(loop = y,flg1 = 0,flg2 = 0;loop < this.mMasuCnt;loop++){
				if(this.getMasuSts(loop,x) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(loop,x) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,x) != color) && (this.getMasuSts(loop,x) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == 1 && x == (this.mMasuCnt-2)){
			for(loop = y,loop2 = x,flg1 = 0,flg2 = 0;loop < this.mMasuCnt;loop++,loop2--){
				if(this.getMasuSts(loop,loop2) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(loop,loop2) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,loop2) != color) && (this.getMasuSts(loop,loop2) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == (this.mMasuCnt-2) && x == 0){
			for(loop = y,flg1 = 0,flg2 = 0;loop > 0;loop--){
				if(this.getMasuSts(loop,x) == color) flg1=1;
				if(flg1 == 1 && this.getMasuSts(loop,x) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,x) != color) && (this.getMasuSts(loop,x) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == (this.mMasuCnt-1) && x == 1){
			for(loop = x,flg1 = 0,flg2 = 0;loop < this.mMasuCnt;loop++){
				if(this.getMasuSts(y,loop) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(y,loop) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(y,loop) != color) && (this.getMasuSts(y,loop) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == (this.mMasuCnt-2) && x == 1){
			for(loop = y,loop2 = x,flg1 = 0,flg2 = 0;loop > 0;loop--,loop2++){
				if(this.getMasuSts(loop,loop2) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(loop,loop2) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,loop2) != color) && (this.getMasuSts(loop,loop2) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == (this.mMasuCnt-2) && x == (this.mMasuCnt-1)){
			for(loop = y,flg1 = 0,flg2 = 0;loop > 0;loop--){
				if(this.getMasuSts(loop,x) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(loop,x) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,x) != color) && (this.getMasuSts(loop,x) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == (this.mMasuCnt-1) && x == (this.mMasuCnt-2)){
			for(loop = x,flg1 = 0,flg2 = 0;loop > 0;loop--){
				if(this.getMasuSts(y,loop) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(y,loop) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(y,loop) != color) && (this.getMasuSts(y,loop) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}
		if(y == (this.mMasuCnt-2) && x == (this.mMasuCnt-2)){
			for(loop = y,loop2 = x,flg1 = 0,flg2 = 0;loop > 0;loop--,loop2--){
				if(this.getMasuSts(loop,loop2) == color) flg1 = 1;
				if(flg1 == 1 && this.getMasuSts(loop,loop2) == ReversiConst.REVERSI_STS_NONE) break;
				if((flg1 == 1) && (this.getMasuSts(loop,loop2) != color) && (this.getMasuSts(loop,loop2) != ReversiConst.REVERSI_STS_NONE)) flg2 = 1;
			}
			if((flg1 == 1) && (flg2 == 0)) style = 1;
		}

		return style;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標が角か取得
	///	@fn				public int getEdgeSideZero(int y,int x)
	///	@param[in]		int y			Y座標
	///	@param[in]		int x			X座標
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getEdgeSideZero(int y,int x)
	{
		int ret = -1;
		if(
				(y == 0 && x == 0)
			||	(y == 0 && x == (this.mMasuCnt-1))
			||	(y == (this.mMasuCnt-1) && x == 0)
			||	(y == (this.mMasuCnt-1) && x == (this.mMasuCnt-1))
		){
			ret = 0;
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標が角の一つ手前か取得
	///	@fn				public int getEdgeSideOne(int y,int x)
	///	@param[in]		int y			Y座標
	///	@param[in]		int x			X座標
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getEdgeSideOne(int y,int x)
	{
		int ret = -1;
		if(
				(y == 0 && x == 1)
			||	(y == 0 && x == (this.mMasuCnt-2))
			||	(y == 1 && x == 0)
			||	(y == 1 && x == 1)
			||	(y == 1 && x == (this.mMasuCnt-2))
			||	(y == 1 && x == (this.mMasuCnt-1))
			||	(y == (this.mMasuCnt-2) && x == 0)
			||	(y == (this.mMasuCnt-2) && x == 1)
			||	(y == (this.mMasuCnt-2) && x == (this.mMasuCnt-2))
			||	(y == (this.mMasuCnt-2) && x == (this.mMasuCnt-1))
			||	(y == (this.mMasuCnt-1) && x == 1)
			||	(y == (this.mMasuCnt-1) && x == (this.mMasuCnt-2))
		){
			ret = 0;
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標が角の二つ手前か取得
	///	@fn				public int getEdgeSideTwo(int y,int x)
	///	@param[in]		int y			Y座標
	///	@param[in]		int x			X座標
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getEdgeSideTwo(int y,int x)
	{
		int ret = -1;
		if(
				(y == 0 && x == 2)
			||	(y == 0 && x == (this.mMasuCnt-3))
			||	(y == 2 && x == 0)
			||	(y == 2 && x == 2)
			||	(y == 2 && x == (this.mMasuCnt-3))
			||	(y == 2 && x == (this.mMasuCnt-1))
			||	(y == (this.mMasuCnt-3) && x == 0)
			||	(y == (this.mMasuCnt-3) && x == 2)
			||	(y == (this.mMasuCnt-3) && x == (this.mMasuCnt-3))
			||	(y == (this.mMasuCnt-3) && x == (this.mMasuCnt-1))
			||	(y == (this.mMasuCnt-1) && x == 2)
			||	(y == (this.mMasuCnt-1) && x == (this.mMasuCnt-3))
		){
			ret = 0;
		}
		return ret;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			指定座標が角の三つ以上手前か取得
	///	@fn				public int getEdgeSideThree(int y,int x)
	///	@param[in]		int y			Y座標
	///	@param[in]		int x			X座標
	///	@return			0 : 成功 それ以外 : 失敗
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getEdgeSideThree(int y,int x){
		int ret = -1;
		if(
				(y == 0 && (3 <= x && x <= (this.mMasuCnt-4)))
			||	((3 <= y && y <= (this.mMasuCnt-4)) && x == 0)
			||	(y == (this.mMasuCnt-1) && (3 <= x && x <= (this.mMasuCnt-4)))
			||	((3 <= y && y <= (this.mMasuCnt-4)) && x == (this.mMasuCnt-1))
		){
			ret = 0;
		}
		return ret;
	}
}
