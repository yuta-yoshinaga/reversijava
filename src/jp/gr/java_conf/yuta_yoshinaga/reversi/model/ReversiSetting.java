////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiSetting.java
///	@brief			アプリ設定クラス
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

package jp.gr.java_conf.yuta_yoshinaga.reversi.model;

import java.io.Serializable;

////////////////////////////////////////////////////////////////////////////////
///	@class		ReversiSetting
///	@brief		アプリ設定クラス
///
////////////////////////////////////////////////////////////////////////////////
public class ReversiSetting implements Serializable
{
	private int mMode;														//!< 現在のモード
	private int mType;														//!< 現在のタイプ
	private int mPlayer;													//!< プレイヤーの色
	private int mAssist;													//!< アシスト
	private int mGameSpd;													//!< ゲームスピード
	private int mEndAnim;													//!< ゲーム終了アニメーション
	private int mMasuCntMenu;												//!< マスの数
	private int mMasuCnt;													//!< マスの数
	private int mPlayCpuInterVal;											//!< CPU対戦時のインターバル(msec)
	private int mPlayDrawInterVal;											//!< 描画のインターバル(msec)
	private int mEndDrawInterVal;											//!< 終了アニメーション描画のインターバル(msec)
	private int mEndInterVal;												//!< 終了アニメーションのインターバル(msec)
	private String mPlayerColor1;											//!< プレイヤー1の色
	private String mPlayerColor2;											//!< プレイヤー2の色
	private String mBackGroundColor;										//!< 背景の色
	private String mBorderColor;											//!< 枠線の色

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMode()
	///	@return			int mMode
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMode() {
		return mMode;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMode(int mMode)
	///	@param[in]		int mMode
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMode(int mMode) {
		this.mMode = mMode;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmType()
	///	@return			int mType
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmType() {
		return mType;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmType(int mType)
	///	@param[in]		int mType
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmType(int mType) {
		this.mType = mType;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmPlayer()
	///	@return			int mPlayer
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmPlayer() {
		return mPlayer;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmPlayer(int mPlayer)
	///	@param[in]		int mPlayer
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmPlayer(int mPlayer) {
		this.mPlayer = mPlayer;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmAssist()
	///	@return			int mAssist
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmAssist() {
		return mAssist;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmAssist(int mAssist)
	///	@param[in]		int mAssist
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmAssist(int mAssist) {
		this.mAssist = mAssist;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmGameSpd()
	///	@return			int mGameSpd
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmGameSpd() {
		return mGameSpd;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmGameSpd(int mGameSpd)
	///	@param[in]		int mGameSpd
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmGameSpd(int mGameSpd) {
		this.mGameSpd = mGameSpd;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmEndAnim()
	///	@return			int mEndAnim
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmEndAnim() {
		return mEndAnim;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmEndAnim(int mEndAnim)
	///	@param[in]		int mEndAnim
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmEndAnim(int mEndAnim) {
		this.mEndAnim = mEndAnim;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmMasuCntMenu()
	///	@return			int mMasuCntMenu
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmMasuCntMenu() {
		return mMasuCntMenu;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmMasuCntMenu(int mMasuCntMenu)
	///	@param[in]		int mMasuCntMenu
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmMasuCntMenu(int mMasuCntMenu) {
		this.mMasuCntMenu = mMasuCntMenu;
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
	///	@fn				int getmPlayCpuInterVal()
	///	@return			int mPlayCpuInterVal
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmPlayCpuInterVal() {
		return mPlayCpuInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmPlayCpuInterVal(int mPlayCpuInterVal)
	///	@param[in]		int mPlayCpuInterVal
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmPlayCpuInterVal(int mPlayCpuInterVal) {
		this.mPlayCpuInterVal = mPlayCpuInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmPlayDrawInterVal()
	///	@return			int mPlayDrawInterVal
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmPlayDrawInterVal() {
		return mPlayDrawInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmPlayDrawInterVal(int mPlayDrawInterVal)
	///	@param[in]		int mPlayDrawInterVal
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmPlayDrawInterVal(int mPlayDrawInterVal) {
		this.mPlayDrawInterVal = mPlayDrawInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmEndDrawInterVal()
	///	@return			int mEndDrawInterVal
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmEndDrawInterVal() {
		return mEndDrawInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmEndDrawInterVal(int mEndDrawInterVal)
	///	@param[in]		int mEndDrawInterVal
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmEndDrawInterVal(int mEndDrawInterVal) {
		this.mEndDrawInterVal = mEndDrawInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				int getmEndInterVal()
	///	@return			int mEndInterVal
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public int getmEndInterVal() {
		return mEndInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmEndInterVal(int mEndInterVal)
	///	@param[in]		int mEndInterVal
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmEndInterVal(int mEndInterVal) {
		this.mEndInterVal = mEndInterVal;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				String getmPlayerColor1()
	///	@return			String mPlayerColor1
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public String getmPlayerColor1() {
		return mPlayerColor1;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmPlayerColor1(String mPlayerColor1)
	///	@param[in]		String mPlayerColor1
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmPlayerColor1(String mPlayerColor1) {
		this.mPlayerColor1 = mPlayerColor1;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				String getmPlayerColor2()
	///	@return			String mPlayerColor2
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public String getmPlayerColor2() {
		return mPlayerColor2;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmPlayerColor2(String mPlayerColor2)
	///	@param[in]		String mPlayerColor2
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmPlayerColor2(String mPlayerColor2) {
		this.mPlayerColor2 = mPlayerColor2;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				String getmBackGroundColor()
	///	@return			String mBackGroundColor
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public String getmBackGroundColor() {
		return mBackGroundColor;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmBackGroundColor(String mBackGroundColor)
	///	@param[in]		String mBackGroundColor
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmBackGroundColor(String mBackGroundColor) {
		this.mBackGroundColor = mBackGroundColor;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ゲッター
	///	@fn				String getmBorderColor()
	///	@return			String mBorderColor
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public String getmBorderColor() {
		return mBorderColor;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			セッター
	///	@fn				void setmBorderColor(String mBorderColor)
	///	@param[in]		String mBorderColor
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public void setmBorderColor(String mBorderColor) {
		this.mBorderColor = mBorderColor;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				ReversiSetting()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2017.10.20
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiSetting()
	{
		this.reset();
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			リセット
	///	@fn				void reset()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2017.10.20
	///
	////////////////////////////////////////////////////////////////////////////////
	public void reset()
	{
		this.mMode = ReversiConst.DEF_MODE_ONE;								// 現在のモード
		this.mType = ReversiConst.DEF_TYPE_HARD;							// 現在のタイプ
		this.mPlayer = ReversiConst.REVERSI_STS_BLACK;						// プレイヤーの色
		this.mAssist = ReversiConst.DEF_ASSIST_ON;							// アシスト
		this.mGameSpd = ReversiConst.DEF_GAME_SPD_MID;						// ゲームスピード
		this.mEndAnim = ReversiConst.DEF_END_ANIM_ON;						// ゲーム終了アニメーション
		this.mMasuCntMenu = ReversiConst.DEF_MASU_CNT_8;					// マスの数
		this.mMasuCnt = ReversiConst.DEF_MASU_CNT_8_VAL;					// マスの数
		this.mPlayCpuInterVal = ReversiConst.DEF_GAME_SPD_MID_VAL2;			// CPU対戦時のインターバル(msec)
		this.mPlayDrawInterVal = ReversiConst.DEF_GAME_SPD_MID_VAL;			// 描画のインターバル(msec)
		this.mEndDrawInterVal = 100;										// 終了アニメーション描画のインターバル(msec)
		this.mEndInterVal = 500;											// 終了アニメーションのインターバル(msec)
		this.mPlayerColor1 = "#000000";										// プレイヤー1の色
		this.mPlayerColor2 = "#FFFFFF";										// プレイヤー2の色
		this.mBackGroundColor = "#00FF00";									// 背景の色
		this.mBorderColor = "#000000";										// 枠線の色
	}
}
