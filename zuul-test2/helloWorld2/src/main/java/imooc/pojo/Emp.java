package imooc.pojo;

public class Emp{
    private int empno;
    private String ename;
    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    
    public Emp(int empno, String ename) {
        super();
        this.empno = empno;
        this.ename = ename;
    }
    @Override
    public String toString()
    {
        return "empno:\t"+empno+"\tename:\t"+ename;
    }
}