package com.monfauna;

import com.monfauna.dao.ProjectDao;
import com.monfauna.dao.impl.DaoFactory;
import com.monfauna.model.Project;

import java.util.List;

public class ProjectTest {

    public static void main(String[] args) {


        ProjectDao projectDao = DaoFactory.getProjectDao();

        //find All
        List<Project> projects = projectDao.findAll();
        for (Project p: projects) {
            System.out.println(p);
        }
    }
}
