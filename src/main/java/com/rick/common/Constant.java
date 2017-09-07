package com.rick.common;

/**
 * -------------------------------------------
 * Title : Constant 
 * Description : 系统常量类
 * Create on : 2017年8月1日 下午1:30:13
 * Copyright (C) strongunion
 * @author RICK
 * @版本号: V1.0
 * -------------------------------------------
 */
public class Constant {

	/** 金额放大倍数 */
	public static final int MONEY_MULTIPLE = 100;
	/**默认当前页*/
	public static final int CURRENT_PAGE = 1;
	/**默认分页条数*/
	public static final int PAGE_SIZE = 10;
	/** 默认密码  */
	public static String DEFAULT_PASSWORD="123456";
	/** 文件上传路径  */
	public static String uploadImgPath="";
	/** 图片服务器url */
	public static String PHOTO_SERVER_URL = "";
	/**日期java格式<p>yyyy-MM-dd*/
	public final static String DATEFORMAT_MINUS = "yyyy-MM-dd";
	/**日期java格式<p>yyyy-MM-dd HH:mm*/
	public final static String DATETIME_FORMAT_MINUS_NO_SECONDS = "yyyy-MM-dd HH:mm";
	/**日期SQL格式<p>年-月-日%Y-%m-%d*/
	public final static String SQL_DATEFORMAT_MINUS = "%Y-%m-%d";
	/**日期java格式<p>年-月-日 时:分:秒yyyy-MM-dd HH:mm:ss*/
	public final static String DATETIMEFORMAT_MINUS = "yyyy-MM-dd HH:mm:ss";
	/**日期SQL格式<p>年-月-日 时:分:秒%Y-%m-%d %H:%i:%s*/
	public final static String SQL_DATETIMEFORMAT_MINUS = "%Y-%m-%d %H:%i:%s";
	/**日期SQL格式<p>年-月-日 时:分:秒%Y-%m-%d %H:%i*/
	public final static String SQL_DATETIMEFORMAT_MINUTES= "%Y-%m-%d %H:%i";
	/**成功（字符串）大写*/
	public final static String SUCCESS_UPPERCASE = "SUCCESS";
	/**失败（字符串）大写*/
	public final static String FAIL_UPPERCASE = "FAIL";
	/**时间开始后缀*/
	public static final String BEGIN_TIME_SUFFIX = " 00:00:00";
	/**时间结束后缀*/
	public static final String END_TIME_SUFFIX = " 23:59:59";

	
	/**周*/
	public static final class Week {
		//周一
		public static final String WEEK_MONDAY = "monday";
		public static final String WEEK_MONDAY_NAME = "周一";
		//周二
		public static final String WEEK_TUESDAY = "tuesday";
		public static final String WEEK_TUESDAY_NAME = "周二";
		//周三
		public static final String WEEK_WEDNESDAY = "wednesday";
		public static final String WEEK_WEDNESDAY_NAME = "周三";
		//周四
		public static final String WEEK_THURSDAY = "thursday";
		public static final String WEEK_THURSDAY_NAME = "周四";
		//周五
		public static final String WEEK_FRIDAY = "friday";
		public static final String WEEK_FRIDAY_NAME = "周五";
		//周六
		public static final String WEEK_SATURDAY = "saturday";
		public static final String WEEK_SATURDAY_NAME = "周六";
		//周日
		public static final String WEEK_SUNDAY = "sunday";
		public static final String WEEK_SUNDAY_NAME = "周日";
	}
	
	/**日志类型*/
	static final public class LogStatus {
		/**成功*/
		public static final int LOG_SUCCESS = 1;
		/**异常*/
		public static final int LOG_FAIL = 2;
	}
	
	/**操作符号*/
	public static final class OperatorSymbol {
		/**逗号*/
		public static final String COMMA = ",";
		/**冒号*/
		public static final String COLON = ":";
		/**单引号*/
		public static final String SINGLE_QUOTE = "'";
		/**双引号*/
		public static final String DOUBLE_QUOTES = "\"";
	}
	
	/**操作类型*/
	public static final class OperatorType {
		/**新增*/
		public static final String ADD = "add";
		/**删除*/
		public static final String DELETE = "delete";
		/**修改*/
		public static final String UPDATE = "update";
		/**查询*/
		public static final String QUERY = "query";
	}
	
	
}
