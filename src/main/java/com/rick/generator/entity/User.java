package com.rick.generator.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "pass_word")
    private String passWord;

    /**
     * 性别 1-男 2-女
     */
    private Integer gender;

    /**
     * 加密盐
     */
    private String salt;

    /**
     * 状态 1-启用 2-禁用 3-删除
     */
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户
     *
     * @return user_name - 用户
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户
     *
     * @param userName 用户
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return pass_word - 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取性别 1-男 2-女
     *
     * @return gender - 性别 1-男 2-女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别 1-男 2-女
     *
     * @param gender 性别 1-男 2-女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取加密盐
     *
     * @return salt - 加密盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置加密盐
     *
     * @param salt 加密盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取状态 1-启用 2-禁用 3-删除
     *
     * @return status - 状态 1-启用 2-禁用 3-删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1-启用 2-禁用 3-删除
     *
     * @param status 状态 1-启用 2-禁用 3-删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}