package com.gtp.myhistory.been;

import java.io.Serializable;

/**
* @desc：
* @author：yangj
* @date：2020/1/19 0019 15:54
*/
public class ResponseJson implements Serializable {

	/**
	 * 成功与否标识
	 */
	private boolean success;
	/**
	 * 消息文本
	 */
	private String msg;
	/**
	 * 消息内容
	 */
	private Object obj;

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}
