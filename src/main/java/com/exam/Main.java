package com.exam;
import com.exam.services.ServiceFactory;
import com.exam.services.impl.CoursServiceImpl;
import com.exam.view.AdminView;

public class Main {
    public static void main(String[] args) {
  
        CoursServiceImpl coursService = ServiceFactory.createCoursService();
        AdminView adminView = new AdminView(coursService);
        adminView.afficherMenu();
    }
}
