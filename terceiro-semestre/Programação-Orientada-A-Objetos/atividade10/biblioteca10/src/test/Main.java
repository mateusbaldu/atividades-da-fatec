package test;

import DAO.LeitorDAO;
import domain.*;

public class Main {
    public static void main(String[] args) {
        FuncionarioGUI funcionarioGUI = new FuncionarioGUI();
        funcionarioGUI.setVisible(false);

        LeitorGUI leitorGUI = new LeitorGUI();
        leitorGUI.setVisible(true);
    }
}