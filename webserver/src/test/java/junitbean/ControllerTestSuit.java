package junitbean;

import org.junit.Test;

import annotation.RequestParameter;
import annotation.RequestServletPath;

public class ControllerTestSuit {
	//****************Frieds|*************************

	@Test 
	@RequestServletPath("/listFriends")
	//正确 $$$ 
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"currentPage\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listFriendsController() throws Exception {
	}
	
	
	@Test 
	@RequestServletPath("/listFriendsSendMessage")
	//正确 $$$ 
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"currentPage\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listFriendsSendMessageController() throws Exception {
	}
	
	
	@Test 
	@RequestServletPath("/listFriendsReceiveMessage")
	//正确 $$$ 
	@RequestParameter(name = "request", value = "{\"content\":{\"frienduserid\":\"1\",\"currentPage\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listFriendsReceiveMessageController() throws Exception {
	}
	
	@Test 
	@RequestServletPath("/addANewFriends")
	//正确 $$$ 
	@RequestParameter(name = "request", value = "{\"content\":{\"frienduserid\":\"1\",\"userid\":\"2\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void addANewFriendsController() throws Exception {
	}
	
	@Test 
	@RequestServletPath("/manageFriendsAdd")
	//正确 $$$ 
//	@RequestParameter(name = "request", value = "{\"content\":{\"frienduserid\":\"1\",\"userid\":\"2\",\"isbefriend\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	@RequestParameter(name = "request", value = "{\"content\":{\"frienduserid\":\"1\",\"userid\":\"2\",\"isbefriend\":\"2\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void manageFriendsAddController() throws Exception {
	}
	
	//****************Message|**********************

	@Test 
	@RequestServletPath("/listRoughMessage")
	//正确 $$$ 列出所有该用户的未读信息  
//	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"currentPage\":\"1\",\"isread\":\"0\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	//正确 $$$ 列出该用户的所有消息
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"currentPage\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listMessageController() throws Exception {
	}
	
	@Test
	@RequestServletPath("/detailMessage")
	@RequestParameter(name = "request", value = "{\"content\":{\"messageid\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void detailMessageController() throws Exception {
	}
	
	
	
	//****************Checkcode|**********************
	
	@Test 
	@RequestServletPath("/generateCheckcode")
	// 正确 $$$
	@RequestParameter(name = "request", value = "{\"content\":{\"telephone\":\"15159628259\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void generateCheckcodeController() throws Exception {
	}
	//****************Registeractivity|**************
	@Test
	@RequestServletPath("/countRegisterSign")
	// 正确 $$$
	@RequestParameter(name = "request", value = "{\"content\":{\"activityid\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void countRegisterSignController() throws Exception {
	}
	
	@Test
	@RequestServletPath("/listRegisterSignUser")
	// 正确 $$$
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"activityid\":\"1\",\"currentPage\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listRegisterSignUserController() throws Exception {
	}
	
	@Test
	@RequestServletPath("/addRegisteractivity")
	// 正确 $$$ 
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"5\",\"activityid\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void addRegisteractivityController() throws Exception {
	}
	
	
	//****************Onlinequestion|***************
	@Test
	@RequestServletPath("/listOnlinequestion")
	// 正确 $$$  
//	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"currentPage\":\"10\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	@RequestParameter(name = "request", value = "{\"content\":{\"currentPage\":\"2\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listOnlinequestionController() throws Exception {
	}
	
	//****************Activity|**********************

//	@Test
//	// 正确
//	@RequestServletPath("/addActivity")
//	@RequestParameter(name = "request", value = "{\"content\":{\"username\":\"5CFFFFFFF238FFFFFFB67547FFFFFFC223\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void addActivityController() throws Exception {
//	}

	@Test
	@RequestServletPath("/detailActivity")
	// 正确  $$$  
	@RequestParameter(name = "request", value = "{\"content\":{\"activityid\":\"1\",\"userid\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void detailActivityController() throws Exception {
	}

	@Test
	@RequestServletPath("/listActivityIncludeVip")
	// 正确  $$$  
	@RequestParameter(name = "request", value = "{\"content\":{\"currentPage\":\"1\",\"kindsid\":\"2\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listActivityIncludeVipController() throws Exception {
	}
	
	//********************Activityvip|**********************
	@Test
	@RequestServletPath("/listActivityvip")
	// 正确  $$$  
	@RequestParameter(name = "request", value = "{\"content\":{\"activityid\":\"1\",\"currentPage\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listActivityvipController() throws Exception {
	}
	
	// *******************Comment|***********************

//	@Test
//	@RequestServletPath("/addComment")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void addCommentController() throws Exception {
//	}
//
//	@Test
//	@RequestServletPath("/detailComment")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void detailCommentController() throws Exception {
//	}
//
	@Test
	@RequestServletPath("/listComment")
	// 正确 $$$ 可以正常返回list，同时每个评论都包含总的评论点赞数，还有该用户是否已点赞
	@RequestParameter(name = "request", value = "{\"content\":{\"themeid\":\"1\",\"currentPage\":\"1\",\"userid\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listCommentController() throws Exception {
	}

	// ********************Praise|**********************
	@Test
	@RequestServletPath("/addActivityPraise")
	//正确 活动点赞，已经赞过的也正常返回错误   $$$   
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"otherid\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void addActivityPraiseController() throws Exception {
	}

	@Test
	@RequestServletPath("/addThemePraise")
	//主题点赞  $$$  
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"otherid\":\"2\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void addThemePraiseController() throws Exception {
	}
	
	
//	@Test
//	@RequestServletPath("/detailPraise")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void detailPraiseController() throws Exception {
//	}
//
//	@Test
//	@RequestServletPath("/listPraise")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void listPraiseController() throws Exception {
//	}

	// **********************Theme|********************
//	@Test
//	@RequestServletPath("/addTheme")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void addThemeController() throws Exception {
//	}
//
//	@Test
//	@RequestServletPath("/detailTheme")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void detailThemeController() throws Exception {
//	}
//
	@Test
	@RequestServletPath("/listTheme")
	//正确 |$$$
	@RequestParameter(name = "request", value = "{\"content\":{\"currentPage\":\"1\",\"activityid\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listThemeController() throws Exception {
	}

	// **********************User|********************
	@Test
	@RequestServletPath("/loginUser")
	//正确  $$$  
	@RequestParameter(name = "request", value = "{\"content\":{\"telephone\":\"15159628259\",\"password\":\"test321\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	//错误的——无值的字段请不要发送""字符串，会解析异常  TODO
//	@RequestParameter(name = "request", value = "{\"content\":{\"username\":\"123\",\"password\":\"123\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	@RequestParameter(name = "request", value = "{\"content\":{\"username\":\"\",\"password\":\"123\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	@RequestParameter(name = "request", value = "{\"content\":{\"username\":\"123\",\"password\":\"\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void loginUserController() throws Exception {
	}
	
	@Test
	@RequestServletPath("/registerUser")
	//正确,执行两次该测试用力会报错|手机号相同  $$$
	@RequestParameter(name = "request", value = "{\"content\":{\"telephone\":\"15155105527\",\"nickname\":\"测试22\",\"company\":\"福富\",\"password\":\"test321\",\"checkcode\":\"977708\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void registerUserController() throws Exception {
	}
	
	@Test
	@RequestServletPath("/findbackUser")
	//正确，多次执行正常可以生成多个校验码  $$$
	@RequestParameter(name = "request", value = "{\"content\":{\"telephone\":\"15159628259\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void findbackUserController() throws Exception {
	}
	
	@Test
	@RequestServletPath("/resetPasswdUser")
	//正确,校验码过期，校验码错误均可以正常显示，校验码通过可以正常修改密码  $$$
	@RequestParameter(name = "request", value = "{\"content\":{\"telephone\":\"15159628259\",\"password\":\"wsg123\",\"checkcode\":\"600074\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	//错误，校验码错误的demo
//	@RequestParameter(name = "request", value = "{\"content\":{\"telephone\":\"15159628259\",\"password\":\"hehe\",\"checkcode\":\"11111\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void resetPasswdUserController() throws Exception {
	}
	
	
	
	@Test 
	@RequestServletPath("/listOnceUser")
	//正确 $$$ 
	@RequestParameter(name = "request", value = "{\"content\":{\"userid\":\"1\",\"currentPage\":\"1\"},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
	public void listOnceUserController() throws Exception {
	}
	
	
//	@Test
//	@RequestServletPath("/addUser")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void addUserController() throws Exception {
//	}
//
//	@Test
//	@RequestServletPath("/detailUser")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void detailUserController() throws Exception {
//	}
//
//	@Test
//	@RequestServletPath("/listUser")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void listUserController() throws Exception {
//	}

	// ***********************Userinfo|*******************
//	@Test
//	@RequestServletPath("/addUserinfo")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void addUserinfoController() throws Exception {
//	}
//
//	@Test
//	@RequestServletPath("/detailUserinfo")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void detailUserinfoController() throws Exception {
//	}
//
//	@Test
//	@RequestServletPath("/listUserinfo")
//	@RequestParameter(name = "request", value = "{\"content\":{},\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
//	public void listUserinfoController() throws Exception {
//	}

	// ******************************************
	
	// *******************Ad|**********************
	@Test
	@RequestServletPath("/listAd")
	@RequestParameter(name = "request", value = "{\"content=\"returnnum\":1,\"head\":{\"brand\":\"HTC\",\"imei\":\"356871046099762\",\"imsi\":\"1234567890ABCDEF\",\"model\":\"Evo 3D GSM\",\"netype\":\"NETWORK_TYPE_WIFI\",\"platform\":\"Android\",\"release\":\"4.2.2\",\"sdk\":\"17\",\"serial\":\"HT22PV203276\",\"time\":\"2014-10-24 13:51:55,611\",\"versionCode\":\"1\",\"versionName\":\"1.0\"},\"mac\":\"F4F26357424C5C61\"}")
		public void listAdController() throws Exception {
	}
	

}
