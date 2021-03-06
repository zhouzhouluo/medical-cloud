package com.zhou.medical.common.entity.log;

import java.util.Date;

public class DoctorSecretaryMessageLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.to_user_id
     *
     * @mbggenerated
     */
    private Integer toUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.to_user_name
     *
     * @mbggenerated
     */
    private String toUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.to_user_phone
     *
     * @mbggenerated
     */
    private String toUserPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.from_user_id
     *
     * @mbggenerated
     */
    private Integer fromUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.from_user_name
     *
     * @mbggenerated
     */
    private String fromUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.from_user_phone
     *
     * @mbggenerated
     */
    private String fromUserPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.from_user_type
     *
     * @mbggenerated
     */
    private Integer fromUserType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.messageContent
     *
     * @mbggenerated
     */
    private String messagecontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.message_type
     *
     * @mbggenerated
     */
    private Integer messageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.sendtime
     *
     * @mbggenerated
     */
    private Date sendtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doctor_secretary_message_log.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.id
     *
     * @return the value of doctor_secretary_message_log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.id
     *
     * @param id the value for doctor_secretary_message_log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.to_user_id
     *
     * @return the value of doctor_secretary_message_log.to_user_id
     *
     * @mbggenerated
     */
    public Integer getToUserId() {
        return toUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.to_user_id
     *
     * @param toUserId the value for doctor_secretary_message_log.to_user_id
     *
     * @mbggenerated
     */
    public void setToUserId(Integer toUserId) {
        this.toUserId = toUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.to_user_name
     *
     * @return the value of doctor_secretary_message_log.to_user_name
     *
     * @mbggenerated
     */
    public String getToUserName() {
        return toUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.to_user_name
     *
     * @param toUserName the value for doctor_secretary_message_log.to_user_name
     *
     * @mbggenerated
     */
    public void setToUserName(String toUserName) {
        this.toUserName = toUserName == null ? null : toUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.to_user_phone
     *
     * @return the value of doctor_secretary_message_log.to_user_phone
     *
     * @mbggenerated
     */
    public String getToUserPhone() {
        return toUserPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.to_user_phone
     *
     * @param toUserPhone the value for doctor_secretary_message_log.to_user_phone
     *
     * @mbggenerated
     */
    public void setToUserPhone(String toUserPhone) {
        this.toUserPhone = toUserPhone == null ? null : toUserPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.from_user_id
     *
     * @return the value of doctor_secretary_message_log.from_user_id
     *
     * @mbggenerated
     */
    public Integer getFromUserId() {
        return fromUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.from_user_id
     *
     * @param fromUserId the value for doctor_secretary_message_log.from_user_id
     *
     * @mbggenerated
     */
    public void setFromUserId(Integer fromUserId) {
        this.fromUserId = fromUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.from_user_name
     *
     * @return the value of doctor_secretary_message_log.from_user_name
     *
     * @mbggenerated
     */
    public String getFromUserName() {
        return fromUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.from_user_name
     *
     * @param fromUserName the value for doctor_secretary_message_log.from_user_name
     *
     * @mbggenerated
     */
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName == null ? null : fromUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.from_user_phone
     *
     * @return the value of doctor_secretary_message_log.from_user_phone
     *
     * @mbggenerated
     */
    public String getFromUserPhone() {
        return fromUserPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.from_user_phone
     *
     * @param fromUserPhone the value for doctor_secretary_message_log.from_user_phone
     *
     * @mbggenerated
     */
    public void setFromUserPhone(String fromUserPhone) {
        this.fromUserPhone = fromUserPhone == null ? null : fromUserPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.from_user_type
     *
     * @return the value of doctor_secretary_message_log.from_user_type
     *
     * @mbggenerated
     */
    public Integer getFromUserType() {
        return fromUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.from_user_type
     *
     * @param fromUserType the value for doctor_secretary_message_log.from_user_type
     *
     * @mbggenerated
     */
    public void setFromUserType(Integer fromUserType) {
        this.fromUserType = fromUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.messageContent
     *
     * @return the value of doctor_secretary_message_log.messageContent
     *
     * @mbggenerated
     */
    public String getMessagecontent() {
        return messagecontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.messageContent
     *
     * @param messagecontent the value for doctor_secretary_message_log.messageContent
     *
     * @mbggenerated
     */
    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent == null ? null : messagecontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.message_type
     *
     * @return the value of doctor_secretary_message_log.message_type
     *
     * @mbggenerated
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.message_type
     *
     * @param messageType the value for doctor_secretary_message_log.message_type
     *
     * @mbggenerated
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.sendtime
     *
     * @return the value of doctor_secretary_message_log.sendtime
     *
     * @mbggenerated
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.sendtime
     *
     * @param sendtime the value for doctor_secretary_message_log.sendtime
     *
     * @mbggenerated
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.createtime
     *
     * @return the value of doctor_secretary_message_log.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.createtime
     *
     * @param createtime the value for doctor_secretary_message_log.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doctor_secretary_message_log.updatetime
     *
     * @return the value of doctor_secretary_message_log.updatetime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doctor_secretary_message_log.updatetime
     *
     * @param updatetime the value for doctor_secretary_message_log.updatetime
     *
     * @mbggenerated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}