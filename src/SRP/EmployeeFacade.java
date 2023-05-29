package SRP;

public class EmployeeFacade {
    private String name;
    private String positon;

    EmployeeFacade(String name, String position) {
        this.name = name;
        this.positon = position;
    }

    // 급여를 계산하는 메서드 (회계팀 클래스를 불러와 에서 사용)
    void calculatePay() {
        // ...
        new PayCalculator().calculatePay();
        // ...
    }

    // 근무시간을 계산하는 메서드 (인사팀 클래스를 불러와 에서 사용)
    void reportHours() {
        // ...
        new HourReporter().reportHours();
        // ...
    }

    // 변경된 정보를 DB에 저장하는 메서드 (기술팀 클래스를 불러와 에서 사용)
    void EmployeeSaver() {
        new EmployeeSaver().saveDatabase();
    }
}

