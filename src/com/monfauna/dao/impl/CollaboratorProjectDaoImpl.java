package com.monfauna.dao.impl;

import com.monfauna.dao.CollaboratorProjectDao;
import com.monfauna.infra.Database;
import com.monfauna.model.Project;
import com.monfauna.model.User;
import com.monfauna.model.CollaboratorProject;

import java.sql.*;
import java.util.List;

class CollaboratorProjectDaoImpl implements CollaboratorProjectDao {

    private final Connection conn;

    CollaboratorProjectDaoImpl(Connection conn) {
        this.conn = conn;
    }


    @Override
    public CollaboratorProject save(CollaboratorProject collaboratorProject) {

        PreparedStatement ps = null;

        String sql = "INSERT INTO user_project (project_id, user_id) VALUES (?, ?);";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, collaboratorProject.getProjectId());
            ps.setInt(2, collaboratorProject.getUserId());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected == 0) {
                throw new SQLException("unable to save user project");
            }

        } catch (SQLException e) {
            System.out.println("unable to save data");
            e.printStackTrace();
        } finally {
            Database.closePreparedStatement(ps);
        }

        return null;
    }

    @Override
    public CollaboratorProject update(CollaboratorProject collaboratorProject) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public User getOwner(Integer projectId) {
        return null;
    }

    @Override
    public List<User> getCollaborator(Integer projectId) {
        return null;
    }

    @Override
    public List<Project> findAllProjectByUser(Integer userId) {
        return null;
    }
}
