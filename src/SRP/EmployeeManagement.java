package SRP;

import java.util.Objects;

public class EmployeeManagement {
    void addEmployee(String employee) {
        if(Objects.equals(employee, "")) {
            postServer(employee); // 서버에 직원 정보를 보냄
            logResult("[LOG] EMPLOYEE ADDED"); // 로그 출력
        } else {
            logResult("[ERROR] NAME MUST NOT BE EMPTY");
        }
    }

    // * 서버에 데이터를 전달하는 메소드
    void postServer(String employees) {}

    // * 로그를 출력하는 매소드
    void logResult(String message) {
        System.out.println(message); // 로그를 콘솔에 출력
        writeToFile(message); // 로그 내용을 로그 파일에 저장
    }

    // * 파일에 내용을 저장하는 메소드
    void writeToFile(String msg){}
}

