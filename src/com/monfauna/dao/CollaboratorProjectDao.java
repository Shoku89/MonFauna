package com.monfauna.dao;

import com.monfauna.model.Project;
import com.monfauna.model.User;
import com.monfauna.model.CollaboratorProject;

import java.util.List;

public interface CollaboratorProjectDao {
    CollaboratorProject save(CollaboratorProject collaboratorProject);
    CollaboratorProject update(CollaboratorProject collaboratorProject);
    void deleteById(Integer id);
    User getOwner(Integer projectId);
    List<User> getCollaborator(Integer projectId);
    List<Project> findAllProjectByUser(Integer userId);
}
