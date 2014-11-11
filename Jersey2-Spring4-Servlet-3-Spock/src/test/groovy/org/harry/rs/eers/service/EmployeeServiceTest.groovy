package org.harry.rs.eers.service

import org.harry.rs.employeesample.model.Employee
import org.harry.rs.employeesample.model.Employees
import org.harry.rs.employeesample.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Stepwise

/**
 * Created by harry on 7/31/14.
 */
@Stepwise
@ContextConfiguration(classes=[org.harry.rs.config.AppConfig])
class EmployeeServiceTest extends Specification{


        @Autowired
        def EmployeeService employeeService;

        def "should receive an empty list of employees back"(){
            when:
            def employees = employeeService.getEmployees()
            then:
            assert employees !=null

        }

       def createEmployees(){
           def employees = []
           Employee emp1 = new Employee();
           emp1.id = 111
           emp1.name = "Harry"
           Employee emp2 = new Employee();
           emp2.id = 112
           emp2.name = "Hermione"
           Employee emp3 = new Employee();
           emp3.id = 113
           emp3.name = "Hermione"
           employees <<emp1
           employees <<emp2
           employees <<emp3
           return  employees

       }



        def "save the employees "() {
            setup:
            def op
            def emps = new Employees()
            emps.employees = createEmployees()

            when:
            op = employeeService.saveEmployees(emps);
            then:
            notThrown(Exception)
            and:
            op != null
//            op.employees[0].id == 111
//            op.employees[0].id == 112
//            op.employees[0].id == 113


        }

}
