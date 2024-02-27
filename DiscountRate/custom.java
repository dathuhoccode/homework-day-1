package DiscountRate;

class custom {
    private String name;
    private boolean member;
    private String membertype;
    public custom(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public String getMembertype(){
        return membertype;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMembertype(String membertype){
        this.membertype = membertype;
    }
    public String toString(){
        return "[Name: "+getName()+", MemberType: "+getMembertype()+"]";
    }
}
