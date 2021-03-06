package com.zhou.medical.common.entity.im;

import java.util.Date;

public class MessageReminding {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.patient_phone
     *
     * @mbggenerated
     */
    private String patientPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.patient_login_id
     *
     * @mbggenerated
     */
    private String patientLoginId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.patient_name
     *
     * @mbggenerated
     */
    private String patientName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_name
     *
     * @mbggenerated
     */
    private String messageName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_content
     *
     * @mbggenerated
     */
    private String messageContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_link
     *
     * @mbggenerated
     */
    private String messageLink;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_status
     *
     * @mbggenerated
     */
    private Integer messageStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_button
     *
     * @mbggenerated
     */
    private String messageButton;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_icon
     *
     * @mbggenerated
     */
    private String messageIcon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_type
     *
     * @mbggenerated
     */
    private Integer messageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.message_ext
     *
     * @mbggenerated
     */
    private String messageExt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_reminding.updatetime
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.id
     *
     * @return the value of message_reminding.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.id
     *
     * @param id the value for message_reminding.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.patient_phone
     *
     * @return the value of message_reminding.patient_phone
     *
     * @mbggenerated
     */
    public String getPatientPhone() {
        return patientPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.patient_phone
     *
     * @param patientPhone the value for message_reminding.patient_phone
     *
     * @mbggenerated
     */
    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone == null ? null : patientPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.patient_login_id
     *
     * @return the value of message_reminding.patient_login_id
     *
     * @mbggenerated
     */
    public String getPatientLoginId() {
        return patientLoginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.patient_login_id
     *
     * @param patientLoginId the value for message_reminding.patient_login_id
     *
     * @mbggenerated
     */
    public void setPatientLoginId(String patientLoginId) {
        this.patientLoginId = patientLoginId == null ? null : patientLoginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.patient_name
     *
     * @return the value of message_reminding.patient_name
     *
     * @mbggenerated
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.patient_name
     *
     * @param patientName the value for message_reminding.patient_name
     *
     * @mbggenerated
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_name
     *
     * @return the value of message_reminding.message_name
     *
     * @mbggenerated
     */
    public String getMessageName() {
        return messageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_name
     *
     * @param messageName the value for message_reminding.message_name
     *
     * @mbggenerated
     */
    public void setMessageName(String messageName) {
        this.messageName = messageName == null ? null : messageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_content
     *
     * @return the value of message_reminding.message_content
     *
     * @mbggenerated
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_content
     *
     * @param messageContent the value for message_reminding.message_content
     *
     * @mbggenerated
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_link
     *
     * @return the value of message_reminding.message_link
     *
     * @mbggenerated
     */
    public String getMessageLink() {
        return messageLink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_link
     *
     * @param messageLink the value for message_reminding.message_link
     *
     * @mbggenerated
     */
    public void setMessageLink(String messageLink) {
        this.messageLink = messageLink == null ? null : messageLink.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_status
     *
     * @return the value of message_reminding.message_status
     *
     * @mbggenerated
     */
    public Integer getMessageStatus() {
        return messageStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_status
     *
     * @param messageStatus the value for message_reminding.message_status
     *
     * @mbggenerated
     */
    public void setMessageStatus(Integer messageStatus) {
        this.messageStatus = messageStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_button
     *
     * @return the value of message_reminding.message_button
     *
     * @mbggenerated
     */
    public String getMessageButton() {
        return messageButton;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_button
     *
     * @param messageButton the value for message_reminding.message_button
     *
     * @mbggenerated
     */
    public void setMessageButton(String messageButton) {
        this.messageButton = messageButton == null ? null : messageButton.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_icon
     *
     * @return the value of message_reminding.message_icon
     *
     * @mbggenerated
     */
    public String getMessageIcon() {
        return messageIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_icon
     *
     * @param messageIcon the value for message_reminding.message_icon
     *
     * @mbggenerated
     */
    public void setMessageIcon(String messageIcon) {
        this.messageIcon = messageIcon == null ? null : messageIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_type
     *
     * @return the value of message_reminding.message_type
     *
     * @mbggenerated
     */
    public Integer getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_type
     *
     * @param messageType the value for message_reminding.message_type
     *
     * @mbggenerated
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.message_ext
     *
     * @return the value of message_reminding.message_ext
     *
     * @mbggenerated
     */
    public String getMessageExt() {
        return messageExt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.message_ext
     *
     * @param messageExt the value for message_reminding.message_ext
     *
     * @mbggenerated
     */
    public void setMessageExt(String messageExt) {
        this.messageExt = messageExt == null ? null : messageExt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.createtime
     *
     * @return the value of message_reminding.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.createtime
     *
     * @param createtime the value for message_reminding.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_reminding.updatetime
     *
     * @return the value of message_reminding.updatetime
     *
     * @mbggenerated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_reminding.updatetime
     *
     * @param updatetime the value for message_reminding.updatetime
     *
     * @mbggenerated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}