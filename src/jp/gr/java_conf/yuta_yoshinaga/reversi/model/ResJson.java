////////////////////////////////////////////////////////////////////////////////
///	@file			ResJson.java
///	@brief			リバーシポイントクラス実装ファイル
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
///	@class		ResJson
///	@brief		リバーシポイントクラス
///
////////////////////////////////////////////////////////////////////////////////
public class ResJson
{
	private String auth;
	private ArrayList<String> callbacks;

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public ArrayList<String> getCallbacks() {
		return callbacks;
	}

	public void setCallbacks(ArrayList<String> callbacks) {
		this.callbacks = callbacks;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public ResJson()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public ResJson(){
		this.auth = "";
		this.callbacks = new ArrayList<String>();
	}
}

