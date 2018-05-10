package org.lc.video.model;

import java.util.Date;

public class Teacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Long teacherId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.name
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.gender
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Boolean gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.gmt_modified
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.portrait
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String portrait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.is_delete
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Boolean delete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.gmt_create
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.description
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.job
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.create_admin
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Long createAdmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.modified_admin
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    private Long modifiedAdmin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_id
     *
     * @return the value of teacher.teacher_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_id
     *
     * @param teacherId the value for teacher.teacher_id
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.name
     *
     * @return the value of teacher.name
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.name
     *
     * @param name the value for teacher.name
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.gender
     *
     * @return the value of teacher.gender
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.gender
     *
     * @param gender the value for teacher.gender
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.gmt_modified
     *
     * @return the value of teacher.gmt_modified
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.gmt_modified
     *
     * @param gmtModified the value for teacher.gmt_modified
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.portrait
     *
     * @return the value of teacher.portrait
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getPortrait() {
        return portrait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.portrait
     *
     * @param portrait the value for teacher.portrait
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.is_delete
     *
     * @return the value of teacher.is_delete
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.is_delete
     *
     * @param delete the value for teacher.is_delete
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.gmt_create
     *
     * @return the value of teacher.gmt_create
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.gmt_create
     *
     * @param gmtCreate the value for teacher.gmt_create
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.description
     *
     * @return the value of teacher.description
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.description
     *
     * @param description the value for teacher.description
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.job
     *
     * @return the value of teacher.job
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.job
     *
     * @param job the value for teacher.job
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.create_admin
     *
     * @return the value of teacher.create_admin
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Long getCreateAdmin() {
        return createAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.create_admin
     *
     * @param createAdmin the value for teacher.create_admin
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setCreateAdmin(Long createAdmin) {
        this.createAdmin = createAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.modified_admin
     *
     * @return the value of teacher.modified_admin
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public Long getModifiedAdmin() {
        return modifiedAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.modified_admin
     *
     * @param modifiedAdmin the value for teacher.modified_admin
     *
     * @mbg.generated Thu May 10 19:32:54 CST 2018
     */
    public void setModifiedAdmin(Long modifiedAdmin) {
        this.modifiedAdmin = modifiedAdmin;
    }
}