package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Test 1: department findById ====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n\n==== Test 2: department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		
		//System.out.println("\n\n==== Test 3: department insert ====");
		//Department newDep = new Department(null, "Snacks");
		//departmentDao.insert(newDep);
		//System.out.println("Inserted, new id = " + newDep.getId());
		
		System.out.println("\n\n==== Test 4: department update ====");
		dep = departmentDao.findById(6);
		dep.setName("D2");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n\n==== Test 5: department delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		sc.close();
	}

}
