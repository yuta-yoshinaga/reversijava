////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiPlayDelegate.java
///	@brief			リバーシデリゲートファイル
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
///	@interface	ReversiPlayDelegate
///	@brief		リバーシプレイデリゲート
///
////////////////////////////////////////////////////////////////////////////////
public class ReversiPlayDelegate implements Serializable
{
	private final ReversiPlayInterface impl;					//!< デリゲート

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				ReversiPlayDelegate(ReversiPlayInterface i)
	///	@param[in]		ReversiPlayInterface i
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ReversiPlayDelegate(ReversiPlayInterface i)
	{
		this.impl = i;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			メッセージダイアログ
	///	@fn				FuncsJson ViewMsgDlg(String title , String msg)
	///	@param[in]		String title	タイトル
	///	@param[in]		String msg		メッセージ
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson ViewMsgDlg(String title , String msg)
	{
		return impl.ViewMsgDlg(title , msg);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			1マス描画
	///	@fn				FuncsJson DrawSingle(int y, int x, int sts, int bk, String text)
	///	@param[in]		int y		Y座標
	///	@param[in]		int x		X座標
	///	@param[in]		int sts		ステータス
	///	@param[in]		int bk		背景
	///	@param[in]		String text	テキスト
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson DrawSingle(int y, int x, int sts, int bk, String text)
	{
		return impl.DrawSingle(y, x, sts, bk, text);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在の色メッセージ
	///	@fn				FuncsJson CurColMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson CurColMsg(String text)
	{
		return impl.CurColMsg(text);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在のステータスメッセージ
	///	@fn				FuncsJson CurStsMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson CurStsMsg(String text)
	{
		return impl.CurStsMsg(text);
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ウェイト
	///	@fn				FuncsJson Wait(int time)
	///	@param[in]		int time	ウェイト時間(msec)
	///	@return			FuncsJson
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson Wait(int time)
	{
		return impl.Wait(time);
	}
}
