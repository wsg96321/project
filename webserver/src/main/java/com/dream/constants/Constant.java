package com.dream.constants;

import java.util.HashMap;
import java.util.Map;

import com.dream.bean.Checkcode;

public interface Constant {
	// MAC校验字段
	public final static String[] CHECK_FIELDS = new String[] { };
	// 返回报文是list类型的时候，使用的key名字
	public static final String JSON_LIST = "list";

	// 加密/解密规则
	public static final Map<String, String> keyMap = new HashMap<String, String>() {
		/**
		 * TODO 初始化加密规则
		 */
		private static final long serialVersionUID = 1L;

		{
			put(CONSTATN_USERNAME, FIELED_IMEI);
			put(CONSTATN_PASSWORD, FIELED_IMSI);
		}
	};
	
	
	//*********字段名字映射常量
	public static final String CONSTATN_USERNAME = "username";
	public static final String CONSTATN_PASSWORD = "password";
	public static final String FIELED_IMEI = "imei";
	public static final String FIELED_IMSI = "imsi";
	
	
	//校验码的位数
	public static final int CHECKCODE_LENGTH = 6;
	//默认的时间格式化模版
	public static final String DEFAULT_DATEFORMAT = "yyyy-MM-dd HH:mm:ss,SSS";

	//校验码过期时间(分钟)
	public static final int CHECKCODE_EXPIRE_MINUTE = 100;
	//校验码过期时间(毫秒)，自动根据上个参数计算
	public static final long CHECKCODE_EXPIRE_MILLISECOND  = CHECKCODE_EXPIRE_MINUTE * 60 * 1000;

	
	//*************业务代码
	public static final String CODE_0000="成功";
	public static final String CODE_0001="业务异常";
	public static final String CODE_0002="用户名或者密码错误，登录失败";
	public static final String CODE_0003="用户已经存在，注册失败";
	public static final String CODE_0004="校验码错误";
	public static final String CODE_0005="校验码已过期，过期时间为"+CHECKCODE_EXPIRE_MINUTE+"分钟";
	public static final String CODE_0006="";
	public static final String CODE_0007="";
	
}
