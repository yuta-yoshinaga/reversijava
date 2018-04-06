////////////////////////////////////////////////////////////////////////////////
///	@file			ReversiPlayInterface.java
///	@brief			リバーシインターフェースファイル
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

////////////////////////////////////////////////////////////////////////////////
///	@interface	ReversiPlayInterface
///	@brief		リバーシプレイインターフェース
///
////////////////////////////////////////////////////////////////////////////////
public interface ReversiPlayInterface
{
	////////////////////////////////////////////////////////////////////////////////
	///	@brief			メッセージダイアログ
	///	@fn				void ViewMsgDlg(String title , String msg)
	///	@param[in]		String title	タイトル
	///	@param[in]		String msg		メッセージ
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	void ViewMsgDlg(String title , String msg);

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			1マス描画
	///	@fn				void DrawSingle(int y, int x, int sts, int bk, String text)
	///	@param[in]		int y		Y座標
	///	@param[in]		int x		X座標
	///	@param[in]		int sts		ステータス
	///	@param[in]		int bk		背景
	///	@param[in]		String text	テキスト
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	void DrawSingle(int y, int x, int sts, int bk, String text);

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在の色メッセージ
	///	@fn				void CurColMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	void CurColMsg(String text);

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			現在のステータスメッセージ
	///	@fn				void CurStsMsg(String text)
	///	@param[in]		String text	テキスト
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	void CurStsMsg(String text);

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			ウェイト
	///	@fn				void Wait(int time)
	///	@param[in]		int time	ウェイト時間(msec)
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	void Wait(int time);
}
