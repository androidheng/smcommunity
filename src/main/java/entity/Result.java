package entity;

import java.io.Serializable;

/**
 * 用于向页面传递信息的类
 * @author jt
 *
 */
public class Result implements Serializable{
	
	private boolean success;
	private boolean flag;
	private String message;
	private int resultcode;
	private String reason;
	private Object data;
	
	
	public Result(int resultcode) {
		super();
		this.resultcode = resultcode;
	}
	
	public Result(int resultcode, String reason) {
		super();
		this.resultcode = resultcode;
		this.reason = reason;
	}

	public Result(int resultcode, String reason, Object data) {
		super();
		this.resultcode = resultcode;
		this.reason = reason;
		this.data = data;
	}
	public Result(boolean success, String message) {
		super();
		this.success=success;
		this.flag = success;
		this.message = message;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getResultcode() {
		return resultcode;
	}

	public void setResultcode(int resultcode) {
		this.resultcode = resultcode;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
