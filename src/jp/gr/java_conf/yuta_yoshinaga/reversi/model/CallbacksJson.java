////////////////////////////////////////////////////////////////////////////////
///	@file			CallbacksJson.java
///	@brief			コールバックJSONクラス実装ファイル
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

import java.util.ArrayList;

////////////////////////////////////////////////////////////////////////////////
///	@class		CallbacksJson
///	@brief		コールバックJSONクラス
///
////////////////////////////////////////////////////////////////////////////////
public class CallbacksJson
{
	private ArrayList<FuncsJson> funcs;

	public ArrayList<FuncsJson> getFuncs() {
		return funcs;
	}

	public void setFuncs(ArrayList<FuncsJson> funcs) {
		this.funcs = funcs;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public CallbacksJson()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public CallbacksJson(){
		this.funcs = new ArrayList<FuncsJson>();
	}
}

