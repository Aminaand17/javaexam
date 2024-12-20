package com.exam.services;

import java.util.Scanner;

import com.exam.repository.CoursRepository;
import com.exam.repository.list.CoursRepositoryList;
import com.exam.services.impl.CoursServiceImpl;

public class ServiceFactory {


    public static Scanner createScanner() {
        return new Scanner(System.in);
    }


    public static CoursServiceImpl createCoursService() {
        CoursRepository coursRepository = new CoursRepositoryList();
        return new CoursServiceImpl(coursRepository);
    }

}


