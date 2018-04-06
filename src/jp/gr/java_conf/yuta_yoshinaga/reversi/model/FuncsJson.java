////////////////////////////////////////////////////////////////////////////////
///	@file			FuncsJson.java
///	@brief			ファンクションJSONクラス実装ファイル
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
///	@class		FuncsJson
///	@brief		ファンクションJSONクラス
///
////////////////////////////////////////////////////////////////////////////////
public class FuncsJson implements Serializable
{
	private String func;
	private String param1;
	private String param2;
	private String param3;
	private String param4;
	private String param5;

	public String getFunc() {
		return func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getParam4() {
		return param4;
	}

	public void setParam4(String param4) {
		this.param4 = param4;
	}

	public String getParam5() {
		return param5;
	}

	public void setParam5(String param5) {
		this.param5 = param5;
	}

	////////////////////////////////////////////////////////////////////////////////
	///	@brief			コンストラクタ
	///	@fn				public FuncsJson()
	///	@return			ありません
	///	@author			Yuta Yoshinaga
	///	@date			2018.04.01
	///
	////////////////////////////////////////////////////////////////////////////////
	public FuncsJson(){
		this.func = "";
		this.param1 = "";
		this.param2 = "";
		this.param3 = "";
		this.param4 = "";
		this.param5 = "";
	}
}

