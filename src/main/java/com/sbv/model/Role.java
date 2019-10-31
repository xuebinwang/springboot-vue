package com.sbv.model;

import java.util.Date;

public class Role {
    private Integer roleId;

    private String roleNameCn;

    private String rolePwd;

    private String roleNum;

    private String roleName;

    private Date createDate;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleNameCn() {
        return roleNameCn;
    }

    public void setRoleNameCn(String roleNameCn) {
        this.roleNameCn = roleNameCn == null ? null : roleNameCn.trim();
    }

    public String getRolePwd() {
        return rolePwd;
    }

    public void setRolePwd(String rolePwd) {
        this.rolePwd = rolePwd == null ? null : rolePwd.trim();
    }

    public String getRoleNum() {
        return roleNum;
    }

    public void setRoleNum(String roleNum) {
        this.roleNum = roleNum == null ? null : roleNum.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}