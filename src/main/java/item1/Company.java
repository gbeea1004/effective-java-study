package item1;

public abstract class Company {
    public static Company getInstance(String path) {
        Company company = null;
        try {
            Class<?> childCompany = Class.forName(path);
            company = (Company) childCompany.newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 없습니다.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return company;
    }

    public abstract String getCompanyName();
}
