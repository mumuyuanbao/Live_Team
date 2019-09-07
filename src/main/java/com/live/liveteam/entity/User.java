package com.live.liveteam.entity;

import com.live.liveteam.common.utils.DateUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("会员实体类")
public class User {
    @ApiModelProperty("用户唯一标识openid")
    private String openId;
    @ApiModelProperty("sessionkey")
    private String sessionKey;
    @ApiModelProperty("所在城市")
    private String city;
    @ApiModelProperty("所在省份")
    private String province;
    @ApiModelProperty("所在国家")
    private String country;
    @ApiModelProperty("头像地址")
    private String avatarUrl;
    @ApiModelProperty("性别 0-女 1-男")
    private Byte gender;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("邮箱")
    private String userEmail;
    @ApiModelProperty("用户名（第一次登录使用微信，之后可更改）")
    private String nickName;
    @ApiModelProperty("用户所在地邮编")
    private Long userPostal;
    @ApiModelProperty("用户生日时间戳")
    private Long userBirthday;
    @ApiModelProperty("用户手机号")
    private String userIphone;
    @ApiModelProperty("真实姓名")
    private String realname;
    @ApiModelProperty("身份证号")
    private String cardId;
    @ApiModelProperty("用户二维码URL")
    private String qrCodeUrl;
    @ApiModelProperty("最近登录设备 0-PC 1-移动H5 2-微信 3-安卓 4-IOS")
    private Byte userIdevice;
    @ApiModelProperty("会员类型 0-青铜会员 1-白银会员 2-白金会员 ")
    private Byte userForm;
    @ApiModelProperty("用户总积分")
    private Long userCountNum;
    @ApiModelProperty("用户生日是否可修改  默认只能修改一次 0-可修改 1不可修改")
    private Byte userIsNot;
    @ApiModelProperty("用户最后登录IP")
    private String userLastIp;
    @ApiModelProperty("用户登录总次数")
    private Long userLoginNum;
    @ApiModelProperty("用户登录最后地址")
    private String userLoginAddress;
    @ApiModelProperty("创建时间-时间戳")
    private Long createTime;
    @ApiModelProperty("最后登录时间-时间戳")
    private Long lastVisitTime;

    public static User newUserEntity(){
        User user = new User();
        user.setOpenId("");
        user.setSessionKey("");
        user.setCity("");
        user.setProvince("");
        user.setCountry("");
        user.setAvatarUrl("");
        user.setGender((byte) 0);
        user.setAge(0);
        user.setUserEmail("");
        user.setNickName(String.valueOf(DateUtils.getTimeStamp()));
        user.setUserBirthday(0l);
        user.setUserIphone("");
        user.setRealname("");
        user.setQrCodeUrl("");
        user.setUserIdevice((byte) 1);
        user.setUserForm((byte)0);
        user.setUserIsNot((byte) 0);
        user.setUserLastIp("");
        user.setUserLoginNum(1l);
        user.setUserCountNum(0l);
        user.setUserLoginAddress("");
        user.setCreateTime(DateUtils.getTimeStamp());
        user.setLastVisitTime(DateUtils.getTimeStamp());
        return  user;
    }

    public User(String openId, String sessionKey, String city, String province, String country, String avatarUrl, Byte gender, Integer age, String userEmail, String nickName, Long userPostal, Long userBirthday, String userIphone, String realname, String cardId, String qrCodeUrl, Byte userIdevice, Byte userForm, Long userCountNum, Byte userIsNot, String userLastIp, Long userLoginNum, String userLoginAddress, Long createTime, Long lastVisitTime) {
        this.openId = openId;
        this.sessionKey = sessionKey;
        this.city = city;
        this.province = province;
        this.country = country;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.age = age;
        this.userEmail = userEmail;
        this.nickName = nickName;
        this.userPostal = userPostal;
        this.userBirthday = userBirthday;
        this.userIphone = userIphone;
        this.realname = realname;
        this.cardId = cardId;
        this.qrCodeUrl = qrCodeUrl;
        this.userIdevice = userIdevice;
        this.userForm = userForm;
        this.userCountNum = userCountNum;
        this.userIsNot = userIsNot;
        this.userLastIp = userLastIp;
        this.userLoginNum = userLoginNum;
        this.userLoginAddress = userLoginAddress;
        this.createTime = createTime;
        this.lastVisitTime = lastVisitTime;
    }

    public User() {
        super();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Long getUserPostal() {
        return userPostal;
    }

    public void setUserPostal(Long userPostal) {
        this.userPostal = userPostal;
    }

    public Long getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Long userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserIphone() {
        return userIphone;
    }

    public Long getUserCountNum() {
        return userCountNum;
    }

    public void setUserCountNum(Long userCountNum) {
        this.userCountNum = userCountNum;
    }

    public void setUserIphone(String userIphone) {
        this.userIphone = userIphone == null ? null : userIphone.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl == null ? null : qrCodeUrl.trim();
    }

    public Byte getUserIdevice() {
        return userIdevice;
    }

    public void setUserIdevice(Byte userIdevice) {
        this.userIdevice = userIdevice;
    }

    public Byte getUserForm() {
        return userForm;
    }

    public void setUserForm(Byte userForm) {
        this.userForm = userForm;
    }

    public Byte getUserIsNot() {
        return userIsNot;
    }

    public void setUserIsNot(Byte userIsNot) {
        this.userIsNot = userIsNot;
    }

    public String getUserLastIp() {
        return userLastIp;
    }

    public void setUserLastIp(String userLastIp) {
        this.userLastIp = userLastIp == null ? null : userLastIp.trim();
    }

    public Long getUserLoginNum() {
        return userLoginNum;
    }

    public void setUserLoginNum(Long userLoginNum) {
        this.userLoginNum = userLoginNum;
    }

    public String getUserLoginAddress() {
        return userLoginAddress;
    }

    public void setUserLoginAddress(String userLoginAddress) {
        this.userLoginAddress = userLoginAddress == null ? null : userLoginAddress.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(Long lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }
}