package com.fse.projectmanager.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @Column(name = "Project_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer projectId;


    @Column(name = "Project")
    @Size(min = 3, max = 50)
    private String project;

    @Column(name = "Manager")
    @Size(min = 3, max = 50)
    private String manager;

    @Column(name = "Start_Date")
    @Type(type = "date")
    private Date startDate;

    @Column(name = "End_Date")
    @Type(type = "date")
    private Date endDate;

    @Column(name = "Priority")
    private Integer priority;

    @Column(name = "Active_Flag")
    private Boolean activeFlag;


    public Project() {
    }

    public Project(Integer projectId, @Size(min = 3, max = 50) String project, @Size(min = 3, max = 50) String manager,
                   Date startDate, Date endDate, Integer priority, Boolean activeFlag) {
        this.projectId = projectId;
        this.project = project;
        this.manager = manager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.activeFlag = activeFlag;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }
}

