package com.monfauna;

import com.monfauna.dao.ProjectDao;
import com.monfauna.dao.impl.DaoFactory;
import com.monfauna.model.Project;
import com.monfauna.model.User;

import java.util.List;

public class ProjectTest {

    public static void main(String[] args) {


        ProjectDao projectDao = DaoFactory.getProjectDao();

        //find All
        List<Project> projects = projectDao.findAll();
        for (Project p: projects) {
            System.out.println(p);
        }

        //find by id
        System.out.println("");
        Project project = projectDao.findById(2);
        System.out.println(project);

        //save project
        System.out.println("");
        Project projectToSave = new Project();
        projectToSave.setName("Spider Pig in NY");
        User owner = new User();
        owner.setId(3);
        projectToSave.setOwner(owner);
        Project projectSaved = projectDao.save(projectToSave);
        System.out.println(projectSaved);

        //update project
        System.out.println("");
        projectSaved.setName("Spider Cow in Tokyo");
        Project projectUpdated = projectDao.update(projectSaved);
        System.out.println(projectUpdated);

        //delete project
        System.out.println("");
        projectDao.deleteById(projectUpdated.getId());
        Project projectDeleted = projectDao.findById(projectUpdated.getId());
        if (projectDeleted == null) {
            System.out.println("project removed successfully");
            List<Project> projectList = projectDao.findAll();
            for (Project p: projectList) {
                System.out.println(p);
            }
        }

        //find all collaborators by project
        System.out.println("");
        Project myProject = projectDao.findById(4);
        List<User> collaboratorList = projectDao.findAllCollaboratorByProject(myProject.getId());
        System.out.println(myProject.getName());
        for (User coL : collaboratorList) {
            System.out.println(coL);
        }


    }
}
