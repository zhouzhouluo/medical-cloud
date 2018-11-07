package com.zhou.medical.common.entity.log;

import java.util.Date;

public class MessageLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.to_user_id1
     *
     * @mbggenerated
     */
    private Integer toUserId1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.to_user_name1
     *
     * @mbggenerated
     */
    private String toUserName1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.to_user_phone1
     *
     * @mbggenerated
     */
    private String toUserPhone1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.to_user_id2
     *
     * @mbggenerated
     */
    private Integer toUserId2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.to_user_name2
     *
     * @mbggenerated
     */
    private String toUserName2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.to_user_phone2
     *
     * @mbggenerated
     */
    private String toUserPhone2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.from_user_id
     *
     * @mbggenerated
     */
    private Integer fromUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.from_user_name
     *
     * @mbggenerated
     */
    private String fromUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.from_user_phone
     *
     * @mbggenerated
     */
    private String fromUserPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.from_user_type
     *
     * @mbggenerated
     */
    private Integer fromUserType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.messageContent
     *
     * @mbggenerated
     */
    private String messagecontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.message_type
     *
     * @mbggenerated
     */
    private Integer messageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.sendtime
     *
     * @mbggenerated
     */
    private Date sendtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_log.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.id
     *
     * @return the value of message_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.id
     *
     * @param id the value for message_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.to_user_id1
     *
     * @return the value of message_log.to_user_id1
     *
     * @mbggenerated
     */
    public Integer getToUserId1() {
        return toUserId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.to_user_id1
     *
     * @param toUserId1 the value for message_log.to_user_id1
     *
     * @mbggenerated
     */
    public void setToUserId1(Integer toUserId1) {
        this.toUserId1 = toUserId1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.to_user_name1
     *
     * @return the value of message_log.to_user_name1
     *
     * @mbggenerated
     */
    public String getToUserName1() {
        return toUserName1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.to_user_name1
     *
     * @param toUserName1 the value for message_log.to_user_name1
     *
     * @mbggenerated
     */
    public void setToUserName1(String toUserName1) {
        this.toUserName1 = toUserName1 == null ? null : toUserName1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.to_user_phone1
     *
     * @return the value of message_log.to_user_phone1
     *
     * @mbggenerated
     */
    public String getToUserPhone1() {
        return toUserPhone1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.to_user_phone1
     *
     * @param toUserPhone1 the value for message_log.to_user_phone1
     *
     * @mbggenerated
     */
    public void setToUserPhone1(String toUserPhone1) {
        this.toUserPhone1 = toUserPhone1 == null ? null : toUserPhone1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.to_user_id2
     *
     * @return the value of message_log.to_user_id2
     *
     * @mbggenerated
     */
    public Integer getToUserId2() {
        return toUserId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.to_user_id2
     *
     * @param toUserId2 the value for message_log.to_user_id2
     *
     * @mbggenerated
     */
    public void setToUserId2(Integer toUserId2) {
        this.toUserId2 = toUserId2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.to_user_name2
     *
     * @return the value of message_log.to_user_name2
     *
     * @mbggenerated
     */
    public String getToUserName2() {
        return toUserName2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.to_user_name2
     *
     * @param toUserName2 the value for message_log.to_user_name2
     *
     * @mbggenerated
     */
    public void setToUserName2(String toUserName2) {
        this.toUserName2 = toUserName2 == null ? null : toUserName2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.to_user_phone2
     *
     * @return the value of message_log.to_user_phone2
     *
     * @mbggenerated
     */
    public String getToUserPhone2() {
        return toUserPhone2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.to_user_phone2
     *
     * @param toUserPhone2 the value for message_log.to_user_phone2
     *
     * @mbggenerated
     */
    public void setToUserPhone2(String toUserPhone2) {
        this.toUserPhone2 = toUserPhone2 == null ? null : toUserPhone2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.from_user_id
     *
     * @return the value of message_log.from_user_id
     *
     * @mbggenerated
     */
    public Integer getFromUserId() {
        return fromUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.from_user_id
     *
     * @param fromUserId the value for message_log.from_user_id
     *
     * @mbggenerated
     */
    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.from_user_name
     *
     * @return the value of message_log.from_user_name
     *
     * @mbggenerated
     */
    public String getFromUserName() {
        return fromUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.from_user_name
     *
     * @param fromUserName the value for message_log.from_user_name
     *
     * @mbggenerated
     */
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName == null ? null : fromUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.from_user_phone
     *
     * @return the value of message_log.from_user_phone
     *
     * @mbggenerated
     */
    public String getFromUserPhone() {
        return fromUserPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.from_user_phone
     *
     * @param fromUserPhone the value for message_log.from_user_phone
     *
     * @mbggenerated
     */
    public void setFromUserPhone(String fromUserPhone) {
        this.fromUserPhone = fromUserPhone == null ? null : fromUserPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.from_user_type
     *
     * @return the value of message_log.from_user_type
     *
     * @mbggenerated
     */
    public Integer getFromUserType() {
        return fromUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.from_user_type
     *
     * @param fromUserType the value for message_log.from_user_type
     *
     * @mbggenerated
     */
    public void setFromUserType(Integer fromUserType) {
        this.fromUserType = fromUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.messageContent
     *
     * @return the value of message_log.messageContent
     *
     * @mbggenerated
     */
    public String getMessagecontent() {
        return messagecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.messageContent
     *
     * @param messagecontent the value for message_log.messageContent
     *
     * @mbggenerated
     */
    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.message_type
     *
     * @return the value of message_log.message_type
     *
     * @mbggenerated
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.message_type
     *
     * @param messageType the value for message_log.message_type
     *
     * @mbggenerated
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.sendtime
     *
     * @return the value of message_log.sendtime
     *
     * @mbggenerated
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.sendtime
     *
     * @param sendtime the value for message_log.sendtime
     *
     * @mbggenerated
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.createtime
     *
     * @return the value of message_log.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.createtime
     *
     * @param createtime the value for message_log.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_log.updatetime
     *
     * @return the value of message_log.updatetime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_log.updatetime
     *
     * @param updatetime the value for message_log.updatetime
     *
     * @mbggenerated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}