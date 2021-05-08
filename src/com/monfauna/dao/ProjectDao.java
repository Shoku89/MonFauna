package com.monfauna.dao;

import com.monfauna.model.Project;
import com.monfauna.model.User;

import java.util.List;

public interface ProjectDao extends Crud<Project> {
    //Modificador de acesso - tipo de retorno - nome do metodo - parametros de entrada
    List<User> findAllCollaboratorByProject(Integer idProject);
}
