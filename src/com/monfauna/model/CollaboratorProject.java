package com.monfauna.model;

public class CollaboratorProject {

    private int projectId;
    private int userId;

    public CollaboratorProject() {
    }

    public CollaboratorProject(int projectId, int userId) {
        this.projectId = projectId;
        this.userId = userId;

    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



}
