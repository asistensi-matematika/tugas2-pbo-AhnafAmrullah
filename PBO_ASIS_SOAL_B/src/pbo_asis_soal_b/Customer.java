package pbo_asis_soal_b;

public class Customer {

    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String Type) {
        this.memberType = Type;
    }

    @Override
    public String toString() {
        return "Name\t\t: " + name + "\n"+"Member\t\t: " + member + "\n"+"memberType\t: " + memberType;
    }
}
